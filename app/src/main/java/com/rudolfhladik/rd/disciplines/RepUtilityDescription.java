package com.rudolfhladik.rd.disciplines;

/**
 * Created by RD on 27.1.2015.
 */
public class RepUtilityDescription {
    String[] desc = new  String[2];

    int ac;
    int utPointPossition;
    // f, ac, utility point, title/description
    String[][][] allDescriptions = new String[8][21][2];
    // REP Advanced classes: 0: guardian, 1: sentinel, 2: sage, 3: shadow, 4: commando, 5: vanguard, 6: scoundrel, 7: gunslinger
    // IMP Advanced classes: 0: juggernaut, 1: marauder, 2: sorcerer, 3: assassin, 4: mercenarz, 5: powertech, 6: operative, 7: sniper


// guardian 0 0 * *
    private static final String guardian_0_0_0_0 = "Second Wind";
    private static final String guardian_0_0_0_1 = "Reduces the cooldown of Resolute by 30 seconds and causes Resolute to heal you for 10% of your maximum health when used";

    private static final String guardian_0_0_1_0 = "Battlefield Command";
    private static final String guardian_0_0_1_1 = "Getting attacked reduces the active cooldown of Force Leap by 1 second. This effect cannot occur more than once every 1.5 seconds.";

    private static final String guardian_0_0_2_0 = "Defiance";
    private static final String guardian_0_0_2_1 = "Generates 4 Focus when stunned, slept or knoked down.";

    private static final String guardian_0_0_3_0 = "Debilitation";
    private static final String guardian_0_0_3_1 = "Master Strike immobilizes the target for the duration of the ability.";

    private static final String guardian_0_0_4_0 = "Gather Strength";
    private static final String guardian_0_0_4_1 = "Whenever your movement is impaired, you gain a 5% damage bonus to your next melee ability that costs Focus. This effect can stack up to 5 times and lasts 15 seconds.";

    private static final String guardian_0_0_5_0 = "Trailblazer";
    private static final String guardian_0_0_5_1 = "Cyclone Slash deals 25% more damage.";

    private static final String guardian_0_0_6_0 = "Stagger";
    private static final String guardian_0_0_6_1 = "Increases the duration of Force Leap's immobilize effect by 1 second.";

    private static final String guardian_0_0_7_0 = "Intervention";
    private static final String guardian_0_0_7_1 = "Force Leap, Guardian Slash, Overhead Slash, Zealous Leap, and Guardian Leap grant Intervention, which makes your next Freezing Force consume no Focus and activate with 0.5 second global cooldown.";

    private static final String guardian_0_0_8_0 = "Narrowed Focus";
    private static final String guardian_0_0_8_1 = "Taking non-periodic area of effect damage generates 1 focus. This effect cannot occur more than once per second.";

    private static final String guardian_0_0_9_0 = "Purifying Sweep";
    private static final String guardian_0_0_9_1 = "For the Defense discipline, Force Sweep slows the targets it damages by 60% for 10 seconds, For the Vigiliance and Focus disciplines, Force Sweep and Vigilant Thurst sunder the targets they damage for 45 seconds. Sundered targets have their armor rating decreased by 20%.";

    private static final String guardian_0_0_10_0 = "Guardianship";
    private static final String guardian_0_0_10_1 = "Challenging Call protects all allies within range, excluding yourself, granting Guardianship, which absorbs a moderate amount of damage. Lasts 10 seconds.";

    private static final String guardian_0_0_11_0 = "Pulse";
    private static final String guardian_0_0_11_1 = "Reduces the cooldown of Force Statis by 15 seconds.";

    private static final String guardian_0_0_12_0 = "Inspring Force";
    private static final String guardian_0_0_12_1 = "Freezing Force increases the movement speed of all allies within 8 meters, excluding yourself, by 50% for 8 seconds.";

    private static final String guardian_0_0_13_0 = "Preparation";
    private static final String guardian_0_0_13_1 = "When you exit combat, the active cooldowns of Force Leap, Combat Focus, and Saber Throw are reduced by 100%.";

    private static final String guardian_0_0_14_0 = "Jedi Warden";
    private static final String guardian_0_0_14_1 = "Reduces the cooldown of Force Push by 15 seconds, and Freezing Force no longer consumes any Focus.";

    private static final String guardian_0_0_15_0 = "Daunting Presence";
    private static final String guardian_0_0_15_1 = "Force Leap finishis the cooldown on Force Kick. In addition, Saber Reflect lasts 2 seconds longer, and while Soresu Form is active, generates a high amount of threat on all engaged enemies within 30 meters when activated.";

    private static final String guardian_0_0_16_0 = "Through Peace";
    private static final String guardian_0_0_16_1 = "Reduces the cooldown of Focused Defense by 30 seconds.";

    private static final String guardian_0_0_17_0 = "Intercessor";
    private static final String guardian_0_0_17_1 = "Reduces the cooldown of Guardian Leap by 5 seconds and reduces the threat and damage taken by an additional 10% each for the friendly target of Guardian Leap.";

    private static final String guardian_0_0_18_0 = "Whiplash";
    private static final String guardian_0_0_18_1 = "Saber Throw immobilizes the target for 3 seconds";

    private static final String guardian_0_0_19_0 = "Peaceful Focus";
    private static final String guardian_0_0_19_1 = "Focused Defense removes all cleansable effects when activated.";

    private static final String guardian_0_0_20_0 = "True Harmony";
    private static final String guardian_0_0_20_1 = "Enure increases your movement speed by 50% and grants immunity to movement-impairing effects while active.";



    // sentinel 0 1 * *
    private static final String sentinel_0_1_0_0 = "Jedi Enforcer";
    private static final String sentinel_0_1_0_1 = "Increases the damage dealt by Rebuke by 15% and increases its duration by 4 seconds.";

    private static final String sentinel_0_1_1_0 = "Debilitation";
    private static final String sentinel_0_1_1_1 = "Master Strike immobilizes the target for the duration of the ability.";

    private static final String sentinel_0_1_2_0 = "Jedi Crusader";
    private static final String sentinel_0_1_2_1 = "While Rebuke is active, it generates 1 focus whenever you are attacked. This effect cannot occur more than once every 3 seconds.";

    private static final String sentinel_0_1_3_0 = "Defiance";
    private static final String sentinel_0_1_3_1 = "Generates 4 Focus when stunned, slept or knocked down.";

    private static final String sentinel_0_1_4_0 = "Defensive Forms";
    private static final String sentinel_0_1_4_1 = "You build 2 Zen when attacked. This effect cannot occur more than once every 1.5 seconds. Additionally, the effect of your lightsaber forms are improved while they are active: Shii-Cho Form: Further increases damage reduction by 2%. Juyo Form: Increases internal and elemental damage reduction by 5%. Ataru Form: Increases your movement speed by 15%.";

    private static final String sentinel_0_1_5_0 = "Trailblazer";
    private static final String sentinel_0_1_5_1 = "Cyclone Slash deals 25% more damage.";

    private static final String sentinel_0_1_6_0 = "Stagger";
    private static final String sentinel_0_1_6_1 = "Increases the duration of Force Leap's immobilize effect by 1 second.";

    private static final String sentinel_0_1_7_0 = "Incisor";
    private static final String sentinel_0_1_7_1 = "Force Leap, Force Melt, Clashing Blast, and Zealous Leap snare the target, reducing its movement speed by 50% for 6 seconds.";

    private static final String sentinel_0_1_8_0 = "Jedi Promulgator";
    private static final String sentinel_0_1_8_1 = "Each use of Strike, Zealous Strike, and Leg Slash reduces the active cooldown of Rebuke by 3 seconds.";

    private static final String sentinel_0_1_9_0 = "Defensive Roll";
    private static final String sentinel_0_1_9_1 = "Reduces damage taken from area effect by 30%.";

    private static final String sentinel_0_1_10_0 = "Watchguard";
    private static final String sentinel_0_1_10_1 = "Reduces the cooldown of Pacify by 15 seconds and Force Kick by 2 seconds.";

    private static final String sentinel_0_1_11_0 = "Pulse";
    private static final String sentinel_0_1_11_1 = "Reduces the cooldown of Force Statis by 15 seconds.";

    private static final String sentinel_0_1_12_0 = "Displacement";
    private static final String sentinel_0_1_12_1 = "Increases the range of Pacify by 6 meters and allows Rebuke to be used while stunned.";

    private static final String sentinel_0_1_13_0 = "Force Fade";
    private static final String sentinel_0_1_13_1 = "Increase the duration of Force Camouflage by 2 seconds and further increases the movement speed bonus of Force Camouflage by 20%.";

    private static final String sentinel_0_1_14_0 = "Fleetfooted";
    private static final String sentinel_0_1_14_1 = "When Transcendence is applied or refreshed, it purges movement-impairing effects. Additionally, the movement speed bonus of Transcendece is increased by 30%.";

    private static final String sentinel_0_1_15_0 = "Expunging Camouflage";
    private static final String sentinel_0_1_15_1 = "Force Camouflage removes all cleansable effects when activated.";

    private static final String sentinel_0_1_16_0 = "Force Aegis";
    private static final String sentinel_0_1_16_1 = "Increases the duration of Guarded by the Force by 2 seconds.";

    private static final String sentinel_0_1_17_0 = "Just Pursuit";
    private static final String sentinel_0_1_17_1 = "Leg Slash consumes 2 less focus. In addition, using Leg Slash against a target already slowed by your Leg Slash immobilizes that target for 3 seconds. This immobilizing effect cannot be applied to the same target more than once every 10 seconds.";

    private static final String sentinel_0_1_18_0 = "Enduring";
    private static final String sentinel_0_1_18_1 = "Reduces the cooldown of Guarded by the Force by 30 seconds.";

    private static final String sentinel_0_1_19_0 = "Zealous Ward";
    private static final String sentinel_0_1_19_1 = "Getting attacked while Saber Ward is active heals you for 3% of your maximum health. This effect cannot occur more than once every 1.5 seconds.";

    private static final String sentinel_0_1_20_0 = "Contemplation";
    private static final String sentinel_0_1_20_1 = "Reduces the cooldown of Awe by 15 seconds. In addition, you build up to 30 Centering over the course of using Introspection. This effect cannot occur more than once every 30 seconds.";

    // sage 0 2 * *

    private static  final String sage_0_2_0_0 = "Psychic Suffasion";
    private static  final String sage_0_2_0_1 = "Force Wave heals you and up to 7 affected allies for 755-1336.";

    private static  final String sage_0_2_1_0 = "Upheaval";
    private static  final String sage_0_2_1_1 = "Increases the damage dealt by Project by 5%. In addition, Project gains a 50% chance to throw a second chunk of debris that deals 50% less damage.";

    private static  final String sage_0_2_2_0 = "Jedi Resistance";
    private static  final String sage_0_2_2_1 = "Increases damage reduction by 3%.";

    private static  final String sage_0_2_3_0 = "Tectonic Mastery";
    private static  final String sage_0_2_3_1 = "Increases the damage dealt by Forcequake by 25%.";

    private static  final String sage_0_2_4_0 = "Pain Bearer";
    private static  final String sage_0_2_4_1 = "Increases all healing recieved by 10%. Does not effect redistributed life.";

    private static  final String sage_0_2_5_0 = "Humility";
    private static  final String sage_0_2_5_1 = "Targets stunned by your Force Stun suffer Humility when Force Stun wears off, which reduces all damage dealt by 25% for 10 seconds.";

    private static  final String sage_0_2_6_0 = "Pinning Resolve";
    private static  final String sage_0_2_6_1 = "Reduces the cooldown of Force Stun by 10 seconds. In addition, your Force Lift affects up to 2 additional standard or weak enemies within 8 meters of target.";

    private static  final String sage_0_2_7_0 = "Blockout";
    private static  final String sage_0_2_7_1 = "Activating Cloud Mind grants Blockout, which increases damage reduction by 25% for 6 seconds.";

    private static  final String sage_0_2_8_0 = "Mind Ward";
    private static  final String sage_0_2_8_1 = "Reduces the damage taken by all periodic effects by 15%.";

    private static  final String sage_0_2_9_0 = "Egress";
    private static  final String sage_0_2_9_1 = "Force Speed grants Egress, removing all movement-impairing effects and granting immunity to them for the duration.";

    private static  final String sage_0_2_10_0 = "Valiance";
    private static  final String sage_0_2_10_1 = "Reduces the health spent by Noble Sacriffice by 25%, and increases the healing done by Force Mend by 30%.";

    private static  final String sage_0_2_11_0 = "Kinetic Collapse";
    private static  final String sage_0_2_11_1 = "Force Armors you place on yourself erupt in a flash of light when they end, blinding up to 8 nearby enemies for 3 seconds. This effect breaks from direct damage.";

    private static  final String sage_0_2_12_0 = "Force Wake";
    private static  final String sage_0_2_12_1 = "Force Wave unbalances its targets, immobilizing them for 5 seconds. Direct damage dealt after 2 seconds ends the effect prematurely.";

    private static  final String sage_0_2_13_0 = "Telekinetic Defense";
    private static  final String sage_0_2_13_1 = "Increases the amount absorbed by your Force Armor by 10%.";

    private static  final String sage_0_2_14_0 = "Metaphysical Alacrity";
    private static  final String sage_0_2_14_1 = "Mental Alacrity increases your movement speed by 50% while active. In addition, Force Speed lasts 0.5 seconds longer, and when Force Barrier ends, the active cooldown of Force Speed is finished.";

    private static  final String sage_0_2_15_0 = "Mental Defense";
    private static  final String sage_0_2_15_1 = "Reduces all damage taken while stunned by 30%.";

    private static  final String sage_0_2_16_0 = "Force Haste";
    private static  final String sage_0_2_16_1 = "Reduce the cooldown of Force Speed by 5 seconds, Force Slow by 3 seconds, and Force Barrier by 30 seconds.";

    private static  final String sage_0_2_17_0 = "Force Mobility";
    private static  final String sage_0_2_17_1 = "Turbulance, Healing Trance, and Force Serenity can by activated while moving.";

    private static  final String sage_0_2_18_0 = "Confound";
    private static  final String sage_0_2_18_1 = "Targets affected by your Weaken Mind are slowed by 30% for its duration.";

    private static  final String sage_0_2_19_0 = "Life Ward";
    private static  final String sage_0_2_19_1 = "Your Force Armor, Force Barrier, and enduring Bastion heal you for 2% of your total health every second for as long as they last. This healing scales up to 8% with the charges for Enduring Bastion.";

    private static  final String sage_0_2_20_0 = "Containment";
    private static  final String sage_0_2_20_1 = "If your Force Lift breaks early from damage, the target is stunned for 2 seconds. In addition, Force Lift activates instantly.";

/// shadow 0 3 * *
    private static final String shadow_0_3_0_0 = "Celerity";
    private static final String shadow_0_3_0_1 = "Reduces the cooldown of Mind Snap by 2 seconds, Force of Will by 30 seconds, and Force Speed by 5 seconds.";

    private static final String shadow_0_3_1_0 = "Pinning Resolve";
    private static final String shadow_0_3_1_1 = "Reduces the cooldown of Force Stun by 10 seconds. In addition, your Force Lift affects up to 2 additional standard or weak enemies within 8 meters of target.";

    private static final String shadow_0_3_2_0 = "Mental Defense";
    private static final String shadow_0_3_2_1 = "Reduces all damage taken while stunned by 30%.";

    private static final String shadow_0_3_3_0 = "Misdirection";
    private static final String shadow_0_3_3_1 = "Increases your movement speed by 15% and your effective stealth level by 5.";

    private static final String shadow_0_3_4_0 = "Lambaste";
    private static final String shadow_0_3_4_1 = "Increases the damage done by Whirling Blow by 25%.";

    private static final String shadow_0_3_5_0 = "Shadowy Veil";
    private static final String shadow_0_3_5_1 = "Increases your armor rating by 30% while Force Technique or Shadow Technique is active. In addition, targets you Guard gain Shadowy Veil when they take damage, increasing their damage reduction by 1%. This effect stacks up to 3 times, cannot occur more than once per second, and lasts up to 10 seconds if you keep Guard on the target.";

    private static final String shadow_0_3_6_0 = "Force Wake";
    private static final String shadow_0_3_6_1 = "Force Wave unbalances its targets, immobilizing them for 5 seconds. Direct damage dealt after 2 seconds ends the effect prematurely.";

    private static final String shadow_0_3_7_0 = "Mind Over Matter";
    private static final String shadow_0_3_7_1 = "Increases the durations of Resilence by 2 seconds and Force Speed by 0.5 seconds.";

    private static final String shadow_0_3_8_0 = "Subduing Techniques";
    private static final String shadow_0_3_8_1 = "Increases the duration of Force Slow and reduces its cooldown by 6 seconds.";

    private static final String shadow_0_3_9_0 = "Fade";
    private static final String shadow_0_3_9_1 = "Reduces the cooldown of Blackout by 15 seconds and Force Cloak by 30 seconds.";

    private static final String shadow_0_3_10_0 = "Nerve Wracking";
    private static final String shadow_0_3_10_1 = "Targets controlled by your Spinning Kick or Force Stun take 5% more damage from all sources.";

    private static final String shadow_0_3_11_0 = "Egress";
    private static final String shadow_0_3_11_1 = "Force Speed grants Egress, removing all movement-imparing effects and granting immunity to them for the duration.";

    private static final String shadow_0_3_12_0 = "Sapped Mind";
    private static final String shadow_0_3_12_1 = "When damage breaks your Mind Maze prematurely, the target will suffer from Sapped Mind, reducing the damage they deal by 25% for 10 seconds.";

    private static final String shadow_0_3_13_0 = "Force Harmonics";
    private static final String shadow_0_3_13_1 = "Reduces the cooldown of Force Wave by 2.5 seconds and Force Potency grants 1 additional charge when activated.";

    private static final String shadow_0_3_14_0 = "Humbling Strike";
    private static final String shadow_0_3_14_1 = "When a target recovers from being stunned by your Spinning Kick or Force Stun, its movements speed is slowed by 90% for the following 3 seconds.";

    private static final String shadow_0_3_15_0 = "Shadow's Shelter";
    private static final String shadow_0_3_15_1 = "Increases all healing received by 3%, In addition, deplouying Phase Walk also deploys Shadow's Shelter, increasing the healing done by those within 5 meters of the Phase Walk by 5%.";

    private static final String shadow_0_3_16_0 = "Containment";
    private static final String shadow_0_3_16_1 = "If your Force Lift breaks early from damage, the target is stunned for 2 seconds. In addition, Force Lift activates instantly.";

    private static final String shadow_0_3_17_0 = "Sturdiness";
    private static final String shadow_0_3_17_1 = "While Deflection is active, you are immune to stun, sleep, lift, and incapacitating effects.";

    private static final String shadow_0_3_18_0 = "Martial Prowess";
    private static final String shadow_0_3_18_1 = "Force Pull immobilizes its target for 3 seconds, Serenity Strike immobilizes its target for 2 seconds, and Low Slash immobilizes its target for 1 second after the incapacitating effetc wears off.";

    private static final String shadow_0_3_19_0 = "Cloak of Resilience";
    private static final String shadow_0_3_19_1 = "Activating Force Cloak grants 2 seconds of Resilience.";

    private static final String shadow_0_3_20_0 = "Motion Control";
    private static final String shadow_0_3_20_1 = "Force Cloak increases your movement speed by 50% while it is active, and Force Slow reduces the movement speed of its target by additional 20%.";
// commando 0 4 * *

    private static final String commando_0_4_0_0 = "Concussive Force";
    private static final String commando_0_4_0_1 = "Stockstrike immobilizes the target for 4 seconds. Direct damage caused after 2 seconds ends effect. In addition, Concussion Charge's knockback effect is stronger and pushes enemies 4 meters further away.";

    private static final String commando_0_4_1_0 = "Parallactic Combat Stims";
    private static final String commando_0_4_1_1 = "You recharge 1 energy cells when stunned, immobilized, knocked down or otherwise incapacitated.";

    private static final String commando_0_4_2_0 = "Cell Capacitor";
    private static final String commando_0_4_2_1 = "recharge Cells now immedietely recharges 15 additional cells and grants 10% alacrity for 6 seconds.";

    private static final String commando_0_4_3_0 = "Charged Barrier";
    private static final String commando_0_4_3_1 = "Charged Bolts, grav round, and Medical Probe build a Charged Barrier that reduces damage taken by 1% for 15 seconds. Stacks up to 5 times.";

    private static final String commando_0_4_4_0 = "Chain Gunnery";
    private static final String commando_0_4_4_1 = "Increases the damage dealt by Hail of Bolts by 25%.";

    private static final String commando_0_4_5_0 = "Heavy Trooper";
    private static final String commando_0_4_5_1 = "Increases Endurance by 3% and all healing received by 3%.";

    private static final String commando_0_4_6_0 = "Tenacious Defence";
    private static final String commando_0_4_6_1 = "Reduces the cooldown of Concussion Charge by 5 seconds and Tenacity by 30 seconds.";

    private static final String commando_0_4_7_0 = "Advance the Line";
    private static final String commando_0_4_7_1 = "Increases the duration of hold the Line by 4 seconds.";

    private static final String commando_0_4_8_0 = "Nightvision Scope";
    private static final String commando_0_4_8_1 = "Increases stealth detection level by 2, melee and ranged defense by 2%, and reduces the cooldown of Stealth Scan by 5 seconds.";

    private static final String commando_0_4_9_0 = "Suit FOE";
    private static final String commando_0_4_9_1 = "When you activate Field Aid on yourself, a Foreign Object Excisor reduces all periodic damage taken by 30% for 12 seconds.";

    private static final String commando_0_4_10_0 = "Med Zone";
    private static final String commando_0_4_10_1 = "Increases all healing received by 20% while Reactive Shield is active.";

    private static final String commando_0_4_11_0 = "Combat Shield";
    private static final String commando_0_4_11_1 = "Reactive Shield now further decreases ability activation pushback by 30% and makes you immune to interupts.";

    private static final String commando_0_4_12_0 = "Efficient Conversions";
    private static final String commando_0_4_12_1 = "Removes the energy cell cost of Concussion Charge, Concussive Round, Field Aid, and Cryo Grenade.";

    private static final String commando_0_4_13_0 = "Electro Shield";
    private static final String commando_0_4_13_1 = "When activated, your Reactive Shield charges with electricity, zapping attackers for 607-607 elemental damage while it remains active. This effect cannot occur more than once each second.";

    private static final String commando_0_4_14_0 = "Shock Absorbers";
    private static final String commando_0_4_14_1 = "Reduces damage taken from area effects by 30%. Additionally, while stunned, you take 30% less damage from all sources.";

    private static final String commando_0_4_15_0 = "Reflexive Shield";
    private static final String commando_0_4_15_1 = "When you take damage, the active cooldown of Reactive Shield is reduced by 3 seconds. This effect cannot occur more than once every 1.5 seconds. In addition, when taking damage, you have a 20% chance to emit an Energy Redoubt, which absorbs a low amount of damage and lasts 6 seconds. This effect cannot occur more than once every 10 seconds.";

    private static final String commando_0_4_16_0 = "Overclock";
    private static final String commando_0_4_16_1 = "Reduces the cooldowns of Concussive Round and Tech Override by 15 seconds each. In addition, Tech Override grants a second charge, making your next two abilities with activation time activate instantly.";

    private static final String commando_0_4_17_0 = "Reflexive Battery";
    private static final String commando_0_4_17_1 = "Increases the damage dealt by Concussion Charge by 30%. In addition, taking damage reduces the active cooldown of Concussion Charge by 1 second. This effect cannot occure more than once every 1.5 seconds.";

    private static final String commando_0_4_18_0 = "Kolto Wave";
    private static final String commando_0_4_18_1 = "Concussion Charge heals you and up to 7 other allies within range for 614-905.";

    private static final String commando_0_4_19_0 = "Supercharged Reserves";
    private static final String commando_0_4_19_1 = "Reduces the cooldowns of Field Aid and Disabling Shot by 3 seconds each. In addition, you build up to 10 stacks of Supercharge over the course of using Recharge and Reloud. This effect cannot occur more than once every 30 seconds.";

    private static final String commando_0_4_20_0 = "Forced March";
    private static final String commando_0_4_20_1 = "Allows Full Auto, Boltstorm, and Successive Treatment to be activated while moving.";

// vanguard 0 5 * *

    private static final String vanguard_0_5_0_0 = "Battlefield Training";
    private static final String vanguard_0_5_0_1 = "Increases movement speed by 15%";

    private static final String vanguard_0_5_1_0 = "Parallactic Combat Stims";
    private static final String vanguard_0_5_1_1 = "You recharge 10 nergy cells when stunned, immobilized, knocked down or otherwise incapacitated.";

    private static final String vanguard_0_5_2_0 = "Reflective Armor";
    private static final String vanguard_0_5_2_1 = "When Into the Fray is triggered, it will also deal 1000-1000 elemental damage to the attacker if the attacker is within 10 meters.";

    private static final String vanguard_0_5_3_0 = "Entangling Heat";
    private static final String vanguard_0_5_3_1 = "Tactical Surge, Ion Pulse, and Explosive Surge reduce the movement speed of affected targets by 50% for 6 seconds.";

    private static final String vanguard_0_5_4_0 = "Muzzle Augs";
    private static final String vanguard_0_5_4_1 = "Increases the range of Ion Pulse and tactical Surge by 5 meters and the radius of Explosive Surge by 2 meters.";

    private static final String vanguard_0_5_5_0 = "Sharp Satchel";
    private static final String vanguard_0_5_5_1 = "Increases Explosive Surge damage by 25%";

    private static final String vanguard_0_5_6_0 = "Iron Will";
    private static final String vanguard_0_5_6_1 = "Reduces the cooldown of Tenacity by 30 seconds and the cooldown of Hold the Line by 5 seconds.";

    private static final String vanguard_0_5_7_0 = "Defensive Measures";
    private static final String vanguard_0_5_7_1 = "Harpoon immobilizes the target for 3 seconds. In addition, the cooldown of Stealth is reduced by 5 seconds, and any targets it reveals are immobilized for 3 seconds.";

    private static final String vanguard_0_5_8_0 = "Electro Shield";
    private static final String vanguard_0_5_8_1 = "When activated, your Reactive Shield charges with electricity, zapping attackers for 607-607 elemental damage while it remains active. This effect cannot occur more than once each second.";

    private static final String vanguard_0_5_9_0 = "Advance the Line";
    private static final String vanguard_0_5_9_1 = "Increases the duration of Hold the Line by 4 seconds.";

    private static final String vanguard_0_5_10_0 = "Accelerated Reel";
    private static final String vanguard_0_5_10_1 = "Reduces the cooldown of Harpoon by 15 seconds.";

    private static final String vanguard_0_5_11_0 = "Sonic Rebounder";
    private static final String vanguard_0_5_11_1 = "Sonic Round protects all friendly targets in its area of impact, excluding you, granting Sonic Rebounder, which reflects the next direct, single-target attack back at the attacker.";

    private static final String vanguard_0_5_12_0 = "Containment Tactics";
    private static final String vanguard_0_5_12_1 = "Reduces the cooldown of Cryo Grenade by 10 seconds.";

    private static final String vanguard_0_5_13_0 = "Frontline Defense";
    private static final String vanguard_0_5_13_1 = "Reduces the cooldown of Riot Strike by 2 seconds.";

    private static final String vanguard_0_5_14_0 = "Guard Canoon";
    private static final String vanguard_0_5_14_1 = "Damaging a target with your Shoulder Cannon missiles heals you for 5% of your total health.";

    private static final String vanguard_0_5_15_0 = "Paralytic Augs";
    private static final String vanguard_0_5_15_1 = "Increases the stun durations of Cryo Grenade and Neural Surge by 1 second each.";

    private static final String vanguard_0_5_16_0 = "Emergency Stims";
    private static final String vanguard_0_5_16_1 = "Allows Adrenaline Rush to be activated while stunned and causes Adrenaline Rush to purge stun effect when activated. This will not work against other types of incapacitating effects or scripted stuns, which are often used by Flashpoint and Operation bosses or other special non-player characters.";

    private static final String vanguard_0_5_17_0 = "Re-energizers";
    private static final String vanguard_0_5_17_1 = "When Reserve Powercell is activated, it recharges 10 energy cells over the next 5 seconds and immediately increases threat towards all current enemies by a small amount if Ion Cell is active, or reduces threat towards all current enemies if Ion Cell is not active.";

    private static final String vanguard_0_5_18_0 = "Focus Stims";
    private static final String vanguard_0_5_18_1 = "Battle Focus increases damage done by 5% while Ion Cell is active and increases damge reduction by 5% while Ion Cell is not active.";

    private static final String vanguard_0_5_19_0 = "Charge the Line";
    private static final String vanguard_0_5_19_1 = "Hold the Line increases movement speed y and additional 45% while is active.";

    private static final String vanguard_0_5_20_0 = "Efficient Tools";
    private static final String vanguard_0_5_20_1 = "Increases the range of Harpoon and Shoulder Cannon by 10 meters and eliminates the energy cell cost of Cryo Grenade and Neural Surge.";
// scoundrel 0 6 * *

    private static final String scoundrel_0_6_0_0 = "Smuggled Get-up";
    private static final String scoundrel_0_6_0_1 = "Reduces all area of effect damage taken by 30%.";

    private static final String scoundrel_0_6_1_0 = "Scat Tissue";
    private static final String scoundrel_0_6_1_1 = "Increases damage reduction by 5%.";

    private static final String scoundrel_0_6_2_0 = "Let Loose";
    private static final String scoundrel_0_6_2_1 = "Blaster Volley deals 25% more damage.";

    private static final String scoundrel_0_6_3_0 = "Flash Powder";
    private static final String scoundrel_0_6_3_1 = "Reduces target's accuracy by 20% for 8 seconds after Flash Grenade ends";

    private static final String scoundrel_0_6_4_0 = "Holdout Defense";
    private static final String scoundrel_0_6_4_1 = "Slapping a target with Blaster Whip or Bludgeon grants Holdout Defense, increasing your movement speed by 50% for 3 seconds.";

    private static final String scoundrel_0_6_5_0 = "Sneaky";
    private static final String scoundrel_0_6_5_1 = "Increases movement speed by 15% and effective stealth level by 3.";

    private static final String scoundrel_0_6_6_0 = "Dirty Escape";
    private static final String scoundrel_0_6_6_1 = "Reduces the cooldown of Dirty Kick by 15 seconds.";

    private static final String scoundrel_0_6_7_0 = "Stopping Power";
    private static final String scoundrel_0_6_7_1 = "Tendon Blast immobilizes the target for 2 seconds.";

    private static final String scoundrel_0_6_8_0 = "Anatomy Lessons";
    private static final String scoundrel_0_6_8_1 = "Reduces the energy cost of Dirty Kick and Tendon Blast by 5.";

    private static final String scoundrel_0_6_9_0 = "Med Screen";
    private static final String scoundrel_0_6_9_1 = "Your Defense Screen heals you for 5% of your maximum health when it collapses.";

    private static final String scoundrel_0_6_10_0 = "Flee the Scene";
    private static final String scoundrel_0_6_10_1 = "Reduces the cooldown of Disappearing Act by 30 seconds and Sneak by 15 seconds. In addition, activating Disappearing Act increases movement speed by 50% for 6 seconds.";

    private static final String scoundrel_0_6_11_0 = "Sedatives";
    private static final String scoundrel_0_6_11_1 = "When Tranquilizer wears off, the target is struck by Sedatives, reducing all damage dealt by 50% for the next 10 seconds.";

    private static final String scoundrel_0_6_12_0 = "Dirty Trickster";
    private static final String scoundrel_0_6_12_1 = "Surrender will also purge movement-impairing effects when activated.";

    private static final String scoundrel_0_6_13_0 = "Keep Cool";
    private static final String scoundrel_0_6_13_1 = "Cool Head now immediately restores 15 additional energy.";

    private static final String scoundrel_0_6_14_0 = "Get the Bulge";
    private static final String scoundrel_0_6_14_1 = "Tendon Blast will now grant an Upper Hand.";

    private static final String scoundrel_0_6_15_0 = "Skedaddle";
    private static final String scoundrel_0_6_15_1 = "When activated, Disappeating Act grants 2 seconds of Dodge.";

    private static final String scoundrel_0_6_16_0 = "K.O.";
    private static final String scoundrel_0_6_16_1 = "When used from stealth, Back Blast and Point Blank Shot interupt and immobilize the target for 3 seconds.";

    private static final String scoundrel_0_6_17_0 = "Scramble";
    private static final String scoundrel_0_6_17_1 = "Every time you get attacked, the active cooldown of your Dodge is reduced by 3 seconds. This effect cannot occur more than once every 1.5 seconds.";

    private static final String scoundrel_0_6_18_0 = "Surprise Comeback";
    private static final String scoundrel_0_6_18_1 = "Pugnacity now additionally grants Surprise Comeback, restoring 5% of total health every 3 seconds and reducing damage received by 20% for the duration.";

    private static final String scoundrel_0_6_19_0 = "Hotwired Defenses";
    private static final String scoundrel_0_6_19_1 = "Increases the amount of damage absorbed by Defense Screen by 30%.";

    private static final String scoundrel_0_6_20_0 = "Smuggled Defenses";
    private static final String scoundrel_0_6_20_1 = "Reduces the cooldown of Escape by 30 seconds, Defense Screen by 5 seconds, and Smuggle by 60 seconds.";

// gunslinger 0 7 * *

    private static final String gunslinger_0_7_0_0 = "Ballistic Dampers";
    private static final String gunslinger_0_7_0_1 = "Entering cover grants 3 charges of Ballistic Dampers. Each charge absorbs 30% of the damage dealt by incoming attacks. This effect cannot occur more than once every 1.5 seconds. Ballistic Dampers can only be gained once every 6 seconds.";

    private static final String gunslinger_0_7_1_0 = "Cool Under Pressure";
    private static final String gunslinger_0_7_1_1 = "While in cover, you heal for 1% of your total health every 3 seconds.";

    private static final String gunslinger_0_7_2_0 = "Cover Screen";
    private static final String gunslinger_0_7_2_1 = "When exiting cover, you increase your ranged defense by 20% for 6 seconds.";

    private static final String gunslinger_0_7_3_0 = "Snap Shot";
    private static final String gunslinger_0_7_3_1 = "Entering cover makes the next Charged Burst or Dirty Blast activate instantly. This effect cannot occur more than once every 6 seconds.";

    private static final String gunslinger_0_7_4_0 = "Flash Powder";
    private static final String gunslinger_0_7_4_1 = "Reduces target's accuracy by 20% for 8 seconds after Flash Grenade ends.";

    private static final String gunslinger_0_7_5_0 = "Efficient Ammo";
    private static final String gunslinger_0_7_5_1 = "Increases the damage dealt by Sweeping Gunfire by 25%.";

    private static final String gunslinger_0_7_6_0 = "Reset Engagement";
    private static final String gunslinger_0_7_6_1 = "Slapping a target with Blaster Whip grants Reset Engagement, increasing your movement speed by 50% for 3 seconds. Additionally, the final shot of Speedshot and Penetrating Rounds knocks back the target if they are within 10 meters.";

    private static final String gunslinger_0_7_7_0 = "Heads Up";
    private static final String gunslinger_0_7_7_1 = "When Hunker Down ends or you leave cover while Hunker Down is active, you gain Heads Up, which increases your movement speed by 50% and grants immunity to movement impairing effects. Lasts 6 seconds.";

    private static final String gunslinger_0_7_8_0 = "Hot Pursuit";
    private static final String gunslinger_0_7_8_1 = "You gain 4 charges of Hot Pursuit upon exiting cover, which reduces the energy cost of Quick Shot by 100%. Each use of Quick Shot consumes 1 charge, and consuming the first charge triggers a 20 second rate-limit on this skill. This effect lasts 15 seconds but is also removed by consuming all charges or reentering cover.";

    private static final String gunslinger_0_7_9_0 = "Pandemonium";
    private static final String gunslinger_0_7_9_1 = "Activating Pulse Detonator makes the next Charged Burst or Dirty Blast activate instantly.";

    private static final String gunslinger_0_7_10_0 = "Dirty Trickster";
    private static final String gunslinger_0_7_10_1 = "Surrender will also purge movement-impairing effects when activated.";

    private static final String gunslinger_0_7_11_0 = "Trip Shot";
    private static final String gunslinger_0_7_11_1 = "Reduces the cooldown of Leg Shot by 3 seconds.";

    private static final String gunslinger_0_7_12_0 = "Hotwired Defenses";
    private static final String gunslinger_0_7_12_1 = "Increases the amount of damage absorbed by Defense Screen by 30%.";

    private static final String gunslinger_0_7_13_0 = "Lay Low";
    private static final String gunslinger_0_7_13_1 = "Reduces the cooldown of Hunker Down by 15 seconds and Pulse Detonator knocks targets back an additional 4 meters.";

    private static final String gunslinger_0_7_14_0 = "Plan B & C";
    private static final String gunslinger_0_7_14_1 = "Reduces the cooldown of Dirty Kick and Flash Grenade by 15 seconds.";

    private static final String gunslinger_0_7_15_0 = "Hold Your Ground";
    private static final String gunslinger_0_7_15_1 = "Reduces the cooldown of Escape by 30 seconds, Defense Screen by 4 seconds and Pulse Detonator by 5 seconds.";

    private static final String gunslinger_0_7_16_0 = "Holed Up";
    private static final String gunslinger_0_7_16_1 = "Reduces all area effect damage taken by 60% while Hunker Down is active.";

    private static final String gunslinger_0_7_17_0 = "Kneecappin' ";
    private static final String gunslinger_0_7_17_1 = "Increases the Trauma duration of Flourish Shot by 6 seconds. In addition, when Leg Shot's immobilize effect wears off, the target's movement is slowed by 70% for 3 seconds.";

    private static final String gunslinger_0_7_18_0 = "Compounding Impact";
    private static final String gunslinger_0_7_18_1 = "Each shot of Speed Shot and Penetrating Rounds snare the target by 20% for 3 seconds. The effect can stack up to 4 times.";

    private static final String gunslinger_0_7_19_0 = "Riot Screen";
    private static final String gunslinger_0_7_19_1 = "Reduces all damage taken while in cover by 6% and reduces the cooldown of Scrambling Field by 30 seconds.";

    private static final String gunslinger_0_7_20_0 = "Crippling Diversion";
    private static final String gunslinger_0_7_20_1 = "Diversion slows all targets by 50% for as long as they remain in the area.";





    public String[] getUtilityDescription(int charAC, int position){

        //guardian
        allDescriptions[0][0][0] = guardian_0_0_0_0;
        allDescriptions[0][0][1] = guardian_0_0_0_1;
        allDescriptions[0][1][0] = guardian_0_0_1_0;
        allDescriptions[0][1][1] = guardian_0_0_1_1;
        allDescriptions[0][2][0] = guardian_0_0_2_0;
        allDescriptions[0][2][1] = guardian_0_0_2_1;
        allDescriptions[0][3][0] = guardian_0_0_3_0;
        allDescriptions[0][3][1] = guardian_0_0_3_1;
        allDescriptions[0][4][0] = guardian_0_0_4_0;
        allDescriptions[0][4][1] = guardian_0_0_4_1;
        allDescriptions[0][5][0] = guardian_0_0_5_0;
        allDescriptions[0][5][1] = guardian_0_0_5_1;
        allDescriptions[0][6][0] = guardian_0_0_6_0;
        allDescriptions[0][6][1] = guardian_0_0_6_1;
        allDescriptions[0][7][0] = guardian_0_0_7_0;
        allDescriptions[0][7][1] = guardian_0_0_7_1;
        allDescriptions[0][8][0] = guardian_0_0_8_0;
        allDescriptions[0][8][1] = guardian_0_0_8_1;
        allDescriptions[0][9][0] = guardian_0_0_9_0;
        allDescriptions[0][9][1] = guardian_0_0_9_1;
        allDescriptions[0][10][0] = guardian_0_0_10_0;
        allDescriptions[0][10][1] = guardian_0_0_10_1;
        allDescriptions[0][11][0] = guardian_0_0_11_0;
        allDescriptions[0][11][1] = guardian_0_0_11_1;
        allDescriptions[0][12][0] = guardian_0_0_12_0;
        allDescriptions[0][12][1] = guardian_0_0_12_1;
        allDescriptions[0][13][0] = guardian_0_0_13_0;
        allDescriptions[0][13][1] = guardian_0_0_13_1;
        allDescriptions[0][14][0] = guardian_0_0_14_0;
        allDescriptions[0][14][1] = guardian_0_0_14_1;
        allDescriptions[0][15][0] = guardian_0_0_15_0;
        allDescriptions[0][15][1] = guardian_0_0_15_1;
        allDescriptions[0][16][0] = guardian_0_0_16_0;
        allDescriptions[0][16][1] = guardian_0_0_16_1;
        allDescriptions[0][17][0] = guardian_0_0_17_0;
        allDescriptions[0][17][1] = guardian_0_0_17_1;
        allDescriptions[0][18][0] = guardian_0_0_18_0;
        allDescriptions[0][18][1] = guardian_0_0_18_1;
        allDescriptions[0][19][0] = guardian_0_0_19_0;
        allDescriptions[0][19][1] = guardian_0_0_19_1;
        allDescriptions[0][20][0] = guardian_0_0_20_0;
        allDescriptions[0][20][1] = guardian_0_0_20_1;

        //sent
        allDescriptions[1][0][0] = sentinel_0_1_0_0;
        allDescriptions[1][0][1] = sentinel_0_1_0_1;
        allDescriptions[1][1][0] = sentinel_0_1_1_0;
        allDescriptions[1][1][1] = sentinel_0_1_1_1;
        allDescriptions[1][2][0] = sentinel_0_1_2_0;
        allDescriptions[1][2][1] = sentinel_0_1_2_1;
        allDescriptions[1][3][0] = sentinel_0_1_3_0;
        allDescriptions[1][3][1] = sentinel_0_1_3_1;
        allDescriptions[1][4][0] = sentinel_0_1_4_0;
        allDescriptions[1][4][1] = sentinel_0_1_4_1;
        allDescriptions[1][5][0] = sentinel_0_1_5_0;
        allDescriptions[1][5][1] = sentinel_0_1_5_1;
        allDescriptions[1][6][0] = sentinel_0_1_6_0;
        allDescriptions[1][6][1] = sentinel_0_1_6_1;
        allDescriptions[1][7][0] = sentinel_0_1_7_0;
        allDescriptions[1][7][1] = sentinel_0_1_7_1;
        allDescriptions[1][8][0] = sentinel_0_1_8_0;
        allDescriptions[1][8][1] = sentinel_0_1_8_1;
        allDescriptions[1][9][0] = sentinel_0_1_9_0;
        allDescriptions[1][9][1] = sentinel_0_1_9_1;
        allDescriptions[1][10][0] = sentinel_0_1_10_0;
        allDescriptions[1][10][1] = sentinel_0_1_10_1;
        allDescriptions[1][11][0] = sentinel_0_1_11_0;
        allDescriptions[1][11][1] = sentinel_0_1_11_1;
        allDescriptions[1][12][0] = sentinel_0_1_12_0;
        allDescriptions[1][12][1] = sentinel_0_1_12_1;
        allDescriptions[1][13][0] = sentinel_0_1_13_0;
        allDescriptions[1][13][1] = sentinel_0_1_13_1;
        allDescriptions[1][14][0] = sentinel_0_1_14_0;
        allDescriptions[1][14][1] = sentinel_0_1_14_1;
        allDescriptions[1][15][0] = sentinel_0_1_15_0;
        allDescriptions[1][15][1] = sentinel_0_1_15_1;
        allDescriptions[1][16][0] = sentinel_0_1_16_0;
        allDescriptions[1][16][1] = sentinel_0_1_16_1;
        allDescriptions[1][17][0] = sentinel_0_1_17_0;
        allDescriptions[1][17][1] = sentinel_0_1_17_1;
        allDescriptions[1][18][0] = sentinel_0_1_18_0;
        allDescriptions[1][18][1] = sentinel_0_1_18_1;
        allDescriptions[1][19][0] = sentinel_0_1_19_0;
        allDescriptions[1][19][1] = sentinel_0_1_19_1;
        allDescriptions[1][20][0] = sentinel_0_1_20_0;
        allDescriptions[1][20][1] = sentinel_0_1_20_1;

        // sage

        allDescriptions[2][0][0] = sage_0_2_0_0;
        allDescriptions[2][0][1] = sage_0_2_0_1;
        allDescriptions[2][1][0] = sage_0_2_1_0;
        allDescriptions[2][1][1] = sage_0_2_1_1;
        allDescriptions[2][2][0] = sage_0_2_2_0;
        allDescriptions[2][2][1] = sage_0_2_2_1;
        allDescriptions[2][3][0] = sage_0_2_3_0;
        allDescriptions[2][3][1] = sage_0_2_3_1;
        allDescriptions[2][4][0] = sage_0_2_4_0;
        allDescriptions[2][4][1] = sage_0_2_4_1;
        allDescriptions[2][5][0] = sage_0_2_5_0;
        allDescriptions[2][5][1] = sage_0_2_5_1;
        allDescriptions[2][6][0] = sage_0_2_6_0;
        allDescriptions[2][6][1] = sage_0_2_6_1;
        allDescriptions[2][7][0] = sage_0_2_7_0;
        allDescriptions[2][7][1] = sage_0_2_7_1;
        allDescriptions[2][8][0] = sage_0_2_8_0;
        allDescriptions[2][8][1] = sage_0_2_8_1;
        allDescriptions[2][9][0] = sage_0_2_9_0;
        allDescriptions[2][9][1] = sage_0_2_9_1;
        allDescriptions[2][10][0] = sage_0_2_10_0;
        allDescriptions[2][10][1] = sage_0_2_10_1;
        allDescriptions[2][11][0] = sage_0_2_11_0;
        allDescriptions[2][11][1] = sage_0_2_11_1;
        allDescriptions[2][12][0] = sage_0_2_12_0;
        allDescriptions[2][12][1] = sage_0_2_12_1;
        allDescriptions[2][13][0] = sage_0_2_13_0;
        allDescriptions[2][13][1] = sage_0_2_13_1;
        allDescriptions[2][14][0] = sage_0_2_14_0;
        allDescriptions[2][14][1] = sage_0_2_14_1;
        allDescriptions[2][15][0] = sage_0_2_15_0;
        allDescriptions[2][15][1] = sage_0_2_15_1;
        allDescriptions[2][16][0] = sage_0_2_16_0;
        allDescriptions[2][16][1] = sage_0_2_16_1;
        allDescriptions[2][17][0] = sage_0_2_17_0;
        allDescriptions[2][17][1] = sage_0_2_17_1;
        allDescriptions[2][18][0] = sage_0_2_18_0;
        allDescriptions[2][18][1] = sage_0_2_18_1;
        allDescriptions[2][19][0] = sage_0_2_19_0;
        allDescriptions[2][19][1] = sage_0_2_19_1;
        allDescriptions[2][20][0] = sage_0_2_20_0;
        allDescriptions[2][20][1] = sage_0_2_20_1;

        // shadow
        allDescriptions[3][0][0] = shadow_0_3_0_0;
        allDescriptions[3][0][1] = shadow_0_3_0_1;
        allDescriptions[3][1][0] = shadow_0_3_1_0;
        allDescriptions[3][1][1] = shadow_0_3_1_1;
        allDescriptions[3][2][0] = shadow_0_3_2_0;
        allDescriptions[3][2][1] = shadow_0_3_2_1;
        allDescriptions[3][3][0] = shadow_0_3_3_0;
        allDescriptions[3][3][1] = shadow_0_3_3_1;
        allDescriptions[3][4][0] = shadow_0_3_4_0;
        allDescriptions[3][4][1] = shadow_0_3_4_1;
        allDescriptions[3][5][0] = shadow_0_3_5_0;
        allDescriptions[3][5][1] = shadow_0_3_5_1;
        allDescriptions[3][6][0] = shadow_0_3_6_0;
        allDescriptions[3][6][1] = shadow_0_3_6_1;
        allDescriptions[3][7][0] = shadow_0_3_7_0;
        allDescriptions[3][7][1] = shadow_0_3_7_1;
        allDescriptions[3][8][0] = shadow_0_3_8_0;
        allDescriptions[3][8][1] = shadow_0_3_8_1;
        allDescriptions[3][9][0] = shadow_0_3_9_0;
        allDescriptions[3][9][1] = shadow_0_3_9_1;
        allDescriptions[3][10][0] = shadow_0_3_10_0;
        allDescriptions[3][10][1] = shadow_0_3_10_1;
        allDescriptions[3][11][0] = shadow_0_3_11_0;
        allDescriptions[3][11][1] = shadow_0_3_11_1;
        allDescriptions[3][12][0] = shadow_0_3_12_0;
        allDescriptions[3][12][1] = shadow_0_3_12_1;
        allDescriptions[3][13][0] = shadow_0_3_13_0;
        allDescriptions[3][13][1] = shadow_0_3_13_1;
        allDescriptions[3][14][0] = shadow_0_3_14_0;
        allDescriptions[3][14][1] = shadow_0_3_14_1;
        allDescriptions[3][15][0] = shadow_0_3_15_0;
        allDescriptions[3][15][1] = shadow_0_3_15_1;
        allDescriptions[3][16][0] = shadow_0_3_16_0;
        allDescriptions[3][16][1] = shadow_0_3_16_1;
        allDescriptions[3][17][0] = shadow_0_3_17_0;
        allDescriptions[3][17][1] = shadow_0_3_17_1;
        allDescriptions[3][18][0] = shadow_0_3_18_0;
        allDescriptions[3][18][1] = shadow_0_3_18_1;
        allDescriptions[3][19][0] = shadow_0_3_19_0;
        allDescriptions[3][19][1] = shadow_0_3_19_1;
        allDescriptions[3][20][0] = shadow_0_3_20_0;
        allDescriptions[3][20][1] = shadow_0_3_20_1;

        // commando

        allDescriptions[4][0][0] = commando_0_4_0_0;
        allDescriptions[4][0][1] = commando_0_4_0_1;
        allDescriptions[4][1][0] = commando_0_4_1_0;
        allDescriptions[4][1][1] = commando_0_4_1_1;
        allDescriptions[4][2][0] = commando_0_4_2_0;
        allDescriptions[4][2][1] = commando_0_4_2_1;
        allDescriptions[4][3][0] = commando_0_4_3_0;
        allDescriptions[4][3][1] = commando_0_4_3_1;
        allDescriptions[4][4][0] = commando_0_4_4_0;
        allDescriptions[4][4][1] = commando_0_4_4_1;
        allDescriptions[4][5][0] = commando_0_4_5_0;
        allDescriptions[4][5][1] = commando_0_4_5_1;
        allDescriptions[4][6][0] = commando_0_4_6_0;
        allDescriptions[4][6][1] = commando_0_4_6_1;
        allDescriptions[4][7][0] = commando_0_4_7_0;
        allDescriptions[4][7][1] = commando_0_4_7_1;
        allDescriptions[4][8][0] = commando_0_4_8_0;
        allDescriptions[4][8][1] = commando_0_4_8_1;
        allDescriptions[4][9][0] = commando_0_4_9_0;
        allDescriptions[4][9][1] = commando_0_4_9_1;
        allDescriptions[4][10][0] = commando_0_4_10_0;
        allDescriptions[4][10][1] = commando_0_4_10_1;
        allDescriptions[4][11][0] = commando_0_4_11_0;
        allDescriptions[4][11][1] = commando_0_4_11_1;
        allDescriptions[4][12][0] = commando_0_4_12_0;
        allDescriptions[4][12][1] = commando_0_4_12_1;
        allDescriptions[4][13][0] = commando_0_4_13_0;
        allDescriptions[4][13][1] = commando_0_4_13_1;
        allDescriptions[4][14][0] = commando_0_4_14_0;
        allDescriptions[4][14][1] = commando_0_4_14_1;
        allDescriptions[4][15][0] = commando_0_4_15_0;
        allDescriptions[4][15][1] = commando_0_4_15_1;
        allDescriptions[4][16][0] = commando_0_4_16_0;
        allDescriptions[4][16][1] = commando_0_4_16_1;
        allDescriptions[4][17][0] = commando_0_4_17_0;
        allDescriptions[4][17][1] = commando_0_4_17_1;
        allDescriptions[4][18][0] = commando_0_4_18_0;
        allDescriptions[4][18][1] = commando_0_4_18_1;
        allDescriptions[4][19][0] = commando_0_4_19_0;
        allDescriptions[4][19][1] = commando_0_4_19_1;
        allDescriptions[4][20][0] = commando_0_4_20_0;
        allDescriptions[4][20][1] = commando_0_4_20_1;

        //vanguard

        allDescriptions[5][0][0] = vanguard_0_5_0_0;
        allDescriptions[5][0][1] = vanguard_0_5_0_1;
        allDescriptions[5][1][0] = vanguard_0_5_1_0;
        allDescriptions[5][1][1] = vanguard_0_5_1_1;
        allDescriptions[5][2][0] = vanguard_0_5_2_0;
        allDescriptions[5][2][1] = vanguard_0_5_2_1;
        allDescriptions[5][3][0] = vanguard_0_5_3_0;
        allDescriptions[5][3][1] = vanguard_0_5_3_1;
        allDescriptions[5][4][0] = vanguard_0_5_4_0;
        allDescriptions[5][4][1] = vanguard_0_5_4_1;
        allDescriptions[5][5][0] = vanguard_0_5_5_0;
        allDescriptions[5][5][1] = vanguard_0_5_5_1;
        allDescriptions[5][6][0] = vanguard_0_5_6_0;
        allDescriptions[5][6][1] = vanguard_0_5_6_1;
        allDescriptions[5][7][0] = vanguard_0_5_7_0;
        allDescriptions[5][7][1] = vanguard_0_5_7_1;
        allDescriptions[5][8][0] = vanguard_0_5_8_0;
        allDescriptions[5][8][1] = vanguard_0_5_8_1;
        allDescriptions[5][9][0] = vanguard_0_5_9_0;
        allDescriptions[5][9][1] = vanguard_0_5_9_1;
        allDescriptions[5][10][0] = vanguard_0_5_10_0;
        allDescriptions[5][10][1] = vanguard_0_5_10_1;
        allDescriptions[5][11][0] = vanguard_0_5_11_0;
        allDescriptions[5][11][1] = vanguard_0_5_11_1;
        allDescriptions[5][12][0] = vanguard_0_5_12_0;
        allDescriptions[5][12][1] = vanguard_0_5_12_1;
        allDescriptions[5][13][0] = vanguard_0_5_13_0;
        allDescriptions[5][13][1] = vanguard_0_5_13_1;
        allDescriptions[5][14][0] = vanguard_0_5_14_0;
        allDescriptions[5][14][1] = vanguard_0_5_14_1;
        allDescriptions[5][15][0] = vanguard_0_5_15_0;
        allDescriptions[5][15][1] = vanguard_0_5_15_1;
        allDescriptions[5][16][0] = vanguard_0_5_16_0;
        allDescriptions[5][16][1] = vanguard_0_5_16_1;
        allDescriptions[5][17][0] = vanguard_0_5_17_0;
        allDescriptions[5][17][1] = vanguard_0_5_17_1;
        allDescriptions[5][18][0] = vanguard_0_5_18_0;
        allDescriptions[5][18][1] = vanguard_0_5_18_1;
        allDescriptions[5][19][0] = vanguard_0_5_19_0;
        allDescriptions[5][19][1] = vanguard_0_5_19_1;
        allDescriptions[5][20][0] = vanguard_0_5_20_0;
        allDescriptions[5][20][1] = vanguard_0_5_20_1;

        //scoundrel

        allDescriptions[6][0][0] = scoundrel_0_6_0_0;
        allDescriptions[6][0][1] = scoundrel_0_6_0_1;
        allDescriptions[6][1][0] = scoundrel_0_6_1_0;
        allDescriptions[6][1][1] = scoundrel_0_6_1_1;
        allDescriptions[6][2][0] = scoundrel_0_6_2_0;
        allDescriptions[6][2][1] = scoundrel_0_6_2_1;
        allDescriptions[6][3][0] = scoundrel_0_6_3_0;
        allDescriptions[6][3][1] = scoundrel_0_6_3_1;
        allDescriptions[6][4][0] = scoundrel_0_6_4_0;
        allDescriptions[6][4][1] = scoundrel_0_6_4_1;
        allDescriptions[6][5][0] = scoundrel_0_6_5_0;
        allDescriptions[6][5][1] = scoundrel_0_6_5_1;
        allDescriptions[6][6][0] = scoundrel_0_6_6_0;
        allDescriptions[6][6][1] = scoundrel_0_6_6_1;
        allDescriptions[6][7][0] = scoundrel_0_6_7_0;
        allDescriptions[6][7][1] = scoundrel_0_6_7_1;
        allDescriptions[6][8][0] = scoundrel_0_6_8_0;
        allDescriptions[6][8][1] = scoundrel_0_6_8_1;
        allDescriptions[6][9][0] = scoundrel_0_6_9_0;
        allDescriptions[6][9][1] = scoundrel_0_6_9_1;
        allDescriptions[6][10][0] = scoundrel_0_6_10_0;
        allDescriptions[6][10][1] = scoundrel_0_6_10_1;
        allDescriptions[6][11][0] = scoundrel_0_6_11_0;
        allDescriptions[6][11][1] = scoundrel_0_6_11_1;
        allDescriptions[6][12][0] = scoundrel_0_6_12_0;
        allDescriptions[6][12][1] = scoundrel_0_6_12_1;
        allDescriptions[6][13][0] = scoundrel_0_6_13_0;
        allDescriptions[6][13][1] = scoundrel_0_6_13_1;
        allDescriptions[6][14][0] = scoundrel_0_6_14_0;
        allDescriptions[6][14][1] = scoundrel_0_6_14_1;
        allDescriptions[6][15][0] = scoundrel_0_6_15_0;
        allDescriptions[6][15][1] = scoundrel_0_6_15_1;
        allDescriptions[6][16][0] = scoundrel_0_6_16_0;
        allDescriptions[6][16][1] = scoundrel_0_6_16_1;
        allDescriptions[6][17][0] = scoundrel_0_6_17_0;
        allDescriptions[6][17][1] = scoundrel_0_6_17_1;
        allDescriptions[6][18][0] = scoundrel_0_6_18_0;
        allDescriptions[6][18][1] = scoundrel_0_6_18_1;
        allDescriptions[6][19][0] = scoundrel_0_6_19_0;
        allDescriptions[6][19][1] = scoundrel_0_6_19_1;
        allDescriptions[6][20][0] = scoundrel_0_6_20_0;
        allDescriptions[6][20][1] = scoundrel_0_6_20_1;

// gunslinger
        allDescriptions[7][0][0] = gunslinger_0_7_0_0;
        allDescriptions[7][0][1] = gunslinger_0_7_0_1;
        allDescriptions[7][1][0] = gunslinger_0_7_1_0;
        allDescriptions[7][1][1] = gunslinger_0_7_1_1;
        allDescriptions[7][2][0] = gunslinger_0_7_2_0;
        allDescriptions[7][2][1] = gunslinger_0_7_2_1;
        allDescriptions[7][3][0] = gunslinger_0_7_3_0;
        allDescriptions[7][3][1] = gunslinger_0_7_3_1;
        allDescriptions[7][4][0] = gunslinger_0_7_4_0;
        allDescriptions[7][4][1] = gunslinger_0_7_4_1;
        allDescriptions[7][5][0] = gunslinger_0_7_5_0;
        allDescriptions[7][5][1] = gunslinger_0_7_5_1;
        allDescriptions[7][6][0] = gunslinger_0_7_6_0;
        allDescriptions[7][6][1] = gunslinger_0_7_6_1;
        allDescriptions[7][7][0] = gunslinger_0_7_7_0;
        allDescriptions[7][7][1] = gunslinger_0_7_7_1;
        allDescriptions[7][8][0] = gunslinger_0_7_8_0;
        allDescriptions[7][8][1] = gunslinger_0_7_8_1;
        allDescriptions[7][9][0] = gunslinger_0_7_9_0;
        allDescriptions[7][9][1] = gunslinger_0_7_9_1;
        allDescriptions[7][10][0] = gunslinger_0_7_10_0;
        allDescriptions[7][10][1] = gunslinger_0_7_10_1;
        allDescriptions[7][11][0] = gunslinger_0_7_11_0;
        allDescriptions[7][11][1] = gunslinger_0_7_11_1;
        allDescriptions[7][12][0] = gunslinger_0_7_12_0;
        allDescriptions[7][12][1] = gunslinger_0_7_12_1;
        allDescriptions[7][13][0] = gunslinger_0_7_13_0;
        allDescriptions[7][13][1] = gunslinger_0_7_13_1;
        allDescriptions[7][14][0] = gunslinger_0_7_14_0;
        allDescriptions[7][14][1] = gunslinger_0_7_14_1;
        allDescriptions[7][15][0] = gunslinger_0_7_15_0;
        allDescriptions[7][15][1] = gunslinger_0_7_15_1;
        allDescriptions[7][16][0] = gunslinger_0_7_16_0;
        allDescriptions[7][16][1] = gunslinger_0_7_16_1;
        allDescriptions[7][17][0] = gunslinger_0_7_17_0;
        allDescriptions[7][17][1] = gunslinger_0_7_17_1;
        allDescriptions[7][18][0] = gunslinger_0_7_18_0;
        allDescriptions[7][18][1] = gunslinger_0_7_18_1;
        allDescriptions[7][19][0] = gunslinger_0_7_19_0;
        allDescriptions[7][19][1] = gunslinger_0_7_19_1;
        allDescriptions[7][20][0] = gunslinger_0_7_20_0;
        allDescriptions[7][20][1] = gunslinger_0_7_20_1;

        this.ac = charAC;
        this.utPointPossition = position;

        desc[0] = allDescriptions[ac][utPointPossition][0];
        desc[1] = allDescriptions[ac][utPointPossition][1];



        return desc;}
}
