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

    public void preform(Madness madness, ContO conto, CheckPoints checkpoints, Trackers trackers) {
        this.left = false;
        this.right = false;
        this.up = false;
        this.down = false;
        this.handb = false;
        this.fire = false;
        if (!madness.dest) {
            if (this.stcnt > this.statusque) {
                this.acuracy = (7 - checkpoints.pos[madness.im]) * checkpoints.pos[0] * (6 - checkpoints.stage * 2);
                if (this.acuracy < 0) {
                    this.acuracy = 0;
                }
                this.clrnce = 5;
                if (checkpoints.stage == 16 || checkpoints.stage == 25) {
                    this.clrnce = 2;
                }
                if (checkpoints.stage == 26 && (madness.pcleared == 27 || madness.pcleared == 17)) {
                    this.clrnce = 3;
                }
                if (checkpoints.stage == 54 && madness.pcleared == 33) {
                    this.clrnce = 3;
                }
                if (checkpoints.stage == 36 && madness.pcleared == 33) {
                    this.clrnce = 3;
                }
                float f = 0.0f;
                if (checkpoints.stage == 1) {
                    f = 1.5f;
                }
                if (checkpoints.stage == 12) {
                    f = 1.5f;
                }
                if (checkpoints.stage == 2) {
                    f = 1.0f;
                }
                if (checkpoints.stage == 13 && madness.im != 6) {
                    f = 0.2f;
                }
                if (checkpoints.stage == 4) {
                    f = 0.5f;
                }
                this.upwait = (int)((float)((checkpoints.pos[0] - checkpoints.pos[madness.im]) * (checkpoints.pos[0] - checkpoints.pos[madness.im]) * (checkpoints.pos[0] - checkpoints.pos[madness.im])) * f);
                if (this.upwait > 80) {
                    this.upwait = 80;
                }
                if (checkpoints.stage == 1 && this.upwait < 20) {
                    this.upwait = 20;
                }
                if (checkpoints.stage == 12 && this.upwait < 20) {
                    this.upwait = 20;
                }
                f = 0.0f;
                if (checkpoints.stage == 1 || checkpoints.stage == 2 || checkpoints.stage == 12) {
                    f = 1.0f;
                }
                if (checkpoints.stage == 13) {
                    f = 0.5f;
                }
                if (checkpoints.stage == 4) {
                    f = 0.5f;
                }
                if (checkpoints.stage == 15) {
                    f = 0.2f;
                }
                if (checkpoints.pos[madness.im] - checkpoints.pos[0] >= -1) {
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
                if (checkpoints.stage == 47) {
                    this.skiplev = madness.pcleared >= 10 && madness.pcleared <= 24 ? 1.0f : 0.0f;
                }
                if (checkpoints.stage == 25) {
                    this.skiplev = 0.0f;
                    if (madness.pcleared == 5) {
                        this.skiplev = 1.0f;
                    }
                    if (madness.pcleared == 28 || madness.pcleared == 35) {
                        this.skiplev = 0.5f;
                    }
                }
                if (checkpoints.stage == 27) {
                    this.skiplev = 0.5f;
                }
                if (checkpoints.stage == 24 || checkpoints.stage == 26) {
                    this.skiplev = 1.0f;
                }
                if (checkpoints.stage == 22 || checkpoints.stage == 35 || checkpoints.stage == 54 || checkpoints.stage == 36 || checkpoints.stage == 38 || checkpoints.stage == 44) {
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
                if (checkpoints.stage == 47 && madness.pcleared >= 45) {
                    this.rampp = 2;
                }
                if (checkpoints.stage == 26 && madness.pcleared == 17) {
                    this.rampp = 2;
                }
                if (checkpoints.stage == 35 || checkpoints.stage == 54 || checkpoints.stage == 36 || checkpoints.stage == 8 || checkpoints.stage == 38 || checkpoints.stage == 50 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
                    this.rampp = 0;
                }
                if (this.cntrn == 0) {
                    this.agressed = false;
                    this.turntyp = (int)(this.m.random() * 4.0f);
                    if (checkpoints.stage == 13 && madness.im == 6) {
                        this.turntyp = 1;
                        if (this.attack == 0) {
                            this.agressed = true;
                        }
                    }
                    if (checkpoints.pos[0] - checkpoints.pos[madness.im] < 0) {
                        this.turntyp = (int)(this.m.random() * 2.0f);
                    }
                    if (checkpoints.stage == 47) {
                        this.turntyp = 2;
                    }
                    if (checkpoints.stage == 22) {
                        this.turntyp = 0;
                    }
                    if (checkpoints.stage == 27) {
                        this.turntyp = 1;
                    }
                    if (checkpoints.stage == 24 || checkpoints.stage == 57 || checkpoints.stage == 37) {
                        this.turntyp = 0;
                    }
                    if (this.attack != 0) {
                        this.turntyp = 2;
                        if (checkpoints.stage == 21 || checkpoints.stage == 25 || checkpoints.stage == 27 || checkpoints.stage == 42) {
                            this.turntyp = (int)(this.m.random() * 3.0f);
                        }
                        if (checkpoints.stage == 54 && checkpoints.clear[madness.im] - checkpoints.clear[0] >= 5) {
                            this.turntyp = 0;
                        }
                    }
                    if (checkpoints.stage == 16 || checkpoints.stage == 17 || checkpoints.stage == 21 || checkpoints.stage == 22 || checkpoints.stage == 25 || checkpoints.stage == 26 || checkpoints.stage == 24 || checkpoints.stage == 54 || checkpoints.stage == 42 || checkpoints.stage == 36 || checkpoints.stage == 29 || checkpoints.stage == 18 || checkpoints.stage == 65 || checkpoints.stage == 14 || checkpoints.stage == 57 || checkpoints.stage == 46 || checkpoints.stage == 8 || checkpoints.stage == 38 || checkpoints.stage == 37 || checkpoints.stage == 39 || checkpoints.stage == 62 || checkpoints.stage == 40 || checkpoints.stage == 31 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 51 || checkpoints.stage == 3 || checkpoints.stage == 56 || checkpoints.stage == 64 || checkpoints.stage == 53 || checkpoints.stage == 48 || checkpoints.stage == 52 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
                        this.agressed = true;
                    }
                    if (checkpoints.stage == 9 || checkpoints.stage == 41 || checkpoints.stage == 12 || checkpoints.stage == 50 || checkpoints.stage == 59) {
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
                if (checkpoints.stage == 1 || checkpoints.stage == 12) {
                    f = 0.9f;
                }
                if (checkpoints.stage == 2) {
                    f = 0.7f;
                }
                if (checkpoints.stage == 4) {
                    f = 0.4f;
                }
                this.mustland = f + (float)((double)(this.m.random() / 2.0f) - 0.25);
                f = 1.0f;
                if (checkpoints.stage == 1 || checkpoints.stage == 12) {
                    f = 5.0f;
                }
                if (checkpoints.stage == 2) {
                    f = 2.0f;
                }
                if (checkpoints.stage == 4) {
                    f = 1.5f;
                }
                if (madness.power > 50.0f) {
                    if (checkpoints.pos[0] - checkpoints.pos[madness.im] > 0) {
                        this.saftey = (int)((float)this.saftey * f);
                    } else {
                        this.mustland = 0.0f;
                    }
                } else {
                    this.mustland -= 0.5f;
                }
                if (checkpoints.stage == 47 || checkpoints.stage == 22 || checkpoints.stage == 26 || checkpoints.stage == 24 || checkpoints.stage == 18 || checkpoints.stage == 8 || checkpoints.stage == 38 || checkpoints.stage == 39 || checkpoints.stage == 62 || checkpoints.stage == 31 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 51 || checkpoints.stage == 3 || checkpoints.stage == 56 || checkpoints.stage == 50 || checkpoints.stage == 53 || checkpoints.stage == 48 || checkpoints.stage == 32 || checkpoints.stage == 52 || checkpoints.stage == 59 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
                    this.mustland = 0.0f;
                }
                this.stuntf = 0;
                if (checkpoints.stage == 47 && madness.pcleared == 57) {
                    this.stuntf = 1;
                }
                if (checkpoints.stage == 21 && madness.pcleared == 3) {
                    this.stuntf = 2;
                }
                if (checkpoints.stage == 22) {
                    if (checkpoints.pos[0] < checkpoints.pos[madness.im] || Math.abs(checkpoints.clear[0] - madness.clear) >= 2 || madness.clear < 2) {
                        this.stuntf = 4;
                        this.saftey = 10;
                    } else {
                        this.stuntf = 3;
                    }
                }
                if (checkpoints.stage == 25 && madness.pcleared == 21) {
                    this.stuntf = 1;
                }
                if (checkpoints.stage == 24) {
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
                if (checkpoints.stage == 54 || checkpoints.stage == 36) {
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
                if (checkpoints.stage == 13 && madness.im == 6 && (double)this.trickprf > 0.7) {
                    this.trickprf = 0.7f;
                }
                if (checkpoints.stage == 16 && (double)this.trickprf > 0.3) {
                    this.trickprf = 0.3f;
                }
                if (checkpoints.stage == 47 && (double)this.trickprf > 0.2) {
                    this.trickprf = 0.2f;
                }
                if (checkpoints.stage == 21) {
                    if ((double)this.trickprf > 0.5) {
                        this.trickprf = 0.5f;
                    }
                    if ((madness.im == 6 || madness.im == 5) && (double)this.trickprf > 0.3) {
                        this.trickprf = 0.3f;
                    }
                }
                if (checkpoints.stage == 25 && this.trickprf != -1.0f) {
                    this.trickprf *= 0.75f;
                }
                if (checkpoints.stage == 26 && (madness.pcleared == 55 || madness.pcleared == 7)) {
                    this.trickprf = -1.0f;
                    this.stuntf = 5;
                }
                if (checkpoints.stage == 27 && (double)this.trickprf > 0.4) {
                    this.trickprf = 0.4f;
                }
                if (checkpoints.stage == 24 && (double)this.trickprf > 0.5) {
                    this.trickprf = 0.5f;
                }
                if (checkpoints.stage == 42) {
                    this.trickprf = -1.0f;
                }
                this.usebounce = this.m.random() > madness.power / 100.0f;
                if (checkpoints.stage == 4 || checkpoints.stage == 16 || checkpoints.stage == 29 || checkpoints.stage == 65 || checkpoints.stage == 57 || checkpoints.stage == 12) {
                    this.usebounce = true;
                }
                if (checkpoints.stage == 22 || checkpoints.stage == 24 || checkpoints.stage == 9 || checkpoints.stage == 36 || checkpoints.stage == 41 || checkpoints.stage == 46 || checkpoints.stage == 38 || checkpoints.stage == 39 || checkpoints.stage == 62 || checkpoints.stage == 31 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 51 || checkpoints.stage == 3 || checkpoints.stage == 56 || checkpoints.stage == 64 || checkpoints.stage == 50 || checkpoints.stage == 53 || checkpoints.stage == 32 || checkpoints.stage == 52 || checkpoints.stage == 59 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
                    this.usebounce = false;
                }
                this.perfection = !(this.m.random() > (float)madness.hitmag / (float)madness.maxmag[madness.cn]);
                if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > 60.0f) {
                    this.perfection = true;
                }
                if (checkpoints.stage == 16 || checkpoints.stage == 47 || checkpoints.stage == 21 || checkpoints.stage == 22 || checkpoints.stage == 25 || checkpoints.stage == 26 || checkpoints.stage == 24 || checkpoints.stage == 54 || checkpoints.stage == 42 || checkpoints.stage == 9 || checkpoints.stage == 36 || checkpoints.stage == 29 || checkpoints.stage == 65 || checkpoints.stage == 41 || checkpoints.stage == 57 || checkpoints.stage == 46 || checkpoints.stage == 8 || checkpoints.stage == 38 || checkpoints.stage == 37 || checkpoints.stage == 39 || checkpoints.stage == 62 || checkpoints.stage == 40 || checkpoints.stage == 55 || checkpoints.stage == 43 || checkpoints.stage == 31 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 51 || checkpoints.stage == 3 || checkpoints.stage == 56 || checkpoints.stage == 64 || checkpoints.stage == 50 || checkpoints.stage == 53 || checkpoints.stage == 48 || checkpoints.stage == 32 || checkpoints.stage == 52 || checkpoints.stage == 59 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
                    this.perfection = true;
                }
                if (checkpoints.stage == 12) {
                    this.perfection = false;
                }
                this.perfection = checkpoints.stage != 14 || madness.cn == 9 || madness.cn == 38 || madness.cn == 39;
                if (this.attack == 0) {
                    boolean flag1 = true;
                    if (checkpoints.stage == 1 || checkpoints.stage == 13 || checkpoints.stage == 4 || checkpoints.stage == 21 || checkpoints.stage == 27 || checkpoints.stage == 54 || checkpoints.stage == 36 || checkpoints.stage == 65 || checkpoints.stage == 8) {
                        flag1 = this.afta;
                    }
                    if ((checkpoints.stage == 16 || checkpoints.stage == 47 || checkpoints.stage == 22 || checkpoints.stage == 24 || checkpoints.stage == 57 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 3 || checkpoints.stage == 52) && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                        flag1 = false;
                    }
                    boolean flag3 = false;
                    if (checkpoints.stage == 13 && madness.cn == 9) {
                        flag3 = true;
                    }
                    if (checkpoints.stage == 13 && madness.cn == 26) {
                        flag3 = true;
                    }
                    if (checkpoints.stage == 47 && madness.cn == 11) {
                        flag3 = true;
                    }
                    if (checkpoints.stage == 47 && madness.cn == 26) {
                        flag3 = true;
                    }
                    if (checkpoints.stage == 21 && checkpoints.clear[0] >= 20) {
                        flag3 = true;
                    }
                    if (checkpoints.stage == 25 || checkpoints.stage == 26 || checkpoints.stage == 27 || checkpoints.stage == 35 || checkpoints.stage == 54 || checkpoints.stage == 36 || checkpoints.stage == 38) {
                        flag3 = true;
                    }
                    int j2 = 60;
                    if (checkpoints.stage == 13 || checkpoints.stage == 47 || checkpoints.stage == 22 || checkpoints.stage == 25 || checkpoints.stage == 42) {
                        j2 = 30;
                    }
                    if ((checkpoints.stage == 2 || checkpoints.stage == 27) && madness.cn == 13) {
                        j2 = 50;
                    }
                    if ((checkpoints.stage == 2 || checkpoints.stage == 27) && madness.cn == 26) {
                        j2 = 50;
                    }
                    if ((checkpoints.stage == 2 || checkpoints.stage == 27) && madness.cn == 35) {
                        j2 = 50;
                    }
                    if (checkpoints.stage == 4) {
                        j2 = 20;
                    }
                    if (checkpoints.stage == 15 && madness.im != 6) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 17) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 47 && madness.cn == 11) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 47 && madness.cn == 26) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 47 && madness.cn == 35) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 21 && flag3) {
                        j2 = 30;
                    }
                    if (checkpoints.stage == 25 && this.bulistc) {
                        j2 = 30;
                    }
                    if (checkpoints.stage == 26) {
                        j2 = 50;
                    }
                    if (checkpoints.stage == 35 && this.bulistc) {
                        j2 = 40;
                    }
                    if (checkpoints.stage == 9 || checkpoints.stage == 29 || checkpoints.stage == 51) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 41) {
                        j2 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 45 && (madness.cn == 11 || madness.cn == 13 || madness.cn == 26)) {
                            j2 = 30;
                    }
                    if (checkpoints.stage == 57 && madness.cn == 26) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 57 && madness.cn == 35) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 62 && madness.cn == 26) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 62 && madness.cn != 26) {
                        j2 = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 66 || checkpoints.stage == 40 || checkpoints.stage == 55 || checkpoints.stage == 53 || checkpoints.stage == 68) {
                        j2 = madness.cn == 9 || madness.cn == 11 || madness.cn == 13 || madness.cn == 15 || madness.cn == 26 || madness.cn == 27 || madness.cn == 34 || madness.cn == 35 || madness.cn == 36 || madness.cn == 37 || madness.cn == 38 || madness.cn == 39 ? 0 : Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 60) {
                        j2 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 44 && madness.cn == 35) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 44 && madness.cn == 36) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 44 && madness.cn == 37) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 44 && madness.cn == 38) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 69 && madness.cn == 36) {
                        j2 = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 69 && madness.cn == 37) {
                        j2 = 0;
                    }
                    if (checkpoints.stage == 69 && madness.cn == 35) {
                        j2 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 70 && madness.cn == 38) {
                        j2 = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 70 && madness.cn != 38) {
                        j2 = 0;
                        this.attack = Integer.MAX_VALUE;
                    }
                    if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                        if (madness.cn == 11 && checkpoints.clear[0] == 27) {
                            j2 = 0;
                        }
                        if (madness.cn == 26 && checkpoints.clear[0] == 27) {
                            j2 = 0;
                        }
                        if (madness.cn == 9 || madness.cn == 15) {
                            j2 = 50;
                        }
                        if (madness.cn == 11 || madness.cn == 26) {
                            j2 = 40;
                        }
                        if (checkpoints.pos[0] > checkpoints.pos[madness.im]) {
                            j2 = 80;
                        }
                    }
                    if (checkpoints.stage != 9 && checkpoints.stage != 29 && checkpoints.stage != 53 && (madness.cn == 17 || madness.cn == 19 || madness.cn == 21 || madness.cn == 33)) {
                        j2 = Integer.MAX_VALUE;
                    }
                    if (madness.cn == 37 || madness.cn == 39) {
                        j2 = 0;
                    }
                    int i4 = 0;
                    do {
                        if (i4 != madness.im && checkpoints.clear[i4] != -1) {
                            int i8;
                            int l5 = conto.xz;
                            if (this.zyinv) {
                                l5 += 180;
                            }
                            while (l5 < 0) {
                                l5 += 360;
                            }
                            while (l5 > 180) {
                                l5 -= 360;
                            }
                            int c4 = 0;
                            if (checkpoints.opx[i4] - conto.x >= 0) {
                                c4 = 180;
                            }
                            for (i8 = (int)((double)(90 + c4) + Math.atan((double)(checkpoints.opz[i4] - conto.z) / (double)(checkpoints.opx[i4] - conto.x)) / (Math.PI / 180)); i8 < 0; i8 += 360) {
                            }
                            while (i8 > 180) {
                                i8 -= 360;
                            }
                            int k8 = Math.abs(l5 - i8);
                            if (k8 > 180) {
                                k8 = Math.abs(k8 - 360);
                            }
                            int l8 = 2000 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                            if (checkpoints.stage == 13 && madness.cn == 9 && l8 < 12000) {
                                l8 = 12000;
                            }
                            if (checkpoints.stage == 13 && madness.cn == 26 && l8 < 12000) {
                                l8 = 12000;
                            }
                            if (checkpoints.stage == 4 && l8 < 4000) {
                                l8 = 4000;
                            }
                            if (checkpoints.stage == 47 && madness.cn == 11) {
                                if (l8 < 12000) {
                                    l8 = 12000;
                                }
                                k8 = 10;
                            }
                            if (checkpoints.stage == 47 && madness.cn == 26) {
                                if (l8 < 12000) {
                                    l8 = 12000;
                                }
                                k8 = 10;
                            }
                            if (checkpoints.stage == 21 && (madness.pcleared == 13 || madness.pcleared == 33 || flag3) && l8 < 12000) {
                                l8 = 12000;
                            }
                            if (checkpoints.stage == 25) {
                                if (this.bulistc) {
                                    l8 = 8000;
                                    k8 = 10;
                                    this.afta = true;
                                } else if (l8 < 6000) {
                                    l8 = 6000;
                                }
                            }
                            if (checkpoints.stage == 26 && this.bulistc) {
                                l8 = 6000;
                                k8 = 10;
                            }
                            if (checkpoints.stage == 27) {
                                l8 = 21000;
                            }
                            if (checkpoints.stage == 35 || checkpoints.stage == 38) {
                                l8 *= Math.abs(checkpoints.clear[i4] - madness.clear) + 1;
                                if (this.bulistc) {
                                    l8 = 4000 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                                    k8 = 10;
                                }
                            }
                            if (checkpoints.stage == 22) {
                                l8 = 16000;
                            }
                            if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                                if (madness.cn == 13 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        l8 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        l8 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkpoints.clear[0] >= 14) {
                                        l8 = 60000;
                                    }
                                    k8 = 10;
                                }
                                if (madness.cn == 26 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        l8 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        l8 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkpoints.clear[0] >= 14) {
                                        l8 = 60000;
                                    }
                                    k8 = 10;
                                }
                                if (madness.cn == 35 && this.bulistc) {
                                    if (this.oupnt == 33) {
                                        l8 = 17000;
                                    }
                                    if (this.oupnt == 51) {
                                        l8 = 30000;
                                    }
                                    if (this.oupnt == 15 && checkpoints.clear[0] >= 14) {
                                        l8 = 60000;
                                    }
                                    k8 = 10;
                                }
                                if (madness.cn == 9 || madness.cn == 15 || madness.cn == 37 || madness.cn == 39) {
                                    l8 *= Math.abs(checkpoints.clear[i4] - madness.clear) + 1;
                                }
                                if (madness.cn == 11) {
                                    l8 = 4000 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                                }
                                if (madness.cn == 26) {
                                    l8 = 4000 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                                }
                            }
                            int i9 = 85 + 15 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                            if (checkpoints.stage == 27) {
                                i9 = 45;
                            }
                            if (checkpoints.stage == 54 && (madness.cn == 9 || madness.cn == 11 || madness.cn == 14 || madness.cn == 15)) {
                                i9 = 50 + 70 * Math.abs(checkpoints.clear[i4] - madness.clear);
                            }
                            if (checkpoints.stage == 36 && (madness.cn == 9 || madness.cn == 11 || madness.cn == 14 || madness.cn == 15)) {
                                i9 = 50 + 70 * Math.abs(checkpoints.clear[i4] - madness.clear);
                            }
                            if (k8 < i9 && this.py(conto.x / 100, checkpoints.opx[i4] / 100, conto.z / 100, checkpoints.opz[i4] / 100) < l8 && this.afta && madness.power > (float)j2) {
                                float f1 = 35 - Math.abs(checkpoints.clear[i4] - madness.clear) * 10;
                                if (f1 < 1.0f) {
                                    f1 = 1.0f;
                                }
                                float f2 = (float)((checkpoints.pos[madness.im] + 1) * (5 - checkpoints.pos[i4])) / f1;
                                if (checkpoints.stage != 42 && (double)f2 > 0.7) {
                                    f2 = 0.7f;
                                }
                                if (i4 != 0 && checkpoints.pos[0] < checkpoints.pos[madness.im]) {
                                    f2 = 0.0f;
                                }
                                if (i4 != 0 && flag3) {
                                    f2 = 0.0f;
                                }
                                if (checkpoints.stage == 13) {
                                    f2 = madness.cn == 9 || madness.cn == 26 || madness.cn == 35 || madness.cn == 37 || madness.cn == 39 || madness.cn == 13 && this.bulistc ? (f2 *= 2.0f) : (f2 *= 0.5f);
                                }
                                if (checkpoints.stage == 16 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                    f2 = 0.0f;
                                }
                                if (checkpoints.stage == 17 && madness.im == 6 && i4 == 0) {
                                    f2 = (float)((double)f2 * 1.5);
                                }
                                if (checkpoints.stage == 9 && madness.im == 6 && i4 == 0) {
                                    f2 = (float)((double)f2 * 1.5);
                                }
                                if (checkpoints.stage == 47) {
                                    f2 = madness.cn == 11 || madness.cn == 35 || madness.cn == 37 || madness.cn == 39 || madness.cn == 13 && this.bulistc || madness.cn == 26 && this.bulistc ? (f2 *= 1.5f) : 0.0f;
                                }
                                if (checkpoints.stage == 21) {
                                    if (i4 != 0) {
                                        f2 = (float)((double)f2 * 0.5);
                                    }
                                    if (madness.pcleared != 13 && madness.pcleared != 33 && !flag3) {
                                        f2 *= 0.5f;
                                    }
                                    if ((madness.im == 6 || madness.im == 5) && i4 != 0) {
                                        f2 = 0.0f;
                                    }
                                }
                                if (checkpoints.stage == 22 && !this.bulistc) {
                                    f2 = 0.0f;
                                }
                                if (checkpoints.stage == 25 && this.bulistc && i4 == 0) {
                                    f2 = 1.0f;
                                }
                                if (checkpoints.stage == 26) {
                                    if (madness.cn != 11 && madness.cn != 13 && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                        f2 = 0.0f;
                                    }
                                    if (madness.cn == 13 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                    if (madness.cn == 26 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                    if (madness.cn == 35 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                }
                                if ((checkpoints.stage == 24 || checkpoints.stage == 57 || checkpoints.stage == 61 || checkpoints.stage == 34 || checkpoints.stage == 3 || checkpoints.stage == 52) && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                                    f2 = 0.0f;
                                }
                                if (checkpoints.stage == 35 || checkpoints.stage == 38) {
                                    if (checkpoints.pos[madness.im] == 0) {
                                        f2 = (float)((double)f2 * 0.5);
                                    }
                                    if (checkpoints.pos[0] < checkpoints.pos[madness.im]) {
                                        f2 *= 2.0f;
                                    }
                                    if (this.bulistc && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                }
                                if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                                    if (madness.cn != 14 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                                        if (checkpoints.pos[0] < checkpoints.pos[madness.im] && checkpoints.clear[0] - checkpoints.clear[madness.im] != 1) {
                                            f2 *= 2.0f;
                                        }
                                    } else {
                                        f2 = (float)((double)f2 * 0.5);
                                    }
                                    if (madness.cn == 13 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                    if (madness.cn == 26 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                    if (madness.cn == 35 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                    if (checkpoints.pos[madness.im] == 0 || checkpoints.pos[madness.im] == 1 && checkpoints.pos[0] == 0) {
                                        f2 = 0.0f;
                                    }
                                    if (checkpoints.clear[madness.im] - checkpoints.clear[0] >= 5 && i4 == 0) {
                                        f2 = 1.0f;
                                    }
                                }
                                if (checkpoints.stage == 41) {
                                    f2 *= 0.0f;
                                }
                                if (checkpoints.stage == 9 || checkpoints.stage == 29 || checkpoints.stage == 44) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 62 && madness.cn == 26) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 62 && madness.cn != 26) {
                                    f2 *= 0.0f;
                                }
                                if (checkpoints.stage == 66 || checkpoints.stage == 40 || checkpoints.stage == 55 || checkpoints.stage == 53) {
                                    f2 = madness.cn == 9 || madness.cn == 11 || madness.cn == 13 || madness.cn == 15 || madness.cn == 26 || madness.cn == 27 || madness.cn == 34 || madness.cn == 35 || madness.cn == 36 || madness.cn == 37 || madness.cn == 38 || madness.cn == 39 ? (f2 *= Float.POSITIVE_INFINITY) : (f2 *= 0.0f);
                                }
                                if (checkpoints.stage == 60) {
                                    f2 *= 0.0f;
                                }
                                if (checkpoints.stage == 68 && madness.cn == 35) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 69 && madness.cn != 35) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 70 && madness.cn == 35) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 70 && madness.cn == 36) {
                                    f2 *= 0.0f;
                                }
                                if (madness.cn == 37 || madness.cn == 39) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 70 && madness.cn == 37) {
                                    f2 *= 0.0f;
                                }
                                if (checkpoints.stage != 9 && checkpoints.stage != 29 && checkpoints.stage != 41 && (madness.cn == 10 || madness.cn == 12 || madness.cn == 17 || madness.cn == 19 || madness.cn == 21 || madness.cn == 33)) {
                                    f2 = 0.0f;
                                }
                                if (madness.cn == 39 && checkpoints.stage != 41 && checkpoints.stage != 52 && checkpoints.stage != 60) {
                                    f2 *= Float.POSITIVE_INFINITY;
                                }
                                if (checkpoints.stage == 30 && madness.cn != 22) {
                                    if (i4 == 0) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = 0.0f;
                                    }
                                }
                                if (checkpoints.stage == 34 && (madness.cn == 11 || madness.cn == 13)) {
                                    if (i4 == 0) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = 0.0f;
                                    }
                                }

                                if (checkpoints.stage == 45 && (madness.cn == 11 || madness.cn == 13 || madness.cn == 26)) {

                                    if (i4 == 0) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = 0.0f;
                                    }
                                }
                                if (this.m.random() < f2) {
                                    this.attack = 40 * (Math.abs(checkpoints.clear[i4] - madness.clear) + 1);
                                    if (this.attack > 500) {
                                        this.attack = 500;
                                    }
                                    this.aim = 0.0f;
                                    if (checkpoints.stage == 13 && madness.im == 6 && this.m.random() > this.m.random()) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkpoints.stage == 4) {
                                        this.aim = i4 == 0 && checkpoints.pos[0] < checkpoints.pos[madness.im] ? 1.5f : this.m.random();
                                    }
                                    if (checkpoints.stage == 15) {
                                        this.aim = this.m.random() * 1.5f;
                                    }
                                    if (checkpoints.stage == 17 && madness.im != 6 && (this.m.random() > this.m.random() || checkpoints.pos[0] < checkpoints.pos[madness.im])) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkpoints.stage == 9 && madness.im != 6 && (this.m.random() > this.m.random() || checkpoints.pos[0] < checkpoints.pos[madness.im])) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkpoints.stage == 47 && madness.cn == 11 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkpoints.stage == 47 && madness.cn == 26 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkpoints.stage == 47 && madness.cn == 28 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkpoints.stage == 47 && madness.cn == 35 && this.m.random() > this.m.random()) {
                                        this.aim = 0.76f + this.m.random() * 0.76f;
                                    }
                                    if (checkpoints.stage == 21 && (madness.pcleared == 13 || madness.pcleared == 33)) {
                                        this.aim = 1.0f;
                                    }
                                    if (checkpoints.stage == 25) {
                                        if (this.bulistc) {
                                            this.aim = 0.7f;
                                            if (this.attack > 150) {
                                                this.attack = 150;
                                            }
                                        } else {
                                            this.aim = this.m.random();
                                        }
                                    }
                                    if (checkpoints.stage == 26) {
                                        if (this.m.random() > this.m.random()) {
                                            this.aim = 0.7f;
                                        }
                                        if (this.bulistc && this.attack > 150) {
                                            this.attack = 150;
                                        }
                                    }
                                    if (checkpoints.stage == 27 && this.attack > 60) {
                                        this.attack = 60;
                                    }
                                    if (checkpoints.stage == 35 || checkpoints.stage == 38) {
                                        this.aim = this.m.random() * 1.5f;
                                        this.attack /= 2;
                                        this.exitattack = this.m.random() > this.m.random();
                                    }
                                    if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                                        if (madness.cn == 13 || madness.cn == 26 || madness.cn == 35) {
                                            this.aim = 0.76f;
                                            this.attack = 150;
                                        } else {
                                            this.aim = this.m.random() * 1.5f;
                                            if (Math.abs(checkpoints.clear[i4] - madness.clear) <= 2 || madness.cn == 14) {
                                                this.attack /= 3;
                                            }
                                        }
                                    }
                                    this.acr = i4;
                                    this.turntyp = (int)(1.0f + this.m.random() * 2.0f);
                                }
                            }
                            if (flag1 && k8 > 100 && this.py(conto.x / 100, checkpoints.opx[i4] / 100, conto.z / 100, checkpoints.opz[i4] / 100) < 300 && (double)this.m.random() > 0.6 - (double)((float)checkpoints.pos[madness.im] / 10.0f)) {
                                this.clrnce = 0;
                                this.acuracy = 0;
                            }
                        }
                        if (checkpoints.stage != 52 && checkpoints.stage != 60) continue;
                        flag1 = false;
                    } while (++i4 < 7);
                }
                boolean flag2 = false;
                if (checkpoints.stage == 16 || checkpoints.stage == 22 || checkpoints.stage == 25 || checkpoints.stage == 42) {
                    flag2 = true;
                }
                if (checkpoints.stage == 47 && madness.pcleared != 73) {
                    flag2 = true;
                }
                if (this.trfix != 3) {
                    this.trfix = 0;
                    int j1 = 50;
                    if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                        j1 = 40;
                    }
                    if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > (float)j1 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
                        this.trfix = 1;
                    }
                    if (!flag2) {
                        int k2 = 80;
                        if (checkpoints.stage == 47 && madness.cn != 11 && madness.cn != 26 && madness.cn != 35 && madness.cn != 37 && madness.cn != 39) {
                            k2 = 50;
                        }
                        if (checkpoints.stage == 21) {
                            k2 = 70;
                        }
                        if (checkpoints.stage == 35 && madness.pcleared == 91) {
                            k2 = 50;
                        }
                        if (checkpoints.stage == 54 && checkpoints.clear[madness.im] - checkpoints.clear[0] >= 5 && madness.cn != 10 && madness.cn != 12 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                            k2 = 50;
                        }
                        if (checkpoints.stage == 36 && checkpoints.clear[madness.im] - checkpoints.clear[0] >= 5 && madness.cn != 10 && madness.cn != 12 && madness.cn != 17 && madness.cn != 19 && madness.cn != 21 && madness.cn != 33) {
                            k2 = 50;
                        }
                        if (100.0f * (float)madness.hitmag / (float)madness.maxmag[madness.cn] > (float)k2 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
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
                    if (checkpoints.stage == 47 && madness.cn == 11 && madness.pcleared == 35) {
                        madness.pcleared = 73;
                        madness.clear = 0;
                        this.bulistc = true;
                        this.runbul = (int)(100.0f * this.m.random());
                        
                    }

                    if (checkpoints.stage == 47 && madness.cn == 28 && madness.pcleared == 35) {
                        madness.pcleared = 73;
                        madness.clear = 0;
                        this.bulistc = true;
                        this.runbul = (int)(100.0f * this.m.random());
                    }
                    if (checkpoints.stage == 47 && madness.cn == 26 && madness.pcleared == 35) {
                        madness.pcleared = 73;
                        madness.clear = 0;
                        this.bulistc = true;
                        this.runbul = (int)(100.0f * this.m.random());
                    }

                    if (checkpoints.stage == 18 && madness.cn == 11) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 18 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 18 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 18 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 25 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 25 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 25 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 26 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 26 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 26 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 30 && madness.cn != 22) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 35 && checkpoints.clear[0] - madness.clear >= 3 && this.trfix == 0) {
                        this.bulistc = true;
                        this.oupnt = -1;
                    }
                    if (checkpoints.stage == 45 && (madness.cn == 11 || madness.cn == 13 || madness.cn == 26)) {
                        this.bulistc = true;
}
                    if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                        if (madness.cn == 13 && checkpoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 26 && checkpoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 35 && checkpoints.pcleared == 8) {
                            this.bulistc = true;
                            this.attack = 0;
                        }
                        if (madness.cn == 11 && checkpoints.clear[0] - madness.clear >= 2 && this.trfix == 0) {
                            this.bulistc = true;
                            this.oupnt = -1;
                        }
                    }
                    if (checkpoints.stage == 64 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 50 && madness.cn == 13) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 50 && madness.cn == 26) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 50 && madness.cn == 35) {
                        this.bulistc = true;
                    }
                    if ((checkpoints.stage == 2 || checkpoints.stage == 13 || checkpoints.stage == 4 || checkpoints.stage == 15 || checkpoints.stage == 47 || checkpoints.stage == 22 || checkpoints.stage == 27 || checkpoints.stage == 64) && madness.cn == 13 && Math.abs(checkpoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                    if ((checkpoints.stage == 2 || checkpoints.stage == 13 || checkpoints.stage == 4 || checkpoints.stage == 15 || checkpoints.stage == 47 || checkpoints.stage == 22 || checkpoints.stage == 27 || checkpoints.stage == 64) && madness.cn == 35 && Math.abs(checkpoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                    if (checkpoints.stage == 22 && madness.cn == 37 && Math.abs(checkpoints.clear[0] - madness.clear) >= 2) {
                        this.bulistc = true;
                    }
                } else if (checkpoints.stage == 47) {
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
            boolean flag = false;
            flag = this.usebounce ? madness.wtouch : madness.mtouch;
            if (flag) {
                if (this.trickfase != 0) {
                    this.trickfase = 0;
                }
                if (checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68 && (this.trfix == 2 || this.trfix == 3)) {
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
                    int i = madness.point;
                    int k1 = 50;
                    if (checkpoints.stage == 47) {
                        k1 = 20;
                    }
                    if (checkpoints.stage == 35) {
                        k1 = 40;
                    }
                    if (checkpoints.stage == 38) {
                        k1 = 40;
                    }
                    if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                        k1 = 20;
                    }
                    if (!this.bulistc || this.trfix == 2 || this.trfix == 3 || this.trfix == 4 || madness.power < (float)k1) {
                        if (this.rampp == 1 && checkpoints.typ[i] <= 0) {
                            int l2 = i + 1;
                            if (l2 == checkpoints.n) {
                                l2 = 0;
                            }
                            if (checkpoints.typ[l2] == -2) {
                                i = l2;
                            }
                        }
                        if (this.rampp == -1 && checkpoints.typ[i] == -2 && ++i == checkpoints.n) {
                            i = 0;
                        }
                        if (this.m.random() > this.skiplev) {
                            int i3 = i;
                            boolean flag5 = false;
                            if (checkpoints.typ[i3] > 0) {
                                int i6 = 0;
                                for (int i7 = 0; i7 < checkpoints.n; ++i7) {
                                    if (checkpoints.typ[i7] <= 0 || i7 >= i3) continue;
                                    ++i6;
                                }
                                boolean bl = flag5 = madness.clear != i6 + madness.nlaps * checkpoints.nsp;
                            }
                            while (checkpoints.typ[i3] == 0 || checkpoints.typ[i3] == -1 || checkpoints.typ[i3] == -3 || flag5) {
                                i = i3++;
                                if (i3 == checkpoints.n) {
                                    i3 = 0;
                                }
                                flag5 = false;
                                if (checkpoints.typ[i3] <= 0) continue;
                                int j6 = 0;
                                for (int j7 = 0; j7 < checkpoints.n; ++j7) {
                                    if (checkpoints.typ[j7] <= 0 || j7 >= i3) continue;
                                    ++j6;
                                }
                                flag5 = madness.clear != j6 + madness.nlaps * checkpoints.nsp;
                            }
                        } else if (this.m.random() > this.skiplev) {
                            while (checkpoints.typ[i] == -1) {
                                if (++i != checkpoints.n) continue;
                                i = 0;
                            }
                        }
                        if (checkpoints.stage == 47 && madness.pcleared == 73 && this.trfix == 0 && madness.clear != 0) {
                            i = 10;
                        }
                        if (checkpoints.stage == 21 && madness.pcleared == 18 && this.trfix == 0) {
                            i = 27;
                        }
                        if (checkpoints.stage == 25) {
                            if (madness.pcleared == 5 && this.trfix == 0 && madness.power < 70.0f) {
                                i = i <= 16 ? 16 : 21;
                            }
                            if (madness.pcleared == 50) {
                                i = 57;
                            }
                        }
                        if (checkpoints.stage == 26 && (madness.pcleared == 27 || madness.pcleared == 37)) {
                            while (checkpoints.typ[i] == -1) {
                                if (++i != checkpoints.n) continue;
                                i = 0;
                            }
                        }
                        if (checkpoints.stage == 27) {
                            while (checkpoints.typ[i] == -1) {
                                if (++i != checkpoints.n) continue;
                                i = 0;
                            }
                        }
                        if (checkpoints.stage == 24) {
                            while (checkpoints.typ[i] == -1) {
                                if (++i != checkpoints.n) continue;
                                i = 0;
                            }
                            if (!madness.gtouch) {
                                while (checkpoints.typ[i] == -2) {
                                    if (++i != checkpoints.n) continue;
                                    i = 0;
                                }
                            }
                            if (this.oupnt >= 68) {
                                i = 70;
                            } else {
                                this.oupnt = i;
                            }
                        }
                        if (checkpoints.stage == 35) {
                            if (madness.pcleared != 91 && checkpoints.pos[0] < checkpoints.pos[madness.im] && madness.cn != 13 || checkpoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkpoints.typ[i] == -4) {
                                    if (++i != checkpoints.n) continue;
                                    i = 0;
                                }
                            }
                            if (madness.pcleared != 91 && checkpoints.pos[0] < checkpoints.pos[madness.im] && madness.cn != 26 || checkpoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkpoints.typ[i] == -4) {
                                    if (++i != checkpoints.n) continue;
                                    i = 0;
                                }
                            }
                            if (madness.pcleared != 91 && checkpoints.pos[0] < checkpoints.pos[madness.im] && madness.cn != 35 || checkpoints.pos[madness.im] == 0 && (madness.clear == 12 || madness.clear == 20)) {
                                while (checkpoints.typ[i] == -4) {
                                    if (++i != checkpoints.n) continue;
                                    i = 0;
                                }
                            }
                            if (madness.pcleared == 9) {
                                if (this.py(conto.x / 100, 297, conto.z / 100, 347) < 400) {
                                    this.oupnt = 1;
                                }
                                if (this.oupnt == 1 && i < 22) {
                                    i = 22;
                                }
                            }
                            if (madness.pcleared == 67) {
                                if (this.py(conto.x / 100, 28, conto.z / 100, 494) < 4000) {
                                    this.oupnt = 2;
                                }
                                if (this.oupnt == 2) {
                                    i = 76;
                                }
                            }
                            if (madness.pcleared == 76) {
                                if (this.py(conto.x / 100, -50, conto.z / 100, 0) < 2000) {
                                    this.oupnt = 3;
                                }
                                i = this.oupnt == 3 ? 91 : 89;
                            }
                        }
                        if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                            if (madness.pcleared == 128) {
                                if (this.py(conto.x / 100, 0, conto.z / 100, 229) < 1500 || conto.z > 23000) {
                                    this.oupnt = 128;
                                }
                                if (this.oupnt != 128) {
                                    i = 3;
                                }
                            }
                            if (madness.pcleared == 8) {
                                if (this.py(conto.x / 100, -207, conto.z / 100, 549) < 1500 || conto.x < -20700) {
                                    this.oupnt = 8;
                                }
                                if (this.oupnt != 8) {
                                    i = 12;
                                }
                            }
                            if (madness.pcleared == 33) {
                                if (this.py(conto.x / 100, -60, conto.z / 100, 168) < 250 || conto.z > 17000) {
                                    this.oupnt = 331;
                                }
                                if (this.py(conto.x / 100, -112, conto.z / 100, 414) < 10000 || conto.z > 40000) {
                                    this.oupnt = 332;
                                }
                                if (this.oupnt != 331 && this.oupnt != 332) {
                                    i = this.trfix != 1 ? 38 : 39;
                                }
                                if (this.oupnt == 331) {
                                    i = 71;
                                }
                            }
                            if (madness.pcleared == 42) {
                                if (this.py(conto.x / 100, -269, conto.z / 100, 493) < 100 || conto.x < -27000) {
                                    this.oupnt = 142;
                                }
                                if (this.oupnt != 142) {
                                    i = 47;
                                }
                            }
                            if (madness.pcleared == 51) {
                                if (this.py(conto.x / 100, -352, conto.z / 100, 260) < 100 || conto.z < 25000) {
                                    this.oupnt = 511;
                                }
                                if (this.py(conto.x / 100, -325, conto.z / 100, 10) < 2000 || conto.x > -32000) {
                                    this.oupnt = 512;
                                }
                                if (this.oupnt != 511 && this.oupnt != 512) {
                                    i = 80;
                                }
                                if (this.oupnt == 511) {
                                    i = 61;
                                }
                            }
                            if (madness.pcleared == 77) {
                                if (this.py(conto.x / 100, -371, conto.z / 100, 319) < 100 || conto.z < 31000) {
                                    this.oupnt = 77;
                                }
                                if (this.oupnt != 77) {
                                    i = 78;
                                    madness.nofocus = true;
                                }
                            }
                            if (madness.pcleared == 105) {
                                if (this.py(conto.x / 100, -179, conto.z / 100, 10) < 2300 || conto.z < 1050) {
                                    this.oupnt = 105;
                                }
                                i = this.oupnt != 105 ? 65 : 125;
                            }
                            if (this.trfix == 3 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
                                if (this.py(conto.x / 100, -52, conto.z / 100, 448) < 100 || conto.z > 45000) {
                                    this.oupnt = 176;
                                }
                                i = this.oupnt != 176 ? 41 : 43;
                            }
                            if (checkpoints.clear[madness.im] - checkpoints.clear[0] >= 2 && this.py(conto.x / 100, checkpoints.opx[0] / 100, conto.z / 100, checkpoints.opz[0] / 100) < 1000 + this.avoidnlev) {
                                int k7;
                                int j4 = conto.xz;
                                if (this.zyinv) {
                                    j4 += 180;
                                }
                                while (j4 < 0) {
                                    j4 += 360;
                                }
                                while (j4 > 180) {
                                    j4 -= 360;
                                }
                                int c3 = 0;
                                if (checkpoints.opx[0] - conto.x >= 0) {
                                    c3 = 180;
                                }
                                for (k7 = (int)((double)(90 + c3) + Math.atan((double)(checkpoints.opz[0] - conto.z) / (double)(checkpoints.opx[0] - conto.x)) / (Math.PI / 180)); k7 < 0; k7 += 360) {
                                }
                                while (k7 > 180) {
                                    k7 -= 360;
                                }
                                int j8 = Math.abs(j4 - k7);
                                if (j8 > 180) {
                                    j8 = Math.abs(j8 - 360);
                                }
                                if (j8 < 90) {
                                    this.wall = 0;
                                }
                            }
                        }
                        if (this.rampp == 2) {
                            int j3 = i + 1;
                            if (j3 == checkpoints.n) {
                                j3 = 0;
                            }
                            if (checkpoints.typ[j3] == -2 && i != madness.point && --i < 0) {
                                i += checkpoints.n;
                            }
                        }
                        if (this.bulistc) {
                            madness.nofocus = true;
                            if (this.gowait) {
                                this.gowait = false;
                            }
                        }
                    } else {
                        if (checkpoints.stage != 35 && checkpoints.stage != 54 && checkpoints.stage != 36 || this.runbul == 0) {
                            if ((i -= 2) < 0) {
                                i += checkpoints.n;
                            }
                            while (checkpoints.typ[i] == -4) {
                                if (--i >= 0) continue;
                                i += checkpoints.n;
                            }
                        }
                        if (checkpoints.stage == 25) {
                            if (i >= 14 && i <= 19) {
                                i = 13;
                            }
                            if (this.oupnt == 72 && i != 56) {
                                i = 57;
                            } else if (this.oupnt == 54 && i != 52) {
                                i = 53;
                            } else if (this.oupnt == 39 && i != 37) {
                                i = 38;
                            } else {
                                this.oupnt = i;
                            }
                        }
                        if (checkpoints.stage == 26) {
                            if (!this.gowait) {
                                if (checkpoints.clear[0] == 0) {
                                    this.wtx = -3500;
                                    this.wtz = 19000;
                                    this.frx = -3500;
                                    this.frz = 39000;
                                    this.frad = 12000;
                                    this.oupnt = 37;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkpoints.clear[0] == 7) {
                                    this.wtx = -44800;
                                    this.wtz = 40320;
                                    this.frx = -44800;
                                    this.frz = 34720;
                                    this.frad = 30000;
                                    this.oupnt = 27;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkpoints.clear[0] == 10) {
                                    this.wtx = 0;
                                    this.wtz = 48739;
                                    this.frx = 0;
                                    this.frz = 38589;
                                    this.frad = 90000;
                                    this.oupnt = 55;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkpoints.clear[0] == 14) {
                                    this.wtx = -3500;
                                    this.wtz = 19000;
                                    this.frx = -14700;
                                    this.frz = 39000;
                                    this.frad = 45000;
                                    this.oupnt = 37;
                                    this.gowait = true;
                                    this.afta = false;
                                }
                                if (checkpoints.clear[0] == 18) {
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
                                if (this.py(conto.x / 100, this.wtx / 100, conto.z / 100, this.wtz / 100) < 10000 && madness.speed > 50.0f) {
                                    this.up = false;
                                }
                                if (this.py(conto.x / 100, this.wtx / 100, conto.z / 100, this.wtz / 100) < 200) {
                                    this.up = false;
                                    this.handb = true;
                                }
                                if (checkpoints.pcleared == this.oupnt && this.py(checkpoints.opx[0] / 100, this.frx / 100, checkpoints.opz[0] / 100, this.frz / 100) < this.frad) {
                                    this.afta = true;
                                    this.gowait = false;
                                }
                                if (this.py(conto.x / 100, checkpoints.opx[0] / 100, conto.z / 100, checkpoints.opz[0] / 100) < 25) {
                                    this.afta = true;
                                    this.gowait = false;
                                    this.attack = 200;
                                    this.acr = 0;
                                }
                            }
                        }
                        if (checkpoints.stage == 35) {
                            if (this.oupnt == -1) {
                                int k3 = -10;
                                for (int k4 = 0; k4 < checkpoints.n; ++k4) {
                                    if (checkpoints.typ[k4] != -2 && checkpoints.typ[k4] != -4 || k4 >= 50 && k4 <= 54 || this.py(conto.x / 100, checkpoints.x[k4] / 100, conto.z / 100, checkpoints.z[k4] / 100) >= k3 && k3 != -10) continue;
                                    k3 = this.py(conto.x / 100, checkpoints.x[k4] / 100, conto.z / 100, checkpoints.z[k4] / 100);
                                    this.oupnt = k4;
                                }
                                --this.oupnt;
                                if (i < 0) {
                                    this.oupnt += checkpoints.n;
                                }
                            }
                            if (this.oupnt >= 0 && this.oupnt < checkpoints.n && this.py(conto.x / 100, checkpoints.x[i = this.oupnt] / 100, conto.z / 100, checkpoints.z[i] / 100) < 800) {
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
                        if (checkpoints.stage == 54) {
                            boolean flag4 = false;
                            if (madness.cn == 13 || madness.cn == 26 || madness.cn == 35 || madness.cn == 39) {
                                if (!this.gowait) {
                                    if (checkpoints.clear[0] == 1) {
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
                                    if (checkpoints.clear[0] == 4) {
                                        this.wtx = -12700;
                                        this.wtz = 14000;
                                        this.frx = -31000;
                                        this.frz = 1050;
                                        this.frad = 11000;
                                        this.oupnt = 51;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkpoints.clear[0] == 14) {
                                        this.wtx = -35350;
                                        this.wtz = 6650;
                                        this.frx = -48300;
                                        this.frz = 54950;
                                        this.frad = 11000;
                                        this.oupnt = 15;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkpoints.clear[0] == 17) {
                                        this.wtx = -42700;
                                        this.wtz = 41000;
                                        this.frx = -40950;
                                        this.frz = 49350;
                                        this.frad = 7000;
                                        this.oupnt = 42;
                                        this.gowait = true;
                                        this.afta = false;
                                    }
                                    if (checkpoints.clear[0] == 21) {
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
                                    if (this.py(conto.x / 100, this.wtx / 100, conto.z / 100, this.wtz / 100) < 10000 && madness.speed > 50.0f) {
                                        this.up = false;
                                    }
                                    if (this.py(conto.x / 100, this.wtx / 100, conto.z / 100, this.wtz / 100) < 200) {
                                        this.up = false;
                                        this.handb = true;
                                    }
                                    if (checkpoints.pcleared == this.oupnt && this.py(checkpoints.opx[0] / 100, this.frx / 100, checkpoints.opz[0] / 100, this.frz / 100) < this.frad) {
                                        this.runbul = 0;
                                        this.afta = true;
                                        this.gowait = false;
                                    }
                                    if (this.py(conto.x / 100, checkpoints.opx[0] / 100, conto.z / 100, checkpoints.opz[0] / 100) < 25) {
                                        this.afta = true;
                                        this.gowait = false;
                                        this.attack = 200;
                                        this.acr = 0;
                                    }
                                    if (checkpoints.clear[0] == 21 && this.oupnt != 125) {
                                        this.gowait = false;
                                    }
                                }
                                if (checkpoints.clear[0] >= 11 && !this.gowait || madness.power < 60.0f && checkpoints.clear[0] < 21) {
                                    flag4 = true;
                                    if (!this.exitattack) {
                                        this.oupnt = -1;
                                        this.exitattack = true;
                                    }
                                } else if (this.exitattack) {
                                    this.exitattack = false;
                                }
                            }
                            if (madness.cn == 11 || madness.cn == 26) {
                                flag4 = true;
                            }
                            if (flag4) {
                                if (this.oupnt == -1) {
                                    int l4 = -10;
                                    for (int k6 = 0; k6 < checkpoints.n; ++k6) {
                                        if (checkpoints.typ[k6] != -4 || !(this.py(conto.x / 100, checkpoints.x[k6] / 100, conto.z / 100, checkpoints.z[k6] / 100) < l4 && (double)this.m.random() > 0.6) && l4 != -10) continue;
                                        l4 = this.py(conto.x / 100, checkpoints.x[k6] / 100, conto.z / 100, checkpoints.z[k6] / 100);
                                        this.oupnt = k6;
                                    }
                                    --this.oupnt;
                                    if (i < 0) {
                                        this.oupnt += checkpoints.n;
                                    }
                                }
                                if (this.oupnt >= 0 && this.oupnt < checkpoints.n && this.py(conto.x / 100, checkpoints.x[i = this.oupnt] / 100, conto.z / 100, checkpoints.z[i] / 100) < 800) {
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
                    if (checkpoints.stage != 42) {
                        if (checkpoints.stage == 21 || checkpoints.stage == 47 && madness.pcleared == 73 || checkpoints.stage == 54 || checkpoints.stage == 36) {
                            this.forget = true;
                        }
                        if ((madness.missedcp == 0 || this.forget || this.trfix == 4) && this.trfix != 0) {
                            int byte1 = 0;
                            if (checkpoints.stage == 35 || checkpoints.stage == 54) {
                                byte1 = 3;
                            }
                            if (this.trfix == 2 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
                                int i5 = -10;
                                int l6 = 0;
                                for (int l7 = byte1; l7 < checkpoints.fn; ++l7) {
                                    if (this.py(conto.x / 100, checkpoints.x[this.fpnt[l7]] / 100, conto.z / 100, checkpoints.z[this.fpnt[l7]] / 100) >= i5 && i5 != -10) continue;
                                    i5 = this.py(conto.x / 100, checkpoints.x[this.fpnt[l7]] / 100, conto.z / 100, checkpoints.z[this.fpnt[l7]] / 100);
                                    l6 = l7;
                                }
                                if (checkpoints.stage == 47 || checkpoints.stage == 26) {
                                    l6 = 1;
                                }
                                i = this.fpnt[l6];
                                this.forget = checkpoints.special[l6];
                            }
                            for (int j5 = byte1; j5 < checkpoints.fn; ++j5) {
                                if (this.py(conto.x / 100, checkpoints.x[this.fpnt[j5]] / 100, conto.z / 100, checkpoints.z[this.fpnt[j5]] / 100) >= 2000) continue;
                                this.forget = false;
                                this.actwait = 0;
                                this.upwait = 0;
                                this.turntyp = 2;
                                this.randtcnt = -1;
                                this.acuracy = 0;
                                this.rampp = 0;
                                this.trfix = 3;
                            }
                            if (this.trfix == 3 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
                                madness.nofocus = true;
                            }
                        }
                    }
                    if (this.turncnt > this.randtcnt) {
                        if (!this.gowait) {
                            int c1 = 0;
                            if (checkpoints.x[i] - conto.x >= 0) {
                                c1 = 180;
                            }
                            this.pan = (int)((double)(90 + c1) + Math.atan((double)(checkpoints.z[i] - conto.z) / (double)(checkpoints.x[i] - conto.x)) / (Math.PI / 180));
                        } else {
                            int c2 = 0;
                            if (this.wtx - conto.x >= 0) {
                                c2 = 180;
                            }
                            this.pan = (int)((double)(90 + c2) + Math.atan((double)(this.wtz - conto.z) / (double)(this.wtx - conto.x)) / (Math.PI / 180));
                        }
                        this.turncnt = 0;
                        this.randtcnt = (int)((float)this.acuracy * this.m.random());
                    } else {
                        ++this.turncnt;
                    }
                } else {
                    this.up = true;
                    int c = 0;
                    int l1 = (int)((float)this.pys(conto.x, checkpoints.opx[this.acr], conto.z, checkpoints.opz[this.acr]) / 2.0f * this.aim);
                    int l3 = (int)((float)checkpoints.opx[this.acr] - (float)l1 * this.m.sin(checkpoints.omxz[this.acr]));
                    int k5 = (int)((float)checkpoints.opz[this.acr] + (float)l1 * this.m.cos(checkpoints.omxz[this.acr]));
                    if (l3 - conto.x >= 0) {
                        c = 180;
                    }
                    this.pan = (int)((double)(90 + c) + Math.atan((double)(k5 - conto.z) / (double)(l3 - conto.x)) / (Math.PI / 180));
                    --this.attack;
                    if (this.attack <= 0) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 35 && this.exitattack && !this.bulistc && madness.missedcp != 0) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 54 && madness.cn == 13 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 54 && madness.cn == 26 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 54 && madness.cn == 35 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 54 && madness.missedcp != 0 && (checkpoints.pos[madness.im] == 0 || checkpoints.pos[madness.im] == 1 && checkpoints.pos[0] == 0)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 54 && checkpoints.pos[0] > checkpoints.pos[madness.im] && madness.power < 80.0f) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 36 && madness.cn == 13 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 36 && madness.cn == 26 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 36 && madness.cn == 35 && (checkpoints.clear[0] == 4 || checkpoints.clear[0] == 13 || checkpoints.clear[0] == 21)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 36 && madness.missedcp != 0 && (checkpoints.pos[madness.im] == 0 || checkpoints.pos[madness.im] == 1 && checkpoints.pos[0] == 0)) {
                        this.attack = 0;
                    }
                    if (checkpoints.stage == 36 && checkpoints.pos[0] > checkpoints.pos[madness.im] && madness.power < 80.0f) {
                        this.attack = 0;
                    }
                }
                int j = conto.xz;
                if (this.zyinv) {
                    j += 180;
                }
                while (j < 0) {
                    j += 360;
                }
                while (j > 180) {
                    j -= 360;
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
                    if (Math.abs(j - this.pan) < 180) {
                        if (Math.abs(j - this.pan) > this.clrnce) {
                            if (j < this.pan) {
                                this.left = true;
                                this.lastl = true;
                            } else {
                                this.right = true;
                                this.lastl = false;
                            }
                            if (Math.abs(j - this.pan) > 50 && madness.speed > (float)madness.swits[madness.cn][0] && this.turntyp != 0) {
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
                    } else if (Math.abs(j - this.pan) < 360 - this.clrnce) {
                        if (j < this.pan) {
                            this.right = true;
                            this.lastl = false;
                        } else {
                            this.left = true;
                            this.lastl = true;
                        }
                        if (Math.abs(j - this.pan) < 310 && madness.speed > (float)madness.swits[madness.cn][0] && this.turntyp != 0) {
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
                if (checkpoints.stage == 24 && this.wall != -1) {
                    if (trackers.dam[this.wall] == 0 || madness.pcleared == 45) {
                        this.wall = -1;
                    }
                    if (madness.pcleared == 58 && checkpoints.opz[madness.im] < 36700) {
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
                        int byte0 = 1;
                        if (trackers.skd[this.wall] == 1) {
                            byte0 = 3;
                        }
                        this.hold += byte0;
                        if (this.hold > 10 * byte0) {
                            this.hold = 10 * byte0;
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
                    int k = (int)((madness.scy[0] + madness.scy[1] + madness.scy[2] + madness.scy[3]) * (float)(conto.y - 300) / 4000.0f);
                    int i2 = 3;
                    if (checkpoints.stage == 35 || checkpoints.stage == 38) {
                        i2 = 10;
                    }
                    if (k > 7 && (this.m.random() > this.trickprf / (float)i2 || this.stuntf == 4 || this.stuntf == 3 || this.stuntf == 5 || this.stuntf == 6 || checkpoints.stage == 54)) {
                        this.oxy = madness.pxy;
                        this.ozy = madness.pzy;
                        this.flycnt = 0;
                        this.uddirect = 0;
                        this.lrdirect = 0;
                        this.udswt = false;
                        this.lrswt = false;
                        this.trickfase = 1;
                        if (k < 16) {
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
                            if (checkpoints.stage == 54 || checkpoints.stage == 36) {
                                this.udstart = 0;
                            }
                            if (checkpoints.stage == 24 && (this.oupnt == 68 || this.oupnt == 69)) {
                                this.apunch = 20;
                                this.oupnt = 70;
                            }
                            if ((double)this.m.random() > 0.85 && this.stuntf != 4 && this.stuntf != 3 && this.stuntf != 6 && checkpoints.stage != 54 && checkpoints.stage != 36) {
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
                            if ((double)this.m.random() > 0.75 && checkpoints.stage != 54 && checkpoints.stage != 36) {
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
                            if (checkpoints.stage != 47 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
                                if (checkpoints.stage != 35 && this.lrdirect == -1) {
                                    this.uddirect = checkpoints.stage != 21 ? -1 : 1;
                                }
                                this.lrdirect = 0;
                                if ((checkpoints.stage == 21 || checkpoints.stage == 35) && this.uddirect == -1) {
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
                            if (checkpoints.stage == 22) {
                                this.uddirect = 1;
                                this.lrdirect = 0;
                            }
                            if (checkpoints.stage == 54 || checkpoints.stage == 36) {
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
                    if (this.trfix == 3 && checkpoints.stage != 24 && checkpoints.stage != 42 && checkpoints.stage != 29 && checkpoints.stage != 66 && checkpoints.stage != 62 && checkpoints.stage != 53 && checkpoints.stage != 59 && checkpoints.stage != 68) {
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
                    if ((madness.scy[0] + madness.scy[1] + madness.scy[2] + madness.scy[3]) * 100.0f / (float)(conto.y - 300) < (float)(-this.saftey)) {
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
                        int l;
                        for (l = madness.pzy + 90; l < 0; l += 360) {
                        }
                        while (l > 180) {
                            l -= 360;
                        }
                        l = Math.abs(l);
                        if (madness.lcomp - madness.rcomp < 5.0f && (this.onced || this.onceu)) {
                            this.udcomp = true;
                        }
                        if (madness.dcomp > madness.ucomp) {
                            if (madness.capsized) {
                                if (this.udcomp) {
                                    if (l > 90) {
                                        this.up = true;
                                    } else {
                                        this.down = true;
                                    }
                                } else if (!this.onced) {
                                    this.down = true;
                                }
                            } else {
                                if (this.udcomp) {
                                    if (this.perfection && Math.abs(l - 90) > 30) {
                                        if (l > 90) {
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
                                if (l > 90) {
                                    this.up = true;
                                } else {
                                    this.down = true;
                                }
                            } else if (!this.onceu) {
                                this.up = true;
                            }
                        } else {
                            if (this.udcomp) {
                                if (this.perfection && Math.abs(l - 90) > 30) {
                                    if (l > 90) {
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
                        int i1 = madness.pxy + 90;
                        if (this.zyinv) {
                            i1 += 180;
                        }
                        while (i1 < 0) {
                            i1 += 360;
                        }
                        while (i1 > 180) {
                            i1 -= 360;
                        }
                        i1 = Math.abs(i1);
                        if (madness.lcomp - madness.rcomp < 10.0f && (this.oncel || this.oncer)) {
                            this.lrcomp = true;
                        }
                        if (madness.lcomp > madness.rcomp) {
                            if (madness.capsized) {
                                if (this.lrcomp) {
                                    if (i1 > 90) {
                                        this.left = true;
                                    } else {
                                        this.right = true;
                                    }
                                } else if (!this.oncel) {
                                    this.left = true;
                                }
                            } else {
                                if (this.lrcomp) {
                                    if (this.perfection && Math.abs(i1 - 90) > 30) {
                                        if (i1 > 90) {
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
                                if (i1 > 90) {
                                    this.left = true;
                                } else {
                                    this.right = true;
                                }
                            } else if (!this.oncer) {
                                this.right = true;
                            }
                        } else {
                            if (this.lrcomp) {
                                if (this.perfection && Math.abs(i1 - 90) > 30) {
                                    if (i1 > 90) {
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
        if (checkpoints.stage == 24 || checkpoints.stage == 42 || checkpoints.stage == 29 || checkpoints.stage == 66 || checkpoints.stage == 62 || checkpoints.stage == 53 || checkpoints.stage == 59 || checkpoints.stage == 68) {
            this.trfix = -2147483647;
        }
        if (checkpoints.stage == 52 || checkpoints.stage == 59 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
            this.acuracy = 0;
        }
        if (checkpoints.stage == 57 || checkpoints.stage == 62 || checkpoints.stage == 59 || checkpoints.stage == 60 || checkpoints.stage == 68 || checkpoints.stage == 44 || checkpoints.stage == 69 || checkpoints.stage == 5) {
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
        if (checkpoints.stage == 68) {
            this.trickprf = 2.14748365E9f;
            this.stuntf = 0;
        }
        this.fire = this.attack != 0 && !madness.dest && madness.mtouch && madness.power > 60.0f ? false : false;
        if (madness.power < 50.0f) {
            this.trickprf = -1.0f;
        }
        if (checkpoints.haltall) {
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

    public void reset(CheckPoints checkpoints, int i) {
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
        if (checkpoints.stage == 16 || checkpoints.stage == 47) {
            this.hold = 50;
        }
        if (checkpoints.stage == 17) {
            this.hold = 10;
        }
        if (checkpoints.stage == 22) {
            this.hold = 30;
        }
        if (checkpoints.stage == 25) {
            if (i != 13) {
                this.hold = 35;
                this.revstart = 25;
            } else {
                this.hold = 5;
            }
            this.statusque = 0;
        }
        if (checkpoints.stage == 26) {
            if (i != 13) {
                this.hold = (int)(20.0f + 10.0f * this.m.random());
                this.revstart = (int)(10.0f + 10.0f * this.m.random());
            } else {
                this.hold = 5;
            }
            this.statusque = 0;
        }
        if (checkpoints.stage == 45 || checkpoints.stage == 46) {
            if (i != 26) {
            this.hold = 35;
            this.revstart = 25;
        } else {
            this.hold = 5;
            this.revstart = 0;
        }

    this.statusque = 0;
}
        if (checkpoints.stage == 24) {
            this.hold = 30;
            this.statusque = 0;
            if (i != 14) {
                this.revstart = 1;
            }
        }
        if (checkpoints.stage == 14) {
            if (i != 9) {
                this.hold = 35;
                this.revstart = Integer.MAX_VALUE;
            } else {
                this.hold = 0;
                this.revstart = 0;
            }
            this.statusque = 0;
        }
        if (checkpoints.stage == 62) {
            if (i == 26) {
                this.hold = (int)(20.0f + 10.0f * this.m.random());
                this.revstart = (int)(40.0f + 10.0f * this.m.random());
            } else {
                this.hold = 0;
            }
            this.statusque = 0;
        }
        if (checkpoints.stage == 60) {
            if (i == 36) {
                this.hold = 0;
                this.revstart = 0;
            } else {
                this.hold = 0;
                this.revstart = 0;
            }
            this.statusque = 0;
        }
        if (checkpoints.stage == 35) {
            this.hold = 40;
        }
        if (checkpoints.stage == 54) {
            this.hold = 20;
        }
        if (checkpoints.stage != 21 && checkpoints.stage != 54) {
            for (int j = 0; j < checkpoints.fn; ++j) {
                int l = -10;
                for (int i1 = 0; i1 < checkpoints.n; ++i1) {
                    if (this.py(checkpoints.fx[j] / 100, checkpoints.x[i1] / 100, checkpoints.fz[j] / 100, checkpoints.z[i1] / 100) >= l && l != -10) continue;
                    l = this.py(checkpoints.fx[j] / 100, checkpoints.x[i1] / 100, checkpoints.fz[j] / 100, checkpoints.z[i1] / 100);
                    this.fpnt[j] = i1;
                }
            }
            for (int k = 0; k < checkpoints.fn; ++k) {
                int n = k;
                this.fpnt[n] = this.fpnt[n] - 4;
                if (this.fpnt[k] >= 0) continue;
                int n2 = k;
                this.fpnt[n2] = this.fpnt[n2] + checkpoints.nsp;
            }
        } else {
            if (checkpoints.stage == 21) {
                this.fpnt[0] = 14;
                this.fpnt[1] = 36;
            }
            if (checkpoints.stage == 54) {
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

    public int pys(int i, int j, int k, int l) {
        return (int)Math.sqrt((i - j) * (i - j) + (k - l) * (k - l));
    }

    public int py(int i, int j, int k, int l) {
        return (i - j) * (i - j) + (k - l) * (k - l);
    }
}
