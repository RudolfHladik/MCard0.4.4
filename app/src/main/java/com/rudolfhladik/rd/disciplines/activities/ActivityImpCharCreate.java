package com.rudolfhladik.rd.disciplines.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.graphics.Palette;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;
import com.rudolfhladik.rd.disciplines.CRUDer;
import com.rudolfhladik.rd.disciplines.Char;
import com.rudolfhladik.rd.disciplines.R;

import java.io.IOException;

/**
 * Created by RD on 12.2.2015.
 */
public class ActivityImpCharCreate extends Activity {
    private static final int PICK_FROM_GALLERY = 2;
    Bitmap photo;
    Uri uri;
    Char newChar = new Char();
    boolean edit = false;

    EditText etCharName;
    Spinner spinner_race;
    Spinner spinner_ac;
    Spinner spinner_role;
    Spinner spinner_spec;

    Spinner spinner_gender;
    SeekBar lvlBar;
    TextView lvlTv;
    ImageView avatarIV;
    Intent imageIntent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    Intent editIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_char_creation);
        avatarIV = (ImageView) findViewById(R.id.iv_avatar);

        etCharName = (EditText) findViewById(R.id.et_char_name);
        spinner_race = (Spinner) findViewById(R.id.spinner_race);
        spinner_ac = (Spinner) findViewById(R.id.spinner_ac);
        spinner_role = (Spinner) findViewById(R.id.spinner_role);
        spinner_spec = (Spinner) findViewById(R.id.spinner_spec);

        spinner_gender = (Spinner) findViewById(R.id.spinner_gender);

        lvlBar = (SeekBar) findViewById(R.id.lvlBar);
        lvlTv = (TextView) findViewById(R.id.tv_lvl);

        editIntent = getIntent();
        edit = editIntent.getBooleanExtra("edit", false);
//        Toast.makeText(this, "" + edit, Toast.LENGTH_LONG).show();
        int charID =  editIntent.getIntExtra("charID", 0);
        int fractionEdit =  editIntent.getIntExtra("fraction", 0);

        avatarIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                imageIntent.setType("image/*");
//                imageIntent.setAction(Intent.ACTION_GET_CONTENT);

                Intent intenti = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

                startActivityForResult(

                        intenti.createChooser(imageIntent, "Select photo"), 0);

            }
        });







        lvlBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int level = 1;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lvlTv.setText("Level: " + (progress + 1));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ArrayAdapter<CharSequence> adapter_races = ArrayAdapter.createFromResource(this,
                R.array.races, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_ac_rep = ArrayAdapter.createFromResource(this,
                R.array.rep_ac, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_ac_imp = ArrayAdapter.createFromResource(this,
                R.array.imp_ac, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_role = ArrayAdapter.createFromResource(this,
                R.array.roles, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_spec = ArrayAdapter.createFromResource(this,
                R.array.specs, android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_gender = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);

        adapter_races.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_race.setAdapter(adapter_races);
        adapter_ac_rep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ac.setAdapter(adapter_ac_imp);
        adapter_role.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_role.setAdapter(adapter_role);
        adapter_spec.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_spec.setAdapter(adapter_spec);

        adapter_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_gender.setAdapter(adapter_gender);




        if (edit){
            Char editChar = new Char();
            CRUDer editCruder = new CRUDer(this);
            editChar = editCruder.getCharFromDB(charID);

            avatarIV.setImageURI(editChar.avatarUri);
            etCharName.setText(editChar.charName);
            spinner_race.setSelection(editChar.race);
            spinner_ac.setSelection(editChar.advClass);
            spinner_role.setSelection(editChar.role);
            spinner_spec.setSelection(editChar.specialization);
            spinner_gender.setSelection(editChar.gender);
            lvlBar.setProgress(editChar.lvl - 1);
            newChar.disciplines = editChar.disciplines;
            newChar.avatarUri = editChar.avatarUri;
            newChar.charid = charID;


        }







        FloatingActionButton setDisciplines = (FloatingActionButton) findViewById(R.id.fab_set_disciplines);
        setDisciplines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if (edit){

                    newChar.setCharName(etCharName.getText().toString());
                    newChar.setRace(spinner_race.getSelectedItemPosition());
                    newChar.setAdvClass(spinner_ac.getSelectedItemPosition()); // for REP ACs, for IMPs its 21
                    newChar.setRole(spinner_role.getSelectedItemPosition());
                    newChar.setSpecialization(spinner_spec.getSelectedItemPosition());
                    newChar.setFraction(0); //0 for REP  1 for IMP
                    newChar.setGender(spinner_gender.getSelectedItemPosition());
                    newChar.setLvl(lvlBar.getProgress() +1);


                    Intent i = new Intent(getApplicationContext(), ActivityDisciplineEditor.class);
                    i.putExtra("Action_edit", edit);
                    Uri u = newChar.avatarUri;
                    if (u == null){

                        // change color
                        u = Uri.parse("android.resource://com.rudolfhladik.rd.disciplines/" + R.drawable.ic_avatar);
                    }

                    i.putExtra("AvatarURI", u.toString());
                    i.putExtra("CharName", newChar.charName);
                    i.putExtra("Race", newChar.race);
                    i.putExtra("AC", newChar.advClass);
                    i.putExtra("Role", newChar.role );
                    i.putExtra("Spec", newChar.specialization);
                    i.putExtra("Fraction", newChar.fraction);
                    i.putExtra("Gender", newChar.gender);
                    i.putExtra("Level", newChar.lvl);
                    i.putExtra("Disciplines", newChar.disciplines );
                    i.putExtra("CharID", newChar.charid);
                    startActivity(i);

                }else {



                    newChar.setAvatarUri(uri);
                    newChar.setCharName(etCharName.getText().toString());
                    newChar.setRace(spinner_race.getSelectedItemPosition());
                    newChar.setAdvClass(spinner_ac.getSelectedItemPosition()); // for REP ACs, for IMPs its 21
                    newChar.setRole(spinner_role.getSelectedItemPosition());
                    newChar.setSpecialization(spinner_spec.getSelectedItemPosition());
                    newChar.setFraction(1); //0 for REP  1 for IMP
                    newChar.setGender(spinner_gender.getSelectedItemPosition());
                    newChar.setLvl(lvlBar.getProgress() +1);


                    Intent i = new Intent(getApplicationContext(), ActivityDisciplineEditor.class);
                    i.putExtra("Action_edit", edit);
                    Uri u = newChar.avatarUri;
                    if (u == null){

                        // change color
                        u = Uri.parse("android.resource://com.rudolfhladik.rd.disciplines/" + R.drawable.ic_avatar_add);
                    }

                    i.putExtra("AvatarURI", u.toString());
                    i.putExtra("CharName", newChar.charName);
                    i.putExtra("Race", newChar.race);
                    i.putExtra("AC", newChar.advClass);
                    i.putExtra("Role", newChar.role );
                    i.putExtra("Spec", newChar.specialization);
                    i.putExtra("Fraction", newChar.fraction);
                    i.putExtra("Gender", newChar.gender);
                    i.putExtra("Level", newChar.lvl);
                    i.putExtra("Disciplines", newChar.disciplines );

                    startActivity(i);
//
//
                }
            }
        });




    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("requestCode: ", "" + requestCode);

        if (resultCode == RESULT_OK) {
            ImageView avatar = (ImageView) findViewById(R.id.iv_avatar);
            uri = data.getData();
            avatar.setImageURI(uri);

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                Palette palette = Palette.generate(bitmap);
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.activity_char_frame);
                frameLayout.setBackgroundColor(palette.getLightMutedColor(0));
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_set_disciplines);
                fab.setColorNormal(palette.getVibrantColor(0));


            }catch (IOException io){

            }


        }
    }
}
