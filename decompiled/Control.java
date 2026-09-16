/*
 * Decompiled with CFR 0.152.
 */
public class Control {
    boolean left = false;
    boolean right = false;
    boolean up = false;
    boolean down = false;
    boolean handb = false;
    boolean fire = false;
    boolean space;
    int lookback = 0;
    boolean enter = false;
    boolean arrace = false;
    boolean mutem = false;
    boolean mutes = false;
    Medium m;
    int pan = 0;
    int attack = 0;
    int acr = 0;
    boolean afta = false;
    int[] fpnt = new int[20];
    int trfix = 0;
    boolean forget = false;
    boolean bulistc = false;
    int runbul = 0;
    int acuracy = 0;
    int upwait = 0;
    boolean agressed = false;
    float skiplev = 1.0f;
    int clrnce = 5;
    int rampp = 0;
    int turntyp = 0;
    float aim = 0.0f;
    int saftey = 30;
    boolean perfection = false;
    float mustland = 0.5f;
    boolean usebounce = false;
    float trickprf = 0.5f;
    int stuntf = 0;
    boolean zyinv = false;
    boolean lastl = false;
    boolean wlastl = false;
    int hold = 0;
    int wall = -1;
    int lwall = -1;
    int stcnt = 0;
    int statusque = 0;
    int turncnt = 0;
    int randtcnt = 0;
    int upcnt = 0;
    int trickfase = 0;
    int swat = 0;
    boolean udcomp = false;
    boolean lrcomp = false;
    boolean udbare = false;
    boolean lrbare = false;
    boolean onceu = false;
    boolean onced = false;
    boolean oncel = false;
    boolean oncer = false;
    int lrdirect = 0;
    int uddirect = 0;
    int lrstart = 0;
    int udstart = 0;
    int oxy = 0;
    int ozy = 0;
    int flycnt = 0;
    boolean lrswt = false;
    boolean udswt = false;
    boolean gowait = false;
    int actwait = 0;
    int cntrn = 0;
    int revstart = 0;
    int oupnt = 0;
    int wtz = 0;
    int wtx = 0;
    int frx = 0;
    int frz = 0;
    int frad = 0;
    int apunch = 0;
    boolean exitattack = false;
    int avoidnlev = 0;
    int wait1 = -1;
    int wait2 = -1;
    int rspeed;
    float speed;
    int rlift;
    double lift;
    boolean pexp;
    int ltyp;
    int[] lx;
    int[] ly;
    int[] lz;
    int[] lxz;
    int[] lzy;
    int[] lxy;
    int[] lstage;
    int[] lspeed;
    int[] lhit;
    int[] nf;
    int nl;
    Lasers gun;
    boolean skip;
    int bulkc;
    int[] sms;
    int[] sx;
    int[] sy;
    int[] sz;
    int[] sxz;
    int[] szy;
    int ns;
    boolean smoke;
    int[] dms;
    int[] dx;
    int[] dy;
    int[] dz;
    int[] dxz;
    int[] dzy;
    int nd;
    int gxz;
    int gzy;
    boolean responce;
    int trgxz;
    int trgzy;
    int out;
    int turnat;
    int tcnt;
    boolean engage;
    int enx;
    int eny;
    int enz;
    int ens;
    boolean targeting;
    int mode;
    int m3o;
    int m3cnt;
    int m1cnt;
    int relax;
    int runn;
    int liftup;
    boolean dracs;

    public void preform(Madness madness, ContO contO, CheckPoints checkPoints, Trackers trackers) {
        this.left = false;
        this.right = false;
        this.up = false;
        this.down = false;
        this.handb = false;
        this.fire = false;
        if (!madness.dest) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            if (this.stcnt > this.statusque) {
                this.acuracy = (7 - checkPoints.pos[madness.im]) * checkPoints.pos[0] * (6 - checkPoints.stage * 2);
                if (this.acuracy < 0) {
                    this.acuracy = 0;
                }
                this.clrnce = 5;
                if (checkPoints.stage == 6 || checkPoints.stage == 11) {
                    this.clrnce = 2;
                }
                if (checkPoints.stage == 12 && (madness.pcleared == 27 || madness.pcleared == 17)) {
                    this.clrnce = 3;
                }
                if (checkPoints.stage == 16 && madness.pcleared == 33) {
                    this.clrnce = 3;
                }
                if (checkPoints.stage == 20 && madness.pcleared == 33) {
                    this.clrnce = 3;
                }
                float f = 0.0f;
                if (checkPoints.stage == 1) {
                    f = 1.5f;
                }
                if (checkPoints.stage == 32) {
                    f = 1.5f;
                }
                if (checkPoints.stage == 2) {
                    f = 1.0f;
                }
                if (checkPoints.stage == 3 && madness.im != 6) {
                    f = 0.2f;
                }
                if (checkPoints.stage == 4) {
                    f = 0.5f;
                }
                this.upwait = (int)((float)((checkPoints.pos[0] - checkPoints.pos[madness.im]) * (checkPoints.pos[0] - checkPoints.pos[madness.im]) * (checkPoints.pos[0] - checkPoints.pos[madness.im])) * f);
                if (this.upwait > 80) {
                    this.upwait = 80;
                }
                if (checkPoints.stage == 1 && this.upwait < 20) {
                    this.upwait = 20;
                }
                if (checkPoints.stage == 32 && this.upwait < 20) {
                    this.upwait = 20;
                }
                f = 0.0f;
                if (checkPoints.stage == 1 || checkPoints.stage == 2 || checkPoints.stage == 32) {
                    f = 1.0f;
                }
                if (checkPoints.stage == 3) {
                    f = 0.5f;
                }
                if (checkPoints.stage == 4) {
                    f = 0.5f;
                }
                if (checkPoints.stage == 5) {
                    f = 0.2f;
                }
                if (checkPoints.pos[madness.im] - checkPoints.pos[0] >= -1) {
                    this.skiplev = (float)((double)this.skiplev - 0.1);
                    if (this.skiplev < 0.0f) {
                        this.skiplev = 0.0f;
                    }
                } else {
                    this.skiplev = (float)((double)this.skiplev + 0.2);
                    if (this.skiplev > f) {
                        this.skiplev = f;
                    }
                }
                if (checkPoints.stage == 8) {
                    float f2 = this.skiplev = madness.pcleared >= 10 && madness.pcleared <= 24 ? 1.0f : 0.0f;
                }
                if (checkPoints.stage == 11) {
                    this.skiplev = 0.0f;
                    if (madness.pcleared == 5) {
                        this.skiplev = 1.0f;
                    }
                    if (madness.pcleared == 28 || madness.pcleared == 35) {
                        this.skiplev = 0.5f;
                    }
                }
                if (checkPoints.stage == 13) {
                    this.skiplev = 0.5f;
                }
                if (checkPoints.stage == 14 || checkPoints.stage == 12) {
                    this.skiplev = 1.0f;
                }
                if (checkPoints.stage == 10 || checkPoints.stage == 15 || checkPoints.stage == 16 || checkPoints.stage == 20 || checkPoints.stage == 36 || checkPoints.stage == 58) {
                    this.skiplev = 0.0f;
                }
                this.rampp = (int)(this.m.random() * 4.0f - 2.0f);
                if (madness.power == 98.0f) {
                    this.rampp = -1;
                }
                if (madness.power < 75.0f && this.rampp == -1) {
                    this.rampp = 0;
                }
                if (madness.power < 60.0f) {
                    this.rampp = 1;
                }
                if (checkPoints.stage == 8 && madness.pcleared >= 45) {
                    this.rampp = 2;
                }
                if (checkPoints.stage == 12 && madness.pcleared == 17) {
                    this.rampp = 2;
                }
                if (checkPoints.stage == 15 || checkPoints.stage == 16 || checkPoints.stage == 20 || checkPoints.stage == 34 || checkPoints.stage == 36 || checkPoints.stage == 50 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
                    this.rampp = 0;
                }
                if (this.cntrn == 0) {
                    this.agressed = false;
                    this.turntyp = (int)(this.m.random() * 4.0f);
                    if (checkPoints.stage == 3 && madness.im == 6) {
                        this.turntyp = 1;
                        if (this.attack == 0) {
                            this.agressed = true;
                        }
                    }
                    if (checkPoints.pos[0] - checkPoints.pos[madness.im] < 0) {
                        this.turntyp = (int)(this.m.random() * 2.0f);
                    }
                    if (checkPoints.stage == 8) {
                        this.turntyp = 2;
                    }
                    if (checkPoints.stage == 10) {
                        this.turntyp = 0;
                    }
                    if (checkPoints.stage == 13) {
                        this.turntyp = 1;
                    }
                    if (checkPoints.stage == 14 || checkPoints.stage == 31 || checkPoints.stage == 37) {
                        this.turntyp = 0;
                    }
                    if (this.attack != 0) {
                        this.turntyp = 2;
                        if (checkPoints.stage == 9 || checkPoints.stage == 11 || checkPoints.stage == 13 || checkPoints.stage == 17) {
                            this.turntyp = (int)(this.m.random() * 3.0f);
                        }
                        if (checkPoints.stage == 16 && checkPoints.clear[madness.im] - checkPoints.clear[0] >= 5) {
                            this.turntyp = 0;
                        }
                    }
                    if (checkPoints.stage == 6 || checkPoints.stage == 7 || checkPoints.stage == 9 || checkPoints.stage == 10 || checkPoints.stage == 11 || checkPoints.stage == 12 || checkPoints.stage == 14 || checkPoints.stage == 16 || checkPoints.stage == 17 || checkPoints.stage == 20 || checkPoints.stage == 21 || checkPoints.stage == 25 || checkPoints.stage == 26 || checkPoints.stage == 27 || checkPoints.stage == 31 || checkPoints.stage == 33 || checkPoints.stage == 34 || checkPoints.stage == 36 || checkPoints.stage == 37 || checkPoints.stage == 38 || checkPoints.stage == 39 || checkPoints.stage == 40 || checkPoints.stage == 43 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 46 || checkPoints.stage == 47 || checkPoints.stage == 48 || checkPoints.stage == 49 || checkPoints.stage == 51 || checkPoints.stage == 52 || checkPoints.stage == 54 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
                        this.agressed = true;
                    }
                    if (checkPoints.stage == 19 || checkPoints.stage == 28 || checkPoints.stage == 32 || checkPoints.stage == 50 || checkPoints.stage == 55) {
                        this.agressed = false;
                    }
                    this.cntrn = 5;
                } else {
                    --this.cntrn;
                }
                this.saftey = (int)((double)((98.0f - madness.power) / 2.0f) * ((double)(this.m.random() / 2.0f) + 0.5));
                if (this.saftey > 20) {
                    this.saftey = 20;
                }
                f = 0.0f;
                if (checkPoints.stage == 1 || checkPoints.stage == 32) {
                    f = 0.9f;
                }
                if (checkPoints.stage == 2) {
                    f = 0.7f;
                }
                if (checkPoints.stage == 4) {
                    f = 0.4f;
                }
                this.mustland = f + (float)((double)(this.m.random() / 2.0f) - 0.25);
                f = 1.0f;
                if (checkPoints.stage == 1 || checkPoints.stage == 32) {
                    f = 5.0f;
                }
                if (checkPoints.stage == 2) {
                    f = 2.0f;
                }
                if (checkPoints.stage == 4) {
                    f = 1.5f;
                }
                if (madness.power > 50.0f) {
                    if (checkPoints.pos[0] - checkPoints.pos[madness.im] > 0) {
                        this.saftey = (int)((float)this.saftey * f);
                    } else {
                        this.mustland = 0.0f;
                    }
                } else {
                    this.mustland -= 0.5f;
                }
                if (checkPoints.stage == 8 || checkPoints.stage == 10 || checkPoints.stage == 12 || checkPoints.stage == 14 || checkPoints.stage == 25 || checkPoints.stage == 34 || checkPoints.stage == 36 || checkPoints.stage == 38 || checkPoints.stage == 39 || checkPoints.stage == 43 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 46 || checkPoints.stage == 47 || checkPoints.stage == 48 || checkPoints.stage == 50 || checkPoints.stage == 51 || checkPoints.stage == 52 || checkPoints.stage == 53 || checkPoints.stage == 54 || checkPoints.stage == 55 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
                    this.mustland = 0.0f;
                }
                this.stuntf = 0;
                if (checkPoints.stage == 8 && madness.pcleared == 57) {
                    this.stuntf = 1;
                }
                if (checkPoints.stage == 9 && madness.pcleared == 3) {
                    this.stuntf = 2;
                }
                if (checkPoints.stage == 10) {
                    if (checkPoints.pos[0] < checkPoints.pos[madness.im] || Math.abs(checkPoints.clear[0] - madness.clear) >= 2 || madness.clear < 2) {
                        this.stuntf = 4;
                        this.saftey = 10;
                    } else {
                        this.stuntf = 3;
                    }
                }
                if (checkPoints.stage == 11 && madness.pcleared == 21) {
                    this.stuntf = 1;
                }
                if (checkPoints.stage == 14) {
                    this.saftey = 10;
                    if (madness.pcleared >= 4 && madness.pcleared < 70) {
                        this.stuntf = 4;
                    } else if (madness.cn == 8 || madness.cn == 12) {
                        this.stuntf = 2;
                    }
                    if (madness.cn == 14 || madness.cn == 32) {
                        this.stuntf = 6;
                    }
                }
                if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                    this.mustland = 0.0f;
                    this.saftey = 10;
                    if (!(madness.pcleared != 15 && madness.pcleared != 51 || !((double)this.m.random() > 0.4) && this.trfix == 0)) {
                        this.stuntf = 7;
                    }
                    if (madness.pcleared == 42) {
                        this.stuntf = 1;
                    }
                    if (madness.pcleared == 77) {
                        this.stuntf = 7;
                    }
                    this.avoidnlev = (int)(2700.0f * this.m.random());
                }
                if (madness.cn == 17 || madness.cn == 21) {
                    this.mustland = 0.0f;
                    this.saftey = 10;
                    if (!(madness.pcleared != 15 && madness.pcleared != 51 || !((double)this.m.random() > 0.4) && this.trfix == 0)) {
                        this.stuntf = 7;
                    }
                    if (madness.pcleared == 42) {
                        this.stuntf = 1;
                    }
                    if (madness.pcleared == 77) {
                        this.stuntf = 7;
                    }
                    this.avoidnlev = (int)(10000.0f * this.m.random());
                }
                this.trickprf = (madness.power - 38.0f) / 50.0f - this.m.random() / 2.0f;
                if (madness.power < 60.0f) {
                    this.trickprf = -1.0f;
                }
                if (checkPoints.stage == 3 && madness.im == 6 && (double)this.trickprf > 0.7) {
                    this.trickprf = 0.7f;
                }
                if (checkPoints.stage == 6 && (double)this.trickprf > 0.3) {
                    this.trickprf = 0.3f;
                }
                if (checkPoints.stage == 8 && (double)this.trickprf > 0.2) {
                    this.trickprf = 0.2f;
                }
                if (checkPoints.stage == 9) {
                    if ((double)this.trickprf > 0.5) {
                        this.trickprf = 0.5f;
                    }
                    if ((madness.im == 6 || madness.im == 5) && (double)this.trickprf > 0.3) {
                        this.trickprf = 0.3f;
                    }
                }
                if (checkPoints.stage == 11 && this.trickprf != -1.0f) {
                    this.trickprf *= 0.75f;
                }
                if (checkPoints.stage == 12 && (madness.pcleared == 55 || madness.pcleared == 7)) {
                    this.trickprf = -1.0f;
                    this.stuntf = 5;
                }
                if (checkPoints.stage == 13 && (double)this.trickprf > 0.4) {
                    this.trickprf = 0.4f;
                }
                if (checkPoints.stage == 14 && (double)this.trickprf > 0.5) {
                    this.trickprf = 0.5f;
                }
                if (checkPoints.stage == 17) {
                    this.trickprf = -1.0f;
                }
                boolean bl = this.usebounce = this.m.random() > madness.power / 100.0f;
                if (checkPoints.stage == 4 || checkPoints.stage == 6 || checkPoints.stage == 21 || checkPoints.stage == 26 || checkPoints.stage == 31 || checkPoints.stage == 32) {
                    this.usebounce = true;
                }
                if (checkPoints.stage == 10 || checkPoints.stage == 14 || checkPoints.stage == 19 || checkPoints.stage == 20 || checkPoints.stage == 28 || checkPoints.stage == 33 || checkPoints.stage == 36 || checkPoints.stage == 38 || checkPoints.stage == 39 || checkPoints.stage == 43 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 46 || checkPoints.stage == 47 || checkPoints.stage == 48 || checkPoints.stage == 49 || checkPoints.stage == 50 || checkPoints.stage == 51 || checkPoints.stage == 53 || checkPoints.stage == 54 || checkPoints.stage == 55 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
                    this.usebounce = false;
                }
                boolean bl2 = this.perfection = !(this.m.random() > (float)madness.hitmag / (float)madness.maxmag[madness.cn]);
                if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > 60.0f) {
                    this.perfection = true;
                }
                if (checkPoints.stage == 6 || checkPoints.stage == 8 || checkPoints.stage == 9 || checkPoints.stage == 10 || checkPoints.stage == 11 || checkPoints.stage == 12 || checkPoints.stage == 14 || checkPoints.stage == 16 || checkPoints.stage == 17 || checkPoints.stage == 19 || checkPoints.stage == 20 || checkPoints.stage == 21 || checkPoints.stage == 26 || checkPoints.stage == 28 || checkPoints.stage == 31 || checkPoints.stage == 33 || checkPoints.stage == 34 || checkPoints.stage == 36 || checkPoints.stage == 37 || checkPoints.stage == 38 || checkPoints.stage == 39 || checkPoints.stage == 40 || checkPoints.stage == 41 || checkPoints.stage == 42 || checkPoints.stage == 43 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 46 || checkPoints.stage == 47 || checkPoints.stage == 48 || checkPoints.stage == 49 || checkPoints.stage == 50 || checkPoints.stage == 51 || checkPoints.stage == 52 || checkPoints.stage == 53 || checkPoints.stage == 54 || checkPoints.stage == 55 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
                    this.perfection = true;
                }
                if (checkPoints.stage == 32) {
                    this.perfection = false;
                }
                boolean bl3 = this.perfection = checkPoints.stage != 27 || madness.cn == 9 || madness.cn == 38 || madness.cn == 39;
                if (this.attack == 0) {
                    n6 = 1;
                    if (checkPoints.stage == 1 || checkPoints.stage == 3 || checkPoints.stage == 4 || checkPoints.stage == 9 || checkPoints.stage == 13 || checkPoints.stage == 16 || checkPoints.stage == 20 || checkPoints.stage == 26 || checkPoints.stage == 34) {
                        n6 = this.afta ? 1 : 0;
                    }
                    if ((checkPoints.stage == 6 || checkPoints.stage == 8 || checkPoints.stage == 10 || checkPoints.stage == 14 || checkPoints.stage == 31 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 47 || checkPoints.stage == 54) && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                        n6 = 0;
                    }
                    n5 = 0;
                    if (checkPoints.stage == 3 && madness.cn == 9) {
                        n5 = 1;
                    }
                    if (checkPoints.stage == 3 && madness.cn == 26) {
                        n5 = 1;
                    }
                    if (checkPoints.stage == 8 && madness.cn == 11) {
                        n5 = 1;
                    }
                    if (checkPoints.stage == 8 && madness.cn == 26) {
                        n5 = 1;
                    }
                    if (checkPoints.stage == 9 && checkPoints.clear[0] >= 20) {
                        n5 = 1;
                    }
                    if (checkPoints.stage == 11 || checkPoints.stage == 12 || checkPoints.stage == 13 || checkPoints.stage == 15 || checkPoints.stage == 16 || checkPoints.stage == 20 || checkPoints.stage == 36) {
                        n5 = 1;
                    }
                    n4 = 60;
                    if (checkPoints.stage == 3 || checkPoints.stage == 8 || checkPoints.stage == 10 || checkPoints.stage == 11 || checkPoints.stage == 17) {
                        n4 = 30;
                    }
                    if ((checkPoints.stage == 2 || checkPoints.stage == 13) && madness.cn == 13) {
                        n4 = 50;
                    }
                    if ((checkPoints.stage == 2 || checkPoints.stage == 13) && madness.cn == 26) {
                        n4 = 50;
                    }
                    if ((checkPoints.stage == 2 || checkPoints.stage == 13) && madness.cn == 35) {
                        n4 = 50;
                    }
                    if (checkPoints.stage == 4) {
                        n4 = 20;
                    }
                    if (checkPoints.stage == 5 && madness.im != 6) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 7) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 8 && madness.cn == 11) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 8 && madness.cn == 26) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 8 && madness.cn == 35) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 9 && n5 != 0) {
                        n4 = 30;
                    }
                    if (checkPoints.stage == 11 && this.bulistc) {
                        n4 = 30;
                    }
                    if (checkPoints.stage == 12) {
                        n4 = 50;
                    }
                    if (checkPoints.stage == 15 && this.bulistc) {
                        n4 = 40;
                    }
                    if (checkPoints.stage == 19 || checkPoints.stage == 21 || checkPoints.stage == 46) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 28 || checkPoints.stage == 55) {
                        n4 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 31 && madness.cn == 26) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 31 && madness.cn == 35) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 39 && madness.cn == 26) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 39 && madness.cn != 26) {
                        n4 = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 35 || checkPoints.stage == 40 || checkPoints.stage == 41 || checkPoints.stage == 51 || checkPoints.stage == 57) {
                        int n7 = n4 = madness.cn == 9 || madness.cn == 11 || madness.cn == 13 || madness.cn == 15 || madness.cn == 26 || madness.cn == 27 || madness.cn == 34 || madness.cn == 35 || madness.cn == 36 || madness.cn == 37 || madness.cn == 38 || madness.cn == 39 ? 0 : Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 56) {
                        n4 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 58 && madness.cn == 35) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 58 && madness.cn == 36) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 58 && madness.cn == 37) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 58 && madness.cn == 38) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 59 && madness.cn == 36) {
                        n4 = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 59 && madness.cn == 37) {
                        n4 = 0;
                    }
                    if (checkPoints.stage == 59 && madness.cn == 35) {
                        n4 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 70 && madness.cn == 38) {
                        n4 = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 70 && madness.cn != 38) {
                        n4 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                        if (madness.cn == 11 && checkPoints.clear[0] == 27) {
                            n4 = 0;
                        }
                        if (madness.cn == 26 && checkPoints.clear[0] == 27) {
                            n4 = 0;
                        }
                        if (madness.cn == 9 || madness.cn == 15) {
                            n4 = 50;
                        }
                        if (madness.cn == 11 || madness.cn == 26) {
                            n4 = 40;
                        }
                        if (checkPoints.pos[0] > checkPoints.pos[madness.im]) {
                            n4 = 80;
                        }
                    }
                    if (checkPoints.stage != 19 && checkPoints.stage != 21 && checkPoints.stage != 51 && (madness.cn == 17 || madness.cn == 19 || madness.cn == 21 || madness.cn == 33)) {
                        n4 = Integer.MAX_VALUE;
                    }
                    if (madness.cn == 37 || madness.cn == 39) {
                        n4 = 0;
                    }
                    n3 = 0;
                    do {
                        if (n3 != madness.im && checkPoints.clear[n3] != -1) {
                            n2 = contO.xz;
                            if (this.zyinv) {
                                n2 += 180;
                            }
                            while (n2 < 0) {
                                n2 += 360;
                            }
                            while (n2 > 180) {
                                n2 -= 360;
                            }
                            int n8 = 0;
                            if (checkPoints.opx[n3] - contO.x >= 0) {
                                n8 = 180;
                            }
                            for (n = (int)((double)(90 + n8) + Math.atan((double)(checkPoints.opz[n3] - contO.z) / (double)(checkPoints.opx[n3] - contO.x)) / (Math.PI / 180)); n < 0; n += 360) {
                            }
                            while (n > 180) {
                                n -= 360;
                            }
                            int n9 = Math.abs(n2 - n);
                            if (n9 > 180) {
                                n9 = Math.abs(n9 - 360);
                            }
                            int n10 = 2000 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                            if (checkPoints.stage == 3 && madness.cn == 9 && n10 < 12000) {
                                n10 = 12000;
                            }
                            if (checkPoints.stage == 3 && madness.cn == 26 && n10 < 12000) {
                                n10 = 12000;
                            }
                            if (checkPoints.stage == 4 && n10 < 4000) {
                                n10 = 4000;
                            }
                            if (checkPoints.stage == 8 && madness.cn == 11) {
                                if (n10 < 12000) {
                                    n10 = 12000;
                                }
                                n9 = 10;
                            }
                            if (checkPoints.stage == 8 && madness.cn == 26) {
                                if (n10 < 12000) {
                                    n10 = 12000;
                                }
                                n9 = 10;
                            }
                            if (checkPoints.stage == 9 && (madness.pcleared == 13 || madness.pcleared == 33 || n5 != 0) && n10 < 12000) {
                                n10 = 12000;
                            }
                            if (checkPoints.stage == 11) {
                                if (this.bulistc) {
                                    n10 = 8000;
                                    n9 = 10;
                                    this.afta = true;
                                } else if (n10 < 6000) {
                                    n10 = 6000;
                                }
                            }
                            if (checkPoints.stage == 12 && this.bulistc) {
                                n10 = 6000;
                                n9 = 10;
                            }
                            if (checkPoints.stage == 13) {
                                n10 = 21000;
                            }
                            if (checkPoints.stage == 15 || checkPoints.stage == 36) {
                                n10 *= Math.abs(checkPoints.clear[n3] - madness.clear) + 1;
                                if (this.bulistc) {
                                    n10 = 4000 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                                    n9 = 10;
                                }
                            }
                            if (checkPoints.stage == 10) {
                                n10 = 16000;
                            }
                            if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                                if (madness.cn == 13 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        n10 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        n10 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkPoints.clear[0] >= 14) {
                                        n10 = 60000;
                                    }
                                    n9 = 10;
                                }
                                if (madness.cn == 26 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        n10 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        n10 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkPoints.clear[0] >= 14) {
                                        n10 = 60000;
                                    }
                                    n9 = 10;
                                }
                                if (madness.cn == 35 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        n10 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        n10 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkPoints.clear[0] >= 14) {
                                        n10 = 60000;
                                    }
                                    n9 = 10;
                                }
                                if (madness.cn == 9 || madness.cn == 15 || madness.cn == 37 || madness.cn == 39) {
                                    n10 *= Math.abs(checkPoints.clear[n3] - madness.clear) + 1;
                                }
                                if (madness.cn == 11) {
                                    n10 = 4000 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                                }
                                if (madness.cn == 26) {
                                    n10 = 4000 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                                }
                            }
                            int n11 = 85 + 15 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                            if (checkPoints.stage == 13) {
                                n11 = 45;
                            }
                            if (checkPoints.stage == 16 && (madness.cn == 9 || madness.cn == 11 || madness.cn == 14 || madness.cn == 15)) {
                                n11 = 50 + 70 * Math.abs(checkPoints.clear[n3] - madness.clear);
                            }
                            if (checkPoints.stage == 20 && (madness.cn == 9 || madness.cn == 11 || madness.cn == 14 || madness.cn == 15)) {
                                n11 = 50 + 70 * Math.abs(checkPoints.clear[n3] - madness.clear);
                            }
                            if (n9 < n11 && this.py(contO.x / 100, checkPoints.opx[n3] / 100, contO.z / 100, checkPoints.opz[n3] / 100) < n10 && this.afta && madness.power > (float)n4) {
                                float f3 = 35 - Math.abs(checkPoints.clear[n3] - madness.clear) * 10;
                                if (f3 < 1.0f) {
                                    f3 = 1.0f;
                                }
                                float f4 = (float)((checkPoints.pos[madness.im] + 1) * (5 - checkPoints.pos[n3])) / f3;
                                if (checkPoints.stage != 17 && (double)f4 > 0.7) {
                                    f4 = 0.7f;
                                }
                                if (n3 != 0 && checkPoints.pos[0] < checkPoints.pos[madness.im]) {
                                    f4 = 0.0f;
                                }
                                if (n3 != 0 && n5 != 0) {
                                    f4 = 0.0f;
                                }
                                if (checkPoints.stage == 3) {
                                    float f5 = f4 = madness.cn == 9 || madness.cn == 26 || madness.cn == 35 || madness.cn == 37 || madness.cn == 39 || madness.cn == 13 && this.bulistc ? (f4 = f4 * 2.0f) : (f4 = f4 * 0.5f);
                                }
                                if (checkPoints.stage == 6 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                    f4 = 0.0f;
                                }
                                if (checkPoints.stage == 7 && madness.im == 6 && n3 == 0) {
                                    f4 = (float)((double)f4 * 1.5);
                                }
                                if (checkPoints.stage == 19 && madness.im == 6 && n3 == 0) {
                                    f4 = (float)((double)f4 * 1.5);
                                }
                                if (checkPoints.stage == 8) {
                                    float f6 = f4 = madness.cn == 11 || madness.cn == 35 || madness.cn == 37 || madness.cn == 39 || madness.cn == 13 && this.bulistc || madness.cn == 26 && this.bulistc ? (f4 = f4 * 1.5f) : 0.0f;
                                }
                                if (checkPoints.stage == 9) {
                                    if (n3 != 0) {
                                        f4 = (float)((double)f4 * 0.5);
                                    }
                                    if (madness.pcleared != 13 && madness.pcleared != 33 && n5 == 0) {
                                        f4 *= 0.5f;
                                    }
                                    if ((madness.im == 6 || madness.im == 5) && n3 != 0) {
                                        f4 = 0.0f;
                                    }
                                }
                                if (checkPoints.stage == 10 && !this.bulistc) {
                                    f4 = 0.0f;
                                }
                                if (checkPoints.stage == 11 && this.bulistc && n3 == 0) {
                                    f4 = 1.0f;
                                }
                                if (checkPoints.stage == 12) {
                                    if (madness.cn != 11 && madness.cn != 13 && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                        f4 = 0.0f;
                                    }
                                    if (madness.cn == 13 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                    if (madness.cn == 26 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                    if (madness.cn == 35 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                }
                                if ((checkPoints.stage == 14 || checkPoints.stage == 31 || checkPoints.stage == 44 || checkPoints.stage == 45 || checkPoints.stage == 47 || checkPoints.stage == 54) && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                    f4 = 0.0f;
                                }
                                if (checkPoints.stage == 15 || checkPoints.stage == 36) {
                                    if (checkPoints.pos[madness.im] == 0) {
                                        f4 = (float)((double)f4 * 0.5);
                                    }
                                    if (checkPoints.pos[0] < checkPoints.pos[madness.im]) {
                                        f4 *= 2.0f;
                                    }
                                    if (this.bulistc && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                }
                                if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                                    if (madness.cn != 14 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                                        if (checkPoints.pos[0] < checkPoints.pos[madness.im] && checkPoints.clear[0] - checkPoints.clear[madness.im] != 1) {
                                            f4 *= 2.0f;
                                        }
                                    } else {
                                        f4 = (float)((double)f4 * 0.5);
                                    }
                                    if (madness.cn == 13 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                    if (madness.cn == 26 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                    if (madness.cn == 35 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                    if (checkPoints.pos[madness.im] == 0 || checkPoints.pos[madness.im] == 1 && checkPoints.pos[0] == 0) {
                                        f4 = 0.0f;
                                    }
                                    if (checkPoints.clear[madness.im] - checkPoints.clear[0] >= 5 && n3 == 0) {
                                        f4 = 1.0f;
                                    }
                                }
                                if (checkPoints.stage == 28) {
                                    f4 *= 0.0f;
                                }
                                if (checkPoints.stage == 19 || checkPoints.stage == 21 || checkPoints.stage == 58) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 39 && madness.cn == 26) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 39 && madness.cn != 26) {
                                    f4 *= 0.0f;
                                }
                                if (checkPoints.stage == 35 || checkPoints.stage == 40 || checkPoints.stage == 41 || checkPoints.stage == 51) {
                                    float f7 = f4 = madness.cn == 9 || madness.cn == 11 || madness.cn == 13 || madness.cn == 15 || madness.cn == 26 || madness.cn == 27 || madness.cn == 34 || madness.cn == 35 || madness.cn == 36 || madness.cn == 37 || madness.cn == 38 || madness.cn == 39 ? (f4 = f4 * Float.POSITIVE_INFINITY) : (f4 = f4 * 0.0f);
                                }
                                if (checkPoints.stage == 56) {
                                    f4 *= 0.0f;
                                }
                                if (checkPoints.stage == 57 && madness.cn == 35) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 59 && madness.cn != 35) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 70 && madness.cn == 35) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 70 && madness.cn == 36) {
                                    f4 *= 0.0f;
                                }
                                if (madness.cn == 37 || madness.cn == 39) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkPoints.stage == 70 && madness.cn == 37) {
                                    f4 *= 0.0f;
                                }
                                if (checkPoints.stage != 19 && checkPoints.stage != 21 && checkPoints.stage != 28 && (madness.cn == 10 || madness.cn == 12 || madness.cn == 17 || madness.cn == 19 || madness.cn == 21 || madness.cn == 33)) {
                                    f4 = 0.0f;
                                }
                                if (madness.cn == 39 && checkPoints.stage != 28 && checkPoints.stage != 54 && checkPoints.stage != 56) {
                                    f4 *= Float.POSITIVE_INFINITY;
                                }
                                if (this.m.random() < f4) {
                                    this.attack = 40 * (Math.abs(checkPoints.clear[n3] - madness.clear) + 1);
                                    if (this.attack > 500) {
                                        this.attack = 500;
                                    }
                                    this.aim = 0.0f;
                                    if (checkPoints.stage == 3 && madness.im == 6 && this.m.random() > this.m.random()) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkPoints.stage == 4) {
                                        float f8 = this.aim = n3 == 0 && checkPoints.pos[0] < checkPoints.pos[madness.im] ? 1.5f : this.m.random();
                                    }
                                    if (checkPoints.stage == 5) {
                                        this.aim = this.m.random() * 1.5f;
                                    }
                                    if (checkPoints.stage == 7 && madness.im != 6 && (this.m.random() > this.m.random() || checkPoints.pos[0] < checkPoints.pos[madness.im])) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkPoints.stage == 19 && madness.im != 6 && (this.m.random() > this.m.random() || checkPoints.pos[0] < checkPoints.pos[madness.im])) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkPoints.stage == 8 && madness.cn == 11 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkPoints.stage == 8 && madness.cn == 26 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkPoints.stage == 8 && madness.cn == 35 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkPoints.stage == 9 && (madness.pcleared == 13 || madness.pcleared == 33)) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkPoints.stage == 11) {
                                        if (this.bulistc) {
                                            this.aim = 0.7f;
                                            if (this.attack > 150) {
                                                this.attack = 150;
                                            }
                                        } else {
                                            this.aim = this.m.random();
                                        }
                                    }
                                    if (checkPoints.stage == 12) {
                                        if (this.m.random() > this.m.random()) {
                                            this.aim = 0.7f;
                                        }
                                        if (this.bulistc && this.attack > 150) {
                                            this.attack = 150;
                                        }
                                    }
                                    if (checkPoints.stage == 13 && this.attack > 60) {
                                        this.attack = 60;
                                    }
                                    if (checkPoints.stage == 15 || checkPoints.stage == 36) {
                                        this.aim = this.m.random() * 1.5f;
                                        this.attack /= 2;
                                        boolean bl4 = this.exitattack = this.m.random() > this.m.random();
                                    }
                                    if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                                        if (madness.cn == 13 || madness.cn == 26 || madness.cn == 35) {
                                            this.aim = 0.76f;
                                            this.attack = 150;
                                        } else {
                                            this.aim = this.m.random() * 1.5f;
                                            if (Math.abs(checkPoints.clear[n3] - madness.clear) <= 2 || madness.cn == 14) {
                                                this.attack /= 3;
                                            }
                                        }
                                    }
                                    this.acr = n3;
                                    this.turntyp = (int)(1.0f + this.m.random() * 2.0f);
                                }
                            }
                            if (n6 != 0 && n9 > 100 && this.py(contO.x / 100, checkPoints.opx[n3] / 100, contO.z / 100, checkPoints.opz[n3] / 100) < 300 && (double)this.m.random() > 0.6 - (double)((float)checkPoints.pos[madness.im] / 10.0f)) {
                                this.clrnce = 0;
                                this.acuracy = 0;
                            }
                        }
                        if (checkPoints.stage != 54 && checkPoints.stage != 56) continue;
                        n6 = 0;
                    } while (++n3 < 7);
                }
                n6 = 0;
                if (checkPoints.stage == 6 || checkPoints.stage == 10 || checkPoints.stage == 11 || checkPoints.stage == 17) {
                    n6 = 1;
                }
                if (checkPoints.stage == 8 && madness.pcleared != 73) {
                    n6 = 1;
                }
                if (this.trfix != 3) {
                    this.trfix = 0;
                    n5 = 50;
                    if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                        n5 = 40;
                    }
                    if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > (float)n5 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                        this.trfix = 1;
                    }
                    if (n6 == 0) {
                        n4 = 80;
                        if (checkPoints.stage == 8 && madness.cn != 11 && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                            n4 = 50;
                        }
                        if (checkPoints.stage == 9) {
                            n4 = 70;
                        }
                        if (checkPoints.stage == 15 && madness.pcleared == 91) {
                            n4 = 50;
                        }
                        if (checkPoints.stage == 16 && checkPoints.clear[madness.im] - checkPoints.clear[0] >= 5 && madness.cn != 10 && madness.cn != 12 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                            n4 = 50;
                        }
                        if (checkPoints.stage == 20 && checkPoints.clear[madness.im] - checkPoints.clear[0] >= 5 && madness.cn != 10 && madness.cn != 12 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                            n4 = 50;
                        }
                        if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > (float)n4 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                            this.trfix = 2;
                        }
                    }
                } else {
                    this.upwait = 0;
                    this.acuracy = 0;
                    this.skiplev = 1.0f;
                    this.clrnce = 2;
                }
                if (!this.bulistc) {
                    if (checkPoints.stage == 8 && madness.cn == 11 && madness.pcleared == 35) {
                        madness.pcleared = 73;
                        madness.clear = 0;
                        this.bulistc = true;
                        this.runbul = (int)(100.0f * this.m.random());
                    }
                    if (checkPoints.stage == 8 && madness.cn == 26 && madness.pcleared == 35) {
                        madness.pcleared = 73;
                        madness.clear = 0;
                        this.bulistc = true;
                        this.runbul = (int)(100.0f * this.m.random());
                    }
                    if (checkPoints.stage == 11 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 11 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 11 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 12 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 12 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 12 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 15 && checkPoints.clear[0] - madness.clear >= 3 && this.trfix == 0) {
                        this.bulistc = true;
                        this.oupnt = -1;
                    }
                    if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                        if (madness.cn == 13 && checkPoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 26 && checkPoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 35 && checkPoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 11 && checkPoints.clear[0] - madness.clear >= 2 && this.trfix == 0) {
                            this.bulistc = true;
                            this.oupnt = -1;
                        }
                    }
                    if (checkPoints.stage == 49 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 50 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 50 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 50 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if ((checkPoints.stage == 2 || checkPoints.stage == 3 || checkPoints.stage == 4 || checkPoints.stage == 5 || checkPoints.stage == 8 || checkPoints.stage == 10 || checkPoints.stage == 13 || checkPoints.stage == 49) && madness.cn == 13 && Math.abs(checkPoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                    if ((checkPoints.stage == 2 || checkPoints.stage == 3 || checkPoints.stage == 4 || checkPoints.stage == 5 || checkPoints.stage == 8 || checkPoints.stage == 10 || checkPoints.stage == 13 || checkPoints.stage == 49) && madness.cn == 35 && Math.abs(checkPoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                    if (checkPoints.stage == 10 && madness.cn == 37 && Math.abs(checkPoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                } else if (checkPoints.stage == 8) {
                    --this.runbul;
                    if (madness.pcleared == 10) {
                        this.runbul = 0;
                    }
                    if (this.runbul <= 0) {
                        this.bulistc = false;
                    }
                }
                this.stcnt = 0;
                this.statusque = (int)(20.0f * this.m.random());
            } else {
                ++this.stcnt;
            }
            boolean bl = false;
            boolean bl5 = bl = this.usebounce ? madness.wtouch : madness.mtouch;
            if (bl) {
                if (this.trickfase != 0) {
                    this.trickfase = 0;
                }
                if (checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57 && (this.trfix == 2 || this.trfix == 3)) {
                    this.attack = 0;
                }
                if (this.attack == 0) {
                    if (this.upcnt < 30) {
                        if (this.revstart <= 0) {
                            this.up = true;
                        } else {
                            this.down = true;
                            --this.revstart;
                        }
                    }
                    if (this.upcnt < 25 + this.actwait) {
                        ++this.upcnt;
                    } else {
                        this.upcnt = 0;
                        this.actwait = this.upwait;
                    }
                    n6 = madness.point;
                    n5 = 50;
                    if (checkPoints.stage == 8) {
                        n5 = 20;
                    }
                    if (checkPoints.stage == 15) {
                        n5 = 40;
                    }
                    if (checkPoints.stage == 36) {
                        n5 = 40;
                    }
                    if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                        n5 = 20;
                    }
                    if (!this.bulistc || this.trfix == 2 || this.trfix == 3 || this.trfix == 4 || madness.power < (float)n5) {
                        if (this.rampp == 1 && checkPoints.typ[n6] <= 0) {
                            n4 = n6 + 1;
                            if (n4 == checkPoints.n) {
                                n4 = 0;
                            }
                            if (checkPoints.typ[n4] == -2) {
                                n6 = n4;
                            }
                        }
                        if (this.rampp == -1 && checkPoints.typ[n6] == -2 && ++n6 == checkPoints.n) {
                            n6 = 0;
                        }
                        if (this.m.random() > this.skiplev) {
                            n4 = n6;
                            n3 = 0;
                            if (checkPoints.typ[n4] > 0) {
                                n = 0;
                                for (n2 = 0; n2 < checkPoints.n; ++n2) {
                                    if (checkPoints.typ[n2] <= 0 || n2 >= n4) continue;
                                    ++n;
                                }
                                n3 = madness.clear != n + madness.nlaps * checkPoints.nsp ? 1 : 0;
                                n2 = n3;
                            }
                            while (checkPoints.typ[n4] == 0 || checkPoints.typ[n4] == -1 || checkPoints.typ[n4] == -3 || n3 != 0) {
                                n6 = n4++;
                                if (n4 == checkPoints.n) {
                                    n4 = 0;
                                }
                                n3 = 0;
                                if (checkPoints.typ[n4] <= 0) continue;
                                n = 0;
                                for (n2 = 0; n2 < checkPoints.n; ++n2) {
                                    if (checkPoints.typ[n2] <= 0 || n2 >= n4) continue;
                                    ++n;
                                }
                                n3 = madness.clear != n + madness.nlaps * checkPoints.nsp ? 1 : 0;
                            }
                        } else if (this.m.random() > this.skiplev) {
                            while (checkPoints.typ[n6] == -1) {
                                if (++n6 != checkPoints.n) continue;
                                n6 = 0;
                            }
                        }
                        if (checkPoints.stage == 8 && madness.pcleared == 73 && this.trfix == 0 && madness.clear != 0) {
                            n6 = 10;
                        }
                        if (checkPoints.stage == 9 && madness.pcleared == 18 && this.trfix == 0) {
                            n6 = 27;
                        }
                        if (checkPoints.stage == 11) {
                            if (madness.pcleared == 5 && this.trfix == 0 && madness.power < 70.0f) {
                                int n12 = n6 = n6 <= 16 ? 16 : 21;
                            }
                            if (madness.pcleared == 50) {
                                n6 = 57;
                            }
                        }
                        if (checkPoints.stage == 12 && (madness.pcleared == 27 || madness.pcleared == 37)) {
                            while (checkPoints.typ[n6] == -1) {
                                if (++n6 != checkPoints.n) continue;
                                n6 = 0;
                            }
                        }
                        if (checkPoints.stage == 13) {
                            while (checkPoints.typ[n6] == -1) {
                                if (++n6 != checkPoints.n) continue;
                                n6 = 0;
                            }
                        }
                        if (checkPoints.stage == 14) {
                            while (checkPoints.typ[n6] == -1) {
                                if (++n6 != checkPoints.n) continue;
                                n6 = 0;
                            }
                            if (!madness.gtouch) {
                                while (checkPoints.typ[n6] == -2) {
                                    if (++n6 != checkPoints.n) continue;
                                    n6 = 0;
                                }
                            }
                            if (this.oupnt >= 68) {
                                n6 = 70;
                            } else {
                                this.oupnt = n6;
                            }
                        }
                        if (checkPoints.stage == 15) {
                            if (madness.pcleared != 91 && checkPoints.pos[0] < checkPoints.pos[madness.im] && madness.cn != 13 || checkPoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkPoints.typ[n6] == -4) {
                                    if (++n6 != checkPoints.n) continue;
                                    n6 = 0;
                                }
                            }
                            if (madness.pcleared != 91 && checkPoints.pos[0] < checkPoints.pos[madness.im] && madness.cn != 26 || checkPoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkPoints.typ[n6] == -4) {
                                    if (++n6 != checkPoints.n) continue;
                                    n6 = 0;
                                }
                            }
                            if (madness.pcleared != 91 && checkPoints.pos[0] < checkPoints.pos[madness.im] && madness.cn != 35 || checkPoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkPoints.typ[n6] == -4) {
                                    if (++n6 != checkPoints.n) continue;
                                    n6 = 0;
                                }
                            }
                            if (madness.pcleared == 9) {
                                if (this.py(contO.x / 100, 297, contO.z / 100, 347) < 400) {
                                    this.oupnt = 1;
                                }
                                if (this.oupnt == 1 && n6 < 22) {
                                    n6 = 22;
                                }
                            }
                            if (madness.pcleared == 67) {
                                if (this.py(contO.x / 100, 28, contO.z / 100, 494) < 4000) {
                                    this.oupnt = 2;
                                }
                                if (this.oupnt == 2) {
                                    n6 = 76;
                                }
                            }
                            if (madness.pcleared == 76) {
                                if (this.py(contO.x / 100, -50, contO.z / 100, 0) < 2000) {
                                    this.oupnt = 3;
                                }
                                int n13 = n6 = this.oupnt == 3 ? 91 : 89;
                            }
                        }
                        if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                            if (madness.pcleared == 128) {
                                if (this.py(contO.x / 100, 0, contO.z / 100, 229) < 1500 || contO.z > 23000) {
                                    this.oupnt = 128;
                                }
                                if (this.oupnt != 128) {
                                    n6 = 3;
                                }
                            }
                            if (madness.pcleared == 8) {
                                if (this.py(contO.x / 100, -207, contO.z / 100, 549) < 1500 || contO.x < -20700) {
                                    this.oupnt = 8;
                                }
                                if (this.oupnt != 8) {
                                    n6 = 12;
                                }
                            }
                            if (madness.pcleared == 33) {
                                if (this.py(contO.x / 100, -60, contO.z / 100, 168) < 250 || contO.z > 17000) {
                                    this.oupnt = 331;
                                }
                                if (this.py(contO.x / 100, -112, contO.z / 100, 414) < 10000 || contO.z > 40000) {
                                    this.oupnt = 332;
                                }
                                if (this.oupnt != 331 && this.oupnt != 332) {
                                    int n14 = n6 = this.trfix != 1 ? 38 : 39;
                                }
                                if (this.oupnt == 331) {
                                    n6 = 71;
                                }
                            }
                            if (madness.pcleared == 42) {
                                if (this.py(contO.x / 100, -269, contO.z / 100, 493) < 100 || contO.x < -27000) {
                                    this.oupnt = 142;
                                }
                                if (this.oupnt != 142) {
                                    n6 = 47;
                                }
                            }
                            if (madness.pcleared == 51) {
                                if (this.py(contO.x / 100, -352, contO.z / 100, 260) < 100 || contO.z < 25000) {
                                    this.oupnt = 511;
                                }
                                if (this.py(contO.x / 100, -325, contO.z / 100, 10) < 2000 || contO.x > -32000) {
                                    this.oupnt = 512;
                                }
                                if (this.oupnt != 511 && this.oupnt != 512) {
                                    n6 = 80;
                                }
                                if (this.oupnt == 511) {
                                    n6 = 61;
                                }
                            }
                            if (madness.pcleared == 77) {
                                if (this.py(contO.x / 100, -371, contO.z / 100, 319) < 100 || contO.z < 31000) {
                                    this.oupnt = 77;
                                }
                                if (this.oupnt != 77) {
                                    n6 = 78;
                                    madness.nofocus = true;
                                }
                            }
                            if (madness.pcleared == 105) {
                                if (this.py(contO.x / 100, -179, contO.z / 100, 10) < 2300 || contO.z < 1050) {
                                    this.oupnt = 105;
                                }
                                int n15 = n6 = this.oupnt != 105 ? 65 : 125;
                            }
                            if (this.trfix == 3 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                                if (this.py(contO.x / 100, -52, contO.z / 100, 448) < 100 || contO.z > 45000) {
                                    this.oupnt = 176;
                                }
                                int n16 = n6 = this.oupnt != 176 ? 41 : 43;
                            }
                            if (checkPoints.clear[madness.im] - checkPoints.clear[0] >= 2 && this.py(contO.x / 100, checkPoints.opx[0] / 100, contO.z / 100, checkPoints.opz[0] / 100) < 1000 + this.avoidnlev) {
                                n3 = contO.xz;
                                if (this.zyinv) {
                                    n3 += 180;
                                }
                                while (n3 < 0) {
                                    n3 += 360;
                                }
                                while (n3 > 180) {
                                    n3 -= 360;
                                }
                                n = 0;
                                if (checkPoints.opx[0] - contO.x >= 0) {
                                    n = 180;
                                }
                                for (n4 = (int)((double)(90 + n) + Math.atan((double)(checkPoints.opz[0] - contO.z) / (double)(checkPoints.opx[0] - contO.x)) / (Math.PI / 180)); n4 < 0; n4 += 360) {
                                }
                                while (n4 > 180) {
                                    n4 -= 360;
                                }
                                n2 = Math.abs(n3 - n4);
                                if (n2 > 180) {
                                    n2 = Math.abs(n2 - 360);
                                }
                                if (n2 < 90) {
                                    this.wall = 0;
                                }
                            }
                        }
                        if (this.rampp == 2) {
                            n4 = n6 + 1;
                            if (n4 == checkPoints.n) {
                                n4 = 0;
                            }
                            if (checkPoints.typ[n4] == -2 && n6 != madness.point && --n6 < 0) {
                                n6 += checkPoints.n;
                            }
                        }
                        if (this.bulistc) {
                            madness.nofocus = true;
                            if (this.gowait) {
                                this.gowait = false;
                            }
                        }
                    } else {
                        if (checkPoints.stage != 15 && checkPoints.stage != 16 && checkPoints.stage != 20 || this.runbul == 0) {
                            if ((n6 -= 2) < 0) {
                                n6 += checkPoints.n;
                            }
                            while (checkPoints.typ[n6] == -4) {
                                if (--n6 >= 0) continue;
                                n6 += checkPoints.n;
                            }
                        }
                        if (checkPoints.stage == 11) {
                            if (n6 >= 14 && n6 <= 19) {
                                n6 = 13;
                            }
                            if (this.oupnt == 72 && n6 != 56) {
                                n6 = 57;
                            } else if (this.oupnt == 54 && n6 != 52) {
                                n6 = 53;
                            } else if (this.oupnt == 39 && n6 != 37) {
                                n6 = 38;
                            } else {
                                this.oupnt = n6;
                            }
                        }
                        if (checkPoints.stage == 12) {
                            if (!this.gowait) {
                                if (checkPoints.clear[0] == 0) {
                                    this.wtx = -3500;
                                    this.wtz = 19000;
                                    this.frx = -3500;
                                    this.frz = 39000;
                                    this.frad = 12000;
                                    this.oupnt = 37;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkPoints.clear[0] == 7) {
                                    this.wtx = -44800;
                                    this.wtz = 40320;
                                    this.frx = -44800;
                                    this.frz = 34720;
                                    this.frad = 30000;
                                    this.oupnt = 27;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkPoints.clear[0] == 10) {
                                    this.wtx = 0;
                                    this.wtz = 48739;
                                    this.frx = 0;
                                    this.frz = 38589;
                                    this.frad = 90000;
                                    this.oupnt = 55;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkPoints.clear[0] == 14) {
                                    this.wtx = -3500;
                                    this.wtz = 19000;
                                    this.frx = -14700;
                                    this.frz = 39000;
                                    this.frad = 45000;
                                    this.oupnt = 37;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkPoints.clear[0] == 18) {
                                    this.wtx = -48300;
                                    this.wtz = -4550;
                                    this.frx = -48300;
                                    this.frz = 5600;
                                    this.frad = 90000;
                                    this.oupnt = 17;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                            }
                            if (this.gowait) {
                                if (this.py(contO.x / 100, this.wtx / 100, contO.z / 100, this.wtz / 100) < 10000 && madness.speed > 50.0f) {
                                    this.up = false;
                                }
                                if (this.py(contO.x / 100, this.wtx / 100, contO.z / 100, this.wtz / 100) < 200) {
                                    this.up = false;
                                    this.handb = true;
                                }
                                if (checkPoints.pcleared == this.oupnt && this.py(checkPoints.opx[0] / 100, this.frx / 100, checkPoints.opz[0] / 100, this.frz / 100) < this.frad) {
                                    this.afta = true;
                                    this.gowait = false;
                                }
                                if (this.py(contO.x / 100, checkPoints.opx[0] / 100, contO.z / 100, checkPoints.opz[0] / 100) < 25) {
                                    this.afta = true;
                                    this.gowait = false;
                                    this.attack = 200;
                                    this.acr = 0;
                                }
                            }
                        }
                        if (checkPoints.stage == 15) {
                            if (this.oupnt == -1) {
                                n4 = -10;
                                for (n3 = 0; n3 < checkPoints.n; ++n3) {
                                    if (checkPoints.typ[n3] != -2 && checkPoints.typ[n3] != -4 || n3 >= 50 && n3 <= 54 || this.py(contO.x / 100, checkPoints.x[n3] / 100, contO.z / 100, checkPoints.z[n3] / 100) >= n4 && n4 != -10) continue;
                                    n4 = this.py(contO.x / 100, checkPoints.x[n3] / 100, contO.z / 100, checkPoints.z[n3] / 100);
                                    this.oupnt = n3;
                                }
                                --this.oupnt;
                                if (n6 < 0) {
                                    this.oupnt += checkPoints.n;
                                }
                            }
                            if (this.oupnt >= 0 && this.oupnt < checkPoints.n && this.py(contO.x / 100, checkPoints.x[n6 = this.oupnt] / 100, contO.z / 100, checkPoints.z[n6] / 100) < 800) {
                                this.oupnt = -((int)(75.0f + this.m.random() * 200.0f));
                                this.runbul = (int)(50.0f + this.m.random() * 100.0f);
                            }
                            if (this.oupnt < -1) {
                                ++this.oupnt;
                            }
                            if (this.runbul != 0) {
                                --this.runbul;
                            }
                        }
                        if (checkPoints.stage == 16) {
                            n4 = 0;
                            if (madness.cn == 13 || madness.cn == 26 || madness.cn == 35 || madness.cn == 39) {
                                if (!this.gowait) {
                                    if (checkPoints.clear[0] == 1) {
                                        if ((double)this.m.random() > 0.5) {
                                            this.wtx = -14000;
                                            this.wtz = 48000;
                                            this.frx = -5600;
                                            this.frz = 47600;
                                            this.frad = 88000;
                                            this.oupnt = 33;
                                        } else {
                                            this.wtx = -5600;
                                            this.wtz = 8000;
                                            this.frx = -7350;
                                            this.frz = -4550;
                                            this.frad = 22000;
                                            this.oupnt = 15;
                                        }
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkPoints.clear[0] == 4) {
                                        this.wtx = -12700;
                                        this.wtz = 14000;
                                        this.frx = -31000;
                                        this.frz = 1050;
                                        this.frad = 11000;
                                        this.oupnt = 51;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkPoints.clear[0] == 14) {
                                        this.wtx = -35350;
                                        this.wtz = 6650;
                                        this.frx = -48300;
                                        this.frz = 54950;
                                        this.frad = 11000;
                                        this.oupnt = 15;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkPoints.clear[0] == 17) {
                                        this.wtx = -42700;
                                        this.wtz = 41000;
                                        this.frx = -40950;
                                        this.frz = 49350;
                                        this.frad = 7000;
                                        this.oupnt = 42;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkPoints.clear[0] == 21) {
                                        this.wtx = -1750;
                                        this.wtz = -15750;
                                        this.frx = -25900;
                                        this.frz = -14000;
                                        this.frad = 11000;
                                        this.oupnt = 125;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                }
                                if (this.gowait) {
                                    if (this.py(contO.x / 100, this.wtx / 100, contO.z / 100, this.wtz / 100) < 10000 && madness.speed > 50.0f) {
                                        this.up = false;
                                    }
                                    if (this.py(contO.x / 100, this.wtx / 100, contO.z / 100, this.wtz / 100) < 200) {
                                        this.up = false;
                                        this.handb = true;
                                    }
                                    if (checkPoints.pcleared == this.oupnt && this.py(checkPoints.opx[0] / 100, this.frx / 100, checkPoints.opz[0] / 100, this.frz / 100) < this.frad) {
                                        this.runbul = 0;
                                        this.afta = true;
                                        this.gowait = false;
                                    }
                                    if (this.py(contO.x / 100, checkPoints.opx[0] / 100, contO.z / 100, checkPoints.opz[0] / 100) < 25) {
                                        this.afta = true;
                                        this.gowait = false;
                                        this.attack = 200;
                                        this.acr = 0;
                                    }
                                    if (checkPoints.clear[0] == 21 && this.oupnt != 125) {
                                        this.gowait = false;
                                    }
                                }
                                if (checkPoints.clear[0] >= 11 && !this.gowait || madness.power < 60.0f && checkPoints.clear[0] < 21) {
                                    n4 = 1;
                                    if (!this.exitattack) {
                                        this.oupnt = -1;
                                        this.exitattack = true;
                                    }
                                } else if (this.exitattack) {
                                    this.exitattack = false;
                                }
                            }
                            if (madness.cn == 11 || madness.cn == 26) {
                                n4 = 1;
                            }
                            if (n4 != 0) {
                                if (this.oupnt == -1) {
                                    n3 = -10;
                                    for (n = 0; n < checkPoints.n; ++n) {
                                        if (checkPoints.typ[n] != -4 || (this.py(contO.x / 100, checkPoints.x[n] / 100, contO.z / 100, checkPoints.z[n] / 100) >= n3 || !((double)this.m.random() > 0.6)) && n3 != -10) continue;
                                        n3 = this.py(contO.x / 100, checkPoints.x[n] / 100, contO.z / 100, checkPoints.z[n] / 100);
                                        this.oupnt = n;
                                    }
                                    --this.oupnt;
                                    if (n6 < 0) {
                                        this.oupnt += checkPoints.n;
                                    }
                                }
                                if (this.oupnt >= 0 && this.oupnt < checkPoints.n && this.py(contO.x / 100, checkPoints.x[n6 = this.oupnt] / 100, contO.z / 100, checkPoints.z[n6] / 100) < 800) {
                                    this.oupnt = -((int)(75.0f + this.m.random() * 200.0f));
                                    this.runbul = (int)(50.0f + this.m.random() * 100.0f);
                                }
                                if (this.oupnt < -1) {
                                    ++this.oupnt;
                                }
                                if (this.runbul != 0) {
                                    --this.runbul;
                                }
                            }
                        }
                        madness.nofocus = true;
                    }
                    if (checkPoints.stage != 17) {
                        if (checkPoints.stage == 9 || checkPoints.stage == 8 && madness.pcleared == 73 || checkPoints.stage == 16 || checkPoints.stage == 20) {
                            this.forget = true;
                        }
                        if ((madness.missedcp == 0 || this.forget || this.trfix == 4) && this.trfix != 0) {
                            n4 = 0;
                            if (checkPoints.stage == 15 || checkPoints.stage == 16) {
                                n4 = 3;
                            }
                            if (this.trfix == 2 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                                n3 = -10;
                                n = 0;
                                for (n2 = n4; n2 < checkPoints.fn; ++n2) {
                                    if (this.py(contO.x / 100, checkPoints.x[this.fpnt[n2]] / 100, contO.z / 100, checkPoints.z[this.fpnt[n2]] / 100) >= n3 && n3 != -10) continue;
                                    n3 = this.py(contO.x / 100, checkPoints.x[this.fpnt[n2]] / 100, contO.z / 100, checkPoints.z[this.fpnt[n2]] / 100);
                                    n = n2;
                                }
                                if (checkPoints.stage == 8 || checkPoints.stage == 12) {
                                    n = 1;
                                }
                                n6 = this.fpnt[n];
                                this.forget = checkPoints.special[n];
                            }
                            for (n3 = n4; n3 < checkPoints.fn; ++n3) {
                                if (this.py(contO.x / 100, checkPoints.x[this.fpnt[n3]] / 100, contO.z / 100, checkPoints.z[this.fpnt[n3]] / 100) >= 2000) continue;
                                this.forget = false;
                                this.actwait = 0;
                                this.upwait = 0;
                                this.turntyp = 2;
                                this.randtcnt = -1;
                                this.acuracy = 0;
                                this.rampp = 0;
                                this.trfix = 3;
                            }
                            if (this.trfix == 3 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                                madness.nofocus = true;
                            }
                        }
                    }
                    if (this.turncnt > this.randtcnt) {
                        if (!this.gowait) {
                            n4 = 0;
                            if (checkPoints.x[n6] - contO.x >= 0) {
                                n4 = 180;
                            }
                            this.pan = (int)((double)(90 + n4) + Math.atan((double)(checkPoints.z[n6] - contO.z) / (double)(checkPoints.x[n6] - contO.x)) / (Math.PI / 180));
                        } else {
                            n4 = 0;
                            if (this.wtx - contO.x >= 0) {
                                n4 = 180;
                            }
                            this.pan = (int)((double)(90 + n4) + Math.atan((double)(this.wtz - contO.z) / (double)(this.wtx - contO.x)) / (Math.PI / 180));
                        }
                        this.turncnt = 0;
                        this.randtcnt = (int)((float)this.acuracy * this.m.random());
                    } else {
                        ++this.turncnt;
                    }
                } else {
                    this.up = true;
                    n6 = 0;
                    n5 = (int)((float)this.pys(contO.x, checkPoints.opx[this.acr], contO.z, checkPoints.opz[this.acr]) / 2.0f * this.aim);
                    n4 = (int)((float)checkPoints.opx[this.acr] - (float)n5 * this.m.sin(checkPoints.omxz[this.acr]));
                    n3 = (int)((float)checkPoints.opz[this.acr] + (float)n5 * this.m.cos(checkPoints.omxz[this.acr]));
                    if (n4 - contO.x >= 0) {
                        n6 = 180;
                    }
                    this.pan = (int)((double)(90 + n6) + Math.atan((double)(n3 - contO.z) / (double)(n4 - contO.x)) / (Math.PI / 180));
                    --this.attack;
                    if (this.attack <= 0) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 15 && this.exitattack && !this.bulistc && madness.missedcp != 0) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 16 && madness.cn == 13 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 16 && madness.cn == 26 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 16 && madness.cn == 35 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 16 && madness.missedcp != 0 && (checkPoints.pos[madness.im] == 0 || checkPoints.pos[madness.im] == 1 && checkPoints.pos[0] == 0)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 16 && checkPoints.pos[0] > checkPoints.pos[madness.im] && madness.power < 80.0f) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 20 && madness.cn == 13 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 20 && madness.cn == 26 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 20 && madness.cn == 35 && (checkPoints.clear[0] == 4 || checkPoints.clear[0] == 13 || checkPoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 20 && madness.missedcp != 0 && (checkPoints.pos[madness.im] == 0 || checkPoints.pos[madness.im] == 1 && checkPoints.pos[0] == 0)) {
                        this.attack = 0;
                    }
                    if (checkPoints.stage == 20 && checkPoints.pos[0] > checkPoints.pos[madness.im] && madness.power < 80.0f) {
                        this.attack = 0;
                    }
                }
                n6 = contO.xz;
                if (this.zyinv) {
                    n6 += 180;
                }
                while (n6 < 0) {
                    n6 += 360;
                }
                while (n6 > 180) {
                    n6 -= 360;
                }
                while (this.pan < 0) {
                    this.pan += 360;
                }
                while (this.pan > 180) {
                    this.pan -= 360;
                }
                if (this.wall != -1 && this.hold == 0) {
                    this.clrnce = 0;
                }
                if (this.hold == 0) {
                    if (Math.abs(n6 - this.pan) < 180) {
                        if (Math.abs(n6 - this.pan) > this.clrnce) {
                            if (n6 < this.pan) {
                                this.left = true;
                                this.lastl = true;
                            } else {
                                this.right = true;
                                this.lastl = false;
                            }
                            if (Math.abs(n6 - this.pan) > 50 && madness.speed > (float)madness.swits[madness.cn][0] && this.turntyp != 0) {
                                if (this.turntyp == 1) {
                                    this.down = true;
                                }
                                if (this.turntyp == 2) {
                                    this.handb = true;
                                }
                                if (!this.agressed) {
                                    this.up = false;
                                }
                            }
                        }
                    } else if (Math.abs(n6 - this.pan) < 360 - this.clrnce) {
                        if (n6 < this.pan) {
                            this.right = true;
                            this.lastl = false;
                        } else {
                            this.left = true;
                            this.lastl = true;
                        }
                        if (Math.abs(n6 - this.pan) < 310 && madness.speed > (float)madness.swits[madness.cn][0] && this.turntyp != 0) {
                            if (this.turntyp == 1) {
                                this.down = true;
                            }
                            if (this.turntyp == 2) {
                                this.handb = true;
                            }
                            if (!this.agressed) {
                                this.up = false;
                            }
                        }
                    }
                }
                if (checkPoints.stage == 14 && this.wall != -1) {
                    if (trackers.dam[this.wall] == 0 || madness.pcleared == 45) {
                        this.wall = -1;
                    }
                    if (madness.pcleared == 58 && checkPoints.opz[madness.im] < 36700) {
                        this.wall = -1;
                        this.hold = 0;
                    }
                }
                if (this.wall != -1) {
                    if (this.lwall != this.wall) {
                        if (this.lastl) {
                            this.left = true;
                        } else {
                            this.right = true;
                        }
                        this.wlastl = this.lastl;
                        this.lwall = this.wall;
                    } else if (this.wlastl) {
                        this.left = true;
                    } else {
                        this.right = true;
                    }
                    if (trackers.dam[this.wall] != 0) {
                        n5 = 1;
                        if (trackers.skd[this.wall] == 1) {
                            n5 = 3;
                        }
                        this.hold += n5;
                        if (this.hold > 10 * n5) {
                            this.hold = 10 * n5;
                        }
                    } else {
                        this.hold = 1;
                    }
                    this.wall = -1;
                } else if (this.hold != 0) {
                    --this.hold;
                }
            } else {
                if (this.trickfase == 0) {
                    n6 = (int)((madness.scy[0] + madness.scy[1] + madness.scy[2] + madness.scy[3]) * (float)(contO.y - 300) / 4000.0f);
                    n5 = 3;
                    if (checkPoints.stage == 15 || checkPoints.stage == 36) {
                        n5 = 10;
                    }
                    if (n6 > 7 && (this.m.random() > this.trickprf / (float)n5 || this.stuntf == 4 || this.stuntf == 3 || this.stuntf == 5 || this.stuntf == 6 || checkPoints.stage == 16)) {
                        this.oxy = madness.pxy;
                        this.ozy = madness.pzy;
                        this.flycnt = 0;
                        this.uddirect = 0;
                        this.lrdirect = 0;
                        this.udswt = false;
                        this.lrswt = false;
                        this.trickfase = 1;
                        if (n6 < 16) {
                            if (this.stuntf != 6) {
                                this.uddirect = -1;
                                this.udstart = 0;
                                this.udswt = false;
                            } else if (this.oupnt != 70) {
                                this.uddirect = 1;
                                this.udstart = 0;
                                this.udswt = false;
                            }
                        } else if (this.m.random() > this.m.random() && this.stuntf != 1 || this.stuntf == 4 || this.stuntf == 6 || this.stuntf == 7) {
                            this.uddirect = (this.m.random() > this.m.random() || this.stuntf == 2 || this.stuntf == 7) && this.stuntf != 4 && this.stuntf != 6 ? -1 : 1;
                            this.udstart = (int)(10.0f * this.m.random() * this.trickprf);
                            if (this.stuntf == 6) {
                                this.udstart = 0;
                            }
                            if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                                this.udstart = 0;
                            }
                            if (checkPoints.stage == 14 && (this.oupnt == 68 || this.oupnt == 69)) {
                                this.apunch = 20;
                                this.oupnt = 70;
                            }
                            if ((double)this.m.random() > 0.85 && this.stuntf != 4 && this.stuntf != 3 && this.stuntf != 6 && checkPoints.stage != 16 && checkPoints.stage != 20) {
                                this.udswt = true;
                            }
                            if (this.m.random() > this.trickprf + 0.3f && this.stuntf != 4 && this.stuntf != 6) {
                                this.lrdirect = this.m.random() > this.m.random() ? -1 : 1;
                                this.lrstart = (int)(30.0f * this.m.random());
                                if ((double)this.m.random() > 0.75) {
                                    this.lrswt = true;
                                }
                            }
                        } else {
                            this.lrdirect = this.m.random() > this.m.random() ? -1 : 1;
                            this.lrstart = (int)(10.0f * this.m.random() * this.trickprf);
                            if ((double)this.m.random() > 0.75 && checkPoints.stage != 16 && checkPoints.stage != 20) {
                                this.lrswt = true;
                            }
                            if (this.m.random() > this.trickprf + 0.3f) {
                                this.uddirect = this.m.random() > this.m.random() ? -1 : 1;
                                this.udstart = (int)(30.0f * this.m.random());
                                if ((double)this.m.random() > 0.85) {
                                    this.udswt = true;
                                }
                            }
                        }
                        if (this.trfix == 3 || this.trfix == 4) {
                            if (checkPoints.stage != 8 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                                if (checkPoints.stage != 15 && this.lrdirect == -1) {
                                    this.uddirect = checkPoints.stage != 9 ? -1 : 1;
                                }
                                this.lrdirect = 0;
                                if ((checkPoints.stage == 9 || checkPoints.stage == 15) && this.uddirect == -1) {
                                    this.uddirect = 1;
                                }
                                if (madness.power < 60.0f) {
                                    this.uddirect = -1;
                                }
                            } else {
                                if (this.uddirect != 0) {
                                    this.uddirect = -1;
                                }
                                this.lrdirect = 0;
                            }
                            if (checkPoints.stage == 10) {
                                this.uddirect = 1;
                                this.lrdirect = 0;
                            }
                            if (checkPoints.stage == 16 || checkPoints.stage == 20) {
                                this.uddirect = -1;
                                this.lrdirect = 0;
                                if (madness.cn != 11 && madness.cn != 13 && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                    this.udstart = 7;
                                    if (madness.cn == 14 && madness.power > 30.0f) {
                                        this.udstart = 14;
                                    }
                                } else {
                                    this.udstart = 0;
                                }
                                if (madness.cn == 11 || madness.cn == 26) {
                                    this.lrdirect = -1;
                                    this.lrstart = 0;
                                }
                            }
                        }
                    } else {
                        this.trickfase = -1;
                    }
                    if (!this.afta) {
                        this.afta = true;
                    }
                    if (this.trfix == 3 && checkPoints.stage != 14 && checkPoints.stage != 17 && checkPoints.stage != 21 && checkPoints.stage != 35 && checkPoints.stage != 39 && checkPoints.stage != 51 && checkPoints.stage != 55 && checkPoints.stage != 57) {
                        this.trfix = 4;
                        this.statusque += 30;
                    }
                }
                if (this.trickfase == 1) {
                    ++this.flycnt;
                    if (this.lrdirect != 0 && this.flycnt > this.lrstart) {
                        if (this.lrswt && Math.abs(madness.pxy - this.oxy) > 180) {
                            this.lrdirect = this.lrdirect == -1 ? 1 : -1;
                            this.lrswt = false;
                        }
                        if (this.lrdirect == -1) {
                            this.handb = true;
                            this.left = true;
                        } else {
                            this.handb = true;
                            this.right = true;
                        }
                    }
                    if (this.uddirect != 0 && this.flycnt > this.udstart) {
                        if (this.udswt && Math.abs(madness.pzy - this.ozy) > 180) {
                            this.uddirect = this.uddirect == -1 ? 1 : -1;
                            this.udswt = false;
                        }
                        if (this.uddirect == -1) {
                            this.handb = true;
                            this.down = true;
                        } else {
                            this.handb = true;
                            this.up = true;
                            if (this.apunch > 0) {
                                this.down = true;
                                --this.apunch;
                            }
                        }
                    }
                    if ((madness.scy[0] + madness.scy[1] + madness.scy[2] + madness.scy[3]) * 100.0f / (float)(contO.y - 300) < (float)(-this.saftey)) {
                        this.onceu = false;
                        this.onced = false;
                        this.oncel = false;
                        this.oncer = false;
                        this.lrcomp = false;
                        this.udcomp = false;
                        this.udbare = false;
                        this.lrbare = false;
                        this.trickfase = 2;
                        this.swat = 0;
                    }
                }
                if (this.trickfase == 2) {
                    if (this.swat == 0) {
                        if (madness.dcomp != 0.0f || madness.ucomp != 0.0f) {
                            this.udbare = true;
                        }
                        if (madness.lcomp != 0.0f || madness.rcomp != 0.0f) {
                            this.lrbare = true;
                        }
                        this.swat = 1;
                    }
                    if (madness.wtouch) {
                        if (this.swat == 1) {
                            this.swat = 2;
                        }
                    } else if (this.swat == 2) {
                        if (madness.capsized && this.m.random() > this.mustland) {
                            if (this.udbare) {
                                this.lrbare = true;
                                this.udbare = false;
                            } else if (this.lrbare) {
                                this.udbare = true;
                                this.lrbare = false;
                            }
                        }
                        this.swat = 3;
                    }
                    if (this.udbare) {
                        for (n6 = madness.pzy + 90; n6 < 0; n6 += 360) {
                        }
                        while (n6 > 180) {
                            n6 -= 360;
                        }
                        n6 = Math.abs(n6);
                        if (madness.lcomp - madness.rcomp < 5.0f && (this.onced || this.onceu)) {
                            this.udcomp = true;
                        }
                        if (madness.dcomp > madness.ucomp) {
                            if (madness.capsized) {
                                if (this.udcomp) {
                                    if (n6 > 90) {
                                        this.up = true;
                                    } else {
                                        this.down = true;
                                    }
                                } else if (!this.onced) {
                                    this.down = true;
                                }
                            } else {
                                if (this.udcomp) {
                                    if (this.perfection && Math.abs(n6 - 90) > 30) {
                                        if (n6 > 90) {
                                            this.up = true;
                                        } else {
                                            this.down = true;
                                        }
                                    }
                                } else if (this.m.random() > this.mustland) {
                                    this.up = true;
                                }
                                this.onced = true;
                            }
                        } else if (madness.capsized) {
                            if (this.udcomp) {
                                if (n6 > 90) {
                                    this.up = true;
                                } else {
                                    this.down = true;
                                }
                            } else if (!this.onceu) {
                                this.up = true;
                            }
                        } else {
                            if (this.udcomp) {
                                if (this.perfection && Math.abs(n6 - 90) > 30) {
                                    if (n6 > 90) {
                                        this.up = true;
                                    } else {
                                        this.down = true;
                                    }
                                }
                            } else if (this.m.random() > this.mustland) {
                                this.down = true;
                            }
                            this.onceu = true;
                        }
                    }
                    if (this.lrbare) {
                        n6 = madness.pxy + 90;
                        if (this.zyinv) {
                            n6 += 180;
                        }
                        while (n6 < 0) {
                            n6 += 360;
                        }
                        while (n6 > 180) {
                            n6 -= 360;
                        }
                        n6 = Math.abs(n6);
                        if (madness.lcomp - madness.rcomp < 10.0f && (this.oncel || this.oncer)) {
                            this.lrcomp = true;
                        }
                        if (madness.lcomp > madness.rcomp) {
                            if (madness.capsized) {
                                if (this.lrcomp) {
                                    if (n6 > 90) {
                                        this.left = true;
                                    } else {
                                        this.right = true;
                                    }
                                } else if (!this.oncel) {
                                    this.left = true;
                                }
                            } else {
                                if (this.lrcomp) {
                                    if (this.perfection && Math.abs(n6 - 90) > 30) {
                                        if (n6 > 90) {
                                            this.left = true;
                                        } else {
                                            this.right = true;
                                        }
                                    }
                                } else if (this.m.random() > this.mustland) {
                                    this.right = true;
                                }
                                this.oncel = true;
                            }
                        } else if (madness.capsized) {
                            if (this.lrcomp) {
                                if (n6 > 90) {
                                    this.left = true;
                                } else {
                                    this.right = true;
                                }
                            } else if (!this.oncer) {
                                this.right = true;
                            }
                        } else {
                            if (this.lrcomp) {
                                if (this.perfection && Math.abs(n6 - 90) > 30) {
                                    if (n6 > 90) {
                                        this.left = true;
                                    } else {
                                        this.right = true;
                                    }
                                }
                            } else if (this.m.random() > this.mustland) {
                                this.left = true;
                            }
                            this.oncer = true;
                        }
                    }
                }
            }
        }
        if (madness.cn == 17 || madness.cn == 21) {
            this.avoidnlev = (int)(2700.0f * this.m.random());
        }
        if (madness.cn == 27) {
            this.usebounce = false;
            this.mustland = 0.0f;
        }
        if (checkPoints.stage == 14 || checkPoints.stage == 17 || checkPoints.stage == 21 || checkPoints.stage == 35 || checkPoints.stage == 39 || checkPoints.stage == 51 || checkPoints.stage == 55 || checkPoints.stage == 57) {
            this.trfix = -2147483647;
        }
        if (checkPoints.stage == 54 || checkPoints.stage == 55 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
            this.acuracy = 0;
        }
        if (checkPoints.stage == 31 || checkPoints.stage == 39 || checkPoints.stage == 55 || checkPoints.stage == 56 || checkPoints.stage == 57 || checkPoints.stage == 58 || checkPoints.stage == 59 || checkPoints.stage == 60) {
            this.clrnce = 2;
            this.acuracy = 0;
        }
        if (this.wall == 0) {
            madness.speed /= 10.0f;
        }
        if (madness.cn == 35 && this.wait1 == -1) {
            this.wait1 = 25;
        }
        if (madness.cn == 39 && this.wait2 == -1) {
            this.wait2 = 500;
        }
        if (this.wait1 > 0) {
            madness.speed = 0.0f;
            madness.moment[35] = Float.POSITIVE_INFINITY;
            this.up = false;
            this.left = false;
            this.right = false;
            this.down = false;
            this.handb = true;
            --this.wait1;
        } else {
            madness.moment[35] = 1000.0f;
        }
        if (this.wait2 > 0) {
            madness.speed = 0.0f;
            this.up = false;
            this.left = false;
            this.right = false;
            this.down = false;
            this.handb = true;
            --this.wait2;
        }
        if (checkPoints.stage == 57) {
            this.trickprf = 2.14748365E9f;
            this.stuntf = 0;
        }
        boolean bl = this.fire = this.attack != 0 && !madness.dest && madness.mtouch && madness.power > 60.0f ? false : false;
        if (madness.power < 50.0f) {
            this.trickprf = -1.0f;
        }
        if (checkPoints.haltall) {
            this.up = false;
            this.down = false;
            this.left = false;
            this.right = false;
        }
        if (madness.cn == 17 || madness.cn == 21 || madness.cn == 24 || madness.cn == 25 || madness.cn == 31 || madness.cn == 32) {
            this.turntyp = 1;
        }
        if (madness.cn == 33 || madness.cn == 34 || madness.cn == 36 || madness.cn == 37 || madness.cn == 38 || madness.cn == 39) {
            this.turntyp = 2;
        }
    }

    public void reset(CheckPoints checkPoints, int n) {
        this.pan = 0;
        this.attack = 0;
        this.acr = 0;
        this.afta = false;
        this.trfix = 0;
        this.acuracy = 0;
        this.upwait = 0;
        this.forget = false;
        this.bulistc = false;
        this.runbul = 0;
        this.revstart = 0;
        this.oupnt = 0;
        this.gowait = false;
        this.apunch = 0;
        this.exitattack = false;
        this.wait1 = -1;
        this.wait2 = -1;
        if (checkPoints.stage == 6 || checkPoints.stage == 8) {
            this.hold = 50;
        }
        if (checkPoints.stage == 7) {
            this.hold = 10;
        }
        if (checkPoints.stage == 10) {
            this.hold = 30;
        }
        if (checkPoints.stage == 11) {
            if (n != 13) {
                this.hold = 35;
                this.revstart = 25;
            } else {
                this.hold = 5;
            }
            this.statusque = 0;
        }
        if (checkPoints.stage == 12) {
            if (n != 13) {
                this.hold = (int)(20.0f + 10.0f * this.m.random());
                this.revstart = (int)(10.0f + 10.0f * this.m.random());
            } else {
                this.hold = 5;
            }
            this.statusque = 0;
        }
        if (checkPoints.stage == 14) {
            this.hold = 30;
            this.statusque = 0;
            if (n != 14) {
                this.revstart = 1;
            }
        }
        if (checkPoints.stage == 27) {
            if (n != 9) {
                this.hold = 35;
                this.revstart = Integer.MAX_VALUE;
            } else {
                this.hold = 0;
                this.revstart = 0;
            }
            this.statusque = 0;
        }
        if (checkPoints.stage == 39) {
            if (n == 26) {
                this.hold = (int)(20.0f + 10.0f * this.m.random());
                this.revstart = (int)(40.0f + 10.0f * this.m.random());
            } else {
                this.hold = 0;
            }
            this.statusque = 0;
        }
        if (checkPoints.stage == 56) {
            if (n == 36) {
                this.hold = 0;
                this.revstart = 0;
            } else {
                this.hold = 0;
                this.revstart = 0;
            }
            this.statusque = 0;
        }
        if (checkPoints.stage == 15) {
            this.hold = 40;
        }
        if (checkPoints.stage == 16) {
            this.hold = 20;
        }
        if (checkPoints.stage != 9 && checkPoints.stage != 16) {
            int n2;
            int n3;
            int n4;
            for (n4 = 0; n4 < checkPoints.fn; ++n4) {
                n3 = -10;
                for (n2 = 0; n2 < checkPoints.n; ++n2) {
                    if (this.py(checkPoints.fx[n4] / 100, checkPoints.x[n2] / 100, checkPoints.fz[n4] / 100, checkPoints.z[n2] / 100) >= n3 && n3 != -10) continue;
                    n3 = this.py(checkPoints.fx[n4] / 100, checkPoints.x[n2] / 100, checkPoints.fz[n4] / 100, checkPoints.z[n2] / 100);
                    this.fpnt[n4] = n2;
                }
            }
            for (n4 = 0; n4 < checkPoints.fn; ++n4) {
                n3 = n4;
                this.fpnt[n3] = this.fpnt[n3] - 4;
                if (this.fpnt[n4] >= 0) continue;
                n2 = n4;
                this.fpnt[n2] = this.fpnt[n2] + checkPoints.nsp;
            }
        } else {
            if (checkPoints.stage == 9) {
                this.fpnt[0] = 14;
                this.fpnt[1] = 36;
            }
            if (checkPoints.stage == 16) {
                this.fpnt[3] = 39;
            }
        }
        this.left = false;
        this.right = false;
        this.up = false;
        this.down = false;
        this.handb = false;
        this.fire = false;
        this.lookback = 0;
        this.arrace = false;
        this.mutem = false;
        this.mutes = false;
    }

    public Control(Medium medium) {
        this.m = medium;
    }

    public void falseo() {
        this.left = false;
        this.right = false;
        this.up = false;
        this.down = false;
        this.handb = false;
        this.fire = false;
        this.lookback = 0;
        this.enter = false;
        this.arrace = false;
        this.mutem = false;
        this.mutes = false;
    }

    public int pys(int n, int n2, int n3, int n4) {
        return (int)Math.sqrt((n - n2) * (n - n2) + (n3 - n4) * (n3 - n4));
    }

    public int py(int n, int n2, int n3, int n4) {
        return (n - n2) * (n - n2) + (n3 - n4) * (n3 - n4);
    }
}
