package com.rudolfhladik.rd.disciplines;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
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

import com.melnykov.fab.FloatingActionButton;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Created by RD on 18.1.2015.
 */
public class ActivityCharCreate extends Activity implements AdapterView.OnItemSelectedListener {

// REP CHAR Creatation fragment TODO IMP Char creatation fragment


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
    Spinner spinner_fraction;
    Spinner spinner_gender;
    SeekBar lvlBar;
    TextView lvlTv;
    ImageView avatarIV;
    Intent imageIntent = new Intent();
    ImageView sith;






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
        spinner_fraction = (Spinner) findViewById(R.id.spinner_fraction);
        spinner_gender = (Spinner) findViewById(R.id.spinner_gender);

        lvlBar = (SeekBar) findViewById(R.id.lvlBar);
        lvlTv = (TextView) findViewById(R.id.tv_lvl);

        avatarIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageIntent.setType("image/*");
                imageIntent.setAction(Intent.ACTION_GET_CONTENT);



                startActivityForResult(
                        Intent.createChooser(imageIntent, "Select photo"), 0);

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
        ArrayAdapter<CharSequence> adapter_fraction = ArrayAdapter.createFromResource(this,
                R.array.fraction, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter_gender = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);

        adapter_races.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_race.setAdapter(adapter_races);
        adapter_ac_rep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ac.setAdapter(adapter_ac_rep);
        adapter_role.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_role.setAdapter(adapter_role);
        adapter_spec.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_spec.setAdapter(adapter_spec);
        adapter_fraction.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_fraction.setAdapter(adapter_fraction);
        adapter_gender.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_gender.setAdapter(adapter_gender);








//        newChar.setCharName(etCharName.getText().toString());
//        newChar.setRace(spinner_race.getSelectedItemPosition());
//        newChar.setAdvClass(spinner_ac.getSelectedItemPosition() + 11); // for REP ACs, for IMPs its 21
//        newChar.setRole(spinner_role.getSelectedItemPosition());
//        newChar.setSpecialization(spinner_spec.getSelectedItemPosition());
//        newChar.setFraction(0); //0 for REP  1 for IMP
//        newChar.setGender(spinner_gender.getSelectedItemPosition());
//        newChar.setLvl(lvlBar.getProgress() +1);


        TextView info = (TextView) findViewById(R.id.tv_info);
        info.setText("Char name: " + newChar.charName +
                       "\n Race: " + newChar.getRace() +
                        "\n AC: " + newChar.getAdvClass() +
                        "\n Role: " + newChar.getRole() +
                        "\n Spec: " + newChar.getSpecialization() +
                        "\n Fraction: " + newChar.getFraction() +
                        "\n Gender: " + newChar.getGender()
        );


        FloatingActionButton setDisciplines = (FloatingActionButton) findViewById(R.id.fab_set_disciplines);
        setDisciplines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if (edit){

                }else {



                    newChar.setAvatarUri(uri);
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

                    i.putExtra("AvatarURI", newChar.avatarUri.toString());
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
