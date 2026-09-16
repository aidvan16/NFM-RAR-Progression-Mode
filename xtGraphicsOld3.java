/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.DataInputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class xtGraphics
extends Panel
implements Runnable {
    Graphics rd;
    Medium m;
    CheckPoints cp;
    FontMetrics ftm;
    ImageObserver ob;
    Applet app;
    int fase = 111;
    int oldfase = 0;
    int starcnt = 0;
    int unlocked = 1;
    int carsUnlocked = 5;

    // DEBUG TRACE COUNTERS - temporary
    int debugFinishCallCount = 0;
    int debugFlexCallCount = 0;

    int lockcnt = 0;
    int opselect = 1;
    boolean shaded = false;
    int flipo = 0;
    boolean nextc = false;
    int gatey = 0;
    int looped = 1;
    int[] sc;
    int[] xstart = new int[]{0, -350, 350, 0, -350, 350, 0};
    int[] zstart = new int[]{0, -380, -380, -760, 380, 380, 760};
    float[] dishandle = new float[]{0.65f, 0.6f, 0.55f, 0.77f, 0.62f, 0.9f, 0.6f, 0.72f, 0.45f, 0.8f, 0.95f, 0.4f, 0.87f, 0.42f, 1.0f, 0.95f, 0.65f, 1.0f, 0.65f, 0.77f, 0.9f, 1.0f, 0.9f, 0.7f, 1.0f, 1.0f, 0.7f, 0.8f, 0.4f, 0.42f, 0.95f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    float[] outdam = new float[]{0.67f, 0.35f, 0.8f, 0.5f, 0.42f, 0.76f, 0.82f, 0.76f, 0.72f, 0.62f, 0.79f, 0.95f, 0.77f, 1.0f, 0.85f, 1.0f, 0.67f, 0.35f, 0.9f, 0.5f, 0.7f, 0.18f, 0.7f, 0.9f, 1.0f, 1.0f, 1.0f, 0.6f, 0.95f, 1.0f, 1.0f, 0.75f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    float[] firepower = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.35f, 0.0f, 0.25f, 0.0f, 0.0f, 0.35f, 0.35f, 0.45f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.45f, 0.5f, 0.75f, 1.0f, 0.0f, 0.0f};
    boolean holdit = false;
    int holdcnt = 0;
    boolean winner = false;
    int[] flexpix;
    int[] smokey;
    Image fleximg;
    int flatrstart = 0;
    Thread runner;
    int runtyp = 0;
    Image odmg;
    Image opwr;
    Image opos;
    Image owas;
    Image olap;
    Image oyourwasted;
    Image oyoulost;
    Image oyouwon;
    Image oyouwastedem;
    Image ogameh;
    Image oloadingmusic;
    Image oflaot;
    Image dmg;
    Image pwr;
    Image pos;
    Image was;
    Image lap;
    Image br;
    Image select;
    Image loadingmusic;
    Image yourwasted;
    Image youlost;
    Image youwon;
    Image youwastedem;
    Image gameh;
    Image congrd;
    Image gameov;
    Image carsbg;
    Image pgate;
    Image selectcar;
    Image statb;
    Image statbo;
    Image mdness;
    Image paused;
    Image radicalplay;
    Image logocars;
    Image logomadnes;
    Image logomadbg;
    Image byrd;
    Image opback;
    Image nfmcoms;
    Image opti;
    Image bgmain;
    Image rpro;
    Image nfmcom;
    Image recharged;
    Image flaot;
    Image fixhoop;
    Image sarrow;
    Image stunts;
    Image racing;
    Image wasting;
    Image plus;
    Image space;
    Image arrows;
    Image chil;
    Image ory;
    Image kz;
    Image kx;
    Image kv;
    Image kp;
    Image km;
    Image kn;
    Image kenter;
    Image nfm;
    Image cover;
    Image[][] trackbg;
    Image[] dude;
    Image[] dudeb;
    int duds = 0;
    int dudo = 0;
    Image[] next;
    Image[] back;
    Image[] contin;
    Image[] ostar;
    Image[] star;
    int pcontin = 0;
    int pnext = 0;
    int pback = 0;
    int pstar = 0;
    Image[] orank;
    Image[] rank;
    Image[] ocntdn;
    Image[] cntdn;
    int gocnt = 0;
    AudioClip[][] engs;
    boolean[] pengs;
    int[] enginsignature = new int[]{0, 1, 2, 1, 0, 3, 2, 2, 1, 0, 3, 4, 1, 4, 0, 3, 0, 3, 0, 1, 3, 1, 1, 3, 5, 5, 4, 3, 6, 6, 6, 6, 8, 2, 3, 7, 3, 7, 6, 6};
    AudioClip[] air;
    boolean aird = false;
    boolean grrd = false;
    AudioClip[] crash;
    AudioClip[] lowcrash;
    AudioClip tires;
    AudioClip checkpoint;
    AudioClip carfixed;
    AudioClip powerup;
    AudioClip three;
    AudioClip two;
    AudioClip one;
    AudioClip go;
    AudioClip wastd;
    AudioClip explosion;
    AudioClip[] killomatic;
    AudioClip[] nuke;
    AudioClip[] guns;
    AudioClip firewasted;
    boolean pwastd = false;
    AudioClip[] skid;
    AudioClip[] dustskid;
    AudioClip[] train;
    AudioClip flames;
    AudioClip out;
    boolean mutes = false;
    RadicalMod stages;
    RadicalMod cars;
    RadicalMod credits;
    RadicalMod instructions;
    RadicalMod[] stracks;
    boolean[] loadedt;
    int lastload = -1;
    boolean mutem = false;
    boolean sunny = false;
    boolean macn = false;
    boolean arrace = false;
    int stageNavCooldown = 0;
    int ana = 0;
    int cntan = 0;
    int cntovn = 0;
    boolean flk = false;
    int tcnt = 30;
    boolean tflk = false;
    String say = "";
    boolean wasay = false;
    int clear = 0;
    int posit = 0;
    int wasted = 0;
    int laps = 0;
    int[] dested;
    String[] names = new String[]{"Tornado Shark", "Formula 7", "Wow Caninaro", "La Vita Crab", "Nimi", "MAX Revenge", "Lead Oxide", "Kool Kat", "Drifter X", "Sword of Justice", "High Rider", "EL KING", "Mighty Eight", "M A S H E E N", "Radical One", "DR Monstaa", "Basic Racer", "Turbo Dragster", "Desert Humvee", "Lamborghini Gallardo", "Armored Corvette", "Radical Racer", "Saleen S7 Twin Turbo", "Sting Rod", "Zonich Tank", "Matlos Tank", "TURBO TANK", "Air Rebound", "EL ROCKET KING", "ROCKET M A S H E E N", "Dr Rocket Monstaa", "The Awesome Radical One", "Over=Kill", "The Phantom", "Lightning Rod", "KILL-O-MATIC", "The Destroyer", "TRAIN of TERROR", "Nuclear Warhead", "Tactical Nuke"};
    int dmcnt = 0;
    boolean dmflk = false;
    int pwcnt = 0;
    boolean pwflk = false;
    String[][] adj = new String[][]{{"Cool", "Alright", "Nice", "Good", "Great", "Decent", "Sucessful", "Tight"}, {"Wicked", "Amazing", "Super", "Superb", "Sick", "Remarkable", "Fantastic", "Impressive"}, {"Awesome", "Ripping", "Radical", "Incredible", "Unbelieveable", "Pro", "Epic", "Extreme"}, {"What the...?!", "You're a super star!!!!", "Who are you again...?", "!?!?!!?!?!?!???!", "HOLY ****!", "RADICAL DUDE!", "WOO-HAA!", "You Rock!"}, {"surf style", "off the lip", "bounce back"}};
    String[] exlm = new String[]{"!", "!!", "!!!"};
    String loop = "";
    String spin = "";
    String asay = "";
    int auscnt = 45;
    boolean aflk = false;
    int[] sndsize = new int[]{106, 76, 56, 116, 92, 208, 70, 80, 152, 102, 27, 65, 52, 30, 151, 129, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70};
    Image hello;
    Image sign;
    Image loadbar;
    int kbload = 0;
    int dnload = 0;
    float shload = 0.0f;
    int radpx = 147;
    int pin = 60;
    int[] bgmy = new int[]{0, 400};
    int[] trkx = new int[]{0, 670};
    int trkl = 0;
    int trklim;
    float[] hipno = new float[]{1.0f, 1.0f, 3.0f, 1.0f, 1.2f, 1.0f, 1.7f, 1.0f, 1.0f, 8.0f, 1.5f, 2.0f, 1.2f, 10.0f, 1.8f, 1.4f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f};
    int flkat;
    int movly;
    int xdu = 272;
    int ydu = 2;
    int gxdu = 0;
    int gydu = 0;
    int[] pgatx = new int[]{146, 175, 215, 267, 334, 401, 452, 493, 521};
    int[] pgaty = new int[]{168, 188, 201, 212, 219, 214, 203, 189, 171};
    int[] pgady;
    boolean[] pgas;
    int lxm = -10;
    int lym = -10;
    int pwait = 7;
    int stopcnt = 0;
    int traincnt = 0;
    int cntwis = 0;
    int crshturn = 0;
    int bfcrash = 0;
    int bfskid = 0;
    boolean crashup = false;
    boolean skidup = false;
    int skflg = 0;
    int dskflg = 0;
    int flatr = 0;
    int flyr = 0;
    int flyrdest = 0;
    int flang = 0;
    int flangados = 0;
    float blackn = 0.0f;
    float blacknados = 0.0f;
    int car;
    int[] carorder = {
    0, 1, 2, 3, 4,
    5, 16, 6, 18, 7,
    8, 9, 10, 11, 19,
    12, 17, 13, 20, 22,
    14, 23, 15, 21, 27,
    24, 25, 26, 28, 29,
    30, 31, 32, 33, 39,
    34, 35, 37, 36, 38
    };
    private int[] campaignBoss = {
    5,   // Stages 1-2   MAX Revenge
    16,  // Stages 3-4   Basic Racer
    6,   // Stages 5-6   Lead Oxide
    18,  // Stages 7-8   Desert Humvee
    7,   // Stages 9-10  Kool Kat
    8,   // Stages 11-12 Drifter X
    9,   // Stages 13-14 Sword of Justice
    10,  // Stages 15-16 High Rider
    11,  // Stages 17-18 EL KING
    19,  // Stages 19-20 Lamborghini Gallardo
    12,  // Stages 21-22 Mighty Eight
    17,  // Stages 23-24 Turbo Dragster
    13,  // Stages 25-26 MASHEEN
    20,  // Stages 27-28 Armoured Corvette
    22,  // Stages 29-30 Saleen S7
    14,  // Stages 31-32 Radical One
    23,  // Stages 33-34 Sting Rod
    15,  // Stages 35-36 Dr Monstaa
    21,  // Stages 37-38 Radical Racer
    27,  // Stages 39-40 Air Rebound
    24,  // Stages 41-42 Zonich Tank
    25,  // Stages 43-44 Matlos Tank
    26,  // 45-46 TURBO TANK
    28,  // 47-48 EL Rocket King
    29,  // 49-50 Dr Rocket Monstaa
    30,  // 51-52 Awesome Radical One
    31,  // 53-54 Over=Kill
    32,  // 55-56 Rocket MASHEEN
    33,  // 57-58 Phantom
    39,  //TN
    34,  //LR
    35,  // K
    37,  // ToT
    36,  // TD
    38,  // NW
};

    private int carOrderPosition(int carID) {
    for (int i = 0; i < this.carorder.length; i++) {
        if (this.carorder[i] == carID) {
            return i;
        }
    }
    return 0;
}

    public boolean over(Image image, int n, int n2, int n3, int n4) {
        int n5 = image.getHeight(this.ob);
        int n6 = image.getWidth(this.ob);
        return n > n3 - 5 && n < n3 + n6 + 5 && n2 > n4 - 5 && n2 < n4 + n5 + 5;
    }

    public void cantgo(Control control) {
        this.pnext = 0;
        this.trackbg(false);
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(110, "This stage will be unlocked when stage " + this.unlocked + " is complete!", 177, 177, 177, 3);
        int n = 0;
        do {
            this.rd.drawImage(this.pgate, 212 + n * 30, 190, null);
        } while (++n < 9);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        if (this.aflk) {
            this.drawcs(160, "[ Stage " + (this.unlocked + 1) + " Locked ]", 255, 128, 0, 3);
            this.aflk = false;
        } else {
            this.drawcs(160, "[ Stage " + (this.unlocked + 1) + " Locked ]", 255, 0, 0, 3);
            this.aflk = true;
        }
        this.rd.drawImage(this.select, 273, 45, null);
        this.rd.drawImage(this.br, 0, 0, null);
        this.rd.drawImage(this.back[this.pback], 305, 320, null);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(396, "You can also use Keyboard Arrows and Enter to navigate.", 82, 90, 0, 3);
        --this.lockcnt;
        if (this.lockcnt == 0 || control.enter || control.handb || control.left) {
            control.left = false;
            control.handb = false;
            control.enter = false;
            this.fase = 1;
        }
    }

    public void loadingstage(int n) {
        this.trackbg(true);
        this.rd.setColor(new Color(177, 177, 177));
        this.rd.fillRoundRect(200, 150, 270, 52, 20, 40);
        this.rd.setColor(new Color(120, 120, 120));
        this.rd.drawRoundRect(200, 150, 270, 52, 20, 40);
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(180, "Loading Stage " + n + ", please wait...", 0, 0, 0, 3);
        this.rd.drawImage(this.select, 273, 45, null);
        this.rd.drawImage(this.br, 0, 0, null);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(396, "You can also use Keyboard Arrows and Enter to navigate.", 82, 90, 0, 3);
        this.app.repaint();
        if (this.lastload != -22) {
            this.stages.loadMod(135, 8150, 125, this.sunny, this.macn);
            this.lastload = -22;
        } else {
            this.stages.stop();
        }
    }

    public void inst(Control control) {
        this.instructions.play();
        this.instructions.loadMod(500, 8500, 135, this.sunny, this.macn);
        this.lastload = -22;
        if (this.flipo == 0) {
            this.flipo = 1;
            this.bgmy[0] = 0;
            this.bgmy[1] = 400;
        }
        if (this.flipo == 2) {
            this.flipo = 3;
            this.dudo = 200;
        }
        if (this.flipo == 4) {
            this.flipo = 5;
            this.dudo = 250;
        }
        if (this.flipo == 6) {
            this.flipo = 7;
            this.dudo = 200;
        }
        if (this.flipo == 8) {
            this.flipo = 9;
            this.dudo = 250;
        }
        if (this.flipo == 10) {
            this.flipo = 11;
            this.dudo = 200;
        }
        if (this.flipo == 12) {
            this.flipo = 13;
            this.dudo = 200;
        }
        if (this.flipo == 14) {
            this.flipo = 15;
            this.dudo = 100;
        }
        int n = 0;
        do {
            this.rd.drawImage(this.bgmain, 0, this.bgmy[n], null);
            int n2 = n;
            this.bgmy[n2] = this.bgmy[n2] - 2;
            if (this.bgmy[n] > -400) continue;
            this.bgmy[n] = 400;
        } while (++n < 2);
        boolean bl = this.aflk = !this.aflk;
        if (this.flipo != 1) {
            if (this.dudo > 0) {
                if (this.aflk) {
                    this.duds = Math.random() > Math.random() ? (int)(Math.random() * 3.0) : (int)(Math.random() * 2.0);
                }
                --this.dudo;
            } else {
                this.duds = 0;
            }
            this.rd.drawImage(this.dude[this.duds], 30, -10, null);
            this.rd.drawImage(this.oflaot, 127, 17, null);
        }
        this.rd.setColor(new Color(0, 0, 0));
        this.rd.setFont(new Font("SansSerif", 1, 13));
        if (this.flipo == 3 || this.flipo == 5) {
            if (this.flipo == 3) {
                this.rd.drawString("Hello!  Welcome to the world of", 197, 42);
                this.rd.drawString("!", 592, 42);
                this.rd.drawImage(this.nfm, 404, 28, null);
                this.rd.drawImage(this.recharged, 375, 47, null);
                this.rd.drawString("In this game there are two ways to complete a stage.", 197, 87);
                this.rd.drawString("One is by racing and finishing in first place, the other is by", 197, 107);
                this.rd.drawString("wasting and destroying all the other cars in the stage!", 197, 127);
            } else {
                this.rd.setColor(new Color(100, 100, 100));
                this.rd.drawString("While racing, you will need to focus on going fast and passing", 197, 42);
                this.rd.drawString("through all the checkpoints in the track. To complete a lap, you", 197, 62);
                this.rd.drawString("must not miss a checkpoint.", 197, 82);
                this.rd.drawString("While wasting, you will just need to chase the other cars and", 197, 102);
                this.rd.drawString("crash into them (without worrying about track and checkpoints).", 197, 122);
                this.rd.setColor(new Color(0, 0, 0));
            }
            this.rd.drawImage(this.racing, 100, 160, null);
            this.rd.drawImage(this.ory, 364, 210, null);
            this.rd.drawImage(this.wasting, 427, 160, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.rd.drawString("Checkpoint", 327, 164);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.rd.drawString("Drive your car using the Arrow Keys and Spacebar :", 60, 295);
            this.rd.drawImage(this.space, 106, 330, null);
            this.rd.drawImage(this.arrows, 440, 298, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.rd.drawString("(When your car is on the ground Spacebar is for Handbrake)", 60, 316);
            this.rd.drawString("Accelerate", 450, 294);
            this.rd.drawString("Brake/Reverse", 441, 372);
            this.rd.drawString("Turn left", 389, 350);
            this.rd.drawString("Turn right", 525, 350);
            this.rd.drawString("Handbrake", 182, 349);
        }
        if (this.flipo == 7 || this.flipo == 9) {
            if (this.flipo == 7) {
                this.rd.drawString("Whether you are racing or wasting the other cars you will need", 197, 42);
                this.rd.drawString("to power up your car (does not apply for some cars).", 197, 62);
                this.rd.drawString("=> More 'Power' makes your car become faster and stronger!", 197, 82);
                this.rd.drawString("To power up your car (and keep it powered up) you will need to", 197, 102);
                this.rd.drawString("perform stunts!", 197, 122);
                this.rd.drawImage(this.chil, 102, 270, null);
            } else {
                this.rd.drawString("The better the stunt the more power you get!", 197, 42);
                this.rd.setColor(new Color(100, 100, 100));
                this.rd.drawString("Forward looping pushes your car forwards in the air and helps", 197, 62);
                this.rd.drawString("when racing. Backward looping pushes your car upwards giving it", 197, 82);
                this.rd.drawString("more hang time in the air making it easier to control its landing.", 197, 102);
                this.rd.drawString("Left and right rolls shift your car in the air left and right slightly.", 197, 122);
                if (this.aflk || this.dudo < 150) {
                    this.rd.drawImage(this.chil, 102, 270, null);
                }
                this.rd.setColor(new Color(0, 0, 0));
            }
            this.rd.drawImage(this.stunts, 40, 150, null);
            this.rd.drawImage(this.opwr, 475, 228, null);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.rd.drawString("To perform stunts. When your car is in the AIR;", 60, 285);
            this.rd.drawString("Press combo Spacebar + Arrow Keys :", 60, 305);
            this.rd.drawImage(this.space, 120, 330, null);
            this.rd.drawImage(this.plus, 340, 333, null);
            this.rd.drawImage(this.arrows, 426, 298, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawString("Forward Loop", 427, 294);
            this.rd.drawString("Backward Loop", 425, 372);
            this.rd.drawString("Left Roll", 378, 350);
            this.rd.drawString("Right Roll", 511, 350);
            this.rd.drawString("Spacebar", 201, 349);
            this.rd.setColor(new Color(140, 243, 244));
            this.rd.fillRect(537, 232, 76, 9);
        }
        if (this.flipo == 11 || this.flipo == 13) {
            if (this.flipo == 11) {
                this.rd.drawString("When wasting cars, to help you find the other cars in the stage,", 197, 42);
                this.rd.drawString("press [ A ] to toggle the guidance arrow from pointing to the track", 197, 62);
                this.rd.drawString("to pointing to the cars.", 197, 82);
                this.rd.drawString("When your car is damaged, fix it (and reset its 'Damage') by", 197, 102);
                this.rd.drawString("jumping (or simply driving) through the electrified hoop.", 197, 122);
            } else {
                this.rd.setColor(new Color(100, 100, 100));
                this.rd.drawString("You will find that in some stages it's easier to waste the other cars", 197, 42);
                this.rd.drawString("and in others it's easier to race and finish in first place.", 197, 62);
                this.rd.drawString("(In some stages you can only race and in others only waste.)", 197, 82);
                this.rd.drawString("And remember, 'Power' is an important factor in the game. You", 197, 102);
                this.rd.drawString("will need it whether you are racing or wasting!", 197, 122);
                this.rd.setColor(new Color(0, 0, 0));
            }
            this.rd.drawImage(this.fixhoop, 120, 193, null);
            this.rd.drawImage(this.sarrow, 320, 203, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.rd.drawString("The Electrified Hoop", 127, 191);
            this.rd.drawString("Passing through it fixes your car.", 93, 313);
            this.rd.drawString("Make guidance arrow point to cars.", 320, 191);
        }
        if (this.flipo == 15) {
            this.rd.drawString("There are a total of 60 stages!", 197, 42);
            this.rd.drawString("All cars and stages come unlocked in Revised and Recharged.", 197, 62);
            this.rd.drawString("I am Coach Insano by the way.", 197, 102);
            this.rd.drawString("I am your coach and narrator in this game!  Good Luck!", 197, 122);
            this.rd.drawString("Other Controls :", 90, 180);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.rd.drawImage(this.kz, 100, 200, null);
            this.rd.drawString("OR", 141, 226);
            this.rd.drawImage(this.kx, 160, 200, null);
            this.rd.drawString("=> To look behind you while driving.", 202, 226);
            this.rd.drawImage(this.kv, 100, 250, null);
            this.rd.drawString("Change Views", 142, 276);
            this.rd.drawImage(this.kp, 100, 300, null);
            this.rd.drawString("OR", 141, 326);
            this.rd.drawImage(this.kenter, 160, 300, null);
            this.rd.drawString("Pause Game", 287, 326);
            this.rd.drawImage(this.km, 420, 200, null);
            this.rd.drawString("Mute Music", 462, 226);
            this.rd.drawImage(this.kn, 420, 250, null);
            this.rd.drawString("Mute Sound Effects", 462, 276);
        }
        if (this.flipo == 1) {
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(20, "Main Game Controls", 0, 0, 0, 3);
            this.rd.drawString("Drive your car using the Arrow Keys:", 60, 55);
            this.rd.drawString("On the GROUND Spacebar is for Handbrake", 60, 76);
            this.rd.drawImage(this.space, 106, 90, null);
            this.rd.drawImage(this.arrows, 440, 58, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            this.rd.drawString("Accelerate", 450, 54);
            this.rd.drawString("Brake/Reverse", 441, 132);
            this.rd.drawString("Turn left", 389, 110);
            this.rd.drawString("Turn right", 525, 110);
            this.rd.drawString("Handbrake", 182, 109);
            this.drawcs(150, "----------------------------------------------------------------------------------------------------------------------------------------------------", 0, 0, 0, 3);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.rd.drawString("To perform stunts:", 60, 175);
            this.rd.drawString("In the AIR press combo Spacebar + Arrow Keys :", 60, 195);
            this.rd.drawImage(this.space, 120, 220, null);
            this.rd.drawImage(this.plus, 340, 223, null);
            this.rd.drawImage(this.arrows, 426, 188, null);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawString("Forward Loop", 427, 184);
            this.rd.drawString("Backward Loop", 425, 262);
            this.rd.drawString("Left Roll", 378, 240);
            this.rd.drawString("Right Roll", 511, 240);
            this.rd.drawString("Spacebar", 201, 239);
            this.rd.drawImage(this.stunts, 60, 260, null);
        }
        if (this.flipo >= 1 && this.flipo <= 13) {
            this.rd.drawImage(this.next[this.pnext], 600, 370, null);
        }
        if (this.flipo >= 3 && this.flipo <= 15) {
            this.rd.drawImage(this.back[this.pback], 10, 370, null);
        }
        if (this.flipo == 15) {
            this.rd.drawImage(this.contin[this.pcontin], 500, 370, null);
        }
        if (control.enter || control.right) {
            if (this.flipo >= 1 && this.flipo <= 13) {
                ++this.flipo;
            }
            if (control.enter && this.flipo == 15) {
                this.flipo = 0;
                this.fase = this.oldfase;
                this.rd.setFont(new Font("SansSerif", 1, 11));
                this.ftm = this.rd.getFontMetrics();
                this.instructions.stop();
                this.instructions.unloadMod();
            }
            control.enter = false;
            control.right = false;
        }
        if (control.left) {
            if (this.flipo >= 3 && this.flipo <= 15) {
                this.flipo -= 3;
            }
            control.left = false;
        }
    }

    public void fleximage(Image image, int n, int n2) {
        ++this.debugFlexCallCount;
        System.out.println("[DBG-XT] fleximage BEGIN call=" + this.debugFlexCallCount
                + " n=" + n + " stage=" + n2
                + " imageNull=" + (image == null)
                + " flexpixNull=" + (this.flexpix == null));

        if (n == 0) {
            System.out.println("[DBG-XT] fleximage BEFORE PixelGrabber.grabPixels()");
            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, 670, 400, this.flexpix, 0, 670);
            try {
                pixelGrabber.grabPixels();
                System.out.println("[DBG-XT] fleximage AFTER PixelGrabber.grabPixels()");
            }
            catch (InterruptedException interruptedException) {
                System.out.println("[DBG-XT] fleximage PixelGrabber INTERRUPTED: " + interruptedException);
                interruptedException.printStackTrace();
            }
        }

        System.out.println("[DBG-XT] fleximage BEFORE 268000-pixel processing loop");
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = (int)(Math.random() * 128.0);
        int n8 = (int)(5.0 + Math.random() * 15.0);
        int n9 = 0;
        do {
            Color color = new Color(this.flexpix[n9]);
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            if (n3 == 0) {
                n4 = n10 = color.getRed();
                n5 = n11 = color.getGreen();
                n6 = n12 = color.getBlue();
            } else {
                n4 = n10 = (int)(((float)color.getRed() + (float)n4 * 0.38f * (float)n) / (1.0f + 0.38f * (float)n));
                n5 = n11 = (int)(((float)color.getGreen() + (float)n5 * 0.38f * (float)n) / (1.0f + 0.38f * (float)n));
                n6 = n12 = (int)(((float)color.getBlue() + (float)n6 * 0.38f * (float)n) / (1.0f + 0.38f * (float)n));
            }
            if (++n3 == 670) {
                n3 = 0;
            }
            int n13 = (n10 * 17 + n11 + n12 + n7) / 22;
            int n14 = (n11 * 17 + n10 + n12 + n7) / 22;
            int n15 = (n12 * 17 + n10 + n11 + n7) / 22;
            if (n2 == 17) {
                n13 = (n10 * 17 + n11 + n12 + n7) / 22;
                n14 = (n11 * 17 + n10 + n12 + n7) / 21;
                n15 = (n12 * 17 + n10 + n11 + n7) / 20;
            }
            if (--n8 == 0) {
                n7 = (int)(Math.random() * 128.0);
                n8 = (int)(5.0 + Math.random() * 15.0);
            }
            Color color2 = new Color(n13, n14, n15);
            this.flexpix[n9] = color2.getRGB();
        } while (++n9 < 268000);
        System.out.println("[DBG-XT] fleximage AFTER 268000-pixel processing loop");

        this.fleximg = this.createImage(new MemoryImageSource(670, 400, this.flexpix, 0, 670));
        System.out.println("[DBG-XT] fleximage AFTER createImage fleximgNull=" + (this.fleximg == null));

        this.rd.drawImage(this.fleximg, 0, 0, null);
        System.out.println("[DBG-XT] fleximage END call=" + this.debugFlexCallCount);
    }

    public void arrow(int n, int n2, CheckPoints checkPoints, boolean bl) {
        int n3;
        int n4;
        int n5;
        int n6;
        int[] nArray = new int[7];
        int[] nArray2 = new int[7];
        int[] nArray3 = new int[7];
        int n7 = 335;
        int n8 = -90;
        int n9 = 700;
        int n10 = 0;
        do {
            nArray2[n10] = n8;
        } while (++n10 < 7);
        nArray[0] = n7;
        nArray3[0] = n9 + 110;
        nArray[1] = n7 - 35;
        nArray3[1] = n9 + 50;
        nArray[2] = n7 - 15;
        nArray3[2] = n9 + 50;
        nArray[3] = n7 - 15;
        nArray3[3] = n9 - 50;
        nArray[4] = n7 + 15;
        nArray3[4] = n9 - 50;
        nArray[5] = n7 + 15;
        nArray3[5] = n9 + 50;
        nArray[6] = n7 + 35;
        nArray3[6] = n9 + 50;
        n10 = 0;
        if (!bl) {
            n6 = 0;
            if (checkPoints.x[n] - checkPoints.opx[0] >= 0) {
                n6 = 180;
            }
            n10 = (int)((double)(90 + n6) + Math.atan((double)(checkPoints.z[n] - checkPoints.opz[0]) / (double)(checkPoints.x[n] - checkPoints.opx[0])) / (Math.PI / 180));
        } else {
            n6 = 0;
            n5 = -1;
            n4 = 0;
            n3 = 1;
            do {
                if (this.py(checkPoints.opx[0] / 100, checkPoints.opx[n3] / 100, checkPoints.opz[0] / 100, checkPoints.opz[n3] / 100) >= n5 && n5 != -1 || n4 != 0 && checkPoints.onscreen[n3] == 0 || checkPoints.dested[n3] != 0) continue;
                n6 = n3;
                n5 = this.py(checkPoints.opx[0] / 100, checkPoints.opx[n3] / 100, checkPoints.opz[0] / 100, checkPoints.opz[n3] / 100);
                if (checkPoints.onscreen[n3] == 0) continue;
                n4 = 1;
            } while (++n3 < 7);
            n3 = 0;
            if (checkPoints.opx[n6] - checkPoints.opx[0] >= 0) {
                n3 = 180;
            }
            n10 = (int)((double)(90 + n3) + Math.atan((double)(checkPoints.opz[n6] - checkPoints.opz[0]) / (double)(checkPoints.opx[n6] - checkPoints.opx[0])) / (Math.PI / 180));
            this.drawcs(13, "[                                                 ]", 100, 100, 100, 0);
            this.drawcs(13, this.names[this.sc[n6]], 100, 100, 100, 0);
        }
        n10 += this.m.xz;
        while (n10 < 0) {
            n10 += 360;
        }
        while (n10 > 180) {
            n10 -= 360;
        }
        if (!bl) {
            if (n10 > 130) {
                n10 = 130;
            }
            if (n10 < -130) {
                n10 = -130;
            }
        } else {
            if (n10 > 100) {
                n10 = 100;
            }
            if (n10 < -100) {
                n10 = -100;
            }
        }
        if (Math.abs(this.ana - n10) < 180) {
            this.ana = Math.abs(this.ana - n10) < 10 ? n10 : (this.ana < n10 ? (this.ana = this.ana + 10) : (this.ana = this.ana - 10));
        } else {
            if (n10 < 0) {
                this.ana += 15;
                if (this.ana > 180) {
                    this.ana -= 360;
                }
            }
            if (n10 > 0) {
                this.ana -= 15;
                if (this.ana < -180) {
                    this.ana += 360;
                }
            }
        }
        this.rot(nArray, nArray3, n7, n9, this.ana, 7);
        n10 = Math.abs(this.ana);
        if (!bl) {
            if (n10 > 7 || n2 > 0 || n2 == -2 || this.cntan != 0) {
                n5 = 0;
                do {
                    nArray[n5] = this.xs(nArray[n5], nArray3[n5]);
                    nArray2[n5] = this.ys(nArray2[n5], nArray3[n5]);
                } while (++n5 < 7);
                n5 = (int)(190.0f + 190.0f * ((float)this.m.snap[0] / 100.0f));
                if (n5 > 255) {
                    n5 = 255;
                }
                if (n5 < 0) {
                    n5 = 0;
                }
                if ((n6 = (int)(255.0f + 255.0f * ((float)this.m.snap[1] / 100.0f))) > 255) {
                    n6 = 255;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                n4 = 0;
                if (n2 <= 0) {
                    if (n10 <= 45 && n2 != -2 && this.cntan == 0) {
                        n5 = (n5 * n10 + this.m.csky[0] * (45 - n10)) / 45;
                        n6 = (n6 * n10 + this.m.csky[1] * (45 - n10)) / 45;
                        n4 = (n4 * n10 + this.m.csky[2] * (45 - n10)) / 45;
                    }
                    if (n10 >= 90) {
                        n3 = (int)(255.0f + 255.0f * ((float)this.m.snap[0] / 100.0f));
                        if (n3 > 255) {
                            n3 = 255;
                        }
                        if (n3 < 0) {
                            n3 = 0;
                        }
                        if ((n5 = (n5 * (140 - n10) + n3 * (n10 - 90)) / 50) > 255) {
                            n5 = 255;
                        }
                    }
                } else if (this.flk) {
                    n5 = (int)(255.0f + 255.0f * ((float)this.m.snap[0] / 100.0f));
                    if (n5 > 255) {
                        n5 = 255;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    this.flk = false;
                } else {
                    n5 = (int)(255.0f + 255.0f * ((float)this.m.snap[0] / 100.0f));
                    if (n5 > 255) {
                        n5 = 255;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    if ((n6 = (int)(220.0f + 220.0f * ((float)this.m.snap[1] / 100.0f))) > 255) {
                        n6 = 255;
                    }
                    if (n6 < 0) {
                        n6 = 0;
                    }
                    this.flk = true;
                }
                this.rd.setColor(new Color(n5, n6, n4));
                this.rd.fillPolygon(nArray, nArray2, 7);
                n5 = (int)(115.0f + 115.0f * ((float)this.m.snap[0] / 100.0f));
                if (n5 > 255) {
                    n5 = 255;
                }
                if (n5 < 0) {
                    n5 = 0;
                }
                if ((n6 = (int)(170.0f + 170.0f * ((float)this.m.snap[1] / 100.0f))) > 255) {
                    n6 = 255;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                n4 = 0;
                if (n2 <= 0) {
                    if (n10 <= 45 && n2 != -2 && this.cntan == 0) {
                        n5 = (n5 * n10 + this.m.csky[0] * (45 - n10)) / 45;
                        n6 = (n6 * n10 + this.m.csky[1] * (45 - n10)) / 45;
                        n4 = (n4 * n10 + this.m.csky[2] * (45 - n10)) / 45;
                    }
                } else if (this.flk) {
                    n5 = (int)(255.0f + 255.0f * ((float)this.m.snap[0] / 100.0f));
                    if (n5 > 255) {
                        n5 = 255;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    n6 = 0;
                }
                this.rd.setColor(new Color(n5, n6, n4));
                this.rd.drawPolygon(nArray, nArray2, 7);
            }
        } else {
            n4 = 0;
            do {
                nArray[n4] = this.xs(nArray[n4], nArray3[n4]);
                nArray2[n4] = this.ys(nArray2[n4], nArray3[n4]);
            } while (++n4 < 7);
            n4 = (int)(159.0f + 159.0f * ((float)this.m.snap[0] / 100.0f));
            if (n4 > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            if ((n5 = (int)(207.0f + 207.0f * ((float)this.m.snap[1] / 100.0f))) > 255) {
                n5 = 255;
            }
            if (n5 < 0) {
                n5 = 0;
            }
            if ((n6 = (int)(255.0f + 255.0f * ((float)this.m.snap[2] / 100.0f))) > 255) {
                n6 = 255;
            }
            if (n6 < 0) {
                n6 = 0;
            }
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.fillPolygon(nArray, nArray2, 7);
            n4 = (int)(120.0f + 120.0f * ((float)this.m.snap[0] / 100.0f));
            if (n4 > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            if ((n5 = (int)(114.0f + 114.0f * ((float)this.m.snap[1] / 100.0f))) > 255) {
                n5 = 255;
            }
            if (n5 < 0) {
                n5 = 0;
            }
            if ((n6 = (int)(255.0f + 255.0f * ((float)this.m.snap[2] / 100.0f))) > 255) {
                n6 = 255;
            }
            if (n6 < 0) {
                n6 = 0;
            }
            this.rd.setColor(new Color(255, 255, 255));
            this.rd.drawPolygon(nArray, nArray2, 7);
        }
    }

    public void levelhigh(int n, int n2, int n3, int n4, int n5) {
        this.rd.drawImage(this.gameh, 236, 20, null);
        if (n != 0) {
            if (n3 == 0) {
                if (this.aflk) {
                    this.drawcs(60, "You Wasted 'em!", 255, 0, 0, 3);
                    this.aflk = false;
                } else {
                    this.drawcs(60, "You Wasted 'em!", 100, 0, 0, 3);
                    this.aflk = true;
                }
            } else if (n3 == 1) {
                if (this.aflk) {
                    this.drawcs(60, "Close Finish!", 0, 0, 255, 3);
                    this.aflk = false;
                } else {
                    this.drawcs(60, "Close Finish!", 0, 0, 100, 3);
                    this.aflk = true;
                }
            } else if (this.aflk) {
                this.drawcs(60, "Close Finish! Almost got it!", 0, 0, 255, 3);
                this.aflk = false;
            } else {
                this.drawcs(60, "Close Finish! Almost got it!", 0, 0, 100, 3);
                this.aflk = true;
            }
        } else if (n2 == 229) {
            if (this.aflk) {
                this.drawcs(60, "Wasted!", 255, 0, 0, 3);
                this.aflk = false;
            } else {
                this.drawcs(60, "Wasted!", 100, 0, 0, 3);
                this.aflk = true;
            }
        } else if (n5 > 2) {
            if (this.aflk) {
                this.drawcs(60, "Stunts!", 0, 255, 0, 3);
                this.aflk = false;
            } else {
                this.drawcs(60, "Stunts!", 0, 100, 0, 3);
                this.aflk = true;
            }
        } else if (this.aflk) {
            this.drawcs(60, "Best Stunt!", 0, 255, 0, 3);
            this.aflk = false;
        } else {
            this.drawcs(60, "Best Stunt!", 0, 100, 0, 3);
            this.aflk = true;
        }
        this.drawcs(380, "Press  [ Enter ]  to continue", 0, 0, 0, 0);
    }

    public void playsounds(Madness madness, Control control, int n) {
        if (this.fase == 0 && this.starcnt < 35 && this.cntwis != 8 && !this.mutes) {
            if (this.traincnt <= 3 && madness.cn == 37 && control.up && madness.speed < 2.0f && madness.speed > 0.0f) {
                this.train[(int)(this.m.random() * 3.0f)].play();
                this.traincnt = 25;
            }
            if (this.traincnt <= 3 && madness.cn == 37 && control.down && madness.speed > -2.0f && madness.speed < 0.0f) {
                this.train[(int)(this.m.random() * 3.0f)].play();
                this.traincnt = 25;
            }
            boolean bl = control.up && madness.speed > 0.0f || control.down && madness.speed < 10.0f;
            boolean bl2 = madness.skid == 1 && control.handb || Math.abs(madness.scz[0] - (madness.scz[1] + madness.scz[0] + madness.scz[2] + madness.scz[3]) / 4.0f) > 1.0f || Math.abs(madness.scx[0] - (madness.scx[1] + madness.scx[0] + madness.scx[2] + madness.scx[3]) / 4.0f) > 1.0f;
            boolean bl3 = false;
            if (control.up && madness.speed < 10.0f) {
                bl2 = true;
                bl = true;
                bl3 = true;
            }
            if (bl && madness.mtouch) {
                if (!madness.capsized) {
                    if (!bl2) {
                        if (madness.power != 98.0f) {
                            int n2;
                            if (Math.abs(madness.speed) > 0.0f && Math.abs(madness.speed) <= (float)madness.swits[madness.cn][0]) {
                                n2 = (int)(3.0f * Math.abs(madness.speed) / (float)madness.swits[madness.cn][0]);
                                if (n2 == 2) {
                                    if (this.pwait == 0) {
                                        n2 = 0;
                                    } else {
                                        --this.pwait;
                                    }
                                } else {
                                    this.pwait = 7;
                                }
                                this.sparkeng(n2);
                            }
                            if (Math.abs(madness.speed) > (float)madness.swits[madness.cn][0] && Math.abs(madness.speed) <= (float)madness.swits[madness.cn][1]) {
                                n2 = (int)(3.0f * (Math.abs(madness.speed) - (float)madness.swits[madness.cn][0]) / (float)(madness.swits[madness.cn][1] - madness.swits[madness.cn][0]));
                                if (n2 == 2) {
                                    if (this.pwait == 0) {
                                        n2 = 0;
                                    } else {
                                        --this.pwait;
                                    }
                                } else {
                                    this.pwait = 7;
                                }
                                this.sparkeng(n2);
                            }
                            if (Math.abs(madness.speed) > (float)madness.swits[madness.cn][1] && Math.abs(madness.speed) <= (float)madness.swits[madness.cn][2]) {
                                n2 = (int)(3.0f * (Math.abs(madness.speed) - (float)madness.swits[madness.cn][1]) / (float)(madness.swits[madness.cn][2] - madness.swits[madness.cn][1]));
                                this.sparkeng(n2);
                            }
                        } else {
                            int n3 = 2;
                            if (this.pwait == 0) {
                                if (Math.abs(madness.speed) > (float)madness.swits[madness.cn][1]) {
                                    n3 = 3;
                                }
                            } else {
                                --this.pwait;
                            }
                            this.sparkeng(n3);
                        }
                    } else {
                        this.sparkeng(-1);
                        if (bl3 && madness.cn != 21 && madness.cn != 24 && madness.cn != 25 && madness.cn != 28 && madness.cn != 29 && madness.cn != 30 && madness.cn != 31 && madness.cn != 33 && madness.cn != 34 && madness.cn != 36 && madness.cn != 37 && madness.cn != 38 && madness.cn != 39) {
                            if (this.stopcnt <= 0) {
                                this.air[5].loop();
                                this.stopcnt = 10;
                            }
                        } else if (this.stopcnt <= -2 && madness.cn != 21 && madness.cn != 24 && madness.cn != 25 && madness.cn != 28 && madness.cn != 29 && madness.cn != 30 && madness.cn != 31 && madness.cn != 33 && madness.cn != 34 && madness.cn != 36 && madness.cn != 37 && madness.cn != 38 && madness.cn != 39) {
                            this.air[2 + (int)(this.m.random() * 3.0f)].loop();
                            this.stopcnt = 7;
                        }
                    }
                } else {
                    this.sparkeng(3);
                }
                this.grrd = false;
                this.aird = false;
            } else {
                this.pwait = 15;
                if (!madness.mtouch && !this.grrd && (double)this.m.random() > 0.4) {
                    this.air[(int)(this.m.random() * 4.0f)].loop();
                    this.stopcnt = 5;
                    this.grrd = true;
                }
                if (!madness.wtouch && !this.aird) {
                    this.stopairs();
                    this.air[(int)(this.m.random() * 4.0f)].loop();
                    this.stopcnt = 10;
                    this.aird = true;
                }
                this.sparkeng(-1);
            }
            if (madness.cntdest != 0 && this.cntwis < 7) {
                if (!this.pwastd) {
                    this.wastd.loop();
                    this.pwastd = true;
                }
            } else {
                if (this.pwastd) {
                    this.wastd.stop();
                    this.pwastd = false;
                }
                if (this.cntwis == 7 && !this.mutes) {
                    this.explosion.play();
                    this.firewasted.play();
                    this.flames.loop();
                }
            }
        } else {
            this.sparkeng(-2);
            if (this.pwastd) {
                this.wastd.stop();
                this.pwastd = false;
            }
        }
        if (this.traincnt > 3) {
            --this.traincnt;
        }
        if (this.stopcnt != -20) {
            if (this.stopcnt == 1) {
                this.stopairs();
            }
            --this.stopcnt;
        }
        if (this.bfcrash != 0) {
            --this.bfcrash;
        }
        if (this.bfskid != 0) {
            --this.bfskid;
        }
        if (madness.newcar) {
            this.cntwis = 0;
        }
        if (this.fase == 0 || this.fase == 6 || this.fase == -1 || this.fase == -2 || this.fase == -3 || this.fase == -4 || this.fase == -5) {
            if (this.mutes != control.mutes) {
                this.mutes = control.mutes;
            }
            if (control.mutem != this.mutem) {
                this.mutem = control.mutem;
                if (this.mutem) {
                    if (this.loadedt[n - 1]) {
                        this.stracks[n - 1].stop();
                    }
                } else if (this.loadedt[n - 1]) {
                    this.stracks[n - 1].resume();
                }
            }
        }
        if (madness.cntdest != 0 && this.cntwis < 7) {
            if (madness.dest) {
                ++this.cntwis;
            }
        } else {
            if (madness.cntdest == 0) {
                this.cntwis = 0;
            }
            if (this.cntwis == 7) {
                this.cntwis = 8;
            }
        }
        if (!madness.dest || this.fase != 0 || this.mutes) {
            this.flames.stop();
        }
        this.car = madness.cn;
    }

    public void crash(float f, int n) {
        if (this.bfcrash == 0) {
            if (n == 0) {
                if (Math.abs(f) > 25.0f && Math.abs(f) < 170.0f) {
                    if (!this.mutes) {
                        this.lowcrash[this.crshturn].play();
                    }
                    this.bfcrash = 2;
                }
                if (Math.abs(f) >= 170.0f) {
                    if (!this.mutes) {
                        this.crash[this.crshturn].play();
                    }
                    this.bfcrash = 2;
                }
                if (Math.abs(f) > 25.0f) {
                    int n2 = this.crshturn = this.crashup ? (this.crshturn = this.crshturn - 1) : (this.crshturn = this.crshturn + 1);
                    if (this.crshturn == -1) {
                        this.crshturn = 2;
                    }
                    if (this.crshturn == 3) {
                        this.crshturn = 0;
                    }
                }
            }
            if (n == -1) {
                if (Math.abs(f) > 25.0f && Math.abs(f) < 170.0f) {
                    if (!this.mutes) {
                        this.lowcrash[2].play();
                    }
                    this.bfcrash = 2;
                }
                if (Math.abs(f) > 170.0f) {
                    if (!this.mutes) {
                        this.crash[2].play();
                    }
                    this.bfcrash = 2;
                }
            }
            if (n == 1 && !this.mutes) {
                if (this.car != 24 && this.car != 25 && this.car != 26 && this.car != 35 && this.car != 37 && this.car != 38 && this.car != 39) {
                    this.tires.play();
                    this.bfcrash = 3;
                } else {
                    this.crash[this.crshturn].play();
                    this.bfcrash = 2;
                }
            }
        }
    }

    public int ys(int n, int n2) {
        if (n2 < 50) {
            n2 = 50;
        }
        return (n2 - this.m.focus_point) * (this.m.cy - n) / n2 + n;
    }

    public void replyn() {
        if (this.aflk) {
            this.drawcs(30, "", 0, 0, 0, 0);
            this.aflk = false;
        } else {
            this.drawcs(30, "", 0, 128, 255, 0);
            this.aflk = true;
        }
    }

    private Image pressed(Image image) {
        int n = image.getHeight(this.ob);
        int n2 = image.getWidth(this.ob);
        int[] nArray = new int[n2 * n];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n2, n, nArray, 0, n2);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        for (int i = 0; i < n2 * n; ++i) {
            if (nArray[i] == nArray[n2 * n - 1]) continue;
            nArray[i] = -16777216;
        }
        Image image2 = this.createImage(new MemoryImageSource(n2, n, nArray, 0, n2));
        return image2;
    }

    private Image dodgen(Image image) {
        int n = image.getHeight(this.ob);
        int n2 = image.getWidth(this.ob);
        int[] nArray = new int[n2 * n];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n2, n, nArray, 0, n2);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        for (int i = 0; i < n2 * n; ++i) {
            int n3;
            int n4;
            Color color = new Color(nArray[i]);
            int n5 = color.getRed() * 3 + 90;
            if (n5 > 255) {
                n5 = 255;
            }
            if (n5 < 0) {
                n5 = 0;
            }
            if ((n4 = color.getGreen() * 3 + 90) > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            if ((n3 = color.getBlue() * 3 + 90) > 255) {
                n3 = 255;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            Color color2 = new Color(n5, n4, n3);
            nArray[i] = color2.getRGB();
        }
        Image image2 = this.createImage(new MemoryImageSource(n2, n, nArray, 0, n2));
        return image2;
    }

    private void smokeypix(byte[] byArray, MediaTracker mediaTracker, Toolkit toolkit) {
        Image image = toolkit.createImage(byArray);
        mediaTracker.addImage(image, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, 466, 202, this.smokey, 0, 466);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public void stoploading() {
        this.loading();
        this.app.repaint();
        this.runner.stop();
        this.runner = null;
        this.runtyp = 0;
    }

    public void nofocus() {
        this.rd.setColor(new Color(255, 255, 255));
        this.rd.fillRect(0, 0, 670, 20);
        this.rd.fillRect(0, 0, 20, 400);
        this.rd.fillRect(0, 380, 670, 20);
        this.rd.fillRect(650, 0, 20, 400);
        this.rd.setColor(new Color(192, 192, 192));
        this.rd.drawRect(20, 20, 630, 360);
        this.rd.setColor(new Color(0, 0, 0));
        this.rd.drawRect(22, 22, 626, 356);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(14, "Game lost its focus.   Click screen with mouse to continue.", 100, 100, 100, 3);
        this.drawcs(395, "Game lost its focus.   Click screen with mouse to continue.", 100, 100, 100, 3);
    }

    public void rot(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            for (int i = 0; i < n4; ++i) {
                int n5 = nArray[i];
                int n6 = nArray2[i];
                nArray[i] = n + (int)((float)(n5 - n) * this.m.cos(n3) - (float)(n6 - n2) * this.m.sin(n3));
                nArray2[i] = n2 + (int)((float)(n5 - n) * this.m.sin(n3) + (float)(n6 - n2) * this.m.cos(n3));
            }
        }
    }

    public boolean overon(int n, int n2, int n3, int n4, int n5, int n6) {
        return n5 > n && n5 < n + n3 && n6 > n2 && n6 < n2 + n4;
    }

    public void pauseimage(Image image) {
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, 670, 400, this.flexpix, 0, 670);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        do {
            Color color = new Color(this.flexpix[n5]);
            int n6 = 0;
            int n7 = n3 = n4 == 0 ? (n6 = (color.getRed() + color.getGreen() + color.getBlue()) / 3) : (n6 = (color.getRed() + color.getGreen() + color.getBlue() + n3 * 30) / 33);
            if (++n4 == 670) {
                n4 = 0;
            }
            if (n5 > 670 * (8 + n2) + 216 && n2 < 188) {
                int n8 = (n6 + 60) / 3;
                int n9 = (n6 + 135) / 3;
                int n10 = (n6 + 220) / 3;
                if (++n == 237) {
                    ++n2;
                    n = 0;
                }
                Color color2 = new Color(n8, n9, n10);
                this.flexpix[n5] = color2.getRGB();
                continue;
            }
            Color color3 = new Color(n6, n6, n6);
            this.flexpix[n5] = color3.getRGB();
        } while (++n5 < 268000);
        this.fleximg = this.createImage(new MemoryImageSource(670, 400, this.flexpix, 0, 670));
        this.rd.drawImage(this.fleximg, 0, 0, null);
        this.m.flex = 0;
    }

    public void loadmusic(int n, int n2) {
        this.hipnoload(n, false);
        this.app.setCursor(new Cursor(3));
        this.app.repaint();
        boolean bl = false;
        if (n == this.unlocked && (n == 1 || n == 2 || n == 3 || n == 4 || n == 7 || n == 8 || n == 9 || n == 10 || n == 12 || n == 13 || n == 16)) {
            bl = true;
        }
        if (bl) {
            this.runtyp = n;
            this.runner = new Thread(this);
            this.runner.start();
        }
        if (!this.loadedt[n - 1]) {
            this.stracks[n - 1] = new RadicalMod("music/stage" + n + ".radq", this.app);
            if (this.stracks[n - 1].loaded == 1) {
                this.loadedt[n - 1] = true;
            }
        }
        if (n == 1) {
            this.stracks[0].loadMod(130, 8000, 128, this.sunny, this.macn);
        }
        if (n == 2) {
            this.stracks[1].loadMod(260, 7200, 125, this.sunny, this.macn);
        }
        if (n == 3) {
            this.stracks[2].loadMod(400, 8000, 125, this.sunny, this.macn);
        }
        if (n == 4) {
            this.stracks[3].loadMod(190, 8000, 125, this.sunny, this.macn);
        }
        if (n == 5) {
            this.stracks[4].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 6) {
            this.stracks[5].loadMod(220, 7600, 125, this.sunny, this.macn);
        }
        if (n == 7) {
            this.stracks[6].loadMod(500, 8150, 125, this.sunny, this.macn);
        }
        if (n == 8) {
            this.stracks[7].loadMod(230, 8150, 125, this.sunny, this.macn);
        }
        if (n == 9) {
            this.stracks[8].loadMod(200, 7900, 125, this.sunny, this.macn);
        }
        if (n == 10) {
            this.stracks[9].loadMod(232, 7300, 125, this.sunny, this.macn);
        }
        if (n == 11) {
            this.stracks[10].loadMod(370, 7900, 125, this.sunny, this.macn);
        }
        if (n == 12) {
            this.stracks[11].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 13) {
            this.stracks[12].loadMod(270, 8000, 125, this.sunny, this.macn);
        }
        if (n == 14) {
            this.stracks[13].loadMod(230, 8000, 125, this.sunny, this.macn);
        }
        if (n == 15) {
            this.stracks[14].loadMod(220, 8000, 125, this.sunny, this.macn);
        }
        if (n == 16) {
            this.stracks[15].loadMod(261, 8000, 125, this.sunny, this.macn);
        }
        if (n == 17) {
            this.stracks[16].loadMod(400, 7600, 125, this.sunny, this.macn);
        }
        if (n == 18) {
            this.stracks[17].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 19) {
            this.stracks[18].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 20) {
            this.stracks[19].loadMod(350, 8100, 145, this.sunny, this.macn);
        }
        if (n == 21) {
            this.stracks[20].loadMod(200, 7900, 125, this.sunny, this.macn);
        }
        if (n == 22) {
            this.stracks[21].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 23) {
            this.stracks[22].loadMod(222, 7600, 125, this.sunny, this.macn);
        }
        if (n == 24) {
            this.stracks[23].loadMod(230, 8000, 125, this.sunny, this.macn);
        }
        if (n == 25) {
            this.stracks[24].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 26) {
            this.stracks[25].loadMod(261, 8000, 125, this.sunny, this.macn);
        }
        if (n == 27) {
            this.stracks[26].loadMod(400, 8000, 125, this.sunny, this.macn);
        }
        if (n == 28) {
            this.stracks[27].loadMod(400, 8150, 125, this.sunny, this.macn);
        }
        if (n == 29) {
            this.stracks[28].loadMod(350, 8150, 125, this.sunny, this.macn);
        }
        if (n == 30) {
            this.stracks[29].loadMod(400, 10000, 125, this.sunny, this.macn);
        }
        if (n == 31) {
            this.stracks[30].loadMod(290, 8150, 125, this.sunny, this.macn);
        }
        if (n == 32) {
            this.stracks[31].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 33) {
            this.stracks[32].loadMod(222, 8100, 125, this.sunny, this.macn);
        }
        if (n == 34) {
            this.stracks[33].loadMod(230, 8150, 125, this.sunny, this.macn);
        }
        if (n == 35) {
            this.stracks[34].loadMod(220, 8150, 125, this.sunny, this.macn);
        }
        if (n == 36) {
            this.stracks[35].loadMod(350, 8100, 145, this.sunny, this.macn);
        }
        if (n == 37) {
            this.stracks[36].loadMod(290, 8150, 125, this.sunny, this.macn);
        }
        if (n == 38) {
            this.stracks[37].loadMod(300, 8150, 136, this.sunny, this.macn);
        }
        if (n == 39) {
            this.stracks[38].loadMod(300, 8150, 136, this.sunny, this.macn);
        }
        if (n == 40) {
            this.stracks[39].loadMod(250, 8150, 125, this.sunny, this.macn);
        }
        if (n == 41) {
            this.stracks[40].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 42) {
            this.stracks[41].loadMod(400, 8150, 128, this.sunny, this.macn);
        }
        if (n == 43) {
            this.stracks[42].loadMod(222, 7900, 120, this.sunny, this.macn);
        }
        if (n == 44) {
            this.stracks[43].loadMod(230, 8150, 125, this.sunny, this.macn);
        }
        if (n == 45) {
            this.stracks[44].loadMod(250, 8100, 125, this.sunny, this.macn);
        }
        if (n == 46) {
            this.stracks[45].loadMod(250, 8000, 145, this.sunny, this.macn);
        }
        if (n == 47) {
            this.stracks[46].loadMod(400, 8150, 140, this.sunny, this.macn);
        }
        if (n == 48) {
            this.stracks[47].loadMod(300, 8150, 145, this.sunny, this.macn);
        }
        if (n == 49) {
            this.stracks[48].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 50) {
            this.stracks[49].loadMod(232, 8150, 122, this.sunny, this.macn);
        }
        if (n == 51) {
            this.stracks[50].loadMod(300, 8150, 125, this.sunny, this.macn);
        }
        if (n == 52) {
            this.stracks[51].loadMod(230, 7900, 125, this.sunny, this.macn);
        }
        if (n == 53) {
            this.stracks[52].loadMod(300, 8200, 125, this.sunny, this.macn);
        }
        if (n == 54) {
            this.stracks[53].loadMod(230, 7900, 125, this.sunny, this.macn);
        }
        if (n == 55) {
            this.stracks[54].loadMod(250, 8150, 125, this.sunny, this.macn);
        }
        if (n == 56) {
            this.stracks[55].loadMod(250, 8100, 125, this.sunny, this.macn);
        }
        if (n == 57) {
            this.stracks[56].loadMod(300, 8150, 130, this.sunny, this.macn);
        }
        if (n == 58) {
            this.stracks[57].loadMod(300, 8200, 125, this.sunny, this.macn);
        }
        if (n == 59) {
            this.stracks[58].loadMod(500, 8150, 125, this.sunny, this.macn);
        }
        if (n == 60) {
            this.stracks[59].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 61) {
            this.stracks[60].loadMod(500, 8150, 125, this.sunny, this.macn);
        }
        if (n == 62) {
            this.stracks[61].loadMod(400, 7900, 125, this.sunny, this.macn);
        }
        if (n == 63) {
            this.stracks[62].loadMod(500, 8150, 125, this.sunny, this.macn);
        }
        if (n == 64) {
            this.stracks[63].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 65) {
            this.stracks[64].loadMod(500, 8150, 125, this.sunny, this.macn);
        }
        if (n == 66) {
            this.stracks[65].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 67) {
            this.stracks[66].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 68) {
            this.stracks[67].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 69) {
            this.stracks[68].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (n == 70) {
            this.stracks[69].loadMod(600, 8150, 145, this.sunny, this.macn);
        }
        if (bl) {
            this.runner.stop();
            this.runner = null;
            this.runtyp = 0;
        }
        System.gc();
        this.lastload = n - 1;
        if (n2 == 0) {
            if (this.loadedt[n - 1]) {
                this.stracks[n - 1].play();
            }
            this.app.setCursor(new Cursor(0));
            this.fase = 6;
        } else {
            this.fase = 176;
        }
        this.pcontin = 0;
        this.mutem = false;
        this.mutes = false;
    }

    public void loadimages() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        MediaTracker mediaTracker = new MediaTracker(this.app);
        this.dnload += 12;
        try {
            URL uRL = new URL(this.app.getCodeBase(), "data/images.radq");
            DataInputStream dataInputStream = new DataInputStream(uRL.openStream());
            ZipInputStream zipInputStream = new ZipInputStream(dataInputStream);
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                int n;
                int n2 = (int)zipEntry.getSize();
                String string = zipEntry.getName();
                byte[] byArray = new byte[n2];
                int n3 = 0;
                for (n2 = (int)zipEntry.getSize(); n2 > 0; n2 -= n) {
                    n = zipInputStream.read(byArray, n3, n2);
                    n3 += n;
                }
                if (string.equals("cars.gif")) {
                    this.carsbg = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("smokey.gif")) {
                    this.smokeypix(byArray, mediaTracker, toolkit);
                }
                if (string.equals("1.gif")) {
                    this.orank[0] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("gameh.gif")) {
                    this.ogameh = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("gameov.gif")) {
                    this.gameov = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("lap.gif")) {
                    this.olap = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("paused.gif")) {
                    this.paused = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("select.gif")) {
                    this.select = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("yourwasted.gif")) {
                    this.oyourwasted = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("youwastedem.gif")) {
                    this.oyouwastedem = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("d1.gif")) {
                    this.dude[0] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("d2.gif")) {
                    this.dude[1] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("d3.gif")) {
                    this.dude[2] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("float.gif")) {
                    this.oflaot = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("1c.gif")) {
                    this.ocntdn[1] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("2c.gif")) {
                    this.ocntdn[2] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("3c.gif")) {
                    this.ocntdn[3] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("2.gif")) {
                    this.orank[1] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("3.gif")) {
                    this.orank[2] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("4.gif")) {
                    this.orank[3] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("5.gif")) {
                    this.orank[4] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("6.gif")) {
                    this.orank[5] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("7.gif")) {
                    this.orank[6] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("bgmain.jpg")) {
                    this.bgmain = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("br.gif")) {
                    this.br = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("loadingmusic.gif")) {
                    this.oloadingmusic = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("radicalplay.gif")) {
                    this.radicalplay = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("back.gif")) {
                    this.back[0] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.back[1] = this.bressed(this.back[0]);
                }
                if (string.equals("continue2.gif")) {
                    this.contin[0] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.contin[1] = this.bressed(this.contin[0]);
                }
                if (string.equals("next.gif")) {
                    this.next[0] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.next[1] = this.bressed(this.next[0]);
                }
                if (string.equals("pgate.gif")) {
                    this.pgate = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("rpro.gif")) {
                    this.rpro = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("selectcar.gif")) {
                    this.selectcar = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("track1.jpg")) {
                    this.trackbg[0][0] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.trackbg[1][0] = this.dodgen(this.trackbg[0][0]);
                }
                if (string.equals("track2.jpg")) {
                    this.trackbg[0][1] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.trackbg[1][1] = this.dodgen(this.trackbg[0][1]);
                }
                if (string.equals("youlost.gif")) {
                    this.oyoulost = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("youwon.gif")) {
                    this.oyouwon = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("0c.gif")) {
                    this.ocntdn[0] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("damage.gif")) {
                    this.odmg = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("power.gif")) {
                    this.opwr = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("position.gif")) {
                    this.opos = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("wasted.gif")) {
                    this.owas = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("start1.gif")) {
                    this.ostar[0] = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("start2.gif")) {
                    this.ostar[1] = this.loadimage(byArray, mediaTracker, toolkit);
                    this.star[2] = this.pressed(this.ostar[1]);
                }
                if (string.equals("congrad.gif")) {
                    this.congrd = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("statb.gif")) {
                    this.statb = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("statbo.gif")) {
                    this.statbo = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("madness.gif")) {
                    this.mdness = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("fixhoop.gif")) {
                    this.fixhoop = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("arrow.gif")) {
                    this.sarrow = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("stunts.gif")) {
                    this.stunts = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("racing.gif")) {
                    this.racing = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("wasting.gif")) {
                    this.wasting = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("plus.gif")) {
                    this.plus = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("space.gif")) {
                    this.space = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("arrows.gif")) {
                    this.arrows = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("chil.gif")) {
                    this.chil = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("ory.gif")) {
                    this.ory = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kz.gif")) {
                    this.kz = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kx.gif")) {
                    this.kx = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kv.gif")) {
                    this.kv = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kp.gif")) {
                    this.kp = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("km.gif")) {
                    this.km = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kn.gif")) {
                    this.kn = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("kenter.gif")) {
                    this.kenter = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("nfm.gif")) {
                    this.nfm = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("options.gif")) {
                    this.opti = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("opback.gif")) {
                    this.opback = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("logocars.gif")) {
                    this.logocars = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("logomadmess.gif")) {
                    this.logomadnes = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("logomadbg.gif")) {
                    this.logomadbg = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("byrd.gif")) {
                    this.byrd = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("nfmcoms.gif")) {
                    this.nfmcoms = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("nfmcom.gif")) {
                    this.nfmcom = this.loadimage(byArray, mediaTracker, toolkit);
                }
                if (string.equals("recharged.gif")) {
                    this.recharged = this.loadimage(byArray, mediaTracker, toolkit);
                }
                this.dnload += 3;
                zipEntry = zipInputStream.getNextEntry();
            }
            dataInputStream.close();
            zipInputStream.close();
        }
        catch (Exception exception) {
            System.out.println("Error Loading Images: " + exception);
        }
        System.gc();
    }

    public void pausedgame(int n, Control control, Record record) {
        this.rd.drawImage(this.fleximg, 0, 0, null);
        if (control.up) {
            --this.opselect;
            if (this.opselect == -1) {
                this.opselect = 3;
            }
            control.up = false;
        }
        if (control.down) {
            ++this.opselect;
            if (this.opselect == 4) {
                this.opselect = 0;
            }
            control.down = false;
        }
        if (this.opselect == 0) {
            this.rd.setColor(new Color(150, 150, 150));
            this.rd.fillRoundRect(264, 45, 137, 22, 7, 20);
            if (this.shaded) {
                this.rd.setColor(new Color(225, 200, 255));
            } else {
                this.rd.setColor(new Color(0, 0, 0));
            }
            this.rd.drawRoundRect(264, 45, 137, 22, 7, 20);
        }
        if (this.opselect == 1) {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.fillRoundRect(255, 73, 155, 22, 7, 20);
            if (this.shaded) {
                this.rd.setColor(new Color(225, 200, 255));
            } else {
                this.rd.setColor(new Color(255, 255, 255));
            }
            this.rd.drawRoundRect(255, 73, 155, 22, 7, 20);
        }
        if (this.opselect == 2) {
            this.rd.setColor(new Color(0, 255, 0));
            this.rd.fillRoundRect(238, 99, 190, 22, 7, 20);
            if (this.shaded) {
                this.rd.setColor(new Color(225, 200, 255));
            } else {
                this.rd.setColor(new Color(0, 255, 0));
            }
            this.rd.drawRoundRect(238, 99, 190, 22, 7, 20);
        }
        if (this.opselect == 3) {
            this.rd.setColor(new Color(255, 0, 0));
            this.rd.fillRoundRect(276, 125, 109, 22, 7, 20);
            if (this.shaded) {
                this.rd.setColor(new Color(225, 200, 255));
            } else {
                this.rd.setColor(new Color(255, 0, 0));
            }
            this.rd.drawRoundRect(276, 125, 109, 22, 7, 20);
        }
        this.rd.drawImage(this.paused, 216, 8, null);
        if (control.enter || control.handb) {
            if (this.opselect == 0) {
                if (this.loadedt[n - 1] && !this.mutem) {
                    this.stracks[n - 1].resume();
                }
                this.fase = 0;
            }
            if (this.opselect == 1) {
                if (record.caught >= 300) {
                    if (this.loadedt[n - 1] && !this.mutem) {
                        this.stracks[n - 1].resume();
                    }
                    this.fase = -1;
                } else {
                    this.fase = -8;
                }
            }
            if (this.opselect == 2) {
                if (this.loadedt[n - 1]) {
                    this.stracks[n - 1].stop();
                }
                this.oldfase = -7;
                this.fase = 11;
            }
            if (this.opselect == 3) {
                if (this.loadedt[n - 1]) {
                    this.stracks[n - 1].stop();
                }
                this.fase = 10;
                this.opselect = 0;
            }
            control.enter = false;
            control.handb = false;
        }
    }

    public void credits(Control control) {
        int n;
        int n2;
        this.credits.play();
        this.credits.loadMod(1100, 8150, 144, this.sunny, this.macn);
        this.lastload = -22;
        if (this.flipo == 0) {
            this.flipo = 1;
            this.bgmy[0] = 0;
            this.bgmy[1] = 400;
        }
        if (this.flipo >= 1 && this.flipo <= 100) {
            this.rad(this.flipo);
            ++this.flipo;
            if (this.flipo == 100) {
                this.flipo = 1;
            }
        }
        if (this.flipo == 101) {
            n2 = 0;
            do {
                this.rd.drawImage(this.bgmain, 0, this.bgmy[n2], null);
                int n3 = n2;
                this.bgmy[n3] = this.bgmy[n3] - 10;
                if (this.bgmy[n2] > -400) continue;
                this.bgmy[n2] = 400;
            } while (++n2 < 2);
            this.rd.drawImage(this.mdness, 218, 7, null);
            this.rd.drawImage(this.recharged, 199, 265, null);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(65, "At Radicalplay.com", 0, 0, 0, 3);
            this.drawcs(100, "Cartoon 3D Engine, Game Programming, 3D Models, Graphics and Sound Effects", 0, 0, 0, 3);
            this.drawcs(120, "Everything By Omar Waly", 70, 70, 70, 3);
            this.drawcs(140, "Game Edited By NeedForMadnessExpert  N.F.M.E.  R.A.", 0, 0, 0, 3);
            this.drawcs(155, "whatever you call me!", 0, 0, 0, 3);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(180, "Thanks for Game Testing", 0, 0, 0, 3);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(200, "Soufy H Abutaleb, Sherif Abouzeid,", 90, 90, 90, 3);
            this.drawcs(215, "Kareem Mansour, Youssef Wahby,", 90, 90, 90, 3);
            this.drawcs(230, "Taymour Farid, Mahmoud Waly", 90, 90, 90, 3);
            this.drawcs(245, "and Mahmoud Ezzeldin (Turbo)", 90, 90, 90, 3);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(340, "Music was obtained from the ModArchive.org", 0, 0, 0, 3);
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(360, "All tracks were remixed to fit game by Omar Waly (and N.F.M.E.)", 90, 90, 90, 3);
            this.drawcs(380, "For more details about the music: http://www.radicalplay.com/madcars/music.html", 90, 90, 90, 3);
        }
        if (this.flipo == 102) {
            n = 0;
            do {
                this.rd.drawImage(this.bgmain, 0, this.bgmy[n], null);
                n2 = n;
                this.bgmy[n2] = this.bgmy[n2] - 16;
                if (this.bgmy[n] > -400) continue;
                this.bgmy[n] = 400;
            } while (++n < 2);
            this.rd.drawImage(this.nfmcom, 125, 170, null);
        }
        this.rd.drawImage(this.next[this.pnext], 600, 370, null);
        if (this.flipo == 103) {
            n = 0;
            do {
                this.rd.drawImage(this.bgmain, 0, this.bgmy[n], null);
                n2 = n;
                this.bgmy[n2] = this.bgmy[n2] - 22;
                if (this.bgmy[n] > -400) continue;
                this.bgmy[n] = 400;
            } while (++n < 2);
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(65, "Changes to the Game:", 0, 0, 0, 3);
            this.drawcs(100, "Better cars with better stats", 0, 0, 0, 3);
            this.drawcs(120, "Bigger stages", 0, 0, 0, 3);
            this.drawcs(140, "New music (not yet implemented)", 0, 0, 0, 3);
            this.drawcs(160, "More superior cars (Destroyer, Warhead, KILL-O-MATIC, Train of Terror, etc.)", 0, 0, 0, 3);
            this.drawcs(180, "New colors", 0, 0, 0, 3);
            this.drawcs(200, "Power BEYOND the MAX (with the Warheads)", 0, 0, 0, 3);
            this.drawcs(220, "Fight your own kind", 0, 0, 0, 3);
            this.drawcs(240, "More car/jet engine sounds (not yet implemented)", 0, 0, 0, 3);
            this.drawcs(260, "FLOATING STAGES! (not yet implemented)", 0, 0, 0, 3);
            this.drawcs(280, "Cars will fly in some stages", 0, 0, 0, 3);
            this.drawcs(300, "More Challenging Gameplay", 0, 0, 0, 3);
            this.drawcs(320, "More realistic (includes trees, clouds, mountains etc.)", 0, 0, 0, 3);
            this.drawcs(340, "A total of 40 CARS and 60 STAGES", 0, 0, 0, 3);
            this.drawcs(360, "Includes all the original stages and cars (with original stats) as well", 0, 0, 0, 3);
            this.drawcs(380, "FIREPOWER?! Maybe in the future", 0, 0, 0, 3);
            this.rd.drawImage(this.recharged, 199, 20, null);
        }
        this.rd.drawImage(this.next[this.pnext], 600, 370, null);
        if (control.enter || control.handb || control.right) {
            if (this.flipo >= 1 && this.flipo <= 100) {
                this.flipo = 101;
                this.app.setCursor(new Cursor(0));
            } else {
                ++this.flipo;
            }
            if (this.flipo == 104) {
                this.flipo = 0;
                this.fase = 10;
                this.credits.stop();
                this.credits.unloadMod();
            }
            control.enter = false;
            control.handb = false;
            control.right = false;
        }
    }

    public float pys(int n, int n2, int n3, int n4) {
        return (float)Math.sqrt((n - n2) * (n - n2) + (n3 - n4) * (n3 - n4));
    }

    public void stat(Madness madness, CheckPoints checkPoints, Control control, boolean bl) {
        if (this.holdit) {
            ++this.holdcnt;
            if (this.m.flex != 0) {
                this.m.flex = 0;
            }
            if (control.enter) {
                this.fase = -2;
                control.enter = false;
            }
        } else {
            if (this.holdcnt != 0) {
                this.holdcnt = 0;
            }
            if (control.enter) {
                if (this.loadedt[checkPoints.stage - 1]) {
                    this.stracks[checkPoints.stage - 1].stop();
                }
                this.fase = -6;
                control.enter = false;
            }
        }
        if (this.fase != -2) {
            this.holdit = false;
            if (checkPoints.wasted == 6 && !madness.dest && madness.hitmag < madness.maxmag[madness.cn]) {
                if (this.m.flex != 2) {
                    this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                    this.rd.fillRect(226, 70, this.youwastedem.getWidth(this.ob), this.youwastedem.getHeight(this.ob));
                    this.rd.setColor(new Color(this.m.cfade[0], this.m.cfade[1], this.m.cfade[2]));
                    this.rd.drawRect(226, 70, this.youwastedem.getWidth(this.ob), this.youwastedem.getHeight(this.ob));
                }
                this.rd.drawImage(this.youwastedem, 226, 70, null);
                if (this.aflk) {
                    this.drawcs(120, "You Won, all cars have been wasted!", 0, 0, 0, 0);
                    this.aflk = false;
                } else {
                    this.drawcs(120, "You Won, all cars have been wasted!", 255, 0, 0, 0);
                    this.aflk = true;
                }
                this.drawcs(350, "Press  [ Enter ]  to continue", 0, 0, 0, 0);
                checkPoints.haltall = false;
                this.holdit = true;
                this.winner = true;
            }
            if (!this.holdit && madness.dest && this.cntwis == 8) {
                if (this.m.flex != 2) {
                    this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                    this.rd.fillRect(232, 70, this.yourwasted.getWidth(this.ob), this.yourwasted.getHeight(this.ob));
                    this.rd.setColor(new Color(this.m.cfade[0], this.m.cfade[1], this.m.cfade[2]));
                    this.rd.drawRect(232, 70, this.yourwasted.getWidth(this.ob), this.yourwasted.getHeight(this.ob));
                }
                this.rd.drawImage(this.yourwasted, 232, 70, null);
                if (this.aflk) {
                    this.drawcs(120, "You got destroyed!", 0, 0, 0, 0);
                    this.aflk = false;
                } else {
                    this.drawcs(120, "You got destroyed!", 255, 0, 0, 0);
                    this.aflk = true;
                }
                this.drawcs(350, "Press  [ Enter ]  to continue", 0, 0, 0, 0);
                this.holdit = true;
                this.winner = false;
            }
            int n = 0;
            do {
                if (checkPoints.clear[n] != checkPoints.nlaps * checkPoints.nsp || checkPoints.pos[n] != 0) continue;
                if (n == 0) {
                    if (this.m.flex != 2) {
                        this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                        this.rd.fillRect(268, 70, this.youwon.getWidth(this.ob), this.youwon.getHeight(this.ob));
                        this.rd.setColor(new Color(this.m.cfade[0], this.m.cfade[1], this.m.cfade[2]));
                        this.rd.drawRect(268, 70, this.youwon.getWidth(this.ob), this.youwon.getHeight(this.ob));
                    }
                    this.rd.drawImage(this.youwon, 268, 70, null);
                    if (this.aflk) {
                        this.drawcs(120, "You finished first, nice job!", 0, 0, 0, 0);
                        this.aflk = false;
                    } else {
                        this.drawcs(120, "You finished first, nice job!", 255, 255, 255, 0);
                        this.aflk = true;
                    }
                    this.winner = true;
                } else {
                    if (this.m.flex != 2) {
                        this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                        this.rd.fillRect(271, 70, this.youlost.getWidth(this.ob), this.youlost.getHeight(this.ob));
                        this.rd.setColor(new Color(this.m.cfade[0], this.m.cfade[1], this.m.cfade[2]));
                        this.rd.drawRect(271, 70, this.youlost.getWidth(this.ob), this.youlost.getHeight(this.ob));
                    }
                    this.rd.drawImage(this.youlost, 271, 70, null);
                    if (this.aflk) {
                        this.drawcs(120, "" + this.names[this.sc[n]] + " finished first, race over!", 0, 0, 0, 0);
                        this.aflk = false;
                    } else {
                        this.drawcs(120, "" + this.names[this.sc[n]] + " finished first, race over!", 255, 255, 255, 0);
                        this.aflk = true;
                    }
                    this.winner = false;
                }
                this.drawcs(350, "Press  [ Enter ]  to continue", 0, 0, 0, 0);
                checkPoints.haltall = true;
                this.holdit = true;
            } while (++n < 7);
            if (bl) {
                if (checkPoints.stage != 36 && checkPoints.stage != 67 && this.arrace != control.arrace) {
                    this.arrace = control.arrace;
                    if (this.arrace) {
                        this.wasay = true;
                        this.say = ">  Arrow now pointing at  Cars  <";
                        this.tcnt = -5;
                    }
                    if (!this.arrace) {
                        this.wasay = false;
                        this.say = ">  Arrow now pointing at  Track  <";
                        this.tcnt = -5;
                        this.cntan = 20;
                    }
                }
                if (checkPoints.stage != 36 && checkPoints.stage != 67 && !this.holdit && this.fase != -6 && this.starcnt == 0) {
                    this.arrow(madness.point, madness.missedcp, checkPoints, this.arrace);
                    if (!this.arrace && this.auscnt == 45 && madness.capcnt == 0) {
                        if (madness.missedcp > 0) {
                            if (madness.missedcp > 15 && madness.missedcp < 50) {
                                if (this.flk) {
                                    this.drawcs(70, "Checkpoint Missed!", 255, 0, 0, 0);
                                } else {
                                    this.drawcs(70, "Checkpoint Missed!", 255, 150, 0, 2);
                                }
                            }
                            ++madness.missedcp;
                            if (madness.missedcp == 70) {
                                madness.missedcp = -2;
                            }
                        } else if (madness.mtouch && this.cntovn < 70) {
                            if (Math.abs(this.ana) > 100) {
                                ++this.cntan;
                            } else if (this.cntan != 0) {
                                --this.cntan;
                            }
                            if (this.cntan > 40) {
                                ++this.cntovn;
                                this.cntan = 40;
                                if (this.flk) {
                                    this.drawcs(70, "Wrong Way!", 255, 150, 0, 0);
                                    this.flk = false;
                                } else {
                                    this.drawcs(70, "Wrong Way!", 255, 0, 0, 2);
                                    this.flk = true;
                                }
                            }
                        }
                    }
                }
                if (this.m.flex != 2) {
                    this.rd.drawImage(this.dmg, 470, 7, null);
                    this.rd.drawImage(this.pwr, 470, 27, null);
                    this.rd.drawImage(this.lap, 19, 7, null);
                    this.rd.setColor(new Color(0, 150, 0));
                    this.rd.drawString("" + (madness.nlaps + 1) + " / " + checkPoints.nlaps + "", 51, 18);
                    this.rd.drawImage(this.was, 92, 7, null);
                    this.rd.setColor(new Color(200, 0, 0));
                    this.rd.drawString("" + checkPoints.wasted + " / 6", 150, 18);
                    this.rd.drawImage(this.pos, 42, 27, null);
                    this.rd.drawImage(this.rank[checkPoints.pos[madness.im]], 110, 28, null);
                    ++this.m.flex;
                } else {
                    if (this.posit != checkPoints.pos[madness.im]) {
                        this.rd.drawImage(this.rank[checkPoints.pos[madness.im]], 110, 28, null);
                        this.posit = checkPoints.pos[madness.im];
                    }
                    if (this.wasted != checkPoints.wasted) {
                        this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                        this.rd.fillRect(150, 8, 30, 10);
                        this.rd.setColor(new Color(200, 0, 0));
                        this.rd.drawString("" + checkPoints.wasted + " / 6", 150, 18);
                        this.wasted = checkPoints.wasted;
                    }
                    if (this.laps != madness.nlaps) {
                        this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
                        this.rd.fillRect(51, 8, 40, 10);
                        this.rd.setColor(new Color(0, 150, 0));
                        this.rd.drawString("" + (madness.nlaps + 1) + " / " + checkPoints.nlaps + "", 51, 18);
                        this.laps = madness.nlaps;
                    }
                }
                this.drawstat(madness.maxmag[madness.cn], madness.hitmag, madness.newcar, madness.power);
            }
            if (this.clear != madness.clear && madness.clear != 0) {
                if (!this.wasay) {
                    this.say = "Checkpoint!";
                    this.tcnt = 15;
                }
                this.clear = madness.clear;
                if (!this.mutes) {
                    this.checkpoint.play();
                }
                this.cntovn = 0;
                if (this.cntan != 0) {
                    this.cntan = 0;
                }
            }
            if (!this.holdit) {
                int n2;
                if (this.starcnt != 0 && this.starcnt <= 35) {
                    if (this.starcnt == 35 && !this.mutes) {
                        this.three.play();
                        this.traincnt = 35;
                    }
                    if (this.starcnt == 24) {
                        this.gocnt = 2;
                        if (!this.mutes) {
                            this.two.play();
                        }
                    }
                    if (this.starcnt == 13) {
                        this.gocnt = 1;
                        if (!this.mutes) {
                            this.one.play();
                        }
                    }
                    if (this.starcnt == 2) {
                        this.gocnt = 0;
                        if (!this.mutes) {
                            this.go.play();
                        }
                    }
                    this.duds = 0;
                    if (this.starcnt <= 37 && this.starcnt > 32) {
                        this.duds = 1;
                    }
                    if (this.starcnt <= 26 && this.starcnt > 21) {
                        this.duds = 1;
                    }
                    if (this.starcnt <= 15 && this.starcnt > 10) {
                        this.duds = 1;
                    }
                    if (this.starcnt <= 4) {
                        this.duds = 2;
                        this.m.flex = 0;
                    }
                    if (this.dudo != -1) {
                        this.rd.drawImage(this.dudeb[this.duds], this.dudo, 0, null);
                    }
                    if (this.gocnt != 0) {
                        this.rd.drawImage(this.cntdn[this.gocnt], 320, 50, null);
                    } else {
                        this.rd.drawImage(this.cntdn[this.gocnt], 298, 50, null);
                    }
                }
                if (this.looped != 0 && madness.loop == 2) {
                    this.looped = 0;
                }
                if (madness.power < 45.0f) {
                    if (this.tcnt == 30 && this.auscnt == 45 && madness.mtouch && madness.capcnt == 0) {
                        if (this.looped != 2) {
                            if (this.pwcnt < 70 || this.pwcnt < 160 && this.looped != 0) {
                                if (this.pwflk) {
                                    this.drawcs(110, "Power low, perform stunt!", 0, 0, 0, 0);
                                    this.pwflk = false;
                                } else {
                                    this.drawcs(110, "Power low, perform stunt!", 255, 255, 255, 0);
                                    this.pwflk = true;
                                }
                            }
                        } else if (this.pwcnt < 250) {
                            if (this.pwflk) {
                                this.drawcs(105, "> >  Press Enter for GAME INSTRUCTIONS!  < <", 0, 0, 0, 0);
                                this.drawcs(120, "To learn how to preform STUNTS!", 255, 255, 255, 0);
                                this.pwflk = false;
                            } else {
                                this.drawcs(105, "> >  Press Enter for GAME INSTRUCTIONS!  < <", 255, 255, 255, 0);
                                this.drawcs(120, "To learn how to preform STUNTS!", 0, 0, 0, 0);
                                this.pwflk = true;
                            }
                        }
                        ++this.pwcnt;
                        if (this.pwcnt == 300) {
                            this.pwcnt = 0;
                            if (this.looped != 0) {
                                ++this.looped;
                                if (this.looped == 3) {
                                    this.looped = 1;
                                }
                            }
                        }
                    }
                } else if (this.pwcnt != 0) {
                    this.pwcnt = 0;
                }
                if (madness.capcnt == 0) {
                    if (this.tcnt < 30) {
                        if (this.tflk) {
                            if (!this.wasay) {
                                this.drawcs(105, this.say, 255, 0, 0, 0);
                            } else {
                                this.drawcs(105, this.say, 255, 255, 255, 0);
                            }
                            this.tflk = false;
                        } else {
                            if (!this.wasay) {
                                this.drawcs(105, this.say, 150, 0, 0, 0);
                            } else {
                                this.drawcs(105, this.say, 255, 0, 0, 0);
                            }
                            this.tflk = true;
                        }
                        ++this.tcnt;
                    } else if (this.wasay) {
                        this.wasay = false;
                    }
                    if (this.auscnt < 45) {
                        if (this.aflk) {
                            this.drawcs(85, this.asay, 98, 200, 98, 0);
                            this.aflk = false;
                        } else {
                            this.drawcs(85, this.asay, 0, 200, 0, 0);
                            this.aflk = true;
                        }
                        ++this.auscnt;
                    }
                } else if (this.tflk) {
                    this.drawcs(110, "Bad Landing!", 0, 0, 0, 0);
                    this.tflk = false;
                } else {
                    this.drawcs(110, "Bad Landing!", 255, 255, 255, 0);
                    this.tflk = true;
                }
                if (madness.trcnt == 10) {
                    this.loop = "";
                    this.spin = "";
                    this.asay = "";
                    n2 = 0;
                    while (madness.travzy > 225) {
                        madness.travzy -= 360;
                        ++n2;
                    }
                    while (madness.travzy < -225) {
                        madness.travzy += 360;
                        --n2;
                    }
                    if (n2 == 1) {
                        this.loop = "Forward loop";
                    }
                    if (n2 == 2) {
                        this.loop = "double Forward";
                    }
                    if (n2 == 3) {
                        this.loop = "triple Forward";
                    }
                    if (n2 >= 4) {
                        this.loop = "massive Forward looping";
                    }
                    if (n2 == -1) {
                        this.loop = "Backloop";
                    }
                    if (n2 == -2) {
                        this.loop = "double Back";
                    }
                    if (n2 == -3) {
                        this.loop = "triple Back";
                    }
                    if (n2 <= -4) {
                        this.loop = "massive Back looping";
                    }
                    if (n2 == 0) {
                        if (madness.ftab && madness.btab) {
                            this.loop = "Tabletop and reversed Tabletop";
                        } else if (madness.ftab || madness.btab) {
                            this.loop = "Tabletop";
                        }
                    }
                    if (n2 > 0 && madness.btab) {
                        this.loop = "Hanged " + this.loop;
                    }
                    if (n2 < 0 && madness.ftab) {
                        this.loop = "Hanged " + this.loop;
                    }
                    if (this.loop != "") {
                        this.asay = this.asay + " " + this.loop;
                    }
                    n2 = 0;
                    madness.travxy = Math.abs(madness.travxy);
                    while (madness.travxy > 270) {
                        madness.travxy -= 360;
                        ++n2;
                    }
                    if (n2 == 0 && madness.rtab) {
                        String string = this.spin = this.loop == "" ? "Tabletop" : "Flipside";
                    }
                    if (n2 == 1) {
                        this.spin = "Rollspin";
                    }
                    if (n2 == 2) {
                        this.spin = "double Rollspin";
                    }
                    if (n2 == 3) {
                        this.spin = "triple Rollspin";
                    }
                    if (n2 >= 4) {
                        this.spin = "massive Roll spinning";
                    }
                    n2 = 0;
                    boolean bl2 = false;
                    madness.travxz = Math.abs(madness.travxz);
                    while (madness.travxz > 90) {
                        madness.travxz -= 180;
                        if ((n2 += 180) <= 900) continue;
                        n2 = 900;
                        bl2 = true;
                    }
                    if (n2 != 0) {
                        if (this.loop == "" && this.spin == "") {
                            this.asay = this.asay + " " + n2;
                            if (bl2) {
                                this.asay = this.asay + " and beyond";
                            }
                        } else {
                            if (this.spin != "") {
                                this.asay = this.loop == "" ? this.asay + " " + this.spin : this.asay + " with " + this.spin;
                            }
                            this.asay = this.asay + " by " + n2;
                            if (bl2) {
                                this.asay = this.asay + " and beyond";
                            }
                        }
                    } else if (this.spin != "") {
                        String string = this.asay = this.loop == "" ? this.asay + " " + this.spin : this.asay + " by " + this.spin;
                    }
                    if (this.asay != "") {
                        this.auscnt -= 15;
                    }
                    if (this.loop != "") {
                        this.auscnt -= 25;
                    }
                    if (this.spin != "") {
                        this.auscnt -= 25;
                    }
                    if (n2 != 0) {
                        this.auscnt -= 25;
                    }
                    if (this.auscnt < 45) {
                        if (!this.mutes) {
                            this.powerup.play();
                        }
                        if (this.auscnt < -20) {
                            this.auscnt = -20;
                        }
                        int n3 = 0;
                        if (madness.powerup > 20.0f) {
                            n3 = 1;
                        }
                        if (madness.powerup > 40.0f) {
                            n3 = 2;
                        }
                        if (madness.powerup > 150.0f) {
                            n3 = 3;
                        }
                        if (madness.surfer) {
                            this.asay = " " + this.adj[4][(int)(this.m.random() * 3.0f)] + this.asay;
                        }
                        String string = this.asay = n3 != 3 ? this.adj[n3][(int)(this.m.random() * 8.0f)] + this.asay + this.exlm[n3] : this.adj[n3][(int)(this.m.random() * 8.0f)];
                        if (!this.wasay) {
                            this.tcnt = this.auscnt;
                            this.say = madness.power != 98.0f ? "Power Up " + (int)(100.0f * madness.powerup / 98.0f) + "%" : "Power To The MAX (100%)";
                            boolean bl3 = this.skidup = !this.skidup;
                        }
                    }
                }
                if (madness.newcar) {
                    if (!this.wasay) {
                        this.say = "Car Fixed";
                        this.tcnt = 0;
                    }
                    this.crashup = !this.crashup;
                }
                n2 = 1;
                do {
                    if (this.dested[n2] == checkPoints.dested[n2]) continue;
                    this.dested[n2] = checkPoints.dested[n2];
                    if (this.dested[n2] == 1) {
                        this.wasay = true;
                        this.say = "" + this.names[this.sc[n2]] + " has been destroyed!";
                        this.tcnt = -15;
                    }
                    if (this.dested[n2] != 2) continue;
                    this.wasay = true;
                    this.say = "You destroyed " + this.names[this.sc[n2]] + "!";
                    this.tcnt = -15;
                } while (++n2 < 7);
            }
        }
    }

    public void finish(CheckPoints checkPoints, ContO[] contOArray, Control control) {
        ++this.debugFinishCallCount;
        boolean debugPrintFinish = this.debugFinishCallCount <= 5 || this.debugFinishCallCount % 60 == 0;

        if (debugPrintFinish) {
            System.out.println("[DBG-XT] finish ENTER call=" + this.debugFinishCallCount
                    + " stage=" + checkPoints.stage
                    + " unlocked=" + this.unlocked
                    + " carsUnlocked=" + this.carsUnlocked
                    + " winner=" + this.winner
                    + " fase=" + this.fase
                    + " enter=" + control.enter
                    + " handb=" + control.handb
                    + " fleximgNull=" + (this.fleximg == null));
        }

        this.rd.drawImage(this.fleximg, 0, 0, null);

        if (debugPrintFinish) {
            System.out.println("[DBG-XT] finish AFTER drawing fleximg");
        }

        if (this.winner) {
            if (debugPrintFinish) {
                System.out.println("[DBG-XT] finish WINNER branch");
            }
            if (checkPoints.stage == this.unlocked) {
                if (debugPrintFinish) {
                    System.out.println("[DBG-XT] finish CURRENT-HIGHEST-STAGE branch");
                }

                if (checkPoints.stage != 60) {
                    this.rd.drawImage(this.congrd, 200, 30, null);
                    this.drawcs(80, "Stage " + checkPoints.stage + " Completed!", 0, 255, 0, 3);
                } else {
                    this.rd.drawImage(this.congrd, 195 + (int)(this.m.random() * 10.0f), 30, null);
                }
                int n = 0;
                int n2 = 0;
                this.pin = 60;
                if (checkPoints.stage % 2 == 0 && checkPoints.stage <= 70) {
                    n = this.bossForStage(checkPoints.stage);

                    // Default vertical position for unlock graphic
                    n2 = 250;

                    this.pin = 0;
                    this.sc[0] = n;
                }
                if (checkPoints.stage != 60) {
                    this.rd.setFont(new Font("SansSerif", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.aflk) {
                        this.drawcs(120 + this.pin, "Stage " + (checkPoints.stage + 1) + " is now unlocked!", 176, 196, 0, 3);
                    } else {
                        this.drawcs(120 + this.pin, "Stage " + (checkPoints.stage + 1) + " is now unlocked!", 247, 255, 165, 3);
                    }
                    if (n != 0) {
                        if (debugPrintFinish) {
                            System.out.println("[DBG-XT] finish CAR-UNLOCK VISUAL n=" + n
                                    + " n2=" + n2
                                    + " contONull=" + (contOArray[n] == null));
                        }

                        if (this.aflk) {
                            this.drawcs(140, "And:", 176, 196, 0, 3);
                        } else {
                            this.drawcs(140, "And:", 247, 255, 165, 3);
                        }
                        this.rd.setColor(new Color(236, 226, 202));
                        float f = (float)Math.random();
                        if ((double)f < 0.7) {
                            this.rd.drawRect(160, 150, 349, 126);
                        } else {
                            this.rd.fillRect(160, 150, 350, 127);
                        }
                        this.rd.setColor(new Color(255, 209, 89));
                        this.rd.fillRect(161, 151, 348, 4);
                        this.rd.fillRect(161, 151, 4, 125);
                        this.rd.fillRect(161, 272, 348, 4);
                        this.rd.fillRect(505, 151, 4, 125);
                        contOArray[n].y = n2;
                        this.m.crs = true;
                        this.m.x = -335;
                        this.m.y = 0;
                        this.m.z = -50;
                        this.m.xz = 0;
                        this.m.zy = 0;
                        this.m.ground = 2470;
                        contOArray[n].z = 1000;
                        contOArray[n].x = 0;
                        contOArray[n].xz += 5;
                        contOArray[n].zy = 0;
                        contOArray[n].wzy -= 10;

                        if (debugPrintFinish) {
                            System.out.println("[DBG-XT] finish BEFORE unlocked-car ContO.d()");
                        }
                        contOArray[n].d(this.rd);
                        if (debugPrintFinish) {
                            System.out.println("[DBG-XT] finish AFTER unlocked-car ContO.d()");
                        }

                        if ((double)f < 0.1) {
                            this.rd.setColor(new Color(236, 226, 202));
                            int n3 = 0;
                            do {
                                this.rd.drawLine(165, 155 + 4 * n3, 504, 155 + 4 * n3);
                            } while (++n3 < 30);
                        }
                        String string = "";
                        if (n == 13) {
                            string = " ";
                        }
                        if (this.aflk) {
                            this.drawcs(300, "" + this.names[n] + "" + string + " has been unlocked!", 176, 196, 0, 3);
                        } else {
                            this.drawcs(300, "" + this.names[n] + "" + string + " has been unlocked!", 247, 255, 165, 3);
                        }
                        this.pin = 180;
                    }
                    this.rd.setFont(new Font("SansSerif", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.drawcs(140 + this.pin, "GAME SAVED", 230, 167, 0, 3);
                    this.pin = this.pin == 60 ? 30 : 0;
                } else {
                    this.rd.setFont(new Font("SansSerif", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.aflk) {
                        this.drawcs(90, "YOU FINISHED THE GAME", 255, 255, 255, 3);
                    } else {
                        this.drawcs(90, "YOU FINISHED THE GAME", 200, 200, 200, 3);
                    }
                    if (this.aflk) {
                        this.drawcs(140, "YOU'RE AWESOME!", 0, 0, 0, 3);
                    } else {
                        this.drawcs(142, "YOU'RE AWESOME!", 255, 255, 255, 3);
                    }
                    if (this.aflk) {
                        this.drawcs(190, "You're truly a RADICAL GAMER!", 0, 255, 0, 3);
                    } else {
                        this.drawcs(190, "You're truly a RADICAL GAMER!", 0, 100, 0, 3);
                    }
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.fillRect(0, 205, 670, 62);
                    this.rd.drawImage(this.radicalplay, this.radpx + (int)(8.0 * Math.random() - 4.0), 205, null);
                    if (this.radpx != 147) {
                        this.radpx += 40;
                        if (this.radpx > 670) {
                            this.radpx = -453;
                        }
                    }
                    if (this.flipo == 40) {
                        this.radpx = 148;
                    }
                    ++this.flipo;
                    if (this.flipo == 70) {
                        this.flipo = 0;
                    }
                    if (this.radpx == 147) {
                        this.rd.setFont(new Font("SansSerif", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        if (this.aflk) {
                            this.drawcs(259, "A Game by Radicalplay.com", 0, 0, 0, 3);
                        } else {
                            this.drawcs(259, "A Game by Radicalplay.com", 255, 0, 0, 3);
                        }
                    }
                    if (this.aflk) {
                        this.drawcs(300, "Now get up and dance!", 255, 255, 255, 3);
                    } else {
                        this.drawcs(300, "Now get up and dance!", 0, 0, 0, 3);
                    }
                    this.pin = 0;
                }
                this.aflk = !this.aflk;
            } else {
                this.pin = 30;
                this.rd.drawImage(this.congrd, 200, 87, null);
                this.drawcs(137, "Stage " + checkPoints.stage + " Completed!", 0, 255, 0, 3);
                this.drawcs(154, "" + checkPoints.name + "", 128, 128, 128, 3);
            }
        } else {
            this.pin = 30;
            this.rd.drawImage(this.gameov, 250, 117, null);
            this.drawcs(167, "Failed to Complete Stage " + checkPoints.stage + "!", 255, 0, 0, 3);
            this.drawcs(184, "" + checkPoints.name + "", 128, 128, 128, 3);
        }
        if (debugPrintFinish) {
            System.out.println("[DBG-XT] finish BEFORE Continue button draw"
                    + " pcontin=" + this.pcontin
                    + " pin=" + this.pin
                    + " continNull=" + (this.contin == null)
                    + " continItemNull=" + (this.contin == null || this.contin[this.pcontin] == null));
        }

        this.rd.drawImage(this.contin[this.pcontin], 290, 350 - this.pin, null);

        if (debugPrintFinish) {
            System.out.println("[DBG-XT] finish AFTER Continue button draw");
        }

        if (control.enter || control.handb) {
            System.out.println("[DBG-XT] finish CONTINUE PRESSED -> setting fase=10"
                    + " stage=" + checkPoints.stage
                    + " unlocked=" + this.unlocked);
            this.fase = 10;
            if (this.loadedt[checkPoints.stage - 1]) {
                this.stracks[checkPoints.stage - 1].stop();
            }
            
            this.flipo = 0;
            control.enter = false;
            control.handb = false;
        }

        if (debugPrintFinish) {
            System.out.println("[DBG-XT] finish EXIT call=" + this.debugFinishCallCount
                    + " fase=" + this.fase
                    + " stage=" + checkPoints.stage
                    + " unlocked=" + this.unlocked);
        }
    }

    private int bossForStage(int stage) {
        if (stage < 1 || stage > 70) {
            return -1;
        }
        return this.campaignBoss[(stage-1) / 2];
    }



    public void sortcars(int n, CheckPoints checkPoints) {
        this.sc[1] = randomUnlockedCar();
        this.sc[2] = randomUnlockedCar();
        this.sc[3] = randomUnlockedCar();
        this.sc[4] = randomUnlockedCar();
        this.sc[5] = randomUnlockedCar();
        this.sc[6] = randomUnlockedCar();


        // if (checkPoints.stage == 1 || checkPoints.stage == 2) {
        //     this.sc[6] = 5;
        // }
        // if (checkPoints.stage == 3) {
        //     this.sc[6] = 9;
        // }
        // if (checkPoints.stage == 4) {
        //     this.sc[6] = 16;
        // }
        // if (checkPoints.stage == 5 || checkPoints.stage == 6) {
        //     this.sc[6] = 10;
        // }
        // if (checkPoints.stage == 7) {
        //     this.sc[6] = 11;
        // }
        // if (checkPoints.stage == 8) {
        //     this.sc[6] = 28;
        // }
        // if (checkPoints.stage == 9 || checkPoints.stage == 10) {
        //     this.sc[6] = 12;
        // }
        // if (checkPoints.stage == 11 || checkPoints.stage == 12) {
        //     this.sc[6] = 13;
        // }
        // if (checkPoints.stage == 13 || checkPoints.stage == 64) {
        //     this.sc[6] = 20;
        // }
        // if (checkPoints.stage == 15) {
        //     this.sc[6] = 15;
        // }
        // if (checkPoints.stage == 16) {
        //     this.sc[6] = 33;
        // }
        // if (checkPoints.stage == 18 || checkPoints.stage == 65) {
        //     this.sc[6] = 19;
        // }
        // if (checkPoints.stage == 19 || checkPoints.stage == 61) {
        //     this.sc[6] = 7;
        // }
        // if (checkPoints.stage == 20) {
        //     this.sc[6] = 15;
        // }
        // if (checkPoints.stage == 22 || checkPoints.stage == 14) {
        //     this.sc[6] = 17;
        // }
        // if (checkPoints.stage == 23) {
        //     this.sc[6] = 6;
        // }
        // if (checkPoints.stage == 25) {
        //     this.sc[6] = 11;
        // }
        // if (checkPoints.stage == 27) {
        //     this.sc[1] = 9;
        //     this.sc[2] = 9;
        //     this.sc[3] = 9;
        // }
        // if (checkPoints.stage == 28) {
        //     this.sc[6] = 24;
        // }
        // if (checkPoints.stage == 30 || checkPoints.stage == 38) {
        //     this.sc[6] = 27;
        // }
        // if (checkPoints.stage == 31) {
        //     this.sc[6] = 33;
        // }
        // if (checkPoints.stage == 33) {
        //     this.sc[6] = 26;
        // }
        // if (checkPoints.stage == 34 || checkPoints.stage == 62) {
        //     this.sc[6] = 18;
        // }
        // if (checkPoints.stage == 35) {
        //     this.sc[3] = 37;
        // }
        // if (checkPoints.stage == 36 || checkPoints.stage == 37) {
        //     this.sc[6] = 21;
        // }
        // if (checkPoints.stage == 39) {
        //     this.sc[1] = 26;
        //     this.sc[2] = 26;
        //     this.sc[3] = 26;
        //     this.sc[6] = 34;
        // }
        // if (checkPoints.stage == 40 || checkPoints.stage == 51) {
        //     this.sc[6] = 32;
        // }
        // if (checkPoints.stage == 41) {
        //     this.sc[6] = 29;
        // }
        // if (checkPoints.stage == 42) {
        //     this.sc[6] = 25;
        // }
        // if (checkPoints.stage == 43 || checkPoints.stage == 53) {
        //     this.sc[6] = 14;
        // }
        // if (checkPoints.stage == 44) {
        //     this.sc[6] = 34;
        // }
        // if (checkPoints.stage == 45) {
        //     this.sc[6] = 23;
        //     this.sc[1] = 11;
        //     this.sc[2] = 11;
        //     this.sc[3] = 13;
        // }
        // if (checkPoints.stage == 46) {
        //     this.sc[6] = 31;
        // }
        // if (checkPoints.stage == 47) {
        //     this.sc[6] = 16;
        // }
        // if (checkPoints.stage == 49) {
        //     this.sc[6] = 35;
        // }
        // if (checkPoints.stage == 50 || checkPoints.stage == 67) {
        //     this.sc[6] = 30;
        // }
        // if (checkPoints.stage == 52) {
        //     this.sc[6] = 28;
        // }
        // if (checkPoints.stage == 54) {
        //     this.sc[1] = this.sc[0];
        //     this.sc[2] = this.sc[0];
        //     this.sc[3] = this.sc[0];
        //     this.sc[4] = this.sc[0];
        //     this.sc[5] = this.sc[0];
        //     this.sc[6] = this.sc[0];
        // }
        // if (checkPoints.stage == 55) {
        //     this.sc[1] = 39;
        //     this.sc[2] = 39;
        //     this.sc[3] = this.sc[0];
        //     this.sc[4] = 39;
        //     this.sc[5] = 39;
        //     this.sc[6] = this.sc[0];
        // }
        // if (checkPoints.stage == 56) {
        //     this.sc[1] = 38;
        //     this.sc[2] = 38;
        //     this.sc[3] = 38;
        //     this.sc[4] = 38;
        //     this.sc[5] = 38;
        //     this.sc[6] = 38;
        // }
        // if (checkPoints.stage == 57) {
        //     this.sc[1] = 33;
        //     this.sc[2] = 33;
        //     this.sc[3] = 36;
        // }
        // if (checkPoints.stage == 58) {
        //     this.sc[1] = 35;
        //     this.sc[2] = 36;
        //     this.sc[3] = 37;
        //     this.sc[4] = this.sc[0];
        //     this.sc[5] = this.sc[0];
        //     this.sc[6] = this.sc[0];
        // }
        // if (checkPoints.stage == 59) {
        //     this.sc[1] = 35;
        //     this.sc[2] = 35;
        //     this.sc[3] = 37;
        //     this.sc[4] = 36;
        //     this.sc[5] = 36;
        //     this.sc[6] = 33;
        // }
        // if (checkPoints.stage == 60) {
        //     this.sc[6] = 6;
        // }
        // if (checkPoints.stage == 63) {
        //     this.sc[6] = 8;
        // }
        // if (checkPoints.stage == 66) {
        //     this.sc[6] = 22;
        // }
        // if (checkPoints.stage == 68) {
        //     this.sc[6] = 36;
        // }
        // if (checkPoints.stage == 70) {
        //     this.sc[1] = 35;
        //     this.sc[2] = 35;
        //     this.sc[3] = 37;
        //     this.sc[4] = 36;
        //     this.sc[5] = 36;
        //     this.sc[6] = 38;
        // }
        // if (checkPoints.stage == 42) {
        //     this.sc[6] = this.sc[0];
        // }
        // if (!(checkPoints.stage != 19 && checkPoints.stage != 21 && checkPoints.stage != 28 && checkPoints.stage != 33 && checkPoints.stage != 40 && checkPoints.stage != 50 && checkPoints.stage != 51 || this.sc[1] != this.sc[0] && this.sc[2] != this.sc[0] && this.sc[3] != this.sc[0] && this.sc[4] != this.sc[0] && this.sc[5] != this.sc[0] && this.sc[6] != this.sc[0])) {
        //     this.sc[1] = this.sc[0];
        //     this.sc[2] = this.sc[0];
        //     this.sc[3] = this.sc[0];
        //     this.sc[4] = this.sc[0];
        //     this.sc[5] = this.sc[0];
        //     this.sc[6] = this.sc[0];
        // }

        if (checkPoints.stage >= 1 && checkPoints.stage <= 70 && checkPoints.stage != 68 && checkPoints.stage != 65 && checkPoints.stage != 66) {
            this.sc[6] = this.bossForStage(checkPoints.stage);

        }

        if (checkPoints.stage == 26) {
            this.sc[3] = 11;
        }

        if (checkPoints.stage == 28) {
            this.sc[1] = 17;
            this.sc[2] = 17;
            this.sc[4] = 17;
            this.sc[5] = 17;
        }

        if (checkPoints.stage == 30) {
            this.sc[3] = 11;
            this.sc[2] = 9;
            this.sc[1] = 9;
        }

        if (checkPoints.stage == 34) {
            this.sc[1] = 11;
            this.sc[2] = 11;
            this.sc[3] = 13;
        } 

        if (checkPoints.stage == 36) {
            this.sc[1] = 11;
            this.sc[2] = 13;

        }

        if (checkPoints.stage == 46) {
            this.sc[1] = 13;
            this.sc[2] = 13;
        }

        if (checkPoints.stage == 55) {
            this.sc[1] = 31;
            this.sc[2] = 31;
        }

        if (checkPoints.stage == 56) {
            this.sc[1] = 13;
            this.sc[2] = 11;
            this.sc[3] = 26;
            this.sc[4] = 15;
            this.sc[5] = 30;
        }

        if (checkPoints.stage == 58) {
            this.sc[1] = 29;
            this.sc[2] = 28;
            this.sc[3] = 26;
            this.sc[4] = 32;
            this.sc[5] = 30;
        }

        if (checkPoints.stage == 62) {
            this.sc[4] = 32;
            this.sc[5] = 32;
            this.sc[1] = 26; // Turbo Tank
            this.sc[2] = 26; // Turbo Tank
            this.sc[3] = 26; // Turbo Tank
        }

        if (checkPoints.stage == 65 || checkPoints.stage == 66) {
            this.sc[3] = 37;
        
        }

        if (checkPoints.stage == 68) {
            this.sc[1] = 33;
            this.sc[2] = 33;
            this.sc[3] = 36;
        }

        if (checkPoints.stage == 69 || checkPoints.stage == 70) {
            this.sc[1] = 35;
            this.sc[2] = 35;
            this.sc[3] = 37;
            this.sc[4] = 36;
            this.sc[5] = 36;
        }


    }

    public void sparkeng(int n) {
        ++n;
        int n2 = 0;
        do {
            if (n == n2) {
                if (this.pengs[n2]) continue;
                this.engs[this.enginsignature[this.sc[0]]][n2].loop();
                this.pengs[n2] = true;
                continue;
            }
            if (!this.pengs[n2]) continue;
            this.engs[this.enginsignature[this.sc[0]]][n2].stop();
            this.pengs[n2] = false;
        } while (++n2 < 5);
    }

    public void drawcs(int n, String string, int n2, int n3, int n4, int n5) {
        if (n5 != 3 && n5 != 4) {
            if ((n2 = (int)((float)n2 + (float)n2 * ((float)this.m.snap[0] / 100.0f))) > 255) {
                n2 = 255;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if ((n3 = (int)((float)n3 + (float)n3 * ((float)this.m.snap[1] / 100.0f))) > 255) {
                n3 = 255;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            if ((n4 = (int)((float)n4 + (float)n4 * ((float)this.m.snap[2] / 100.0f))) > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n5 == 4) {
            if ((n2 = (int)((float)n2 - (float)n2 * ((float)this.m.snap[0] / 100.0f))) > 255) {
                n2 = 255;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if ((n3 = (int)((float)n3 - (float)n3 * ((float)this.m.snap[1] / 100.0f))) > 255) {
                n3 = 255;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            if ((n4 = (int)((float)n4 - (float)n4 * ((float)this.m.snap[2] / 100.0f))) > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n5 == 1) {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawString(string, 335 - this.ftm.stringWidth(string) / 2 + 1, n + 1);
        }
        if (n5 == 2) {
            if ((n2 = (n2 * 2 + this.m.csky[0] * 1) / 3) > 255) {
                n2 = 255;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if ((n3 = (n3 * 2 + this.m.csky[1] * 1) / 3) > 255) {
                n3 = 255;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            if ((n4 = (n4 * 2 + this.m.csky[2] * 1) / 3) > 255) {
                n4 = 255;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        this.rd.setColor(new Color(n2, n3, n4));
        this.rd.drawString(string, 335 - this.ftm.stringWidth(string) / 2, n);
    }

    public int py(int n, int n2, int n3, int n4) {
        return (n - n2) * (n - n2) + (n3 - n4) * (n3 - n4);
    }

    public void trackbg(boolean bl) {
        int n = 0;
        ++this.trkl;
        if (this.trkl > this.trklim) {
            n = 1;
            this.trklim = (int)(Math.random() * 40.0);
            this.trkl = 0;
        }
        if (bl) {
            n = 0;
        }
        int n2 = 0;
        do {
            this.rd.drawImage(this.trackbg[n][n2], this.trkx[n2], 0, null);
            int n3 = n2;
            this.trkx[n3] = this.trkx[n3] - 1;
            if (this.trkx[n2] > -670) continue;
            this.trkx[n2] = 670;
        } while (++n2 < 2);
    }

    public void stageselect(CheckPoints checkPoints, Control control) {
        this.stages.play();
        this.rd.drawImage(this.br, 0, 0, null);
        this.rd.drawImage(this.select, 273, 45, null);
        this.rd.drawImage(this.back[this.pback], 50, 110, null);
        this.rd.drawImage(this.next[this.pnext], 560, 110, null);
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        if (checkPoints.stage != 70) {
            this.drawcs(80, "< Stage " + checkPoints.stage + "  >", 255, 255, 255, 3);
        }
        //if (checkPoints.stage == 36 || checkPoints.stage == 37 || checkPoints.stage == 38) {
            //this.drawcs(80, "<  Specialty Stage  >", 255, 255, 255, 3);
        //}
        if (checkPoints.stage == 70) {
            this.drawcs(80, "<  Final Stage  >", 255, 255, 255, 3);
        }
        this.drawcs(100, "| " + checkPoints.name + " |", 210, 210, 210, 3);
        this.rd.drawImage(this.contin[this.pcontin], 290, 325, null);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(396, "You can also use Keyboard Arrows and Enter to navigate.", 82, 90, 0, 3);
        if (control.handb || control.enter) {
            this.asay = "Stage " + checkPoints.stage + ":  " + checkPoints.name + " ";
            this.dudo = 150;
            this.m.trk = false;
            this.m.focus_point = 400;
            this.fase = 5;
            control.handb = false;
            control.enter = false;
            this.stages.stop();
            this.stages.unloadMod();
        }
        this.rd.setFont(new Font("SansSerif", 1, 22));
        this.ftm = this.rd.getFontMetrics();
        if (checkPoints.stage == 31 || checkPoints.stage == 39 || checkPoints.stage == 49 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
            this.rd.setColor(new Color(0, 255, 0));
            this.rd.drawString("RACE-ONLY STAGE!", 224, 376);
        }
        if (checkPoints.stage == 19 || checkPoints.stage == 28 || checkPoints.stage == 55) {
            this.rd.setColor(new Color(255, 0, 0));
            this.rd.drawString("WASTE-ONLY STAGE!", 221, 376);
        }
        if (this.stageNavCooldown > 0) {
            --this.stageNavCooldown;
        }

        if (control.right && this.stageNavCooldown == 0) {
            if (checkPoints.stage < this.unlocked) {
                ++checkPoints.stage;
            } else {
                checkPoints.stage = 1;
            }

            this.stages.stop();
            this.fase = 12;
            this.stageNavCooldown = 2;
            control.right = false;
        }

        if (control.left && this.stageNavCooldown == 0) {
            if (checkPoints.stage > 1) {
                --checkPoints.stage;
            } else {
                checkPoints.stage = this.unlocked;
            }

            this.stages.stop();
            this.fase = 12;
            this.stageNavCooldown = 2;
            control.left = false;
        }
    }

    public void snap(int n) {
        this.dmg = this.loadsnap(this.odmg);
        this.pwr = this.loadsnap(this.opwr);
        this.was = this.loadsnap(this.owas);
        this.lap = this.loadsnap(this.olap);
        this.pos = this.loadsnap(this.opos);
        int n2 = 0;
        do {
            this.rank[n2] = this.loadsnap(this.orank[n2]);
        } while (++n2 < 7);
        n2 = 0;
        do {
            this.cntdn[n2] = this.loadsnap(this.ocntdn[n2]);
        } while (++n2 < 4);
        this.yourwasted = this.loadsnap(this.oyourwasted);
        this.youlost = this.loadsnap(this.oyoulost);
        this.youwon = this.loadsnap(this.oyouwon);
        this.youwastedem = this.loadsnap(this.oyouwastedem);
        this.gameh = this.loadsnap(this.ogameh);
        this.loadingmusic = this.loadopsnap(this.oloadingmusic, n, 76);
        this.star[0] = this.loadopsnap(this.ostar[0], n, 0);
        this.star[1] = this.loadopsnap(this.ostar[1], n, 0);
        this.flaot = this.loadopsnap(this.oflaot, n, 1);
    }

    private Image loadsnap(Image image) {
        int n = image.getHeight(this.ob);
        int n2 = image.getWidth(this.ob);
        int[] nArray = new int[n2 * n];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n2, n, nArray, 0, n2);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        for (int i = 0; i < n2 * n; ++i) {
            if (nArray[i] != -4144960 && nArray[i] != nArray[n2 * n - 1]) {
                int n3;
                int n4;
                Color color = new Color(nArray[i]);
                int n5 = (int)((float)color.getRed() + (float)color.getRed() * ((float)this.m.snap[0] / 100.0f));
                if (n5 > 225) {
                    n5 = 225;
                }
                if (n5 < 0) {
                    n5 = 0;
                }
                if ((n4 = (int)((float)color.getGreen() + (float)color.getGreen() * ((float)this.m.snap[1] / 100.0f))) > 225) {
                    n4 = 225;
                }
                if (n4 < 0) {
                    n4 = 0;
                }
                if ((n3 = (int)((float)color.getBlue() + (float)color.getBlue() * ((float)this.m.snap[2] / 100.0f))) > 225) {
                    n3 = 225;
                }
                if (n3 < 0) {
                    n3 = 0;
                }
                Color color2 = new Color(n5, n4, n3);
                nArray[i] = color2.getRGB();
                continue;
            }
            if (nArray[i] != -4144960) continue;
            Color color = new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]);
            nArray[i] = color.getRGB();
        }
        Image image2 = this.createImage(new MemoryImageSource(n2, n, nArray, 0, n2));
        return image2;
    }

    public void resetstat(int n) {
        this.arrace = false;
        this.ana = 0;
        this.cntan = 0;
        this.cntovn = 0;
        this.tcnt = 30;
        this.wasay = false;
        this.clear = 0;
        this.dmcnt = 0;
        this.pwcnt = 0;
        this.auscnt = 45;
        this.pnext = 0;
        this.pback = 0;
        this.starcnt = 130;
        this.gocnt = 3;
        this.grrd = true;
        this.aird = true;
        this.bfcrash = 0;
        this.cntwis = 0;
        this.bfskid = 0;
        this.pwait = 7;
        this.holdcnt = 0;
        this.holdit = false;
        this.winner = false;
        this.wasted = 0;
        int n2 = 0;
        do {
            this.dested[n2] = 0;
        } while (++n2 < 7);
        this.sortcars(n, this.cp);
    }

    public void drawstat(int n, int n2, boolean bl, float f) {
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        if (bl) {
            nArray[0] = 533;
            nArray2[0] = 11;
            nArray[1] = 533;
            nArray2[1] = 19;
            nArray[2] = 630;
            nArray2[2] = 19;
            nArray[3] = 630;
            nArray2[3] = 11;
            this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
            this.rd.fillPolygon(nArray, nArray2, 4);
        }
        if (n2 > n) {
            n2 = n;
        }
        int n3 = (int)(98.0f * ((float)n2 / (float)n));
        nArray[0] = 532;
        nArray2[0] = 11;
        nArray[1] = 532;
        nArray2[1] = 20;
        nArray[2] = 532 + n3;
        nArray2[2] = 20;
        nArray[3] = 532 + n3;
        nArray2[3] = 11;
        int n4 = 244;
        int n5 = 244;
        int n6 = 11;
        if (n3 > 33) {
            n5 = (int)(244.0f - 233.0f * ((float)(n3 - 33) / 65.0f));
        }
        if (n3 > 70) {
            if (this.dmcnt < 10) {
                if (this.dmflk) {
                    n5 = 170;
                    this.dmflk = false;
                } else {
                    this.dmflk = true;
                }
            }
            ++this.dmcnt;
            if ((double)this.dmcnt > 167.0 - (double)n3 * 1.5) {
                this.dmcnt = 0;
            }
        }
        if ((n4 = (int)((float)n4 + (float)n4 * ((float)this.m.snap[0] / 100.0f))) > 255) {
            n4 = 255;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if ((n5 = (int)((float)n5 + (float)n5 * ((float)this.m.snap[1] / 100.0f))) > 255) {
            n5 = 255;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if ((n6 = (int)((float)n6 + (float)n6 * ((float)this.m.snap[2] / 100.0f))) > 255) {
            n6 = 255;
        }
        if (n6 < 0) {
            n6 = 0;
        }
        this.rd.setColor(new Color(n4, n5, n6));
        this.rd.fillPolygon(nArray, nArray2, 4);
        nArray[0] = 532;
        nArray2[0] = 31;
        nArray[1] = 532;
        nArray2[1] = 40;
        nArray[2] = (int)(532.0f + f);
        nArray2[2] = 40;
        nArray[3] = (int)(532.0f + f);
        nArray2[3] = 31;
        n4 = 128;
        if (f == 98.0f) {
            n4 = 64;
        }
        n5 = (int)(190.0 + (double)f * 0.37);
        n6 = 244;
        if (this.auscnt < 45 && this.aflk) {
            n4 = 0;
            n5 = 255;
            n6 = 0;
        }
        if ((n4 = (int)((float)n4 + (float)n4 * ((float)this.m.snap[0] / 100.0f))) > 255) {
            n4 = 255;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if ((n5 = (int)((float)n5 + (float)n5 * ((float)this.m.snap[1] / 100.0f))) > 255) {
            n5 = 255;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if ((n6 = (int)((float)n6 + (float)n6 * ((float)this.m.snap[2] / 100.0f))) > 255) {
            n6 = 255;
        }
        if (n6 < 0) {
            n6 = 0;
        }
        this.rd.setColor(new Color(n4, n5, n6));
        this.rd.fillPolygon(nArray, nArray2, 4);
        if (this.m.flex == 2 && f != 98.0f) {
            nArray[0] = (int)(532.0f + f);
            nArray2[0] = 31;
            nArray[1] = (int)(532.0f + f);
            nArray2[1] = 39;
            nArray[2] = 630;
            nArray2[2] = 39;
            nArray[3] = 630;
            nArray2[3] = 31;
            this.rd.setColor(new Color(this.m.csky[0], this.m.csky[1], this.m.csky[2]));
            this.rd.fillPolygon(nArray, nArray2, 4);
        }
    }

    private Image bressed(Image image) {
        int n = image.getHeight(this.ob);
        int n2 = image.getWidth(this.ob);
        int[] nArray = new int[n2 * n];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n2, n, nArray, 0, n2);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        Color color = new Color(247, 255, 165);
        for (int i = 0; i < n2 * n; ++i) {
            if (nArray[i] == nArray[n2 * n - 1]) continue;
            nArray[i] = color.getRGB();
        }
        Image image2 = this.createImage(new MemoryImageSource(n2, n, nArray, 0, n2));
        return image2;
    }

    public void loading() {
        this.rd.setColor(new Color(0, 0, 0));
        this.rd.fillRect(0, 0, 670, 400);
        this.rd.drawImage(this.logocars, 12, 28, null);
        this.rd.drawImage(this.cover, 476, 186, this);
        this.rd.drawImage(this.sign, 297, 10, this);
        this.rd.drawImage(this.hello, 60, 80, this);
        this.rd.setColor(new Color(255, 0, 0));
        this.rd.fillRoundRect(185, 315, 300, 80, 30, 70);
        this.rd.setColor(new Color(255, 255, 255));
        this.rd.drawRoundRect(185, 315, 300, 80, 30, 70);
        this.rd.drawImage(this.loadbar, 216, 340, this);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(333, "Loading game, please wait.", 0, 0, 0, 3);
        this.rd.setColor(new Color(255, 0, 0));
        this.rd.fillRect(230, 373, 210, 17);
        this.shload += ((float)this.dnload + 10.0f - this.shload) / 100.0f;
        if (this.shload > (float)this.kbload) {
            this.shload = this.kbload;
        }
        if (this.dnload == this.kbload) {
            this.shload = this.kbload;
        }
        this.drawcs(385, "" + (int)((26.0f + this.shload / (float)this.kbload * 200.0f) / 226.0f * 100.0f) + " % loaded    |    " + (this.kbload - (int)this.shload) + " KB remaining", 255, 255, 255, 3);
        this.rd.setColor(new Color(255, 0, 0));
        this.rd.fillRect(222, 346, 26 + (int)(this.shload / (float)this.kbload * 200.0f), 10);
    }

    public xtGraphics(Medium medium, CheckPoints checkPoints, Graphics graphics, Applet applet) {
        this.sc = new int[7];
        this.flexpix = new int[268000];
        this.smokey = new int[94132];
        this.trackbg = new Image[2][2];
        this.dude = new Image[3];
        this.dudeb = new Image[3];
        this.next = new Image[2];
        this.back = new Image[2];
        this.contin = new Image[2];
        this.ostar = new Image[2];
        this.star = new Image[3];
        this.orank = new Image[7];
        this.rank = new Image[7];
        this.ocntdn = new Image[4];
        this.cntdn = new Image[4];
        this.engs = new AudioClip[9][5];
        this.pengs = new boolean[5];
        this.air = new AudioClip[6];
        this.crash = new AudioClip[3];
        this.lowcrash = new AudioClip[3];
        this.train = new AudioClip[3];
        this.killomatic = new AudioClip[2];
        this.nuke = new AudioClip[2];
        this.guns = new AudioClip[7];
        this.skid = new AudioClip[3];
        this.dustskid = new AudioClip[3];
        this.stracks = new RadicalMod[70];
        this.loadedt = new boolean[70];
        this.dested = new int[7];
        this.trklim = (int)(Math.random() * 40.0);
        this.flkat = (int)(60.0 + 140.0 * Math.random());
        this.movly = (int)(100.0 + 100.0 * Math.random());
        this.pgady = new int[9];
        this.pgas = new boolean[9];
        this.m = medium;
        this.cp = checkPoints;
        this.app = applet;
        this.rd = graphics;
        MediaTracker mediaTracker = new MediaTracker(this.app);
        this.hello = this.app.getImage(this.app.getCodeBase(), "hello.gif");
        mediaTracker.addImage(this.hello, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.sign = this.app.getImage(this.app.getCodeBase(), "sign.gif");
        mediaTracker.addImage(this.sign, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.loadbar = this.app.getImage(this.app.getCodeBase(), "loadbar.gif");
        mediaTracker.addImage(this.loadbar, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.cover = this.app.getImage(this.app.getCodeBase(), "cover.gif");
        mediaTracker.addImage(this.cover, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        int n = 0;
        do {
            this.loadedt[n] = false;
        } while (++n < 17);
    }

    public void maini(Control control) {
        if (this.lastload >= 0 && this.loadedt[this.lastload]) {
            this.stracks[this.lastload].unloadMod();
        }
        if (this.flipo == 0) {
            this.bgmy[0] = 0;
            this.bgmy[1] = 400;
            this.app.setCursor(new Cursor(0));
        }
        int n = 0;
        do {
            this.rd.drawImage(this.bgmain, 0, this.bgmy[n], null);
            int n2 = n;
            this.bgmy[n2] = this.bgmy[n2] - 20;
            if (this.bgmy[n] > -400) continue;
            this.bgmy[n] = 400;
        } while (++n < 2);
        if (this.flipo > this.flkat) {
            this.rd.drawImage(this.logomadbg, 67 + (int)(4.0 - Math.random() * 8.0), 143 + (int)(4.0 - Math.random() * 8.0), null);
        } else {
            this.rd.drawImage(this.logomadbg, 67, 143, null);
        }
        this.rd.drawImage(this.dude[0], this.xdu, this.ydu, null);
        this.rd.drawImage(this.logocars, 12, 28, null);
        if (this.flipo > this.flkat) {
            this.rd.drawImage(this.logomadnes, 99 + (int)(4.0 - Math.random() * 8.0), 148 + (int)(4.0 - Math.random() * 8.0), null);
        } else {
            this.rd.drawImage(this.logomadnes, 99, 148, null);
        }
        ++this.flipo;
        if (this.flipo > this.flkat + 36) {
            this.flipo = 1;
            this.flkat = (int)(60.0 + 140.0 * Math.random());
        }
        if (this.movly <= 10) {
            if (this.movly == 10 || this.movly == 8 || this.movly == 6 || this.movly == 4 || this.movly == 2) {
                this.gxdu = (int)((double)(this.xdu + 200) - 400.0 * Math.random());
                this.gydu = (int)((double)(this.ydu + 200) - 400.0 * Math.random());
                if (this.movly == 2) {
                    this.gxdu = 272;
                    this.gydu = 2;
                }
                --this.movly;
            }
            this.xdu += (this.gxdu - this.xdu) / 15;
            this.ydu += (this.gydu - this.ydu) / 15;
            if (this.movly != 1) {
                if (this.pys(this.xdu, this.gxdu, this.ydu, this.gydu) < 20.0f) {
                    --this.movly;
                }
            } else {
                this.xdu = this.xdu > this.gxdu ? (this.xdu = this.xdu - 1) : (this.xdu = this.xdu + 1);
                int n3 = this.ydu = this.ydu > this.gydu ? (this.ydu = this.ydu - 1) : (this.ydu = this.ydu + 1);
                if (this.pys(this.xdu, this.gxdu, this.ydu, this.gydu) < 2.0f) {
                    --this.movly;
                }
            }
            if (this.movly == 0) {
                this.xdu = 272;
                this.ydu = 2;
                this.movly = (int)(100.0 + 100.0 * Math.random());
            }
        } else if (this.flipo >= this.movly) {
            this.movly = 10;
        }
        this.rd.drawImage(this.opback, 179, 212, null);
        this.rd.drawImage(this.nfmcoms, 237, 195, null);
        this.rd.drawImage(this.recharged, 198, 215, null);
        this.rd.drawImage(this.byrd, 264, 383, null);
        if (control.up) {
            --this.opselect;
            if (this.opselect == -1) {
                this.opselect = 2;
            }
            control.up = false;
        }
        if (control.down) {
            ++this.opselect;
            if (this.opselect == 3) {
                this.opselect = 0;
            }
            control.down = false;
        }
        if (this.opselect == 0) {
            if (this.shaded) {
                this.rd.setColor(new Color(255, 255, 255));
                this.rd.fillRect(278, 246, 110, 22);
                this.aflk = false;
            }
            if (this.aflk) {
                this.rd.setColor(new Color(255, 255, 255));
                this.aflk = false;
            } else {
                this.rd.setColor(new Color(0, 0, 0));
                this.aflk = true;
            }
            this.rd.drawRoundRect(278, 246, 110, 22, 7, 20);
        } else {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(278, 246, 110, 22, 7, 20);
        }
        if (this.opselect == 1) {
            if (this.shaded) {
                this.rd.setColor(new Color(0, 255, 0));
                this.rd.fillRect(234, 275, 196, 22);
                this.aflk = false;
            }
            if (this.aflk) {
                this.rd.setColor(new Color(0, 255, 0));
                this.aflk = false;
            } else {
                this.rd.setColor(new Color(0, 0, 0));
                this.aflk = true;
            }
            this.rd.drawRoundRect(234, 275, 196, 22, 7, 20);
        } else {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(234, 275, 196, 22, 7, 20);
        }
        if (this.opselect == 2) {
            if (this.shaded) {
                this.rd.setColor(new Color(255, 0, 0));
                this.rd.fillRect(290, 306, 85, 22);
                this.aflk = false;
            }
            if (this.aflk) {
                this.rd.setColor(new Color(255, 0, 0));
                this.aflk = false;
            } else {
                this.rd.setColor(new Color(0, 0, 0));
                this.aflk = true;
            }
            this.rd.drawRoundRect(290, 306, 85, 22, 7, 20);
        } else {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(290, 306, 85, 22, 7, 20);
        }
        this.rd.drawImage(this.opti, 241, 250, null);
        if (control.enter || control.handb) {
            if (this.opselect == 0) {
                if (this.unlocked == 1 && this.oldfase == 0) {
                    this.oldfase = -9;
                    this.fase = 11;
                } else {
                    this.fase = -9;
                }
            }
            if (this.opselect == 1) {
                this.oldfase = 10;
                this.fase = 11;
            }
            if (this.opselect == 2) {
                this.fase = 8;
            }
            this.flipo = 0;
            control.enter = false;
            control.handb = false;
        }
        if (this.shaded) {
            this.app.repaint();
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    public void blendude(Image image) {
        if (!this.macn) {
            this.dudo = Math.random() > Math.random() ? 217 : 331;
            int[] nArray = new int[19520];
            PixelGrabber pixelGrabber = new PixelGrabber(image, this.dudo, 0, 122, 160, nArray, 0, 122);
            try {
                pixelGrabber.grabPixels();
            }
            catch (InterruptedException interruptedException) {
                this.dudo = -1;
            }
            int n = 0;
            do {
                int[] nArray2 = new int[19520];
                PixelGrabber pixelGrabber2 = new PixelGrabber(this.dude[n], 0, 10, 122, 160, nArray2, 0, 122);
                try {
                    pixelGrabber2.grabPixels();
                }
                catch (InterruptedException interruptedException) {
                    this.dudo = -1;
                }
                if (this.dudo == -1) continue;
                int n2 = 0;
                do {
                    int n3;
                    int n4;
                    if (nArray2[n2] == nArray2[0]) continue;
                    Color color = new Color(nArray2[n2]);
                    Color color2 = new Color(nArray[n2]);
                    int n5 = (color.getRed() + color2.getRed() * 3) / 4;
                    if (n5 > 255) {
                        n5 = 255;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    if ((n4 = (color.getGreen() + color2.getGreen() * 3) / 4) > 255) {
                        n4 = 255;
                    }
                    if (n4 < 0) {
                        n4 = 0;
                    }
                    if ((n3 = (color.getBlue() + color2.getBlue() * 3) / 4) > 255) {
                        n3 = 255;
                    }
                    if (n3 < 0) {
                        n3 = 0;
                    }
                    Color color3 = new Color(n5, n4, n3);
                    nArray2[n2] = color3.getRGB();
                } while (++n2 < 19520);
                this.dudeb[n] = this.createImage(new MemoryImageSource(122, 160, nArray2, 0, 122));
            } while (++n < 3);
        } else {
            this.dudo = Math.random() > Math.random() ? 176 : 372;
            int n = 0;
            do {
                this.dudeb[n] = this.dude[n];
            } while (++n < 3);
        }
    }

    public void musicomp(int n, Control control) {
        this.hipnoload(n, true);
        if (control.handb || control.enter) {
            System.gc();
            this.fase = 0;
            control.handb = false;
            control.enter = false;
        }
    }

    public void drawSmokeCarsbg() {
        if (Math.abs(this.flyr - this.flyrdest) > 20) {
            this.flyr = this.flyr > this.flyrdest ? (this.flyr = this.flyr - 20) : (this.flyr = this.flyr + 20);
        } else {
            this.flyr = this.flyrdest;
            this.flyrdest = (int)((float)this.flyr + this.m.random() * 160.0f - 80.0f);
        }
        if (this.flyr > 160) {
            this.flyr = 160;
        }
        if (this.flatr > 170) {
            ++this.flatrstart;
            this.flatr = this.flatrstart * 3;
            this.flyr = (int)(this.m.random() * 160.0f - 80.0f);
            this.flyrdest = (int)((float)this.flyr + this.m.random() * 160.0f - 80.0f);
            this.flang = 1;
            this.flangados = (int)(this.m.random() * 6.0f + 2.0f);
            this.blackn = 0.0f;
            this.blacknados = this.m.random() * 0.4f;
        }
        int n = 0;
        do {
            int n2 = 0;
            do {
                if (this.smokey[n + n2 * 466] == this.smokey[0]) continue;
                float f = this.pys(n, 233, n2, this.flyr);
                int n3 = (int)((float)(n - 233) / f * (float)this.flatr);
                int n4 = (int)((float)(n2 - this.flyr) / f * (float)this.flatr);
                int n5 = n + n3 + 100 + (n2 + n4 + 110) * 670;
                if (n + n3 + 100 >= 670 || n + n3 + 100 <= 0 || n2 + n4 + 110 >= 400 || n2 + n4 + 110 <= 0 || n5 >= 268000 || n5 < 0) continue;
                Color color = new Color(this.flexpix[n5]);
                Color color2 = new Color(this.smokey[n + n2 * 466]);
                float f2 = (255.0f - (float)color2.getRed()) / 255.0f;
                int n6 = (int)(((float)color.getRed() * ((float)this.flang * f2) + (float)color2.getRed() * (1.0f - f2)) / ((float)this.flang * f2 + (1.0f - f2) + this.blackn));
                if (n6 > 255) {
                    n6 = 255;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                Color color3 = new Color(n6, n6, n6);
                this.flexpix[n5] = color3.getRGB();
            } while (++n2 < 202);
        } while (++n < 466);
        this.blackn += this.blacknados;
        this.flang += this.flangados;
        this.flatr += 10 + this.flatrstart * 2;
        Image image = this.createImage(new MemoryImageSource(670, 400, this.flexpix, 0, 670));
        this.rd.drawImage(image, 0, 0, null);
    }

    public void loaddata(int n) {
        String string;
        this.kbload = 625;
        this.sunny = false;
        String string2 = "default/";
        String string3 = "au";
        if (n == 2) {
            this.kbload = 950;
            this.sunny = true;
            string2 = "JavaNew/";
            string3 = "wav";
        }
        if (!(string = System.getProperty("os.name")).startsWith("Win")) {
            this.macn = true;
        }
        this.runtyp = 176;
        this.runner = new Thread(this);
        this.runner.start();
        this.loadimages();
        this.cars = new RadicalMod("music/cars.radq", this.app);
        this.dnload += 27;
        this.credits = new RadicalMod("music/credits.radq", this.app);
        this.dnload += 27;
        this.instructions = new RadicalMod("music/instructions.radq", this.app);
        this.dnload += 27;
        int n2 = 0;
        do {
            int n3 = 0;
            do {
                this.engs[n3][n2] = this.getSound("sounds/" + string2 + "" + n3 + "" + n2 + ".wav");
                this.dnload += 3;
            } while (++n3 < 9);
            this.pengs[n2] = false;
        } while (++n2 < 5);
        this.stages = new RadicalMod("music/stages.radq", this.app);
        this.dnload += 91;
        n2 = 0;
        do {
            this.air[n2] = this.getSound("sounds/" + string2 + "air" + n2 + ".wav");
            this.dnload += 2;
        } while (++n2 < 6);
        n2 = 0;
        do {
            this.crash[n2] = this.getSound("sounds/" + string2 + "crash" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 10;
                continue;
            }
            this.dnload += 7;
        } while (++n2 < 3);
        n2 = 0;
        do {
            this.lowcrash[n2] = this.getSound("sounds/" + string2 + "lowcrash" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 10;
                continue;
            }
            this.dnload += 3;
        } while (++n2 < 3);
        n2 = 0;
        do {
            this.train[n2] = this.getSound("sounds/" + string2 + "train" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 10;
                continue;
            }
            this.dnload += 3;
        } while (++n2 < 3);
        this.tires = this.getSound("sounds/" + string2 + "tires." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.checkpoint = this.getSound("sounds/" + string2 + "checkpoint." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 6);
        this.carfixed = this.getSound("sounds/" + string2 + "carfixed." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 10);
        this.powerup = this.getSound("sounds/" + string2 + "powerup." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 42) : (this.dnload = this.dnload + 8);
        this.three = this.getSound("sounds/" + string2 + "three." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.two = this.getSound("sounds/" + string2 + "two." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 2);
        this.one = this.getSound("sounds/" + string2 + "one." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.go = this.getSound("sounds/" + string2 + "go." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.wastd = this.getSound("sounds/" + string2 + "wasted." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.explosion = this.getSound("sounds/" + string2 + "explosion." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 4);
        this.firewasted = this.getSound("sounds/" + string2 + "firewasted." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 10);
        this.flames = this.getSound("sounds/" + string2 + "flames." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 10);
        this.out = this.getSound("sounds/" + string2 + "out." + string3);
        this.dnload = n == 2 ? (this.dnload = this.dnload + 24) : (this.dnload = this.dnload + 10);
        n2 = 0;
        do {
            this.skid[n2] = this.getSound("sounds/" + string2 + "skid" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 22;
                continue;
            }
            this.dnload += 6;
        } while (++n2 < 3);
        n2 = 0;
        do {
            this.dustskid[n2] = this.getSound("sounds/" + string2 + "dustskid" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 22;
                continue;
            }
            this.dnload += 7;
        } while (++n2 < 3);
        n2 = 0;
        do {
            this.killomatic[n2] = this.getSound("sounds/" + string2 + "killomatic" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 22;
                continue;
            }
            this.dnload += 7;
        } while (++n2 < 2);
        n2 = 0;
        do {
            this.nuke[n2] = this.getSound("sounds/" + string2 + "nuke" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 22;
                continue;
            }
            this.dnload += 7;
        } while (++n2 < 2);
        n2 = 0;
        do {
            this.guns[n2] = this.getSound("sounds/" + string2 + "gun" + (n2 + 1) + "." + string3);
            if (n == 2) {
                this.dnload += 22;
                continue;
            }
            this.dnload += 7;
        } while (++n2 < 7);
    }

    public void clicknow() {
        this.rd.setColor(new Color(0, 255, 0));
        this.rd.fillRoundRect(185, 315, 300, 80, 30, 70);
        this.rd.setColor(new Color(255, 255, 255));
        this.rd.drawRoundRect(185, 315, 300, 80, 30, 70);
        if (this.aflk) {
            this.drawcs(355, "Click here to Start", 0, 0, 0, 3);
            this.aflk = false;
        } else {
            this.drawcs(355, "Click here to Start", 255, 255, 255, 3);
            this.aflk = true;
        }
        this.drawcs(335, "THIS IS A PROTOTYPE", 0, 0, 0, 3);
        this.drawcs(375, "GAME IS INCOMPLETE", 0, 0, 0, 3);
        this.drawcs(390, "EXPECT PROBLEMS", 0, 0, 0, 3);
    }

    private Image loadimage(byte[] byArray, MediaTracker mediaTracker, Toolkit toolkit) {
        Image image = toolkit.createImage(byArray);
        mediaTracker.addImage(image, 0);
        try {
            mediaTracker.waitForID(0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return image;
    }

    public void rad(int n) {
        if (n == 0) {
            this.powerup.play();
            this.radpx = 147;
            this.pin = 0;
        }
        this.trackbg(false);
        this.rd.setColor(new Color(0, 0, 0));
        this.rd.fillRect(0, 110, 670, 59);
        if (this.pin != 0) {
            this.rd.drawImage(this.radicalplay, this.radpx + (int)(8.0 * Math.random() - 4.0), 110, null);
        } else {
            this.rd.drawImage(this.radicalplay, 147, 110, null);
        }
        if (this.radpx != 147) {
            this.radpx += 40;
            if (this.radpx > 670) {
                this.radpx = -453;
            }
        } else if (this.pin != 0) {
            --this.pin;
        }
        if (n == 40) {
            this.radpx = 148;
            this.pin = 7;
        }
        if (this.radpx == 147) {
            this.rd.setFont(new Font("SansSerif", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            this.drawcs(160 + (int)(5.0f * this.m.random()), "Radicalplay.com", 255, 255, 255, 3);
        }
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        if (this.aflk) {
            this.drawcs(190, "And we are never going to find the new unless we get a little crazy...", 255, 255, 255, 3);
            this.aflk = false;
        } else {
            this.drawcs(192, "And we are never going to find the new unless we get a little crazy...", 100, 100, 100, 3);
            this.aflk = true;
        }
        this.rd.setFont(new Font("Impact", 1, 25));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(230, "Need For Madness Expert", 0, 0, 0, 3);
        this.rd.drawImage(this.rpro, 210, 240, null);
        this.rd.drawImage(this.sign, 297, 10, null);
    }

    public void skid(int n, float f) {
        if (this.bfcrash == 0 && this.bfskid == 0 && f > 150.0f) {
            if (n == 0) {
                if (!this.mutes) {
                    this.skid[this.skflg].play();
                }
                int n2 = this.skflg = this.skidup ? (this.skflg = this.skflg + 1) : (this.skflg = this.skflg - 1);
                if (this.skflg == 3) {
                    this.skflg = 0;
                }
                if (this.skflg == -1) {
                    this.skflg = 2;
                }
            } else {
                if (!this.mutes) {
                    this.dustskid[this.dskflg].play();
                }
                int n3 = this.dskflg = this.skidup ? (this.dskflg = this.dskflg + 1) : (this.dskflg = this.dskflg - 1);
                if (this.dskflg == 3) {
                    this.dskflg = 0;
                }
                if (this.dskflg == -1) {
                    this.dskflg = 2;
                }
            }
            this.bfskid = 35;
        }
    }

    public int xs(int n, int n2) {
        if (n2 < 50) {
            n2 = 50;
        }
        return (n2 - this.m.focus_point) * (this.m.cx - n) / n2 + n;
    }

    public void cantreply() {
        this.rd.setColor(new Color(64, 143, 223));
        this.rd.fillRoundRect(135, 73, 400, 23, 7, 20);
        this.rd.setColor(new Color(0, 89, 223));
        this.rd.drawRoundRect(135, 73, 400, 23, 7, 20);
        this.drawcs(89, "Sorry not enough replay data to play available, please try again later.", 255, 255, 255, 1);
    }

    public void stopallnow() {
        int n = 0;
        do {
            if (!this.loadedt[n]) continue;
            this.stracks[n].unloadAll();
            this.stracks[n] = null;
        } while (++n < 17);
        n = 0;
        do {
            this.engs[0][n].stop();
            this.engs[1][n].stop();
        } while (++n < 5);
        n = 0;
        do {
            this.air[n].stop();
        } while (++n < 6);
        this.wastd.stop();
        this.cars.unloadAll();
        this.stages.unloadAll();
    }

    public void inishcarselect() {
        this.carsbginflex();
        this.flatrstart = 0;
        this.m.lightson = false;
        this.cars.loadMod(200, 7900, 125, this.sunny, this.macn);
        this.pnext = 0;
        this.pback = 0;
    }

    public void carselect(Control control, ContO[] contOArray, Madness madness) {
        this.cars.play();
        if (this.flatrstart == 6) {
            this.rd.drawImage(this.carsbg, 0, 0, null);
        } else if (this.flatrstart <= 1) {
            this.drawSmokeCarsbg();
        } else {
            this.rd.setColor(new Color(255, 255, 255));
            this.rd.fillRect(0, 0, 670, 400);
            this.carsbginflex();
            this.flatrstart = 6;
        }
        this.rd.drawImage(this.selectcar, 256, 12, null);
        this.m.crs = true;
        this.m.x = -335;
        this.m.y = -500;
        this.m.z = -50;
        this.m.xz = 0;
        this.m.zy = 10;
        this.m.ground = 470;
        contOArray[this.sc[0]].d(this.rd);
        if (this.flipo == 0) {
            this.rd.setFont(new Font("SansSerif", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            int n = 0;
            if (this.flatrstart < 6) {
                n = 2;
            }
            if (this.aflk) {
                this.drawcs(70 + n, this.names[this.sc[0]], 240, 240, 240, 3);
                this.aflk = false;
            } else {
                this.drawcs(70, this.names[this.sc[0]], 176, 176, 176, 3);
                this.aflk = true;
            }
            if (this.sc[0] == 33 || this.sc[0] == 34 || this.sc[0] == 35 || this.sc[0] == 36 || this.sc[0] == 37 || this.sc[0] == 38) {
                this.drawcs(90, "( Immortal )", 150, 150, 150, 3);
            }
            if (this.sc[0] == 35 || this.sc[0] == 37 || this.sc[0] == 38 || this.sc[0] == 39) {
                this.drawcs(335, "Caution; Powerful", 255, 0, 0, 3);
            }
            contOArray[this.sc[0]].z = 950;
            if (this.sc[0] == 13) {
                contOArray[this.sc[0]].z = 1000;
            }
            contOArray[this.sc[0]].y = -34 - contOArray[this.sc[0]].grat;
            contOArray[this.sc[0]].x = 0;
            contOArray[this.sc[0]].xz += 5;
            contOArray[this.sc[0]].zy = 0;
            contOArray[this.sc[0]].wzy -= 10;
            if (contOArray[this.sc[0]].wzy < -45) {
                contOArray[this.sc[0]].wzy += 45;
            }
            this.rd.drawImage(this.back[this.pback], 30, 250, null);
            this.rd.drawImage(this.next[this.pnext], 580, 250, null);
            if (this.getCarOrderIndex(this.sc[0]) >= this.carsUnlocked) {
                int n2;
                if (this.gatey == 300) {
                    n2 = 0;
                    do {
                        this.pgas[n2] = false;
                        this.pgady[n2] = 0;
                    } while (++n2 < 9);
                    this.pgas[0] = true;
                }
                n2 = 0;
                do {
                    int n3;
                    this.rd.drawImage(this.pgate, this.pgatx[n2], this.pgaty[n2] + this.pgady[n2] - this.gatey, null);
                    if (this.flatrstart != 6) continue;
                    if (this.pgas[n2]) {
                        n3 = n2;
                        this.pgady[n3] = this.pgady[n3] - (80 + 100 / (n2 + 1) - Math.abs(this.pgady[n2])) / 3;
                        if (this.pgady[n2] >= -(70 + 100 / (n2 + 1))) continue;
                        this.pgas[n2] = false;
                        if (n2 == 8) continue;
                        this.pgas[n2 + 1] = true;
                        continue;
                    }
                    n3 = n2;
                    this.pgady[n3] = this.pgady[n3] + (80 + 100 / (n2 + 1) - Math.abs(this.pgady[n2])) / 3;
                    if (this.pgady[n2] <= 0) continue;
                    this.pgady[n2] = 0;
                } while (++n2 < 9);
                if (this.gatey != 0) {
                    this.gatey -= 100;
                }
                if (this.flatrstart == 6) {
                    this.drawcs(335, "[ Car Locked ]", 210, 210, 210, 3);
                    int carPos = this.getCarOrderIndex(this.sc[0]);
                    int unlockStage = (carPos - 4) * 2;

                    this.drawcs(355, "This car unlocks when stage " + unlockStage + " is completed...", 181, 120, 40, 3);
                }
            } else {
                if (this.flatrstart == 6) {
                    float f;
                    this.rd.setFont(new Font("SansSerif", 1, 22));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(181, 120, 40));
                    this.rd.drawString("CLASS:", 410, 376);
                    if (this.sc[0] < 5) {
                        this.rd.setColor(new Color(50, 50, 50));
                        this.rd.drawString("C", 500, 376);
                    }
                    if (this.sc[0] == 5) {
                        this.rd.setColor(new Color(75, 75, 75));
                        this.rd.drawString("B & C", 500, 376);
                    }
                    if (this.sc[0] > 5 && this.sc[0] < 10 || this.sc[0] == 16) {
                        this.rd.setColor(new Color(100, 100, 100));
                        this.rd.drawString("B", 500, 376);
                    }
                    if (this.sc[0] == 10 || this.sc[0] == 19 || this.sc[0] == 21) {
                        this.rd.setColor(new Color(125, 125, 125));
                        this.rd.drawString("A & B", 500, 376);
                    }
                    if (this.sc[0] > 10 && this.sc[0] < 16 || this.sc[0] == 17 || this.sc[0] == 18 || this.sc[0] == 22 || this.sc[0] == 24) {
                        this.rd.setColor(new Color(150, 150, 150));
                        this.rd.drawString("A", 500, 376);
                    }
                    if (this.sc[0] == 20 || this.sc[0] == 27) {
                        this.rd.setColor(new Color(175, 175, 175));
                        this.rd.drawString("A+ & A", 500, 376);
                    }
                    if (this.sc[0] == 23 || this.sc[0] == 25) {
                        this.rd.setColor(new Color(200, 200, 200));
                        this.rd.drawString("A+", 500, 376);
                    }
                    if (this.sc[0] == 26 || this.sc[0] == 28 || this.sc[0] == 29 || this.sc[0] == 30) {
                        this.rd.setColor(new Color(225, 225, 225));
                        this.rd.drawString("A++ & A+", 500, 376);
                    }
                    if (this.sc[0] == 31 || this.sc[0] == 32) {
                        this.rd.setColor(new Color(250, 250, 250));
                        this.rd.drawString("A++", 500, 376);
                    }
                    if (this.sc[0] == 33) {
                        this.rd.setColor(new Color(50, 50, 50));
                        this.rd.drawString("Untouchable", 500, 376);
                    }
                    if (this.sc[0] == 34) {
                        this.rd.setColor(new Color(255, 255, 255));
                        this.rd.drawString("A+++ & A++", 500, 376);
                    }
                    if (this.sc[0] == 35 || this.sc[0] == 36 || this.sc[0] == 37 || this.sc[0] == 38) {
                        this.rd.setColor(new Color(255, 255, 255));
                        this.rd.drawString("A+++", 500, 376);
                    }
                    if (this.sc[0] == 39) {
                        this.rd.setColor(new Color(255, 0, 0));
                        this.rd.drawString("SUICIDAL", 500, 376);
                    }
                    this.rd.setFont(new Font("SansSerif", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(181, 120, 40));
                    this.rd.drawString("Top Speed:", 33, 318);
                    this.rd.drawImage(this.statb, 97, 312, null);
                    this.rd.drawString("Acceleration:", 23, 333);
                    this.rd.drawImage(this.statb, 97, 327, null);
                    this.rd.drawString("Handling:", 45, 348);
                    this.rd.drawImage(this.statb, 97, 342, null);
                    this.rd.drawString("Firepower?:", 28, 363);
                    this.rd.drawImage(this.statb, 97, 357, null);
                    this.rd.drawString("Stunts:", 430, 318);
                    this.rd.drawImage(this.statb, 471, 312, null);
                    this.rd.drawString("Strength:", 418, 333);
                    this.rd.drawImage(this.statb, 471, 327, null);
                    this.rd.drawString("Endurance:", 408, 348);
                    this.rd.drawImage(this.statb, 471, 342, null);
                    this.rd.setColor(new Color(0, 0, 0));
                    float f2 = (float)(madness.swits[this.sc[0]][2] - 220) / 90.0f;
                    if ((double)f2 < 0.2) {
                        f2 = 0.2f;
                    }
                    this.rd.fillRect((int)(97.0f + 156.0f * f2), 312, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    f2 = madness.acelf[this.sc[0]][1] * madness.acelf[this.sc[0]][0] * madness.acelf[this.sc[0]][2] * madness.grip[this.sc[0]] / 7700.0f;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.rd.fillRect((int)(97.0f + 156.0f * f2), 327, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    f2 = this.dishandle[this.sc[0]];
                    this.rd.fillRect((int)(97.0f + 156.0f * f2), 342, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    f2 = ((float)madness.airc[this.sc[0]] * madness.airs[this.sc[0]] * madness.bounce[this.sc[0]] + 28.0f) / 139.0f;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.rd.fillRect((int)(471.0f + 156.0f * f2), 312, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    float f3 = 0.5f;
                    if (this.sc[0] == 9) {
                        f3 = 0.8f;
                    }
                    f2 = (madness.moment[this.sc[0]] + f3) / 2.6f;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    this.rd.fillRect((int)(471.0f + 156.0f * f2), 327, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    f2 = this.outdam[this.sc[0]];
                    this.rd.fillRect((int)(471.0f + 156.0f * f2), 342, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    f2 = this.firepower[this.sc[0]];
                    this.rd.fillRect((int)(97.0f + 156.0f * f2), 357, (int)(156.0f * (1.0f - f2) + 1.0f), 7);
                    this.rd.drawImage(this.statbo, 97, 312, null);
                    this.rd.drawImage(this.statbo, 97, 327, null);
                    this.rd.drawImage(this.statbo, 97, 342, null);
                    this.rd.drawImage(this.statbo, 97, 357, null);
                    this.rd.drawImage(this.statbo, 471, 312, null);
                    this.rd.drawImage(this.statbo, 471, 327, null);
                    this.rd.drawImage(this.statbo, 471, 342, null);
                }
                this.rd.drawImage(this.contin[this.pcontin], 290, 360, null);
            }
        } else {
            this.pback = 0;
            this.pnext = 0;
            this.gatey = 300;
            if (this.flipo > 10) {
                contOArray[this.sc[0]].y -= 100;
                contOArray[this.sc[0]].zy = this.nextc ? (contOArray[this.sc[0]].zy = contOArray[this.sc[0]].zy + 20) : (contOArray[this.sc[0]].zy = contOArray[this.sc[0]].zy - 20);
            } else {
                if (this.flipo == 10) {
                    this.sc[0] = this.nextc ? this.sc[0] + 1 : this.sc[0] - 1;
                    contOArray[this.sc[0]].z = 950;
                    contOArray[this.sc[0]].y = -34 - contOArray[this.sc[0]].grat - 1100;
                    contOArray[this.sc[0]].x = 0;
                    contOArray[this.sc[0]].zy = 0;
                }
                contOArray[this.sc[0]].y += 100;
            }
            --this.flipo;
        }
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(295, "Note: Some stats shown may be inaccurate", 0, 0, 0, 3);
        this.drawcs(396, "You can also use Keyboard Arrows and Enter to navigate.", 82, 90, 0, 3);
        if (control.right) {
            control.right = false;
            int pos = this.carOrderPosition(this.sc[0]);
            ++pos;

            if (pos >= this.carorder.length) {
                pos = 0;
            } 
                this.sc[0] = this.carorder[pos];
            
        }
        if (control.left) {
            control.left = false;
            int pos = this.carOrderPosition(this.sc[0]);
            --pos;

            if (pos < 0) {
                pos = this.carorder.length - 1;
            } 
                this.sc[0] = this.carorder[pos];
            
        }
        if (control.handb || control.enter) {
            int carPos = this.getCarOrderIndex(this.sc[0]);

            if (this.flipo == 0 && carPos >= 0 && carPos < this.carsUnlocked) {
                this.lastload = -11;
                this.cars.stop();
                this.cars.unloadMod();
                this.m.crs = false;
                this.fase = 2;
            }

            control.handb = false;
            control.enter = false;
        }
    }

    public void ctachm(int n, int n2, int n3, Control control) {
        if (this.fase == 1) {
            if (n3 == 1) {
                if (this.over(this.next[0], n, n2, 560, 110)) {
                    this.pnext = 1;
                }
                if (this.over(this.back[0], n, n2, 50, 110)) {
                    this.pback = 1;
                }
                if (this.over(this.contin[0], n, n2, 290, 325)) {
                    this.pcontin = 1;
                }
            }
            if (n3 == 2) {
                if (this.pnext == 1) {
                    control.right = true;
                }
                if (this.pback == 1) {
                    control.left = true;
                }
                if (this.pcontin == 1) {
                    control.enter = true;
                }
            }
        }
        if (this.fase == 3) {
            if (n3 == 1 && this.over(this.contin[0], n, n2, 290, 325)) {
                this.pcontin = 1;
            }
            if (n3 == 2 && this.pcontin == 1) {
                control.enter = true;
                this.pcontin = 0;
            }
            if (n3 == 1) {
                if (this.over(this.next[0], n, n2, 560, 110)) {
                    this.pnext = 1;
                }
                if (this.over(this.back[0], n, n2, 50, 110)) {
                    this.pback = 1;
                }
                if (this.over(this.contin[0], n, n2, 290, 325)) {
                    this.pcontin = 1;
                }
            }
            if (n3 == 2) {
                if (this.pnext == 1) {
                    control.right = true;
                }
                if (this.pback == 1) {
                    control.left = true;
                }
                if (this.pcontin == 1) {
                    control.enter = true;
                }
            }
        }
        if (this.fase == 4) {
            if (n3 == 1 && this.over(this.back[0], n, n2, 305, 320)) {
                this.pback = 1;
            }
            if (n3 == 2 && this.pback == 1) {
                control.enter = true;
                this.pback = 0;
            }
        }
        if (this.fase == 6) {
            if (n3 == 1 && (this.over(this.star[0], n, n2, 294, 360) || this.over(this.star[0], n, n2, 294, 270))) {
                this.pstar = 2;
            }
            if (n3 == 2 && this.pstar == 2) {
                control.enter = true;
                this.pstar = 1;
            }
        }
        if (this.fase == 7) {
            if (n3 == 1) {
                if (this.over(this.next[0], n, n2, 580, 250)) {
                    this.pnext = 1;
                }
                if (this.over(this.back[0], n, n2, 30, 250)) {
                    this.pback = 1;
                }
                if (this.over(this.contin[0], n, n2, 290, 360)) {
                    this.pcontin = 1;
                }
            }
            if (n3 == 2) {
                if (this.pnext == 1) {
                    control.right = true;
                }
                if (this.pback == 1) {
                    control.left = true;
                }
                if (this.pcontin == 1) {
                    control.enter = true;
                    this.pcontin = 0;
                }
            }
        }
        if (this.fase == -5) {
            this.lxm = n;
            this.lym = n2;
            if (n3 == 1 && this.over(this.contin[0], n, n2, 290, 350 - this.pin)) {
                this.pcontin = 1;
            }
            if (n3 == 2 && this.pcontin == 1) {
                control.enter = true;
                this.pcontin = 0;
            }
        }
        if (this.fase == -7) {
            if (n3 == 1) {
                if (this.overon(264, 45, 137, 22, n, n2)) {
                    this.opselect = 0;
                    this.shaded = true;
                }
                if (this.overon(255, 73, 155, 22, n, n2)) {
                    this.opselect = 1;
                    this.shaded = true;
                }
                if (this.overon(238, 99, 190, 22, n, n2)) {
                    this.opselect = 2;
                    this.shaded = true;
                }
                if (this.overon(276, 125, 109, 22, n, n2)) {
                    this.opselect = 3;
                    this.shaded = true;
                }
            }
            if (n3 == 2 && this.shaded) {
                control.enter = true;
                this.shaded = false;
            }
            if (n3 == 0 && (n != this.lxm || n2 != this.lym)) {
                if (this.overon(264, 45, 137, 22, n, n2)) {
                    this.opselect = 0;
                }
                if (this.overon(255, 73, 155, 22, n, n2)) {
                    this.opselect = 1;
                }
                if (this.overon(238, 99, 190, 22, n, n2)) {
                    this.opselect = 2;
                }
                if (this.overon(276, 125, 109, 22, n, n2)) {
                    this.opselect = 3;
                }
                this.lxm = n;
                this.lym = n2;
            }
        }
        if (this.fase == 10) {
            if (n3 == 1) {
                if (this.overon(278, 246, 110, 22, n, n2)) {
                    this.opselect = 0;
                    this.shaded = true;
                }
                if (this.overon(234, 275, 196, 22, n, n2)) {
                    this.opselect = 1;
                    this.shaded = true;
                }
                if (this.overon(290, 306, 85, 22, n, n2)) {
                    this.opselect = 2;
                    this.shaded = true;
                }
            }
            if (n3 == 2 && this.shaded) {
                control.enter = true;
                this.shaded = false;
            }
            if (n3 == 0 && (n != this.lxm || n2 != this.lym)) {
                if (this.overon(278, 246, 110, 22, n, n2)) {
                    this.opselect = 0;
                }
                if (this.overon(234, 275, 196, 22, n, n2)) {
                    this.opselect = 1;
                }
                if (this.overon(290, 306, 85, 22, n, n2)) {
                    this.opselect = 2;
                }
                this.lxm = n;
                this.lym = n2;
            }
        }
        if (this.fase == 11) {
            if (this.flipo >= 1 && this.flipo <= 13) {
                if (n3 == 1 && this.over(this.next[0], n, n2, 600, 370)) {
                    this.pnext = 1;
                }
                if (n3 == 2 && this.pnext == 1) {
                    control.right = true;
                    this.pnext = 0;
                }
            }
            if (this.flipo >= 3 && this.flipo <= 15) {
                if (n3 == 1 && this.over(this.back[0], n, n2, 10, 370)) {
                    this.pback = 1;
                }
                if (n3 == 2 && this.pback == 1) {
                    control.left = true;
                    this.pback = 0;
                }
            }
            if (this.flipo == 15) {
                if (n3 == 1 && this.over(this.contin[0], n, n2, 500, 370)) {
                    this.pcontin = 1;
                }
                if (n3 == 2 && this.pcontin == 1) {
                    control.enter = true;
                    this.pcontin = 0;
                }
            }
        }
        if (this.fase == 8) {
            if (n3 == 1 && this.over(this.next[0], n, n2, 600, 370)) {
                this.pnext = 1;
            }
            if (n3 == 2 && this.pnext == 1) {
                control.enter = true;
                this.pnext = 0;
            }
        }
    }

    public void stopairs() {
        int n = 0;
        do {
            this.air[n].stop();
        } while (++n < 6);
    }

    @Override
    public void run() {
        while (this.runtyp != 0) {
            if (this.runtyp >= 1 && this.runtyp <= 17) {
                this.hipnoload(this.runtyp, false);
            }
            if (this.runtyp == 176) {
                this.loading();
            }
            this.app.repaint();
            try {
                Thread.sleep(20L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public void loadingfailed(int n, Control control, CheckPoints checkPoints) {
        this.trackbg(false);
        this.rd.drawImage(this.br, 0, 0, null);
        this.rd.drawImage(this.select, 273, 45, null);
        this.rd.drawImage(this.back[this.pback], 50, 110, null);
        this.rd.drawImage(this.next[this.pnext], 560, 110, null);
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(140, "Error Loading Stage " + n, 200, 0, 0, 3);
        this.drawcs(170, "Your internet connection may have been lost...", 177, 177, 177, 3);
        this.drawcs(220, "Press Enter to try again.", 177, 177, 177, 3);
        this.rd.drawImage(this.contin[this.pcontin], 290, 325, null);
        this.rd.drawImage(this.br, 0, 0, null);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(396, "You can also use Keyboard Arrows and Enter to navigate.", 82, 90, 0, 3);
        if (control.handb || control.enter) {
            this.fase = 2;
            control.handb = false;
            control.enter = false;
        }
        if (control.right && checkPoints.stage != 70) {
            ++checkPoints.stage;
            this.fase = 2;
            control.right = false;
        }
        if (control.right && checkPoints.stage == 70) {
            checkPoints.stage = 1;
            this.fase = 2;
            control.right = false;
        }
        if (control.left && checkPoints.stage != 1) {
            --checkPoints.stage;
            this.fase = 2;
            control.left = false;
        }
        if (control.left && checkPoints.stage == 1) {
            checkPoints.stage = 70;
            this.fase = 2;
            control.left = false;
        }
    }

    public void hipnoload(int n, boolean bl) {
        int n2;
        int n3;
        int n4 = (int)(230.0f - 230.0f * ((float)this.m.snap[0] / (100.0f * this.hipno[n - 1])));
        if (n4 > 255) {
            n4 = 255;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if ((n3 = (int)(230.0f - 230.0f * ((float)this.m.snap[1] / (100.0f * this.hipno[n - 1])))) > 255) {
            n3 = 255;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if ((n2 = (int)(230.0f - 230.0f * ((float)this.m.snap[2] / (100.0f * this.hipno[n - 1])))) > 255) {
            n2 = 255;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n == 1) {
            n4 = 230;
            n3 = 230;
            n2 = 230;
        }
        this.rd.setColor(new Color(n4, n3, n2));
        this.rd.fillRect(0, 0, 670, 400);
        this.rd.setFont(new Font("SansSerif", 1, 13));
        this.ftm = this.rd.getFontMetrics();
        this.drawcs(25, this.asay, 0, 0, 0, 3);
        int n5 = -90;
        if (n >= 1 && n <= 70) {
            n5 = 0;
        }
        if (n5 == 0) {
            int n6;
            int n7;
            if (this.dudo > 0) {
                if (this.aflk) {
                    this.duds = Math.random() > Math.random() ? (int)(Math.random() * 3.0) : (int)(Math.random() * 2.0);
                    this.aflk = false;
                } else {
                    this.aflk = true;
                }
                --this.dudo;
            } else {
                this.duds = 0;
            }
            this.rd.drawImage(this.dude[this.duds], 30, 10, null);
            this.rd.drawImage(this.flaot, 127, 42, null);
            int n8 = (int)(80.0f - 80.0f * ((float)this.m.snap[0] / (50.0f * this.hipno[n - 1])));
            if (n8 > 255) {
                n8 = 255;
            }
            if (n8 < 0) {
                n8 = 0;
            }
            if ((n7 = (int)(80.0f - 80.0f * ((float)this.m.snap[1] / (50.0f * this.hipno[n - 1])))) > 255) {
                n7 = 255;
            }
            if (n7 < 0) {
                n7 = 0;
            }
            if ((n6 = (int)(80.0f - 80.0f * ((float)this.m.snap[2] / (50.0f * this.hipno[n - 1])))) > 255) {
                n6 = 255;
            }
            if (n6 < 0) {
                n6 = 0;
            }
            if (n == 1) {
                n8 = 80;
                n7 = 80;
                n6 = 80;
            }
            this.rd.setColor(new Color(n8, n7, n6));
            this.rd.setFont(new Font("SansSerif", 1, 13));
            if (n == 1) {
                this.rd.drawString("Welcome to Aidvan's remake of NFM:RAR! Remember to pass through", 197, 67);
                this.rd.drawString("all checkpoints in the track!", 197, 87);
                this.rd.drawString("Each pair of stages have their own unique boss car which is unlocked", 197, 127);
                this.rd.drawString("after completing them! Have fun!", 197, 147);

            }
            if (n == 2) {
                this.rd.drawString("Remember, the more power you have the faster your car will be!", 197, 67);
                this.rd.drawString("Completing this stage will unlock MAX Revenge! Now go get em!", 197, 107);
            }
            if (n == 3) {
                this.rd.drawString("Good news, there is only one checkpoint!", 197, 67);
                this.rd.drawString("Bad news, you have 100 laps to complete.", 197, 87);
                this.rd.drawString("Try not to get intercepted when gaining the laps!", 197, 127);
            }
            if (n == 4) {
                this.rd.drawString("Don't waste your time.  Waste them instead!", 197, 67);
                this.rd.drawString("Try a taste of sweet revenge here (if you can)!", 197, 87);
                this.rd.drawString("Press [ A ] to make the guidance arrow point to cars instead of", 197, 127);
                this.rd.drawString("the track. Time to show Basic Racer a new way to lose!", 197, 147);

            }
             if (n == 5) {
                this.rd.drawString("It's back! From NFM 1. Wasting is still a good option here, just be", 197, 67);
                this.rd.drawString("careful of Lead Oxide.", 197, 87);
                this.rd.drawString("He might not be the fastest, but he has higher strength than most cars", 197, 127);
                this.rd.drawString("you've faced so far!", 197, 147);
                

            }

            if (n == 6) {
                this.rd.drawString("Only ONE lap! Forget about wasting the others this time, keep your", 197, 67);
                this.rd.drawString("power up and go go go!", 197, 87);
                
            }
            if (n == 7) {
                this.rd.drawString("Welcome to nowhere. Population: You and six lunatics.", 197, 67);
                this.rd.drawString("Once again, only one lap, but the giant ramps in the middle will", 197, 107);
                this.rd.drawString("give you lots of POWER! Take advantage of that!", 197, 127);
            }
            if (n == 8) {
                this.rd.drawString("We're still nowhere, but we found another track to race on!", 197, 67);
                this.rd.drawString("Desert Humvee has the highest endurance of any vehicle so far.", 197, 87);
                this.rd.drawString("Try to keep up!", 197, 127);
            }
            if (n == 9) {
                this.rd.drawString("Forget the finish line, this is a Demolition Derby!", 197, 67);
                this.rd.drawString("P.S. This race is impossible to finish via racing.", 197, 87);
            }
            if (n == 10) {
                this.rd.drawString("Everything is GOLDEN! Remember, forward loops give your car a push", 197, 67);
                this.rd.drawString("forwards in the air and help in racing.", 197, 87);
                this.rd.drawString("You may need to do more forward loops here, as Kool Kat's stunting", 197, 127);
                this.rd.drawString("is this highest of all the cars so far.", 197, 147);
            }
            if (n == 11) {
                this.rd.drawString("This stage will seem familiar, but has some visible changes, more laps,", 197, 67);
                this.rd.drawString("and a brand new car named Drifter X. ", 197, 87);
                this.rd.drawString("He's one of the fastest cars you've seen so far, so keep up!", 197, 107);
            }
            if (n == 12) {
                this.rd.drawString("Not too many ramps in this stage, but the checkpoints are all close", 197, 67);
                this.rd.drawString("together.", 197, 87);
                this.rd.drawString("Oh, and it's dark, good luck!", 197, 127);
            }
            if (n == 13) {
                this.rd.drawString("Things are about to get scary, the first 'bully' car has made his", 197, 67);
                this.rd.drawString("appearance. Turns out you aren't above the law.", 197, 87);
                this.rd.drawString("You better run, run, run!", 197, 107);
                
            }

            if (n == 14) {
                this.rd.drawString("NOTE: AI's drive drunk (backwards) in this stage!", 197, 67);
                this.rd.drawString("This doesn't mean you're still above the law though you filthy", 197, 87);
                this.rd.drawString("hag.", 197, 107);
    
            }

            if (n == 15) {
                this.rd.drawString("You've somehow convinced the cops to be on your side...", 197, 67);
                this.rd.drawString("lucky for you, this stage is perfect to show you their power!", 197, 87);
                this.rd.drawString("But under water? Who made this script?!", 197, 127);
            }
            // if (n == 16) {
            //     this.rd.drawString("This is it!  This is the toughest (original) stage in the game!", 197, 67);
            //     this.rd.drawString("This track is actually a 4D object projected onto the 3D world.", 197, 107);
            //     this.rd.drawString("It's been broken down, separated and, in many ways, it is also a", 197, 127);
            //     this.rd.drawString("maze!  GOOD LUCK!", 197, 147);
            // }

            if (n == 16) {
                this.rd.drawString("High Rider has higher stunts than Kool Kat and Tornado Shark. This", 197, 67);
                this.rd.drawString("stage is meant to showcase the importance of stunting and speed.", 197, 87);
                this.rd.drawString("Good Luck! :)", 197, 107);
            }
            if (n == 17) {
                this.rd.drawString("Welcome to the garden of the king....", 197, 67);
                this.rd.drawString("With highest strength so far, EL KING is a nightmare to deal with.", 197, 87);
                this.rd.drawString("To race or to waste... that is the question.", 197, 107);

            }

            if (n == 18) {
                this.rd.drawString("WARNING: EL King travels backwards on this stage.", 197, 67);
                this.rd.drawString("If you are caught in an unfortunate position, you can kiss", 197, 87);
                this.rd.drawString("your run goodbye. Good luck!", 197, 107);
            }
            // if (n == 18) {
            //     this.rd.drawString("It's the jungle gym of NFM!", 197, 67);
            //     this.rd.drawString("(See if you can reach the floating checkpoint)", 197, 107);
            // }
            if (n == 19) {
                this.rd.drawString("It's the jungle gym of NFM! See if you can reach", 197, 67);
                this.rd.drawString("the floating checkpoint. Or, waste with EL King!", 197, 87);
            }
            // if (n == 20) {
            //     this.rd.drawString("> Note: Guidance Arrow is disabled in this stage! <", 197, 67);
            // }
            if (n == 20) {
                this.rd.drawString("Expect a lot of collisions here, as the roads intersect a LOT.", 197, 67);
                this.rd.drawString("Wasting might be your best friend here, considering the power", 197, 87);
                this.rd.drawString("of the KING.", 197, 107);
            }
            if (n == 21) {
                this.rd.drawString("It must be good to be the king right? Well, this is the last", 197, 67);
                this.rd.drawString("close-quarters stage for now, so enjoy it while it lasts!", 197, 87);
            }

            if (n == 22) {
                this.rd.drawString("SIKE! The old creator named it 'Rainbow Road' for no reason.", 197, 67);
                this.rd.drawString("Anyways, This stage is very long, and Mighty Eight is one ", 197, 107);
                this.rd.drawString("of the fastest cars so far, finally.. a worthy opponent!", 197, 127);
                this.rd.drawString("May your battle be legendary!", 197, 147);
            }

            if (n == 23) {
                this.rd.drawString("This stage has trees, mountains, weird physics, and a fast", 197, 67);
                this.rd.drawString("little bugger named Turbo Dragster. ", 197, 87);
                this.rd.drawString("He is the best racer so far by a long shot, but is extremely", 197, 107);
                this.rd.drawString("fragile. Pick your poison, and good luck!", 197, 127);
            }
            if (n == 24) {
                this.rd.drawString("One lap, but significantly more difficult than previous stages.", 197, 67);
                this.rd.drawString("Remember to use forward loops, and keep up!", 197, 87);
                
            }

            if (n == 25) {
                this.rd.drawString("Uh oh, why is there a bulldozer on the track?", 197, 67);
                this.rd.drawString("MASHEEN travels backwards on this stage, and is stronger than", 197, 87);
                this.rd.drawString("any vehicle so far. Best to avoid him for now.", 197, 107);
            }


            if (n == 26) {
                this.rd.drawString("Keep an eye out for MASHEEN in this stage, he could", 197, 67);
                this.rd.drawString("be anywhere. It also seems that EL King could be in kahoots with", 197, 87);
                this.rd.drawString("him too?", 197, 107);
            }
            if (n == 27) {
                this.rd.drawString("Anyone for a game of digger?", 197, 67);
                this.rd.drawString("Have fun with MASHEEN here!", 197, 87);
            }
            if (n == 28) {
                this.rd.drawString("This stage will be a bit familiar!", 197, 67);
                this.rd.drawString("You might want to be a bit fast for this one....", 197, 87);
                this.rd.drawString("Or try to waste them! What could go wrong? ;)", 197, 107);
            }
            if (n == 29) {
                this.rd.drawString("This stage is pretty long, but its got some more pretty scenary!", 197, 67);
                this.rd.drawString("Next level will be the midterm, so you better study with this stage!", 197, 87);

            }
            if (n == 30) {
                this.rd.drawString("Here it is! The midterm! Essentially a revamp of the original.", 197, 67);
                this.rd.drawString("Try to keep up with the S7 and avoid being wasted by the others.", 197, 87);
                this.rd.drawString("Try to keep up with the S7 and avoid being wasted by the others.", 197, 87);

            }
            if (n == 31) {
                this.rd.drawString("Welcome to the second half! It's been a hell of a ride so far!", 197, 67);
                this.rd.drawString("Things are going to get more challenging soon! ", 197, 87);
                this.rd.drawString("You might want to practice wasting :) ", 197, 107);
            }
            if (n == 32) {
                this.rd.drawString("In the original game, Radical One was the greatest racer of them all.", 197, 67);
                this.rd.drawString("He is about to show you why, pick a fast car and get this win.", 197, 107);
            }
            if (n == 33) {
                this.rd.drawString("This stage features at least one of each obstacle!", 197, 67);
                this.rd.drawString("Sting Rod also resides here! He is quite tanky, so dont expect", 197, 87);
                this.rd.drawString("an easy kill!", 197, 107);
            }
            if (n == 34) {
                this.rd.drawString("WARNING: You are in danger..", 197, 67);
                this.rd.drawString("Some of the old bully cars want their revenge.", 197, 87);
                this.rd.drawString("Finish the race quickly to get out of there.", 197, 107);
                this.rd.drawString("You can also fight back, nothing is stopping you.", 197, 127);
            }
            if (n == 35) {
                this.rd.drawString("Imagine a vehicle with the strength of EL King and Speed of ", 197, 67);
                this.rd.drawString("Radical One. You are about to meet Dr. Monstaa in this course.", 197, 87);
                this.rd.drawString("Always keep an eye out to make sure he isn't chasing you.", 197, 127);
                this.rd.drawString("One nasty hit from him could end your run!", 197, 147);
            }
            if (n == 36) {
                this.rd.drawString("Hey, so you know that arrow at the top of your screen?", 197, 67);
                this.rd.drawString("It's gone.", 197, 87);
                this.rd.drawString("On top of that, the bullies are back, and they aren't happy.", 197, 107);
                this.rd.drawString("Have fun!", 197, 127);
            }
            if (n == 37) {
                this.rd.drawString("Ready for some slippin' and slidin'?", 197, 67);
                this.rd.drawString("Hint 1: Use the track edges to get more traction.", 197, 87);
                this.rd.drawString("Hint 2: It might sound crazy, but pick a slower vehicle.", 197, 107);
            }
            if (n == 38) {
                this.rd.drawString("We made it to Mars ladies and gentlemen, now its time to race", 197, 67);
                this.rd.drawString("on it!", 197, 87);
                this.rd.drawString("Gravity is reduced by half its normal amount, meaning that", 197, 107);
                this.rd.drawString("stunts can be even crazier!", 197, 127);
            }
            if (n == 39) {
                this.rd.drawString("Gravity is reduced even more on the moon!", 197, 67);
                this.rd.drawString("Radical Racer has amazing stunting ability, so use it to", 197, 87);
                this.rd.drawString("get some sick stunts!", 197, 107);
            }
            
            if (n == 40) {
                this.rd.drawString("NOTE: In this stage, cars get fixed when they touch the walls.", 197, 67);
                this.rd.drawString("Air rebound may be fragile, but he hits harder than you think!", 197, 87);
                this.rd.drawString("Dr. Monstaa may have the ability to knock him out though!", 197, 107);
            }
            
            if (n == 41) {
                this.rd.drawString("Its everyone vs you! Lets see if you have what it takes to ", 197, 67);
                this.rd.drawString("the gauntlet! ", 197, 87);
            }
            if (n == 42) {
                this.rd.drawString("Zonich tank has infinite stamina, so it doesn't need ramps to", 197, 67);
                this.rd.drawString("go full speed!", 197, 87);
                this.rd.drawString("Like Moonlight, this stage is very crammed, so finish quick", 197, 107);
                this.rd.drawString("and don't get lost!", 197, 127);
            } if (n == 43) {
                this.rd.drawString("Its a Derby on the dance floor!", 197, 67);
                this.rd.drawString("There is a new tank on the field, but this one is more powerful!", 197, 87);
            }

            if (n == 44) {
                this.rd.drawString("This stage has a few twists and turns, making it kind of a maze!", 197, 67);
                this.rd.drawString("Enjoy this race while it lasts, cause once you are done...", 197, 87);
                this.rd.drawString("The big one is coming next.", 197, 107);
            }
            if (n == 45) {
                this.rd.drawString("Yes, you have to complete five laps. Yes, the course is massive.", 197, 67);
                this.rd.drawString("Yes, you have to deal with a vehicle more powerful than MASHEEN.", 197, 87);
                this.rd.drawString("You can NOT waste TURBO TANK properly right now, so its ", 197, 107);
                this.rd.drawString("best to avoid him for now. ", 197, 127);
            }
            if (n == 46) {
                this.rd.drawString("Again its ten laps, but good news is that the course is smaller!", 197, 67);
                this.rd.drawString("The bad news? Well, lets just say that this stage is a bit dangerous.", 197, 87);
                this.rd.drawString("Avoid TURBO TANK, follow the guidance arrow, and don't fall off!", 197, 107);
            }
            if (n == 47) {
                this.rd.drawString("This stage has a lot of oppurtunities for stunting!", 197, 67);
                this.rd.drawString("It seems that EL King has received a rocket, and is much faster than", 197, 87);
                this.rd.drawString("any other vehicle so far. He doesn't seem to be racing however, so", 197, 107);
                this.rd.drawString("avoid him if you can!", 197, 127);
            }
            if (n == 48) {
                this.rd.drawString("One of the best racing maps so far, but only for super fast vehicles!", 197, 67);
                this.rd.drawString("Given the speed of the king, it might be impossible to win by racing", 197, 87);
                this.rd.drawString("right now.", 197, 107);
                this.rd.drawString("Luckally, you just unlocked TURBO TANK! Now teach that truck a lesson!", 197, 127);
            }
            if (n == 49) {
                this.rd.drawString("This is a pretty long race, MASHEEN is also back too, but he borrowed", 197, 67);
                this.rd.drawString("EL King's rocket...", 197, 87);
                this.rd.drawString("Stay safe out there kiddo.", 197, 107);
            }
            if (n == 50) {
                this.rd.drawString("Essentially the stretch, but now you are facing MASHEEN! with a rocket....", 197, 67);
                this.rd.drawString("Try to beat him to the end, and do not stop!", 197, 87);
                
            }
            if (n == 51) {
                this.rd.drawString("Once again, a stage that looks very familiar! This one is also a bit deadly.", 197, 67);
                this.rd.drawString("DR Rocket Monstaa can build enough speed to deal much more damage than ", 197, 87);
                this.rd.drawString("MASHEEN at times, so be careful!", 197, 107);
            }
            if (n == 52) {
                this.rd.drawString("This may be the longest stage in the entire game.", 197, 67);
                this.rd.drawString("Follow the guidance arrow and don't lose sight of Dr. Rocket Monstaa!", 197, 87);
            }
             if (n == 53) {
                this.rd.drawString("You are about to enter a race with the best racer in the game!", 197, 67);
                this.rd.drawString("With exceptional speed, you'll need a bit of luck to win this one.", 197, 107);
            }
            if (n == 54) {
                this.rd.drawString("This stage is amazing for the rocket vehicles! One checkpoint on", 197, 67);
                this.rd.drawString("each side. Have some fun with this one!", 197, 107);
            }
            if (n == 55) {
                this.rd.drawString("This is likely the most fast-paced race in the entire game.", 197, 67);
                this.rd.drawString("Take The Awesome Radical One here, trust me.", 197, 87);
                this.rd.drawString("Have fun!", 197, 107);
            }
            if (n == 56) {
                this.rd.drawString("This is it!  This is the toughest (original) stage in the game!", 197, 67);
                this.rd.drawString("This track is actually a 4D object projected onto the 3D world.", 197, 107);
                this.rd.drawString("Over==Kill is the most powerful mortal car in the game. Avoid him", 197, 127);
                this.rd.drawString("at all costs. GOOD LUCK!", 197, 147);
            }
            if (n == 57) {
                this.rd.drawString("A small bottleneck through the middle, causing many collisions with", 197, 67);
                this.rd.drawString("other cars. The phantom can not collide with other vehicles.", 197, 87);
                this.rd.drawString("Good luck!", 197, 107);
            }
            if (n == 58) {
                this.rd.drawString("The sequel to Four Dimensional Vertigo!", 197, 67);
                this.rd.drawString("More confusing road breaks, and more powerful characters.", 197, 87);
                this.rd.drawString("Completing this stage will unlock the Phantom, who will be vital for", 197, 107);
                this.rd.drawString("future levels.", 197, 127);
            }
            if (n == 59) {
                this.rd.drawString("There is a nuke on this stage, rumor says he wastes any vehicle", 197, 67);
                this.rd.drawString("and itself in one hit.", 197, 87);
                this.rd.drawString("Might be best to run for your life here, as there are many fast vehicles", 197, 107);
                this.rd.drawString("here as well.", 197, 127);
            }
            if (n == 60) {
                this.rd.drawString("This is a massive puzzle, a bunch of floating checkpoints that", 197, 67);
                this.rd.drawString("require precision and skill to find. Try not to get lost.", 197, 107);
                this.rd.drawString("GOOD LUCK!", 197, 127);
            }
            if (n == 61) {
                this.rd.drawString("Everything is cooking! This is the power of racing on the Sun!", 197, 67);
                this.rd.drawString("You'll notice the boss car Lightning Rod, it is completely immortal,", 197, 87);
                this.rd.drawString("and it does massive damage to the giant vehicles.", 197, 107);
                this.rd.drawString("Try to avoid him on this course and do not get hit.", 197, 127);
            }
            if (n == 62) {
                this.rd.drawString("An actual maze, well, its more of a dungeon than a maze.", 197, 67);
                this.rd.drawString("There are three TURBO TANKS to hunt you down, two Over=kills to race,", 197, 87);
                this.rd.drawString("and a Lightning Rod to get in your way.", 197, 107);
                this.rd.drawString("Oh, and there are no fix hoops, good luck!", 197, 127);
            }
            if (n == 63) {
                this.rd.drawString("We even have Madness in the Sky!", 197, 67);
                this.rd.drawString("This course is essentially a giant obstacle course.", 197, 87);
                this.rd.drawString("If you fall, be careful not to get hit by KILL-O-MATIC", 197, 107);
                this.rd.drawString("He wastes in one hit.", 197, 127);
            }
            if (n == 64) {
                this.rd.drawString("WARNING: KILL-O-MATIC travels backwards in this stage.", 197, 67);
                this.rd.drawString("Clearing this race without the use of an immortal vehicle is a challenge. ", 197, 87);
                this.rd.drawString("But it is still possible! Now go get em tiger!", 197, 107);
                
            }
            if (n == 65) {
                this.rd.drawString("There seems to be a giant vehicle behind you, it seems you're in its", 197, 67);
                this.rd.drawString("territory. Try to get enough speed and go above the course and over", 197, 87);
                this.rd.drawString("Train of Terror!", 197, 107);
                
            }
            if (n == 66) {
                this.rd.drawString("Same thing as last time, but you can't go over the course to avoid the Train.", 197, 67);
                this.rd.drawString("The vehicle eventually gets faster overtime, so finish the course quick!", 197, 87);
                
            }
            if (n == 67) {
                this.rd.drawString("You've made it to the final four stages! Congrats!", 197, 67);
                this.rd.drawString("The layout is very familiar, but has a small twist at the end. ", 197, 87);
                this.rd.drawString("Remember: BR, TD, DH, LG, NW, S7, SR, TT, TARO, TD", 197, 107);
                this.rd.drawString("The Destroyer is going to live up to its name in this course.", 197, 127);
                this.rd.drawString("Proceed with caution.", 197, 147);
            }
            if (n == 68) {
                this.rd.drawString("This is literally a Tunnel of Doom. Two laps, and it is very easy to", 197, 67);
                this.rd.drawString("get wasted here. ", 197, 87);
                this.rd.drawString("Keep up with the Phantoms, and for the love of everything holy,", 197, 107);
                this.rd.drawString("AVOID THE DESTROYER!", 197, 127);
  
            }
            if (n == 69) {
                this.rd.drawString("It's a DEATH RACE, just the Criss Cross Crash but harder!", 197, 67);
                this.rd.drawString("Nuclear Warhead kills in one hit, but it is mainly focused on racing here.", 197, 87);
                this.rd.drawString("Keep up with it and The Destroyers, and don't get wasted by the ", 197, 107);
                this.rd.drawString("KILL-O-MATICs and Train of Terrors!", 197, 127);
            }
            if (n == 70) {
                this.rd.drawString("This is it, the final and hardest stage in the whole game. ", 197, 67);
                this.rd.drawString("All of the megapowers of the game are plotting their revenge now.", 197, 107);
                this.rd.drawString("May God have mercy on your soul.", 197, 127);
            }

        }
        this.rd.drawImage(this.loadingmusic, 224, 180 + n5, null);
        this.rd.setFont(new Font("SansSerif", 1, 11));
        this.ftm = this.rd.getFontMetrics();
        if (!bl) {
            this.drawcs(315 + n5, "" + this.sndsize[n - 1] + " KB", 0, 0, 0, 3);
            this.drawcs(350 + n5, " Please Wait...", 0, 0, 0, 3);
        } else {
            this.drawcs(340 + n5, "Loading complete!  Press Start to begin...", 0, 0, 0, 3);
            this.rd.drawImage(this.star[this.pstar], 294, 360 + n5, null);
            if (this.pstar != 2) {
                this.pstar = this.pstar == 0 ? 1 : 0;
            }
        }
    }

    private Image loadopsnap(Image image, int n, int n2) {
        int n3 = image.getHeight(this.ob);
        int n4 = image.getWidth(this.ob);
        int[] nArray = new int[n4 * n3];
        PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, n4, n3, nArray, 0, n4);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        int n5 = 0;
        if (n2 == 1) {
            n5 = nArray[61993];
        }
        for (int i = 0; i < n4 * n3; ++i) {
            if (nArray[i] == nArray[n2]) continue;
            Color color = new Color(nArray[i]);
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            if (n2 == 1 && nArray[i] == n5) {
                n6 = (int)(237.0f - 237.0f * ((float)this.m.snap[0] / (150.0f * this.hipno[n - 1])));
                if (n6 > 255) {
                    n6 = 255;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                if ((n7 = (int)(237.0f - 237.0f * ((float)this.m.snap[1] / (150.0f * this.hipno[n - 1])))) > 255) {
                    n7 = 255;
                }
                if (n7 < 0) {
                    n7 = 0;
                }
                if ((n8 = (int)(237.0f - 237.0f * ((float)this.m.snap[2] / (150.0f * this.hipno[n - 1])))) > 255) {
                    n8 = 255;
                }
                if (n8 < 0) {
                    n8 = 0;
                }
                if (n == 1) {
                    n6 = 250;
                    n7 = 250;
                    n8 = 250;
                }
            } else {
                n6 = (int)((float)color.getRed() - (float)color.getRed() * ((float)this.m.snap[0] / (50.0f * this.hipno[n - 1])));
                if (n6 > 255) {
                    n6 = 255;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                if ((n7 = (int)((float)color.getGreen() - (float)color.getGreen() * ((float)this.m.snap[1] / (50.0f * this.hipno[n - 1])))) > 255) {
                    n7 = 255;
                }
                if (n7 < 0) {
                    n7 = 0;
                }
                if ((n8 = (int)((float)color.getBlue() - (float)color.getBlue() * ((float)this.m.snap[2] / (50.0f * this.hipno[n - 1])))) > 255) {
                    n8 = 255;
                }
                if (n8 < 0) {
                    n8 = 0;
                }
                if (n == 1) {
                    n6 = color.getRed();
                    n7 = color.getGreen();
                    n8 = color.getBlue();
                }
            }
            Color color2 = new Color(n6, n7, n8);
            nArray[i] = color2.getRGB();
        }
        Image image2 = this.createImage(new MemoryImageSource(n4, n3, nArray, 0, n4));
        return image2;
    }

    private AudioClip getSound(String string) {
        AudioClip audioClip = this.app.getAudioClip(this.app.getCodeBase(), string);
        if (string.startsWith("sounds/default")) {
            audioClip.play();
            Thread.yield();
            audioClip.stop();
        }
        return audioClip;
    }

    public void carsbginflex() {
        this.flatr = 0;
        this.flyr = (int)(this.m.random() * 160.0f - 80.0f);
        this.flyrdest = (int)((float)this.flyr + this.m.random() * 160.0f - 80.0f);
        this.flang = 1;
        this.flangados = (int)(this.m.random() * 6.0f + 2.0f);
        this.blackn = 0.0f;
        this.blacknados = this.m.random() * 0.4f;
        PixelGrabber pixelGrabber = new PixelGrabber(this.carsbg, 0, 0, 670, 400, this.flexpix, 0, 670);
        try {
            pixelGrabber.grabPixels();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }
    public int getCarOrderIndex(int carId) {
        for (int i = 0; i < this.carorder.length; i++) {
            if (this.carorder[i] == carId) {
                return i;
            }
        }
        return -1;
    }
    private int randomUnlockedCar() {
        return this.carorder[(int)(Math.random() * this.carsUnlocked)];
    }

}
