/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;

public class Madness {
    CheckPoints cp;
    Medium m;
    Record rpd;
    xtGraphics xt;
    int cn = 0;
    int im = 0;
    int mxz = 0;
    int cxz = 0;
    float[][] acelf = new float[][]{{11.0f, 5.0f, 3.0f}, {14.0f, 7.0f, 5.0f}, {10.0f, 5.0f, 3.5f}, {11.0f, 6.0f, 3.5f}, {10.0f, 5.0f, 3.5f}, {12.0f, 6.0f, 3.0f}, {7.0f, 9.0f, 4.0f}, {11.0f, 5.0f, 3.0f}, {12.0f, 7.0f, 4.0f}, {12.0f, 7.0f, 3.5f}, {11.5f, 6.5f, 3.5f}, {9.0f, 5.0f, 3.0f}, {13.0f, 7.0f, 4.5f}, {7.5f, 3.5f, 3.0f}, {11.0f, 7.5f, 4.0f}, {12.0f, 6.0f, 3.5f}, {11.0f, 5.0f, 3.0f}, {22.0f, 14.0f, 10.0f}, {10.0f, 7.0f, 3.5f}, {11.0f, 6.0f, 3.5f}, {5.0f, 5.0f, 5.0f}, {9.0f, 9.0f, 9.0f}, {10.0f, 7.0f, 3.0f}, {10.0f, 10.0f, 10.0f}, {15.0f, 15.0f, 15.0f}, {15.0f, 15.0f, 15.0f}, {9.0f, 6.0f, 3.0f}, {12.0f, 10.0f, 10.0f}, {9.0f, 9.0f, 9.0f}, {7.5f, 7.5f, 7.5f}, {12.0f, 12.0f, 12.0f}, {22.0f, 14.0f, 14.0f}, {30.0f, 30.0f, 30.0f}, {20.0f, 20.0f, 20.0f}, {20.0f, 20.0f, 20.0f}, {3.0f, 3.0f, 3.0f}, {15.0f, 15.0f, 15.0f}, {1.0f, 1.0f, 1.0f}, {30.0f, 30.0f, 30.0f}, {30.0f, 30.0f, 30.0f}};
    int[][] swits = new int[][]{{50, 180, 280}, {100, 200, 310}, {60, 180, 275}, {70, 190, 295}, {70, 170, 275}, {60, 200, 290}, {60, 170, 280}, {60, 180, 280}, {90, 210, 295}, {90, 190, 276}, {70, 200, 295}, {50, 160, 270}, {90, 200, 305}, {50, 130, 210}, {80, 200, 300}, {70, 210, 290}, {50, 180, 282}, {100, 200, 400}, {60, 180, 280}, {70, 250, 350}, {80, 200, 295}, {70, 190, 375}, {60, 250, 325}, {60, 170, 278}, {60, 170, 280}, {60, 170, 270}, {50, 160, 220}, {70, 210, 285}, {50, 160, 1000}, {50, 130, 875}, {70, 210, 1000}, {80, 200, 1000}, {200, 300, 500}, {60, 170, 290}, {310, 310, 310}, {140, 140, 180}, {70, 210, 320}, {100, 100, 300}, {70, 170, 1000}, {70, 170, 1000}};
    int[] handb = new int[]{7, 10, 7, 15, 12, 8, 9, 10, 5, 7, 8, 10, 8, 12, 7, 7, 7, 30, 14, 15, 6, 15, 18, 14, 30, 30, 10, 17, 10, 12, 7, 30, 60, 50, 40, 3, 50, 2, 100, 100};
    float[] airs = new float[]{1.0f, 1.2f, 0.95f, 1.0f, 2.2f, 1.0f, 0.9f, 0.8f, 1.0f, 0.9f, 1.15f, 0.8f, 1.0f, 0.3f, 1.3f, 1.0f, 1.0f, 1.2f, 0.95f, 1.0f, 0.8f, 2.0f, 1.25f, 0.9f, 1.0f, 1.5f, 0.8f, 1.0f, 0.8f, 0.3f, 1.0f, 2.0f, 1.3f, 2.0f, 2.0f, 0.2f, 2.0f, 0.0f, 3.0f, 3.0f};
    int[] airc = new int[]{70, 30, 40, 40, 30, 50, 40, 90, 40, 50, 75, 10, 50, 0, 100, 60, 40, 0, 50, 40, 50, 125, 75, 40, 75, 100, 5, 64, 10, 0, 60, 100, 200, 100, 200, 0, 60, 200, 600, 600};
    float[] drag = new float[]{0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.45f, 0.5f, 0.5f, 0.25f, 0.475f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.5f, 0.1f, 0.375f, 0.1f, 0.0f, 0.0f};
    int[] turn = new int[]{6, 9, 5, 7, 8, 7, 5, 5, 9, 7, 7, 4, 6, 5, 7, 6, 8, 14, 6, 9, 8, 13, 11, 6, 72, 72, 10, 12, 4, 5, 6, 72, 72, 72, 72, 72, 72, 72, 72, 72};
    float[] grip = new float[]{20.0f, 27.0f, 18.0f, 22.0f, 19.0f, 20.0f, 25.0f, 20.0f, 16.0f, 24.0f, 22.5f, 25.0f, 30.0f, 27.0f, 25.0f, 27.0f, 23.0f, 50.0f, 22.0f, 26.0f, 35.0f, 40.0f, 30.0f, 27.0f, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, 39.0f, 34.0f, 25.0f, 27.0f, 27.0f, Float.POSITIVE_INFINITY, 75.0f, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY};
    float[] bounce = new float[]{1.2f, 1.05f, 1.3f, 1.15f, 1.3f, 1.2f, 1.15f, 1.1f, 1.2f, 1.1f, 1.15f, 0.8f, 1.05f, 0.8f, 1.1f, 1.15f, 1.0f, 0.8f, 1.0f, 1.15f, 0.8f, 1.15f, 1.3f, 1.15f, 1.25f, 1.0f, 0.6f, 1.4f, 0.8f, 0.8f, 1.15f, 0.75f, 1.0f, 0.4f, 1.3f, 0.4f, 1.15f, 0.4f, 0.4f, 0.4f};
    float[] simag = new float[]{0.9f, 0.85f, 1.05f, 0.9f, 0.85f, 0.9f, 1.05f, 0.9f, 1.0f, 1.05f, 0.9f, 1.1f, 0.9f, 1.3f, 0.9f, 1.15f, 0.9f, 0.85f, 1.05f, 0.9f, 1.2f, 0.9f, 0.9f, 1.05f, 1.1f, 1.1f, 1.1f, 1.15f, 1.1f, 1.3f, 1.15f, 0.9f, 1.5f, 0.01f, 0.9f, 1.5f, 1.15f, 1.5f, 0.01f, 0.01f};
    float[] moment = new float[]{1.2f, 0.75f, 1.4f, 1.0f, 0.85f, 1.25f, 1.4f, 1.3f, 1.2f, 1.45f, 1.375f, 2.0f, 1.2f, 3.0f, 1.5f, 2.0f, 1.2f, 0.75f, 1.5f, 1.0f, 1.75f, 1.0f, 1.25f, 1.6f, 1.0f, 1.5f, 3.0f, 2.0f, 2.0f, 3.0f, 2.0f, 1.5f, 2.0f, Float.POSITIVE_INFINITY, 0.6f, 1000.0f, 2.1f, 5.0f, 1000.0f, 10000.0f};
    float[] comprad = new float[]{0.5f, 0.4f, 0.8f, 0.5f, 0.3f, 0.5f, 0.5f, 0.5f, 0.5f, 0.8f, 0.5f, 1.0f, 0.5f, 0.6f, 0.5f, 0.8f, 0.5f, 0.4f, 0.8f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 2.0f, 0.5f, 1.0f, 0.6f, 0.8f, 0.5f, 0.25f, 0.0f, 5.0f, 7.5f, 0.8f, 2.0f, 1.0f, 1.0f};
    int[] push = new int[]{2, 2, 3, 3, 2, 2, 2, 4, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 3, 3, 2, 3, 2, 3, 1, 2, 4, 3, 4, 2, 2, 2, 3, 0, 2, 2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    int[] revpush = new int[]{2, 3, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 3, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 0, -2, 0, 1, 0, 0, 0};
    int[] lift = new int[]{0, 30, 0, 20, 0, 30, 0, 0, 20, 0, 0, 0, 10, 0, 30, 0, 0, 30, 0, 20, 15, 30, 30, 0, 10, 10, 0, 0, 0, 0, 0, 30, 0, 0, 10, 0, 0, 0, 100, 100};
    int[] revlift = new int[]{0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 100, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] powerloss = new int[]{2500000, 2500000, 3500000, 2500000, 4000000, 2500000, 3200000, 3200000, 2750000, 5500000, 2750000, 4500000, 3500000, 16700000, 3000000, 5500000, 2500000, 2500000, 5700000, 4200000, 3500000, 3000000, 5000000, 5000000, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 4500000, 4500000, 16700000, 5500000, 4100000, Integer.MAX_VALUE, -1610612737, -1610612737, -1610612737, -1610612737, -1610612737, 6500000, 6500000};
    int[] flipy = new int[]{-50, -60, -92, -44, -60, -57, -54, -60, -77, -57, -82, -85, -28, -100, -63, -127, -50, -26, -90, -61, -70, -21, -53, -54, -85, -85, -85, -50, -85, -100, -127, -30, -60, -54, -255, -40, -70, -220, 0, 0};
    int[] msquash = new int[]{7, 4, 7, 2, 8, 4, 6, 4, 3, 8, 4, 10, 3, 20, 3, 8, 7, 1, 7, 2, 3, 1, 3, 6, 10, 10, 10, 0, 10, 20, 8, 3, 1, 0, 0, 0, 0, 0, 0, 0};
    int[] clrad = new int[]{3300, 1700, 4700, 3000, 2000, 4500, 3500, 5000, 10000, 15000, 4000, 7000, 10000, 30000, 5500, 5000, 3300, 1500, 3500, 3000, 2000, 3000, 2100, 3500, 3750, 4500, 7000, 12000, 7000, 30000, 5000, 4000, 4000, 0, 0, 0, 0, 0, 0, 0};
    float[] dammult = new float[]{0.8f, 1.17f, 0.55f, 1.0f, 0.6f, 0.7f, 0.72f, 0.8f, 0.6f, 0.46f, 0.67f, 0.5f, 0.61f, 0.176f, 0.36f, 0.46f, 0.5f, 0.75f, 0.65f, 0.7066f, 0.6f, 1.0f, 0.7066f, 0.6f, 0.5f, 0.5f, 0.5f, 0.501f, 0.5f, 0.176f, 0.46f, 0.5f, 1.0f, 0.0f, 5.0f, 2.0f, 0.7667f, 10.0f, 1.0f, 1.0f};
    int[] maxmag = new int[]{6000, 4200, 7200, 6000, 6000, 9100, 14000, 12000, 12000, 9700, 13000, 10700, 13000, 30000, 5800, 18000, 3500, 1000, 8800, 7000, 5000, 500, 7100, 9000, 4400, 6000, 10000, 5000, 11700, 31000, 19000, 4400, 30000, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    boolean[] dominate;
    boolean[] caught;
    int pzy = 0;
    int pxy = 0;
    float speed = 0.0f;
    float forca = 0.0f;
    float[] scy;
    float[] scz;
    float[] scx;
    boolean mtouch = false;
    boolean wtouch = false;
    int cntouch = 0;
    boolean capsized = false;
    int txz = 0;
    int fxz = 0;
    int pmlt = 1;
    int nmlt = 1;
    int dcnt = 0;
    int skid = 0;
    boolean pushed = false;
    boolean gtouch = false;
    boolean pl = false;
    boolean pr = false;
    boolean pd = false;
    boolean pu = false;
    int loop = 0;
    float ucomp = 0.0f;
    float dcomp = 0.0f;
    float lcomp = 0.0f;
    float rcomp = 0.0f;
    int lxz = 0;
    int travxy = 0;
    int travzy = 0;
    int travxz = 0;
    int trcnt = 0;
    int capcnt = 0;
    int srfcnt = 0;
    boolean rtab = false;
    boolean ftab = false;
    boolean btab = false;
    boolean surfer = false;
    float powerup = 0.0f;
    int xtpower = 0;
    float tilt = 0.0f;
    int squash = 0;
    int nbsq = 0;
    int hitmag = 0;
    int cntdest = 0;
    boolean dest = false;
    boolean newcar = false;
    int pan = 0;
    int pcleared = 0;
    int clear = 0;
    int nlaps = 0;
    int focus = -1;
    float power = 75.0f;
    int missedcp = 0;
    int lastcolido = 0;
    int point = 0;
    boolean nofocus = false;
    int rpdcatch = 0;
    boolean colidim = false;
    int explocnt;
    int lascnt = 0;
    int rspeed;
    int rlift;
    boolean pexp;
    int njumps;
    int ester;
    int[] llx;
    int[] lly;
    int[] llz;
    int[] llxz;
    int[] llzy;
    int[] llxy;
    int[] lstage;
    int[] lspeed;
    int[] lhit;
    int nl;
    Lasers lsr;
    int[] ltyp = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, 0, -1, -1, 1, 1, 2, 3, -1, -1, -1, -1, -1, 0, -1, 2, 4, 5, 6, -1, -1};
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

    public int py(int i, int j, int k, int l) {
        return (i - j) * (i - j) + (k - l) * (k - l);
    }

    public void regy(int i, float f, ContO conto) {
        if ((f *= this.dammult[this.cn]) > 100.0f) {
            int j;
            this.rpd.recy(i, f, this.mtouch, this.im);
            f -= 100.0f;
            int byte0 = 0;
            int byte1 = 0;
            int k = conto.xy;
            for (j = conto.zy; j < 360; j += 360) {
            }
            while (j > 360) {
                j -= 360;
            }
            if (j < 210 && j > 150) {
                byte0 = -1;
            }
            if (j > 330 || j < 30) {
                byte0 = 1;
            }
            while (k < 360) {
                k += 360;
            }
            while (k > 360) {
                k -= 360;
            }
            if (k < 210 && k > 150) {
                byte1 = -1;
            }
            if (k > 330 || k < 30) {
                byte1 = 1;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, byte1 * byte0);
            }
            if (byte1 * byte0 == 0 || this.mtouch) {
                for (int l = 0; l < conto.npl; ++l) {
                    float f1 = 0.0f;
                    for (int k1 = 0; k1 < conto.p[l].n; ++k1) {
                        if (conto.p[l].wz != 0 || this.py(conto.keyx[i], conto.p[l].ox[k1], conto.keyz[i], conto.p[l].oz[k1]) >= this.clrad[this.cn]) continue;
                        f1 = f / 20.0f * this.m.random();
                        int n = k1;
                        conto.p[l].oz[n] = (int)((float)conto.p[l].oz[n] + f1 * this.m.sin(j));
                        int n2 = k1;
                        conto.p[l].ox[n2] = (int)((float)conto.p[l].ox[n2] - f1 * this.m.sin(k));
                        this.hitmag = (int)((float)this.hitmag + Math.abs(f1));
                    }
                    if (f1 == 0.0f) continue;
                    if (Math.abs(f1) >= 1.0f) {
                        conto.p[l].chip = 1;
                        conto.p[l].ctmag = f1;
                    }
                    if (!conto.p[l].nocol && !conto.p[l].glass) {
                        if (conto.p[l].bfase > 20 && (double)conto.p[l].hsb[1] > 0.25) {
                            conto.p[l].hsb[1] = 0.25f;
                        }
                        if (conto.p[l].bfase > 25 && (double)conto.p[l].hsb[2] > 0.7) {
                            conto.p[l].hsb[2] = 0.7f;
                        }
                        if (conto.p[l].bfase > 30 && (double)conto.p[l].hsb[1] > 0.15) {
                            conto.p[l].hsb[1] = 0.15f;
                        }
                        if (conto.p[l].bfase > 35 && (double)conto.p[l].hsb[2] > 0.6) {
                            conto.p[l].hsb[2] = 0.6f;
                        }
                        if (conto.p[l].bfase > 40) {
                            conto.p[l].hsb[0] = 0.075f;
                        }
                        if (conto.p[l].bfase > 50 && (double)conto.p[l].hsb[2] > 0.5) {
                            conto.p[l].hsb[2] = 0.5f;
                        }
                        if (conto.p[l].bfase > 60) {
                            conto.p[l].hsb[0] = 0.05f;
                        }
                        conto.p[l].bfase = (int)((float)conto.p[l].bfase + f1);
                        new Color(conto.p[l].c[0], conto.p[l].c[1], conto.p[l].c[2]);
                        Color color = Color.getHSBColor(conto.p[l].hsb[0], conto.p[l].hsb[1], conto.p[l].hsb[2]);
                        conto.p[l].c[0] = color.getRed();
                        conto.p[l].c[1] = color.getGreen();
                        conto.p[l].c[2] = color.getBlue();
                    }
                    if (!conto.p[l].glass) continue;
                    conto.p[l].gr = (int)((double)conto.p[l].gr + Math.abs((double)f1 * 0.0));
                }
            }
            if (byte1 * byte0 == -1) {
                if (this.nbsq > 0) {
                    int i1 = 0;
                    int j1 = 1;
                    for (int l1 = 0; l1 < conto.npl; ++l1) {
                        float f2 = 0.0f;
                        for (int i2 = 0; i2 < conto.p[l1].n; ++i2) {
                            if (conto.p[l1].wz != 0) continue;
                            f2 = f / 15.0f * this.m.random();
                            if (Math.abs(conto.p[l1].oy[i2] - this.flipy[this.cn] - this.squash) >= this.msquash[this.cn] * 3 && conto.p[l1].oy[i2] >= this.flipy[this.cn] + this.squash || this.squash >= this.msquash[this.cn]) continue;
                            int n = i2;
                            conto.p[l1].oy[n] = (int)((float)conto.p[l1].oy[n] + f2);
                            i1 = (int)((float)i1 + f2);
                            ++j1;
                            this.hitmag = (int)((float)this.hitmag + Math.abs(f2));
                        }
                        if (conto.p[l1].glass && this.cn != 33 && this.cn != 34 && this.cn != 35 && this.cn != 36 && this.cn != 37 && this.cn != 38 && this.cn != 39) {
                            conto.p[l1].gr += 0;
                        } else if (f2 != 0.0f) {
                            conto.p[l1].bfase = (int)((float)conto.p[l1].bfase + f2);
                        }
                        if (!(Math.abs(f2) >= 1.0f)) continue;
                        conto.p[l1].chip = 1;
                        conto.p[l1].ctmag = f2;
                    }
                    this.squash += i1 / j1;
                    this.nbsq = 0;
                } else {
                    ++this.nbsq;
                }
            }
        }
    }

    public void reset(int i) {
        this.rspeed = 0;
        this.speed = 0.0f;
        this.rlift = 0;
        this.pexp = false;
        int j = 0;
        do {
            this.lstage[j] = 0;
        } while (++j < 20);
    }

    public Madness(Medium medium, Record record, xtGraphics xtgraphics, int i) {
        this.dominate = new boolean[7];
        this.caught = new boolean[7];
        this.scy = new float[4];
        this.scz = new float[4];
        this.scx = new float[4];
        this.m = medium;
        this.rpd = record;
        this.xt = xtgraphics;
        this.im = i;
        this.njumps = 0;
        this.ester = 0;
        this.llx = new int[20];
        this.lly = new int[20];
        this.llz = new int[20];
        this.llxz = new int[20];
        this.llzy = new int[20];
        this.llxy = new int[20];
        this.lstage = new int[20];
        this.lspeed = new int[20];
        this.lhit = new int[20];
        this.nl = 0;
        this.skip = false;
        this.bulkc = 0;
        this.sms = new int[4];
        this.sx = new int[4];
        this.sy = new int[4];
        this.sz = new int[4];
        this.sxz = new int[4];
        this.szy = new int[4];
        this.ns = 0;
        this.smoke = false;
        this.dms = new int[4];
        this.dx = new int[4];
        this.dy = new int[4];
        this.dz = new int[4];
        this.dxz = new int[4];
        this.dzy = new int[4];
        this.nd = 0;
        this.lsr = new Lasers(medium);
    }

    public int rpy(float f, float f1, float f2, float f3, float f4, float f5) {
        return (int)((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3) + (f4 - f5) * (f4 - f5));
    }

    public void regz(int i, float f, ContO conto) {
        if (Math.abs(f *= this.dammult[this.cn]) > 100.0f) {
            this.rpd.recz(i, f, this.im);
            if (f > 100.0f) {
                f -= 100.0f;
            }
            if (f < -100.0f) {
                f += 100.0f;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, 0);
            }
            for (int j = 0; j < conto.npl; ++j) {
                float f1 = 0.0f;
                for (int k = 0; k < conto.p[j].n; ++k) {
                    if (conto.p[j].wz != 0 || this.py(conto.keyx[i], conto.p[j].ox[k], conto.keyz[i], conto.p[j].oz[k]) >= this.clrad[this.cn]) continue;
                    f1 = f / 20.0f * this.m.random();
                    int n = k;
                    conto.p[j].oz[n] = (int)((float)conto.p[j].oz[n] + f1 * this.m.cos(conto.xz) * this.m.cos(conto.zy));
                    int n2 = k;
                    conto.p[j].ox[n2] = (int)((float)conto.p[j].ox[n2] + f1 * this.m.sin(conto.xz) * this.m.cos(conto.xy));
                    this.hitmag = (int)((float)this.hitmag + Math.abs(f1));
                }
                if (f1 == 0.0f) continue;
                if (Math.abs(f1) >= 1.0f) {
                    conto.p[j].chip = 1;
                    conto.p[j].ctmag = f1;
                }
                if (!conto.p[j].nocol && !conto.p[j].glass) {
                    if (conto.p[j].bfase > 20 && (double)conto.p[j].hsb[1] > 0.25) {
                        conto.p[j].hsb[1] = 0.25f;
                    }
                    if (conto.p[j].bfase > 25 && (double)conto.p[j].hsb[2] > 0.7) {
                        conto.p[j].hsb[2] = 0.7f;
                    }
                    if (conto.p[j].bfase > 30 && (double)conto.p[j].hsb[1] > 0.15) {
                        conto.p[j].hsb[1] = 0.15f;
                    }
                    if (conto.p[j].bfase > 35 && (double)conto.p[j].hsb[2] > 0.6) {
                        conto.p[j].hsb[2] = 0.6f;
                    }
                    if (conto.p[j].bfase > 40) {
                        conto.p[j].hsb[0] = 0.075f;
                    }
                    if (conto.p[j].bfase > 50 && (double)conto.p[j].hsb[2] > 0.5) {
                        conto.p[j].hsb[2] = 0.5f;
                    }
                    if (conto.p[j].bfase > 60) {
                        conto.p[j].hsb[0] = 0.05f;
                    }
                    conto.p[j].bfase = (int)((float)conto.p[j].bfase + Math.abs(f1));
                    new Color(conto.p[j].c[0], conto.p[j].c[1], conto.p[j].c[2]);
                    Color color = Color.getHSBColor(conto.p[j].hsb[0], conto.p[j].hsb[1], conto.p[j].hsb[2]);
                    conto.p[j].c[0] = color.getRed();
                    conto.p[j].c[1] = color.getGreen();
                    conto.p[j].c[2] = color.getBlue();
                }
                if (!conto.p[j].glass) continue;
                conto.p[j].gr = (int)((double)conto.p[j].gr + Math.abs((double)f1 * 0.0));
            }
        }
    }

    public void rot(float[] af, float[] af1, int i, int j, int k, int l) {
        if (k != 0) {
            for (int i1 = 0; i1 < l; ++i1) {
                float f = af[i1];
                float f1 = af1[i1];
                af[i1] = (float)i + ((f - (float)i) * this.m.cos(k) - (f1 - (float)j) * this.m.sin(k));
                af1[i1] = (float)j + ((f - (float)i) * this.m.sin(k) + (f1 - (float)j) * this.m.cos(k));
            }
        }
    }

    public void colide(ContO conto, Madness madness, ContO conto1, xtGraphics xtgraphics) {
        float[] af = new float[4];
        float[] af1 = new float[4];
        float[] af2 = new float[4];
        float[] af3 = new float[4];
        float[] af4 = new float[4];
        float[] af5 = new float[4];
        int i = 0;
        do {
            af[i] = conto.x + conto.keyx[i];
            af1[i] = this.capsized ? (float)(conto.y + this.flipy[this.cn] + this.squash) : (float)(conto.y + conto.grat);
            af2[i] = conto.z + conto.keyz[i];
            af3[i] = conto1.x + conto1.keyx[i];
            af4[i] = this.capsized ? (float)(conto1.y + madness.flipy[madness.cn] + madness.squash) : (float)(conto1.y + conto1.grat);
            af5[i] = conto1.z + conto1.keyz[i];
        } while (++i < 4);
        this.rot(af, af1, conto.x, conto.y, conto.xy, 4);
        this.rot(af1, af2, conto.y, conto.z, conto.zy, 4);
        this.rot(af, af2, conto.x, conto.z, conto.xz, 4);
        this.rot(af3, af4, conto1.x, conto1.y, conto1.xy, 4);
        this.rot(af4, af5, conto1.y, conto1.z, conto1.zy, 4);
        this.rot(af3, af5, conto1.x, conto1.z, conto1.xz, 4);
        if ((double)this.rpy(conto.x, conto1.x, conto.y, conto1.y, conto.z, conto1.z) < (double)(conto.maxR * conto.maxR + conto1.maxR * conto1.maxR) * 1.5 && this.cn == 35 && madness.cn != 33 && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtgraphics.killomatic[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 7.5);
        }
        if ((double)this.rpy(conto.x, conto1.x, conto.y, conto1.y, conto.z, conto1.z) < (double)(conto.maxR * conto.maxR + conto1.maxR * conto1.maxR) * (double)(this.speed / 200.0f) && this.cn == 38 && madness.cn != 33 && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtgraphics.nuke[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 10.0);
        }
        if ((double)this.rpy(conto.x, conto1.x, conto.y, conto1.y, conto.z, conto1.z) < (double)(conto.maxR * conto.maxR + conto1.maxR * conto1.maxR) * (double)(this.speed / 10.0f) && this.cn == 38 && madness.cn != 33 && (madness.cn == 34 || madness.cn == 35 || madness.cn == 37) && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtgraphics.nuke[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 10.0);
        }
        if ((double)this.rpy(conto.x, conto1.x, conto.y, conto1.y, conto.z, conto1.z) < (double)(conto.maxR * conto.maxR + conto1.maxR * conto1.maxR) * 1.5 && this.cn == 39 && madness.cn != 33 && !this.dest && !madness.dest && this.speed != 0.0f) {
            this.dest = true;
            this.grip[this.cn] = 0.0f;
            this.revlift[this.cn] = 100;
            this.distruct(conto);
            ++this.cntdest;
            if (this.cntdest == 1) {
                this.rpd.dest[this.im] = 300;
            }
            if (!this.xt.mutes) {
                xtgraphics.nuke[(int)(this.m.random() * 2.0f)].play();
            }
        }
        if ((double)this.rpy(conto.x, conto1.x, conto.y, conto1.y, conto.z, conto1.z) < (double)(conto.maxR * conto.maxR + conto1.maxR * conto1.maxR) * 1.5) {
            if (!(this.caught[madness.im] || this.speed == 0.0f && madness.speed == 0.0f)) {
                this.dominate[madness.im] = Math.abs(this.power * this.speed * this.moment[this.cn]) != Math.abs(madness.power * madness.speed * madness.moment[madness.cn]) ? Math.abs(this.power * this.speed * this.moment[this.cn]) > Math.abs(madness.power * madness.speed * madness.moment[madness.cn]) : this.moment[this.cn] > madness.moment[madness.cn];
                this.caught[madness.im] = true;
            }
        } else if (this.caught[madness.im]) {
            this.caught[madness.im] = false;
        }
        if (this.dominate[madness.im]) {
            int j = (int)(((this.scz[0] - madness.scz[0] + this.scz[1] - madness.scz[1] + this.scz[2] - madness.scz[2] + this.scz[3] - madness.scz[3]) * (this.scz[0] - madness.scz[0] + this.scz[1] - madness.scz[1] + this.scz[2] - madness.scz[2] + this.scz[3] - madness.scz[3]) + (this.scx[0] - madness.scx[0] + this.scx[1] - madness.scx[1] + this.scx[2] - madness.scx[2] + this.scx[3] - madness.scx[3]) * (this.scx[0] - madness.scx[0] + this.scx[1] - madness.scx[1] + this.scx[2] - madness.scx[2] + this.scx[3] - madness.scx[3])) / 16.0f);
            int k = 0;
            do {
                int l = 0;
                do {
                    if (!((float)this.rpy(af[k], af3[l], af1[k], af4[l], af2[k], af5[l]) < (float)(j + 7000) * (this.comprad[madness.cn] + this.comprad[this.cn]))) continue;
                    if (Math.abs(this.scx[k] * this.moment[this.cn]) > Math.abs(madness.scx[l] * madness.moment[madness.cn])) {
                        float f2;
                        float f = madness.scx[l] * (float)this.revpush[this.cn];
                        if (f > 300.0f) {
                            f = 300.0f;
                        }
                        if (f < -300.0f) {
                            f = -300.0f;
                        }
                        if ((f2 = this.scx[k] * (float)this.push[this.cn]) > 300.0f) {
                            f2 = 300.0f;
                        }
                        if (f2 < -300.0f) {
                            f2 = -300.0f;
                        }
                        float f4 = 1.0f;
                        if ((madness.cn == 13 || madness.cn == 29) && this.cn != 35 && this.cn != 38 && this.cn != 39) {
                            f4 = this.moment[this.cn];
                        }
                        int n = l;
                        madness.scx[n] = madness.scx[n] + f2;
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regx(l, f2 * this.moment[this.cn] * f4, conto1);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                        int n2 = k;
                        this.scx[n2] = this.scx[n2] - f;
                        this.regx(k, -f * madness.moment[this.cn], conto);
                        int n3 = k;
                        this.scy[n3] = this.scy[n3] - (float)this.revlift[this.cn];
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regy(l, this.revlift[this.cn] * 7, conto1);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                    }
                    if (Math.abs(this.scz[k] * this.moment[this.cn]) > Math.abs(madness.scz[l] * madness.moment[madness.cn])) {
                        float f3;
                        float f1 = madness.scz[l] * (float)this.revpush[this.cn];
                        if (f1 > 300.0f) {
                            f1 = 300.0f;
                        }
                        if (f1 < -300.0f) {
                            f1 = -300.0f;
                        }
                        if ((f3 = this.scz[k] * (float)this.push[this.cn]) > 300.0f) {
                            f3 = 300.0f;
                        }
                        if (f3 < -300.0f) {
                            f3 = -300.0f;
                        }
                        float f5 = 1.0f;
                        if ((madness.cn == 13 || madness.cn == 29) && this.cn != 35 && this.cn != 38 && this.cn != 39) {
                            f5 = this.moment[this.cn];
                        }
                        int n = l;
                        madness.scz[n] = madness.scz[n] + f3;
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regz(l, f3 * this.moment[this.cn] * f5, conto1);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                        int n4 = k;
                        this.scz[n4] = this.scz[n4] - f1;
                        this.regz(k, -f1 * madness.moment[this.cn], conto);
                        int n5 = k;
                        this.scy[n5] = this.scy[n5] - (float)this.revlift[this.cn];
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regy(l, this.revlift[this.cn] * 7, conto1);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                    }
                    if (this.im == 0) {
                        madness.lastcolido = 70;
                    }
                    if (madness.im == 0) {
                        this.lastcolido = 70;
                    }
                    if (madness.cn == 35 || madness.cn == 37) continue;
                    int n = l;
                    madness.scy[n] = madness.scy[n] - (float)this.lift[this.cn];
                } while (++l < 4);
            } while (++k < 4);
        }
    }

    public void distruct(ContO conto) {
        for (int i = 0; i < conto.npl; ++i) {
            if (conto.p[i].wz != 0 && conto.p[i].gr != -17 && conto.p[i].gr != -16) continue;
            conto.p[i].embos = 1;
        }
    }

    public void reseto(int i, ContO conto, CheckPoints checkpoints) {
        this.cn = i;
        int j = 0;
        do {
            this.dominate[j] = false;
            this.caught[j] = false;
        } while (++j < 7);
        if (this.cn == 11 && this.im == 0) {
            this.moment[this.cn] = checkpoints.stage == 10 ? 2.5f : 2.0f;
        }
        if (this.cn == 9 && this.im != 0) {
            this.maxmag[this.cn] = checkpoints.stage == 4 ? 8000 : 9700;
        }
        this.mxz = 0;
        this.cxz = 0;
        this.pzy = 0;
        this.pxy = 0;
        this.speed = 0.0f;
        j = 0;
        do {
            this.scy[j] = 0.0f;
            this.scx[j] = 0.0f;
            this.scz[j] = 0.0f;
        } while (++j < 4);
        this.forca = ((float)Math.sqrt(conto.keyz[0] * conto.keyz[0] + conto.keyx[0] * conto.keyx[0]) + (float)Math.sqrt(conto.keyz[1] * conto.keyz[1] + conto.keyx[1] * conto.keyx[1]) + (float)Math.sqrt(conto.keyz[2] * conto.keyz[2] + conto.keyx[2] * conto.keyx[2]) + (float)Math.sqrt(conto.keyz[3] * conto.keyz[3] + conto.keyx[3] * conto.keyx[3])) / 10000.0f * (float)((double)this.bounce[this.cn] - 0.3);
        if (this.cn == 17 || this.cn == 18 || this.cn == 20 || this.cn == 21 || this.cn == 23 || this.cn == 24 || this.cn == 25 || this.cn == 26 || this.cn == 31 || this.cn == 32) {
            this.forca = ((float)Math.sqrt(conto.keyz[0] * conto.keyz[0] + conto.keyx[0] * conto.keyx[0]) + (float)Math.sqrt(conto.keyz[1] * conto.keyz[1] + conto.keyx[1] * conto.keyx[1]) + (float)Math.sqrt(conto.keyz[2] * conto.keyz[2] + conto.keyx[2] * conto.keyx[2]) + (float)Math.sqrt(conto.keyz[3] * conto.keyz[3] + conto.keyx[3] * conto.keyx[3])) / 100000.0f * (float)((double)this.bounce[this.cn] - 0.3);
        }
        if (this.cn == 33 || this.cn == 34 || this.cn == 35 || this.cn == 36 || this.cn == 37 || this.cn == 38 || this.cn == 39) {
            this.forca = ((float)Math.sqrt(conto.keyz[0] * conto.keyz[0] + conto.keyx[0] * conto.keyx[0]) + (float)Math.sqrt(conto.keyz[1] * conto.keyz[1] + conto.keyx[1] * conto.keyx[1]) + (float)Math.sqrt(conto.keyz[2] * conto.keyz[2] + conto.keyx[2] * conto.keyx[2]) + (float)Math.sqrt(conto.keyz[3] * conto.keyz[3] + conto.keyx[3] * conto.keyx[3])) / Float.POSITIVE_INFINITY * (float)((double)this.bounce[this.cn] - 0.3);
        }
        this.mtouch = false;
        this.wtouch = false;
        this.txz = 0;
        this.fxz = 0;
        this.pmlt = 1;
        this.nmlt = 1;
        this.dcnt = 0;
        this.skid = 0;
        this.pushed = false;
        this.gtouch = false;
        this.pl = false;
        this.pr = false;
        this.pd = false;
        this.pu = false;
        this.loop = 0;
        this.ucomp = 0.0f;
        this.dcomp = 0.0f;
        this.lcomp = 0.0f;
        this.rcomp = 0.0f;
        this.lxz = 0;
        this.travxy = 0;
        this.travzy = 0;
        this.travxz = 0;
        this.rtab = false;
        this.ftab = false;
        this.btab = false;
        this.powerup = 0.0f;
        this.xtpower = 0;
        this.trcnt = 0;
        this.capcnt = 0;
        this.tilt = 0.0f;
        this.pan = 0;
        this.pcleared = checkpoints.pcs;
        this.clear = 0;
        this.nlaps = 0;
        this.focus = -1;
        this.missedcp = 0;
        this.nofocus = false;
        this.power = this.cn != 38 && this.cn != 39 ? 98.0f : 1.0f;
        this.lastcolido = 0;
        checkpoints.dested[this.im] = 0;
        this.squash = 0;
        this.nbsq = 0;
        this.hitmag = 0;
        this.cntdest = 0;
        this.dest = false;
        this.newcar = false;
        if (this.im == 0) {
            this.m.checkpoint = -1;
            this.m.lastcheck = false;
        }
        this.rpdcatch = 0;
        int j9 = 0;
        do {
            this.lstage[j9] = 0;
        } while (++j9 < 20);
    }

    public void regx(int i, float f, ContO conto) {
        if (Math.abs(f *= this.dammult[this.cn]) > 100.0f) {
            this.rpd.recx(i, f, this.im);
            if (f > 100.0f) {
                f -= 100.0f;
            }
            if (f < -100.0f) {
                f += 100.0f;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, 0);
            }
            for (int j = 0; j < conto.npl; ++j) {
                float f1 = 0.0f;
                for (int k = 0; k < conto.p[j].n; ++k) {
                    if (conto.p[j].wz != 0 || this.py(conto.keyx[i], conto.p[j].ox[k], conto.keyz[i], conto.p[j].oz[k]) >= this.clrad[this.cn]) continue;
                    f1 = f / 20.0f * this.m.random();
                    int n = k;
                    conto.p[j].oz[n] = (int)((float)conto.p[j].oz[n] - f1 * this.m.sin(conto.xz) * this.m.cos(conto.zy));
                    int n2 = k;
                    conto.p[j].ox[n2] = (int)((float)conto.p[j].ox[n2] + f1 * this.m.cos(conto.xz) * this.m.cos(conto.xy));
                    this.hitmag = (int)((float)this.hitmag + Math.abs(f1));
                }
                if (f1 == 0.0f) continue;
                if (Math.abs(f1) >= 1.0f) {
                    conto.p[j].chip = 1;
                    conto.p[j].ctmag = f1;
                }
                if (!conto.p[j].nocol && !conto.p[j].glass) {
                    if (conto.p[j].bfase > 20 && (double)conto.p[j].hsb[1] > 0.25) {
                        conto.p[j].hsb[1] = 0.25f;
                    }
                    if (conto.p[j].bfase > 25 && (double)conto.p[j].hsb[2] > 0.7) {
                        conto.p[j].hsb[2] = 0.7f;
                    }
                    if (conto.p[j].bfase > 30 && (double)conto.p[j].hsb[1] > 0.15) {
                        conto.p[j].hsb[1] = 0.15f;
                    }
                    if (conto.p[j].bfase > 35 && (double)conto.p[j].hsb[2] > 0.6) {
                        conto.p[j].hsb[2] = 0.6f;
                    }
                    if (conto.p[j].bfase > 40) {
                        conto.p[j].hsb[0] = 0.075f;
                    }
                    if (conto.p[j].bfase > 50 && (double)conto.p[j].hsb[2] > 0.5) {
                        conto.p[j].hsb[2] = 0.5f;
                    }
                    if (conto.p[j].bfase > 60) {
                        conto.p[j].hsb[0] = 0.05f;
                    }
                    conto.p[j].bfase = (int)((float)conto.p[j].bfase + Math.abs(f1));
                    new Color(conto.p[j].c[0], conto.p[j].c[1], conto.p[j].c[2]);
                    Color color = Color.getHSBColor(conto.p[j].hsb[0], conto.p[j].hsb[1], conto.p[j].hsb[2]);
                    conto.p[j].c[0] = color.getRed();
                    conto.p[j].c[1] = color.getGreen();
                    conto.p[j].c[2] = color.getBlue();
                }
                if (!conto.p[j].glass) continue;
                conto.p[j].gr = (int)((double)conto.p[j].gr + Math.abs((double)f1 * 0.0));
            }
        }
    }

    public void drive(Control control, ContO conto, Trackers trackers, CheckPoints checkpoints, ContO[] aconto, int[] ai99, int i99) {
        int i2;
        float f5;
        int l;
        int k;
        int i = 1;
        int j = 1;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        this.capsized = false;
        for (k = Math.abs(this.pzy); k > 270; k -= 360) {
        }
        if ((k = Math.abs(k)) > 90) {
            flag = true;
        }
        boolean flag3 = false;
        for (l = Math.abs(this.pxy); l > 270; l -= 360) {
        }
        if ((l = Math.abs(l)) > 90) {
            flag3 = true;
            j = -1;
        }
        int i1 = conto.grat;
        if (flag) {
            if (flag3) {
                flag3 = false;
                flag1 = true;
            } else {
                flag3 = true;
                this.capsized = true;
            }
            i = -1;
        } else if (flag3) {
            this.capsized = true;
        }
        if (this.capsized) {
            i1 = this.flipy[this.cn] + this.squash;
        }
        control.zyinv = flag;
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        if (this.mtouch) {
            this.loop = 0;
        }
        if (this.cn == 34) {
            conto.elec = true;
            conto.roted = true;
        }
        if (this.wtouch) {
            if (this.loop == 2 || this.loop == -1) {
                this.loop = -1;
                if (control.left) {
                    this.pl = true;
                }
                if (control.right) {
                    this.pr = true;
                }
                if (control.up) {
                    this.pu = true;
                }
                if (control.down) {
                    this.pd = true;
                }
            }
            this.ucomp = 0.0f;
            this.dcomp = 0.0f;
            this.lcomp = 0.0f;
            this.rcomp = 0.0f;
        }
        if (control.handb) {
            if (!this.pushed) {
                if (!this.wtouch) {
                    if (this.loop == 0) {
                        this.loop = 1;
                    }
                } else if (this.gtouch) {
                    this.pushed = true;
                }
            }
        } else {
            this.pushed = false;
        }
        if (this.loop == 1) {
            float f3 = (this.scy[0] + this.scy[1] + this.scy[2] + this.scy[3]) / 4.0f;
            int j1 = 0;
            do {
                this.scy[j1] = f3;
            } while (++j1 < 4);
            this.loop = 2;
        }
        if (!this.dest) {
            if (this.loop == 2) {
                if (control.up) {
                    if (this.ucomp == 0.0f) {
                        this.ucomp = 10.0f + (this.scy[0] + 50.0f) / 20.0f;
                        if (this.ucomp < 5.0f) {
                            this.ucomp = 5.0f;
                        }
                        if (this.ucomp > 10.0f) {
                            this.ucomp = 10.0f;
                        }
                        this.ucomp *= this.airs[this.cn];
                    }
                    if (this.ucomp < 20.0f) {
                        this.ucomp = (float)((double)this.ucomp + 0.5 * (double)this.airs[this.cn]);
                    }
                    f = (float)(-this.airc[this.cn]) * this.m.sin(conto.xz) * (float)j;
                    f1 = (float)this.airc[this.cn] * this.m.cos(conto.xz) * (float)j;
                } else if (this.ucomp != 0.0f && this.ucomp > -2.0f) {
                    this.ucomp = (float)((double)this.ucomp - 0.5 * (double)this.airs[this.cn]);
                }
                if (control.down) {
                    if (this.dcomp == 0.0f) {
                        this.dcomp = 10.0f + (this.scy[0] + 50.0f) / 20.0f;
                        if (this.dcomp < 5.0f) {
                            this.dcomp = 5.0f;
                        }
                        if (this.dcomp > 10.0f) {
                            this.dcomp = 10.0f;
                        }
                        this.dcomp *= this.airs[this.cn];
                    }
                    if (this.dcomp < 20.0f) {
                        this.dcomp = (float)((double)this.dcomp + 0.5 * (double)this.airs[this.cn]);
                    }
                    f2 = -this.airc[this.cn];
                } else if (this.dcomp != 0.0f && this.ucomp > -2.0f) {
                    this.dcomp = (float)((double)this.dcomp - 0.5 * (double)this.airs[this.cn]);
                }
                if (control.left) {
                    if (this.lcomp == 0.0f && this.cn != 26 && this.cn != 35 && this.cn != 37) {
                        this.lcomp = 5.0f;
                    }
                    if (this.lcomp < 20.0f) {
                        this.lcomp += 2.0f * this.airs[this.cn];
                    }
                    f = (float)(-this.airc[this.cn]) * this.m.cos(conto.xz) * (float)i;
                    f1 = (float)(-this.airc[this.cn]) * this.m.sin(conto.xz) * (float)i;
                } else if (this.lcomp > 0.0f) {
                    this.lcomp -= 2.0f * this.airs[this.cn];
                }
                if (control.right) {
                    if (this.rcomp == 0.0f && this.cn != 26 && this.cn != 35 && this.cn != 37) {
                        this.rcomp = 5.0f;
                    }
                    if (this.rcomp < 20.0f) {
                        this.rcomp += 2.0f * this.airs[this.cn];
                    }
                    f = (float)this.airc[this.cn] * this.m.cos(conto.xz) * (float)i;
                    f1 = (float)this.airc[this.cn] * this.m.sin(conto.xz) * (float)i;
                } else if (this.rcomp > 0.0f) {
                    this.rcomp -= 2.0f * this.airs[this.cn];
                }
                this.pzy = (int)((float)this.pzy + (this.dcomp - this.ucomp) * this.m.cos(this.pxy));
                conto.xz = flag ? (int)((float)conto.xz + (this.dcomp - this.ucomp) * this.m.sin(this.pxy)) : (int)((float)conto.xz - (this.dcomp - this.ucomp) * this.m.sin(this.pxy));
                this.pxy = (int)((float)this.pxy + (this.rcomp - this.lcomp));
            } else {
                float f4 = this.power;
                if (f4 < 40.0f) {
                    f4 = 40.0f;
                }
                if (this.im == 0 && this.power != 98.0f) {
                    if (checkpoints.stage != 6 && checkpoints.stage != 8) {
                        f4 = (float)((double)f4 * 0.76);
                    } else if (checkpoints.stage != 6) {
                        f4 = (float)((double)f4 * 0.9);
                    }
                }
                if (control.down) {
                    if (this.speed > 0.0f) {
                        this.speed -= (float)(this.handb[this.cn] / 2);
                    } else {
                        int k1 = 0;
                        int j2 = 0;
                        do {
                            if (!(this.speed <= -((float)(this.swits[this.cn][j2] / 2) + f4 * (float)this.swits[this.cn][j2] / 196.0f))) continue;
                            ++k1;
                        } while (++j2 < 2);
                        this.speed = k1 != 2 ? (this.speed -= this.acelf[this.cn][k1] / 2.0f + f4 * this.acelf[this.cn][k1] / 196.0f) : -((float)(this.swits[this.cn][1] / 2) + f4 * (float)this.swits[this.cn][1] / 196.0f);
                    }
                }
                if (control.up) {
                    if (this.speed < 0.0f) {
                        this.speed += (float)this.handb[this.cn];
                    } else {
                        int l1 = 0;
                        int k2 = 0;
                        do {
                            if (!(this.speed >= (float)(this.swits[this.cn][k2] / 2) + f4 * (float)this.swits[this.cn][k2] / 196.0f)) continue;
                            ++l1;
                        } while (++k2 < 3);
                        this.speed = l1 != 3 ? (this.speed += this.acelf[this.cn][l1] / 2.0f + f4 * this.acelf[this.cn][l1] / 196.0f) : (float)(this.swits[this.cn][2] / 2) + f4 * (float)this.swits[this.cn][2] / 196.0f;
                    }
                }
                if (control.handb && Math.abs(this.speed) > (float)this.handb[this.cn]) {
                    this.speed = this.speed < 0.0f ? (this.speed += (float)this.handb[this.cn]) : (this.speed -= (float)this.handb[this.cn]);
                }
                if (this.loop == -1 && conto.y < 100) {
                    if (control.left) {
                        if (!this.pl) {
                            if (this.lcomp == 0.0f) {
                                this.lcomp = 5.0f * this.airs[this.cn];
                            }
                            if (this.lcomp < 20.0f) {
                                this.lcomp += 2.0f * this.airs[this.cn];
                            }
                        }
                    } else {
                        if (this.lcomp > 0.0f) {
                            this.lcomp -= 2.0f * this.airs[this.cn];
                        }
                        this.pl = false;
                    }
                    if (control.right) {
                        if (!this.pr) {
                            if (this.rcomp == 0.0f) {
                                this.rcomp = 5.0f * this.airs[this.cn];
                            }
                            if (this.rcomp < 20.0f) {
                                this.rcomp += 2.0f * this.airs[this.cn];
                            }
                        }
                    } else {
                        if (this.rcomp > 0.0f) {
                            this.rcomp -= 2.0f * this.airs[this.cn];
                        }
                        this.pr = false;
                    }
                    if (control.up) {
                        if (!this.pu) {
                            if (this.ucomp == 0.0f) {
                                this.ucomp = 5.0f * this.airs[this.cn];
                            }
                            if (this.ucomp < 20.0f) {
                                this.ucomp += 2.0f * this.airs[this.cn];
                            }
                        }
                    } else {
                        if (this.ucomp > 0.0f) {
                            this.ucomp -= 2.0f * this.airs[this.cn];
                        }
                        this.pu = false;
                    }
                    if (control.down) {
                        if (!this.pd) {
                            if (this.dcomp == 0.0f) {
                                this.dcomp = 5.0f * this.airs[this.cn];
                            }
                            if (this.dcomp < 20.0f) {
                                this.dcomp += 2.0f * this.airs[this.cn];
                            }
                        }
                    } else {
                        if (this.dcomp > 0.0f) {
                            this.dcomp -= 2.0f * this.airs[this.cn];
                        }
                        this.pd = false;
                    }
                    this.pzy = (int)((float)this.pzy + (this.dcomp - this.ucomp) * this.m.cos(this.pxy));
                    conto.xz = flag ? (int)((float)conto.xz + (this.dcomp - this.ucomp) * this.m.sin(this.pxy)) : (int)((float)conto.xz - (this.dcomp - this.ucomp) * this.m.sin(this.pxy));
                    this.pxy = (int)((float)this.pxy + (this.rcomp - this.lcomp));
                }
            }
        }
        if ((f5 = 20.0f * this.speed / (154.0f * this.simag[this.cn])) > 22.0f) {
            f5 = 22.0f;
        }
        if (f5 < -22.0f) {
            f5 = -22.0f;
        }
        conto.wzy = (int)((float)conto.wzy - f5);
        if (conto.wzy < -45) {
            conto.wzy += 45;
        }
        if (conto.wzy > 45) {
            conto.wzy -= 45;
        }
        if (control.right) {
            conto.wxz -= this.turn[this.cn];
            if (conto.wxz < -36) {
                conto.wxz = -36;
            }
        }
        if (control.left) {
            conto.wxz += this.turn[this.cn];
            if (conto.wxz > 36) {
                conto.wxz = 36;
            }
        }
        if (conto.wxz != 0 && !control.left && !control.right) {
            if (Math.abs(conto.wxz) < this.turn[this.cn] * 2) {
                conto.wxz = 0;
            }
            if (conto.wxz > 0) {
                conto.wxz -= this.turn[this.cn] * 2;
            }
            if (conto.wxz < 0) {
                conto.wxz += this.turn[this.cn] * 2;
            }
        }
        if ((i2 = (int)(0.0f / (this.speed * this.speed))) < 5) {
            i2 = 5;
        }
        if (this.speed < 0.0f) {
            i2 = -i2;
        }
        if (this.wtouch) {
            if (!this.capsized) {
                this.fxz = !control.handb ? conto.wxz / (i2 * 3) : conto.wxz / i2;
                conto.xz += conto.wxz / i2;
            }
            this.wtouch = false;
            this.gtouch = false;
        } else {
            conto.xz += this.fxz;
        }
        if (this.speed > 6.0f || this.speed < -6.0f) {
            while (Math.abs(this.mxz - this.cxz) > 180) {
                if (this.cxz > this.mxz) {
                    this.cxz -= 360;
                    continue;
                }
                if (this.cxz >= this.mxz) continue;
                this.cxz += 360;
            }
            if (Math.abs(this.mxz - this.cxz) < 30) {
                this.cxz = (int)((float)this.cxz + (float)(this.mxz - this.cxz) / 4.0f);
            } else {
                if (this.cxz > this.mxz) {
                    this.cxz -= 10;
                }
                if (this.cxz < this.mxz) {
                    this.cxz += 10;
                }
            }
        }
        float[] af = new float[4];
        float[] af1 = new float[4];
        float[] af2 = new float[4];
        int l2 = 0;
        do {
            af[l2] = conto.keyx[l2] + conto.x;
            af2[l2] = i1 + conto.y;
            af1[l2] = conto.z + conto.keyz[l2];
            if (checkpoints.stage != 39 && checkpoints.stage != 38) {
                int n = l2;
                this.scy[n] = this.scy[n] + 7.0f;
            }
            if (checkpoints.stage == 39) {
                int n = l2;
                this.scy[n] = this.scy[n] + 1.1666666f;
            }
            if (checkpoints.stage != 38) continue;
            int n = l2;
            this.scy[n] = this.scy[n] + 3.5f;
        } while (++l2 < 4);
        this.rot(af, af2, conto.x, conto.y, this.pxy, 4);
        this.rot(af2, af1, conto.y, conto.z, this.pzy, 4);
        this.rot(af, af1, conto.x, conto.z, conto.xz, 4);
        boolean flag4 = false;
        double d = 0.0;
        int i3 = (int)((this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f);
        int j3 = (int)((this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f);
        int k3 = 0;
        do {
            if (this.scx[k3] - (float)i3 > 200.0f) {
                this.scx[k3] = 200 + i3;
            }
            if (this.scx[k3] - (float)i3 < -200.0f) {
                this.scx[k3] = i3 - 200;
            }
            if (this.scz[k3] - (float)j3 > 200.0f) {
                this.scz[k3] = 200 + j3;
            }
            if (!(this.scz[k3] - (float)j3 < -200.0f)) continue;
            this.scz[k3] = j3 - 200;
        } while (++k3 < 4);
        k3 = 0;
        do {
            int n = k3;
            af2[n] = af2[n] + this.scy[k3];
            int n2 = k3;
            af[n2] = af[n2] + (this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f;
            int n3 = k3++;
            af1[n3] = af1[n3] + (this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f;
        } while (k3 < 4);
        k3 = 1;
        for (int l3 = 0; l3 < trackers.nt; ++l3) {
            if (Math.abs(trackers.zy[l3]) == 90 || Math.abs(trackers.xy[l3]) == 90 || Math.abs(conto.x - trackers.x[l3]) >= trackers.radx[l3] || Math.abs(conto.z - trackers.z[l3]) >= trackers.radz[l3]) continue;
            k3 = trackers.skd[l3];
        }
        if (this.mtouch) {
            if (this.cn != 24 && this.cn != 25 && this.cn != 31 && this.cn != 33 && this.cn != 34 && this.cn != 35 && this.cn != 36 && this.cn != 37 && this.cn != 38 && this.cn != 39 && (control.left || control.right)) {
                this.speed -= this.speed / 100.0f;
            }
            float f6 = this.grip[this.cn];
            f6 -= (float)Math.abs(this.txz - conto.xz) * this.speed / 250.0f;
            if (control.handb) {
                f6 -= (float)(Math.abs(this.txz - conto.xz) * 4);
            }
            if (f6 < this.grip[this.cn]) {
                if (this.skid != 2) {
                    this.skid = 1;
                }
            } else if (this.skid == 1) {
                this.skid = 2;
            }
            if (k3 == 1) {
                if (checkpoints.stage != 37) {
                    f6 = (float)((double)f6 * 0.75);
                }
                if (checkpoints.stage == 37) {
                    f6 = this.cn != 24 && this.cn != 25 && this.cn != 28 && this.cn != 29 && this.cn != 30 && this.cn != 31 ? (float)((double)f6 * 0.075) : (float)((double)f6 * 0.75);
                }
            }
            if (k3 == 2) {
                f6 = (float)((double)f6 * 0.55);
            }
            int j4 = -((int)(this.speed * this.m.sin(conto.xz) * this.m.cos(this.pzy)));
            int k4 = (int)(this.speed * this.m.cos(conto.xz) * this.m.cos(this.pzy));
            int i5 = -((int)(this.speed * this.m.sin(this.pzy)));
            if (this.capsized || this.dest || checkpoints.haltall) {
                this.speed /= 3.0f;
                if (checkpoints.stage != 37) {
                    f6 = this.grip[this.cn] / 5.0f;
                }
                if (checkpoints.stage == 37) {
                    f6 = this.cn != 24 && this.cn != 25 && this.cn != 28 && this.cn != 29 && this.cn != 30 && this.cn != 31 ? this.grip[this.cn] / 50.0f : this.grip[this.cn] / 5.0f;
                }
                this.speed = this.speed > 0.0f ? (this.speed -= 2.0f) : (this.speed += 2.0f);
            }
            this.speed = Math.abs(this.speed) > this.drag[this.cn] ? (this.speed > 0.0f ? (this.speed -= this.drag[this.cn]) : (this.speed += this.drag[this.cn])) : 0.0f;
            if (this.cn == 8 && f6 < 5.0f) {
                f6 = 5.0f;
            }
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            float f9 = 0.0f;
            float f10 = 0.0f;
            int l6 = 0;
            do {
                if (Math.abs(this.scx[l6] - (float)j4) > f6) {
                    if (this.scx[l6] < (float)j4) {
                        int n = l6;
                        this.scx[n] = this.scx[n] + f6;
                    } else {
                        int n = l6;
                        this.scx[n] = this.scx[n] - f6;
                    }
                } else {
                    this.scx[l6] = j4;
                }
                if (Math.abs(this.scz[l6] - (float)k4) > f6) {
                    if (this.scz[l6] < (float)k4) {
                        int n = l6;
                        this.scz[n] = this.scz[n] + f6;
                    } else {
                        int n = l6;
                        this.scz[n] = this.scz[n] - f6;
                    }
                } else {
                    this.scz[l6] = k4;
                }
                if (Math.abs(this.scy[l6] - (float)i5) > f6) {
                    if (this.scy[l6] < (float)i5) {
                        int n = l6;
                        this.scy[n] = this.scy[n] + f6;
                    } else {
                        int n = l6;
                        this.scy[n] = this.scy[n] - f6;
                    }
                } else {
                    this.scy[l6] = i5;
                }
                if (f6 < this.grip[this.cn]) {
                    if (this.txz != conto.xz) {
                        ++this.dcnt;
                    } else if (this.dcnt != 0) {
                        this.dcnt = 0;
                    }
                    if ((float)this.dcnt > 40.0f * f6 / this.grip[this.cn] || this.capsized) {
                        float f11 = 1.0f;
                        if (k3 != 0) {
                            f11 = 1.2f;
                        }
                        if ((double)this.m.random() > 0.75) {
                            conto.dust(l6, af[l6], af2[l6], af1[l6], this.scx[l6], this.scz[l6], f11 * this.simag[this.cn], true, (int)this.tilt);
                            if (this.im == 0 && !this.capsized) {
                                this.xt.skid(k3, (float)Math.sqrt(this.scx[l6] * this.scx[l6] + this.scz[l6] * this.scz[l6]));
                            }
                        }
                    } else {
                        if (k3 == 1 && (double)this.m.random() > 0.85) {
                            conto.dust(l6, af[l6], af2[l6], af1[l6], this.scx[l6], this.scz[l6], 1.1f * this.simag[this.cn], false, (int)this.tilt);
                        }
                        if ((k3 == 2 || k3 == 3) && (double)this.m.random() > 0.7) {
                            conto.dust(l6, af[l6], af2[l6], af1[l6], this.scx[l6], this.scz[l6], 1.15f * this.simag[this.cn], false, (int)this.tilt);
                        }
                    }
                } else if (this.dcnt != 0) {
                    this.dcnt -= 2;
                    if (this.dcnt < 0) {
                        this.dcnt = 0;
                    }
                }
                if (k3 == 3) {
                    int k7 = (int)(this.m.random() * 4.0f);
                    this.scy[k7] = (float)((double)(-100.0f * this.m.random() * (this.speed / (float)this.swits[this.cn][2])) * ((double)this.bounce[this.cn] - 0.3));
                }
                if (k3 == 4) {
                    int l7 = (int)(this.m.random() * 4.0f);
                    this.scy[l7] = (float)((double)(-150.0f * this.m.random() * (this.speed / (float)this.swits[this.cn][2])) * ((double)this.bounce[this.cn] - 0.3));
                }
                f9 += this.scx[l6];
                f10 += this.scz[l6];
            } while (++l6 < 4);
            this.txz = conto.xz;
            i = f9 > 0.0f ? -1 : 1;
            double d1 = (double)f10 / Math.sqrt(f9 * f9 + f10 * f10);
            this.mxz = (int)(Math.acos(d1) / (Math.PI / 180) * (double)i);
            if (this.skid == 2) {
                if (!this.capsized) {
                    f9 /= 4.0f;
                    f10 /= 4.0f;
                    this.speed = flag1 ? -((float)Math.sqrt(f9 * f9 + f10 * f10) * this.m.cos(this.mxz - conto.xz)) : (float)Math.sqrt(f9 * f9 + f10 * f10) * this.m.cos(this.mxz - conto.xz);
                }
                this.skid = 0;
            }
            if (this.capsized && f9 == 0.0f && f10 == 0.0f) {
                k3 = 0;
            }
            this.mtouch = false;
            flag4 = true;
        } else if (this.skid != 2) {
            this.skid = 2;
        }
        int i4 = 0;
        boolean[] aflag = new boolean[4];
        int l4 = 0;
        do {
            if (af2[l4] > 245.0f) {
                ++i4;
                this.wtouch = true;
                this.gtouch = true;
                if (!flag4 && this.scy[l4] != 7.0f) {
                    float f7 = this.scy[l4] / 333.33f;
                    if ((double)f7 > 0.3) {
                        f7 = 0.3f;
                    }
                    f7 = k3 == 0 ? (float)((double)f7 + 1.1) : (float)((double)f7 + 1.2);
                    conto.dust(l4, af[l4], af2[l4], af1[l4], this.scx[l4], this.scz[l4], f7 * this.simag[this.cn], true, 0);
                }
                af2[l4] = 250.0f;
                float f8 = 0.0f;
                int iiii = 0;
                do {
                    if ((float)l4 == f8 || !(af2[iiii] <= 245.0f)) continue;
                    int n = iiii;
                    af2[n] = af2[n] - (af2[l4] - 250.0f);
                } while ((f8 += 1.0f) < 4.0f);
                f8 = Math.abs(this.m.sin(this.pxy)) + Math.abs(this.m.sin(this.pzy));
                if ((double)(f8 /= 3.0f) > 0.4) {
                    f8 = 0.4f;
                }
                if ((double)(f8 += this.bounce[this.cn]) < 1.1) {
                    f8 = 1.1f;
                }
                this.regy(l4, Math.abs(this.scy[l4] * f8), conto);
                if (this.scy[l4] > 0.0f) {
                    int n = l4;
                    this.scy[n] = this.scy[n] - Math.abs(this.scy[l4] * f8);
                }
            }
            aflag[l4] = false;
        } while (++l4 < 4);
        l4 = 0;
        for (int j5 = 0; j5 < trackers.nt; ++j5) {
            int l5 = 0;
            int j6 = 0;
            int i7 = 0;
            do {
                int iiii;
                if (aflag[i7] || !(af[i7] > (float)(trackers.x[j5] - trackers.radx[j5])) || !(af[i7] < (float)(trackers.x[j5] + trackers.radx[j5])) || !(af1[i7] > (float)(trackers.z[j5] - trackers.radz[j5])) || !(af1[i7] < (float)(trackers.z[j5] + trackers.radz[j5])) || !(af2[i7] > (float)(trackers.y[j5] - trackers.rady[j5])) || !(af2[i7] < (float)(trackers.y[j5] + trackers.rady[j5]))) continue;
                if (trackers.xy[j5] == 0 && trackers.zy[j5] == 0 && trackers.y[j5] != 250 && af2[i7] > (float)(trackers.y[j5] - 5)) {
                    ++j6;
                    this.wtouch = true;
                    this.gtouch = true;
                    if (!flag4 && this.scy[i7] != 7.0f) {
                        float f12 = this.scy[i7] / 333.33f;
                        if ((double)f12 > 0.3) {
                            f12 = 0.3f;
                        }
                        f12 = k3 == 0 ? (float)((double)f12 + 1.1) : (float)((double)f12 + 1.2);
                        conto.dust(i7, af[i7], af2[i7], af1[i7], this.scx[i7], this.scz[i7], f12 * this.simag[this.cn], true, 0);
                    }
                    af2[i7] = trackers.y[j5];
                    float f13 = 0.0f;
                    iiii = 0;
                    do {
                        if ((float)i7 == f13 || !(af2[iiii] <= (float)(trackers.y[j5] - 5))) continue;
                        int n = iiii;
                        af2[n] = af2[n] - (af2[i7] - (float)trackers.y[j5]);
                    } while ((f13 += 1.0f) < 4.0f);
                    f13 = Math.abs(this.m.sin(this.pxy)) + Math.abs(this.m.sin(this.pzy));
                    if ((double)(f13 /= 3.0f) > 0.4) {
                        f13 = 0.4f;
                    }
                    if ((double)(f13 += this.bounce[this.cn]) < 1.1) {
                        f13 = 1.1f;
                    }
                    this.regy(i7, Math.abs(this.scy[i7] * f13), conto);
                    if (this.scy[i7] > 0.0f) {
                        int n = i7;
                        this.scy[n] = this.scy[n] - Math.abs(this.scy[i7] * f13);
                    }
                    aflag[i7] = true;
                }
                if (trackers.zy[j5] == -90 && af1[i7] < (float)(trackers.z[j5] + trackers.radz[j5]) && this.scz[i7] < 0.0f) {
                    af1[i7] = trackers.z[j5] + trackers.radz[j5];
                    float f14 = 0.0f;
                    iiii = 0;
                    do {
                        if ((float)i7 == f14 || !(af1[iiii] >= (float)(trackers.z[j5] + trackers.radz[j5]))) continue;
                        int n = iiii;
                        af1[n] = af1[n] - (af1[i7] - (float)(trackers.z[j5] + trackers.radz[j5]));
                    } while ((f14 += 1.0f) < 4.0f);
                    f14 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    if ((double)(f14 /= 4.0f) > 0.3) {
                        f14 = 0.3f;
                    }
                    if (flag4) {
                        f14 = 0.0f;
                    }
                    if ((double)(f14 = (float)((double)f14 + ((double)this.bounce[this.cn] - 0.2))) < 1.1) {
                        f14 = 1.1f;
                    }
                    this.regz(i7, Math.abs(this.scz[i7] * f14 * (float)trackers.dam[j5]), conto);
                    int n = i7;
                    this.scz[n] = this.scz[n] + Math.abs(this.scz[i7] * f14);
                    this.skid = 2;
                    flag2 = true;
                    aflag[i7] = true;
                    if (!trackers.notwall[j5]) {
                        control.wall = j5;
                    }
                }
                if (trackers.zy[j5] == 90 && af1[i7] > (float)(trackers.z[j5] - trackers.radz[j5]) && this.scz[i7] > 0.0f) {
                    af1[i7] = trackers.z[j5] - trackers.radz[j5];
                    float f15 = 0.0f;
                    iiii = 0;
                    do {
                        if ((float)i7 == f15 || !(af1[iiii] <= (float)(trackers.z[j5] - trackers.radz[j5]))) continue;
                        int n = iiii;
                        af1[n] = af1[n] - (af1[i7] - (float)(trackers.z[j5] - trackers.radz[j5]));
                    } while ((f15 += 1.0f) < 4.0f);
                    f15 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    if ((double)(f15 /= 4.0f) > 0.3) {
                        f15 = 0.3f;
                    }
                    if (flag4) {
                        f15 = 0.0f;
                    }
                    if ((double)(f15 = (float)((double)f15 + ((double)this.bounce[this.cn] - 0.2))) < 1.1) {
                        f15 = 1.1f;
                    }
                    this.regz(i7, -Math.abs(this.scz[i7] * f15 * (float)trackers.dam[j5]), conto);
                    int n = i7;
                    this.scz[n] = this.scz[n] - Math.abs(this.scz[i7] * f15);
                    this.skid = 2;
                    flag2 = true;
                    aflag[i7] = true;
                    if (!trackers.notwall[j5]) {
                        control.wall = j5;
                    }
                }
                if (trackers.xy[j5] == -90 && af[i7] < (float)(trackers.x[j5] + trackers.radx[j5]) && this.scx[i7] < 0.0f) {
                    af[i7] = trackers.x[j5] + trackers.radx[j5];
                    float f16 = 0.0f;
                    iiii = 0;
                    do {
                        if ((float)i7 == f16 || !(af[iiii] >= (float)(trackers.x[j5] + trackers.radx[j5]))) continue;
                        int n = iiii;
                        af[n] = af[n] - (af[i7] - (float)(trackers.x[j5] + trackers.radx[j5]));
                    } while ((f16 += 1.0f) < 4.0f);
                    f16 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    if ((double)(f16 /= 4.0f) > 0.3) {
                        f16 = 0.3f;
                    }
                    if (flag4) {
                        f16 = 0.0f;
                    }
                    if ((double)(f16 = (float)((double)f16 + ((double)this.bounce[this.cn] - 0.2))) < 1.1) {
                        f16 = 1.1f;
                    }
                    this.regx(i7, Math.abs(this.scx[i7] * f16 * (float)trackers.dam[j5]), conto);
                    int n = i7;
                    this.scx[n] = this.scx[n] + Math.abs(this.scx[i7] * f16);
                    this.skid = 2;
                    flag2 = true;
                    aflag[i7] = true;
                    if (!trackers.notwall[j5]) {
                        control.wall = j5;
                    }
                }
                if (trackers.xy[j5] == 90 && af[i7] > (float)(trackers.x[j5] - trackers.radx[j5]) && this.scx[i7] > 0.0f) {
                    af[i7] = trackers.x[j5] - trackers.radx[j5];
                    float f17 = 0.0f;
                    iiii = 0;
                    do {
                        if ((float)i7 == f17 || !(af[iiii] <= (float)(trackers.x[j5] - trackers.radx[j5]))) continue;
                        int n = iiii;
                        af[n] = af[n] - (af[i7] - (float)(trackers.x[j5] - trackers.radx[j5]));
                    } while ((f17 += 1.0f) < 4.0f);
                    f17 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    if ((double)(f17 /= 4.0f) > 0.3) {
                        f17 = 0.3f;
                    }
                    if (flag4) {
                        f17 = 0.0f;
                    }
                    if ((double)(f17 = (float)((double)f17 + ((double)this.bounce[this.cn] - 0.2))) < 1.1) {
                        f17 = 1.1f;
                    }
                    this.regx(i7, -Math.abs(this.scx[i7] * f17 * (float)trackers.dam[j5]), conto);
                    int n = i7;
                    this.scx[n] = this.scx[n] - Math.abs(this.scx[i7] * f17);
                    this.skid = 2;
                    flag2 = true;
                    aflag[i7] = true;
                    if (!trackers.notwall[j5]) {
                        control.wall = j5;
                    }
                }
                if (trackers.zy[j5] != 0 && trackers.zy[j5] != 90 && trackers.zy[j5] != -90) {
                    int i8 = 90 + trackers.zy[j5];
                    float f19 = 1.0f + (float)(50 - Math.abs(trackers.zy[j5])) / 30.0f;
                    if (f19 < 1.0f) {
                        f19 = 1.0f;
                    }
                    float f21 = (float)trackers.y[j5] + ((af2[i7] - (float)trackers.y[j5]) * this.m.cos(i8) - (af1[i7] - (float)trackers.z[j5]) * this.m.sin(i8));
                    float f23 = (float)trackers.z[j5] + ((af2[i7] - (float)trackers.y[j5]) * this.m.sin(i8) + (af1[i7] - (float)trackers.z[j5]) * this.m.cos(i8));
                    if (f23 > (float)trackers.z[j5] && f23 < (float)(trackers.z[j5] + 200)) {
                        int n = i7;
                        this.scy[n] = this.scy[n] - (f23 - (float)trackers.z[j5]) / f19;
                        f23 = trackers.z[j5];
                    }
                    if (f23 > (float)(trackers.z[j5] - 30)) {
                        if (trackers.skd[j5] == 2) {
                            ++l5;
                        } else {
                            ++l4;
                        }
                        this.wtouch = true;
                        this.gtouch = false;
                        if (!flag4 && k3 != 0) {
                            float f25 = 1.4f;
                            conto.dust(i7, af[i7], af2[i7], af1[i7], this.scx[i7], this.scz[i7], f25 * this.simag[this.cn], true, 0);
                        }
                    }
                    af2[i7] = (float)trackers.y[j5] + ((f21 - (float)trackers.y[j5]) * this.m.cos(-i8) - (f23 - (float)trackers.z[j5]) * this.m.sin(-i8));
                    af1[i7] = (float)trackers.z[j5] + ((f21 - (float)trackers.y[j5]) * this.m.sin(-i8) + (f23 - (float)trackers.z[j5]) * this.m.cos(-i8));
                    aflag[i7] = true;
                }
                if (trackers.xy[j5] == 0 || trackers.xy[j5] == 90 || trackers.xy[j5] == -90) continue;
                int j8 = 90 + trackers.xy[j5];
                float f20 = 1.0f + (float)(50 - Math.abs(trackers.xy[j5])) / 30.0f;
                if (f20 < 1.0f) {
                    f20 = 1.0f;
                }
                float f22 = (float)trackers.y[j5] + ((af2[i7] - (float)trackers.y[j5]) * this.m.cos(j8) - (af[i7] - (float)trackers.x[j5]) * this.m.sin(j8));
                float f24 = (float)trackers.x[j5] + ((af2[i7] - (float)trackers.y[j5]) * this.m.sin(j8) + (af[i7] - (float)trackers.x[j5]) * this.m.cos(j8));
                if (f24 > (float)trackers.x[j5] && f24 < (float)(trackers.x[j5] + 200)) {
                    int n = i7;
                    this.scy[n] = this.scy[n] - (f24 - (float)trackers.x[j5]) / f20;
                    f24 = trackers.x[j5];
                }
                if (f24 > (float)(trackers.x[j5] - 30)) {
                    if (trackers.skd[j5] == 2) {
                        ++l5;
                    } else {
                        ++l4;
                    }
                    this.wtouch = true;
                    this.gtouch = false;
                    if (!flag4 && k3 != 0) {
                        float f26 = 1.4f;
                        conto.dust(i7, af[i7], af2[i7], af1[i7], this.scx[i7], this.scz[i7], f26 * this.simag[this.cn], true, 0);
                    }
                }
                af2[i7] = (float)trackers.y[j5] + ((f22 - (float)trackers.y[j5]) * this.m.cos(-j8) - (f24 - (float)trackers.x[j5]) * this.m.sin(-j8));
                af[i7] = (float)trackers.x[j5] + ((f22 - (float)trackers.y[j5]) * this.m.sin(-j8) + (f24 - (float)trackers.x[j5]) * this.m.cos(-j8));
                aflag[i7] = true;
            } while (++i7 < 4);
            if (l5 == 4) {
                this.mtouch = true;
            }
            if (j6 != 4) continue;
            i4 = 4;
        }
        if (l4 == 4) {
            this.mtouch = true;
        }
        int k5 = 0;
        int i6 = 0;
        int k6 = 0;
        int j7 = 0;
        if (this.scy[2] != this.scy[0]) {
            i = this.scy[2] < this.scy[0] ? -1 : 1;
            double d2 = Math.sqrt((af1[0] - af1[2]) * (af1[0] - af1[2]) + (af2[0] - af2[2]) * (af2[0] - af2[2]) + (af[0] - af[2]) * (af[0] - af[2])) / (double)(Math.abs(conto.keyz[0]) + Math.abs(conto.keyz[2]));
            k5 = d2 >= 0.9998 ? i : (int)(Math.acos(d2) / (Math.PI / 180) * (double)i);
        }
        if (this.scy[3] != this.scy[1]) {
            i = this.scy[3] < this.scy[1] ? -1 : 1;
            double d3 = Math.sqrt((af1[1] - af1[3]) * (af1[1] - af1[3]) + (af2[1] - af2[3]) * (af2[1] - af2[3]) + (af[1] - af[3]) * (af[1] - af[3])) / (double)(Math.abs(conto.keyz[1]) + Math.abs(conto.keyz[3]));
            i6 = d3 >= 0.9998 ? i : (int)(Math.acos(d3) / (Math.PI / 180) * (double)i);
        }
        if (this.scy[1] != this.scy[0]) {
            i = this.scy[1] < this.scy[0] ? -1 : 1;
            double d4 = Math.sqrt((af1[0] - af1[1]) * (af1[0] - af1[1]) + (af2[0] - af2[1]) * (af2[0] - af2[1]) + (af[0] - af[1]) * (af[0] - af[1])) / (double)(Math.abs(conto.keyx[0]) + Math.abs(conto.keyx[1]));
            k6 = d4 >= 0.9998 ? i : (int)(Math.acos(d4) / (Math.PI / 180) * (double)i);
        }
        if (this.scy[3] != this.scy[2]) {
            i = this.scy[3] < this.scy[2] ? -1 : 1;
            double d5 = Math.sqrt((af1[2] - af1[3]) * (af1[2] - af1[3]) + (af2[2] - af2[3]) * (af2[2] - af2[3]) + (af[2] - af[3]) * (af[2] - af[3])) / (double)(Math.abs(conto.keyx[2]) + Math.abs(conto.keyx[3]));
            j7 = d5 >= 0.9998 ? i : (int)(Math.acos(d5) / (Math.PI / 180) * (double)i);
        }
        if (flag2) {
            int k8;
            for (k8 = Math.abs(conto.xz + 45); k8 > 180; k8 -= 360) {
            }
            this.pmlt = Math.abs(k8) > 90 ? 1 : -1;
            for (k8 = Math.abs(conto.xz - 45); k8 > 180; k8 -= 360) {
            }
            this.nmlt = Math.abs(k8) > 90 ? 1 : -1;
        }
        conto.xz = (int)((float)conto.xz + this.forca * (this.scz[0] * (float)this.nmlt - this.scz[1] * (float)this.pmlt + this.scz[2] * (float)this.pmlt - this.scz[3] * (float)this.nmlt + this.scx[0] * (float)this.pmlt + this.scx[1] * (float)this.nmlt - this.scx[2] * (float)this.nmlt - this.scx[3] * (float)this.pmlt));
        if (Math.abs(i6) > Math.abs(k5)) {
            k5 = i6;
        }
        if (Math.abs(j7) > Math.abs(k6)) {
            k6 = j7;
        }
        this.pzy = !flag ? (this.pzy += k5) : (this.pzy -= k5);
        this.pxy = !flag3 ? (this.pxy += k6) : (this.pxy -= k6);
        if (i4 == 4) {
            int l8 = 0;
            while (this.pzy < 360) {
                this.pzy += 360;
                conto.zy += 360;
            }
            while (this.pzy > 360) {
                this.pzy -= 360;
                conto.zy -= 360;
            }
            if (this.pzy < 190 && this.pzy > 170) {
                this.pzy = 180;
                conto.zy = 180;
                ++l8;
            }
            if (this.pzy > 350 || this.pzy < 10) {
                this.pzy = 0;
                conto.zy = 0;
                ++l8;
            }
            while (this.pxy < 360) {
                this.pxy += 360;
                conto.xy += 360;
            }
            while (this.pxy > 360) {
                this.pxy -= 360;
                conto.xy -= 360;
            }
            if (this.pxy < 190 && this.pxy > 170) {
                this.pxy = 180;
                conto.xy = 180;
                ++l8;
            }
            if (this.pxy > 350 || this.pxy < 10) {
                this.pxy = 0;
                conto.xy = 0;
                ++l8;
            }
            if (l8 == 2) {
                this.mtouch = true;
            }
        }
        if (!this.mtouch && this.wtouch) {
            if (this.cntouch == 10) {
                this.mtouch = true;
            } else {
                ++this.cntouch;
            }
        } else {
            this.cntouch = 0;
        }
        i = flag ? -1 : 1;
        if (checkpoints.stage != 999) {
            conto.x = (int)((af[0] - (float)conto.keyx[0] * this.m.cos(conto.xz) + (float)(i * conto.keyz[0]) * this.m.sin(conto.xz) + af[1] - (float)conto.keyx[1] * this.m.cos(conto.xz) + (float)(i * conto.keyz[1]) * this.m.sin(conto.xz) + af[2] - (float)conto.keyx[2] * this.m.cos(conto.xz) + (float)(i * conto.keyz[2]) * this.m.sin(conto.xz) + af[3] - (float)conto.keyx[3] * this.m.cos(conto.xz) + (float)(i * conto.keyz[3]) * this.m.sin(conto.xz)) / 4.0f + (float)i1 * this.m.sin(this.pxy) * this.m.cos(conto.xz) - (float)i1 * this.m.sin(this.pzy) * this.m.sin(conto.xz) + f);
            conto.y = (int)((af2[0] + af2[1] + af2[2] + af2[3]) / 4.0f - (float)i1 * this.m.cos(this.pzy) * this.m.cos(this.pxy) + f2);
            conto.z = (int)((af1[0] - (float)(i * conto.keyz[0]) * this.m.cos(conto.xz) - (float)conto.keyx[0] * this.m.sin(conto.xz) + af1[1] - (float)(i * conto.keyz[1]) * this.m.cos(conto.xz) - (float)conto.keyx[1] * this.m.sin(conto.xz) + af1[2] - (float)(i * conto.keyz[2]) * this.m.cos(conto.xz) - (float)conto.keyx[2] * this.m.sin(conto.xz) + af1[3] - (float)(i * conto.keyz[3]) * this.m.cos(conto.xz) - (float)conto.keyx[3] * this.m.sin(conto.xz)) / 4.0f + (float)i1 * this.m.sin(this.pxy) * this.m.sin(conto.xz) - (float)i1 * this.m.sin(this.pzy) * this.m.cos(conto.xz) + f1);
        } else {
            conto.x = (int)((af[0] - (float)conto.keyx[0] * this.m.cos(conto.xz) + (float)(i * conto.keyz[0]) * this.m.sin(conto.xz) + af[1] - (float)conto.keyx[1] * this.m.cos(conto.xz) + (float)(i * conto.keyz[1]) * this.m.sin(conto.xz) + af[2] - (float)conto.keyx[2] * this.m.cos(conto.xz) + (float)(i * conto.keyz[2]) * this.m.sin(conto.xz) + af[3] - (float)conto.keyx[3] * this.m.cos(conto.xz) + (float)(i * conto.keyz[3]) * this.m.sin(conto.xz)) / 4.05f + (float)i1 * this.m.sin(this.pxy) * this.m.cos(conto.xz) - (float)i1 * this.m.sin(this.pzy) * this.m.sin(conto.xz) + f);
            conto.y = (int)((af2[0] + af2[1] + af2[2] + af2[3]) / 4.05f - (float)i1 * this.m.cos(this.pzy) * this.m.cos(this.pxy) + f2);
            conto.z = (int)((af1[0] - (float)(i * conto.keyz[0]) * this.m.cos(conto.xz) - (float)conto.keyx[0] * this.m.sin(conto.xz) + af1[1] - (float)(i * conto.keyz[1]) * this.m.cos(conto.xz) - (float)conto.keyx[1] * this.m.sin(conto.xz) + af1[2] - (float)(i * conto.keyz[2]) * this.m.cos(conto.xz) - (float)conto.keyx[2] * this.m.sin(conto.xz) + af1[3] - (float)(i * conto.keyz[3]) * this.m.cos(conto.xz) - (float)conto.keyx[3] * this.m.sin(conto.xz)) / 4.05f + (float)i1 * this.m.sin(this.pxy) * this.m.sin(conto.xz) - (float)i1 * this.m.sin(this.pzy) * this.m.cos(conto.xz) + f1);
        }
        if (Math.abs(this.speed) > 10.0f || !this.mtouch) {
            conto.xy = Math.abs(this.pxy - conto.xy) >= 4 ? (this.pxy > conto.xy ? (conto.xy += 2 + (this.pxy - conto.xy) / 2) : (conto.xy -= 2 + (conto.xy - this.pxy) / 2)) : this.pxy;
            conto.zy = Math.abs(this.pzy - conto.zy) >= 4 ? (this.pzy > conto.zy ? (conto.zy += 2 + (this.pzy - conto.zy) / 2) : (conto.zy -= 2 + (conto.zy - this.pzy) / 2)) : this.pzy;
        }
        if (this.wtouch && !this.capsized) {
            float f18 = (float)((double)(this.speed / (float)this.swits[this.cn][2] * 14.0f) * ((double)this.bounce[this.cn] - 0.4));
            this.tilt = control.left && this.tilt < f18 && this.tilt >= 0.0f ? (float)((double)this.tilt + 0.4) : (control.right && this.tilt > -f18 && this.tilt <= 0.0f ? (float)((double)this.tilt - 0.4) : ((double)Math.abs(this.tilt) > 3.0 * ((double)this.bounce[this.cn] - 0.4) ? (this.tilt > 0.0f ? (float)((double)this.tilt - 3.0 * ((double)this.bounce[this.cn] - 0.3)) : (float)((double)this.tilt + 3.0 * ((double)this.bounce[this.cn] - 0.3))) : 0.0f));
            conto.xy = (int)((float)conto.xy + this.tilt);
        } else if (this.tilt != 0.0f) {
            this.tilt = 0.0f;
        }
        if (this.wtouch && k3 == 2) {
            conto.zy += (int)((double)(this.m.random() * 6.0f * this.speed / (float)this.swits[this.cn][2] - 3.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
            conto.xy += (int)((double)(this.m.random() * 6.0f * this.speed / (float)this.swits[this.cn][2] - 3.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
        }
        if (this.wtouch && k3 == 1) {
            conto.zy += (int)((double)(this.m.random() * 4.0f * this.speed / (float)this.swits[this.cn][2] - 2.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
            conto.xy += (int)((double)(this.m.random() * 4.0f * this.speed / (float)this.swits[this.cn][2] - 2.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
        }
        if (this.hitmag > this.maxmag[this.cn] && !this.dest) {
            this.distruct(conto);
            if (this.cntdest == 7) {
                this.dest = true;
            } else {
                ++this.cntdest;
            }
            if (this.cntdest == 1) {
                this.rpd.dest[this.im] = 300;
            }
        }
        if (conto.dist == 0) {
            for (int i9 = 0; i9 < conto.npl; ++i9) {
                if (conto.p[i9].chip != 0) {
                    conto.p[i9].chip = 0;
                }
                if (conto.p[i9].embos == 0) continue;
                conto.p[i9].embos = 13;
            }
        }
        if (checkpoints.stage == 43) {
            for (int i9 = 0; i9 < conto.npl; ++i9) {
                conto.p[i9].chip = 1;
                conto.p[i9].embos = 1;
            }
        }
        int j9 = 0;
        int k9 = 0;
        int l9 = 0;
        j = this.nofocus ? 1 : 7;
        for (int j10 = 0; j10 < checkpoints.n; ++j10) {
            if (checkpoints.typ[j10] > 0) {
                ++l9;
                if (checkpoints.typ[j10] == 1) {
                    if (this.clear == l9 + this.nlaps * checkpoints.nsp) {
                        j = 1;
                    }
                    if ((float)Math.abs(conto.z - checkpoints.z[j10]) < 60.0f + Math.abs(this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f && Math.abs(conto.x - checkpoints.x[j10]) < 700 && Math.abs(conto.y - checkpoints.y[j10]) < 800 && this.clear == l9 + this.nlaps * checkpoints.nsp - 1) {
                        this.clear = l9 + this.nlaps * checkpoints.nsp;
                        this.pcleared = j10;
                        this.focus = -1;
                    }
                }
                if (checkpoints.typ[j10] == 2) {
                    if (this.clear == l9 + this.nlaps * checkpoints.nsp) {
                        j = 1;
                    }
                    if ((float)Math.abs(conto.x - checkpoints.x[j10]) < 60.0f + Math.abs(this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f && Math.abs(conto.z - checkpoints.z[j10]) < 700 && Math.abs(conto.y - checkpoints.y[j10]) < 800 && this.clear == l9 + this.nlaps * checkpoints.nsp - 1) {
                        this.clear = l9 + this.nlaps * checkpoints.nsp;
                        this.pcleared = j10;
                        this.focus = -1;
                    }
                }
            }
            if (this.py(conto.x / 100, checkpoints.x[j10] / 100, conto.z / 100, checkpoints.z[j10] / 100) * j >= k9 && k9 != 0) continue;
            j9 = j10;
            k9 = this.py(conto.x / 100, checkpoints.x[j10] / 100, conto.z / 100, checkpoints.z[j10] / 100) * j;
        }
        if (this.clear == l9 + this.nlaps * checkpoints.nsp) {
            ++this.nlaps;
        }
        if (this.im == 0) {
            this.m.checkpoint = this.clear;
            while (this.m.checkpoint >= checkpoints.nsp) {
                this.m.checkpoint -= checkpoints.nsp;
            }
            if (this.clear == checkpoints.nlaps * checkpoints.nsp - 1) {
                this.m.lastcheck = true;
            }
            if (checkpoints.haltall) {
                this.m.lastcheck = false;
            }
        }
        if (this.focus == -1) {
            j9 = this.im == 0 ? (j9 += 2) : ++j9;
            if (!this.nofocus) {
                int i10 = this.pcleared + 1;
                if (i10 >= checkpoints.n) {
                    i10 = 0;
                }

                while (checkpoints.typ[i10] <= 0) {
                    ++i10;
                    if (i10 >= checkpoints.n) {
                        i10 = 0;
                    }
                }
            }
            if (j9 >= checkpoints.n) {
                j9 -= checkpoints.n;
            }
            if (checkpoints.typ[j9] == -3) {
                j9 = 0;
            }
            if (this.im == 0) {
                if (this.missedcp != -1) {
                    this.missedcp = -1;
                }
            } else if (this.missedcp != 0) {
                this.missedcp = 0;
            }
        } else {
            j9 = this.focus;
            if (this.im == 0) {
                if (this.missedcp == 0 && this.mtouch && Math.sqrt(this.py(conto.x / 10, checkpoints.x[this.focus] / 10, conto.z / 10, checkpoints.z[this.focus] / 10)) > 800.0) {
                    this.missedcp = 1;
                }
                if (this.missedcp == -2 && Math.sqrt(this.py(conto.x / 10, checkpoints.x[this.focus] / 10, conto.z / 10, checkpoints.z[this.focus] / 10)) < 400.0) {
                    this.missedcp = 0;
                }
                if (this.missedcp != 0 && this.mtouch && Math.sqrt(this.py(conto.x / 10, checkpoints.x[this.focus] / 10, conto.z / 10, checkpoints.z[this.focus] / 10)) < 250.0) {
                    this.missedcp = 68;
                }
            } else {
                this.missedcp = 1;
            }
            if (this.nofocus) {
                this.focus = -1;
                this.missedcp = 0;
            }
        }
        if (this.nofocus) {
            this.nofocus = false;
        }
        this.point = j9;
        for (int k10 = 0; k10 < checkpoints.fn; ++k10) {
            if (!checkpoints.roted[k10]) {
                if (Math.abs(conto.z - checkpoints.fz[k10]) >= 200 || this.py(conto.x / 100, checkpoints.fx[k10] / 100, conto.y / 100, checkpoints.fy[k10] / 100) >= 30) continue;
                if (conto.dist == 0) {
                    conto.fcnt = 8;
                } else {
                    if (this.im == 0 && !conto.fix && !this.xt.mutes) {
                        this.xt.carfixed.play();
                    }
                    conto.fix = true;
                }
                this.rpd.fix[this.im] = 300;
                continue;
            }
            if (Math.abs(conto.x - checkpoints.fx[k10]) >= 200 || this.py(conto.z / 100, checkpoints.fz[k10] / 100, conto.y / 100, checkpoints.fy[k10] / 100) >= 30) continue;
            if (conto.dist == 0) {
                conto.fcnt = 8;
            } else {
                if (this.im == 0 && !conto.fix && !this.xt.mutes) {
                    this.xt.carfixed.play();
                }
                conto.fix = true;
            }
            this.rpd.fix[this.im] = 300;
        }
        if (conto.fcnt == 7 || conto.fcnt == 8) {
            this.squash = 0;
            this.nbsq = 0;
            this.hitmag = 0;
            this.cntdest = 0;
            this.dest = false;
            this.newcar = true;
        }
        if (!this.mtouch) {
            if (this.trcnt != 1) {
                this.trcnt = 1;
                this.lxz = conto.xz;
            }
            if (this.loop == 2 || this.loop == -1) {
                this.travxy = (int)((float)this.travxy + (this.rcomp - this.lcomp));
                if (Math.abs(this.travxy) > 135) {
                    this.rtab = true;
                }
                this.travzy = (int)((float)this.travzy + (this.ucomp - this.dcomp));
                if (this.travzy > 135) {
                    this.ftab = true;
                }
                if (this.travzy < -135) {
                    this.btab = true;
                }
            }
            if (this.lxz != conto.xz) {
                this.travxz += this.lxz - conto.xz;
                this.lxz = conto.xz;
            }
            if (this.srfcnt < 10) {
                if (control.wall != -1) {
                    this.surfer = true;
                }
                ++this.srfcnt;
            }
        } else if (!this.dest) {
            if (!this.capsized) {
                if (this.capcnt != 0) {
                    this.capcnt = 0;
                }
                if (this.gtouch && this.trcnt != 0) {
                    if (this.trcnt == 9) {
                        this.powerup = 0.0f;
                        if (Math.abs(this.travxy) > 90) {
                            this.powerup += (float)Math.abs(this.travxy) / 24.0f;
                        } else if (this.rtab) {
                            this.powerup += 30.0f;
                        }
                        if (Math.abs(this.travzy) > 90) {
                            this.powerup += (float)Math.abs(this.travzy) / 18.0f;
                        } else {
                            if (this.ftab) {
                                this.powerup += 40.0f;
                            }
                            if (this.btab) {
                                this.powerup += 40.0f;
                            }
                        }
                        if (Math.abs(this.travxz) > 90) {
                            this.powerup += (float)Math.abs(this.travxz) / 18.0f;
                        }
                        if (this.surfer) {
                            this.powerup += 30.0f;
                        }
                        this.power += this.powerup;
                        if (this.im == 0 && (int)this.powerup > this.rpd.powered && this.rpd.wasted == 0 && (this.powerup > 60.0f || checkpoints.stage <= 2)) {
                            this.rpdcatch = 30;
                            if (this.rpd.hcaught) {
                                this.rpd.powered = (int)this.powerup;
                            }
                        }
                        if (this.cn != 38 && this.cn != 39) {
                            if (this.power > 98.0f) {
                                this.power = 98.0f;
                                this.xtpower = this.powerup > 150.0f ? 400 : 100;
                            }
                        } else if (this.power > Float.POSITIVE_INFINITY) {
                            this.power = Float.POSITIVE_INFINITY;
                            this.xtpower = this.powerup > 150.0f ? 400 : 100;
                        }
                    }
                    if (this.trcnt == 10) {
                        this.travxy = 0;
                        this.travzy = 0;
                        this.travxz = 0;
                        this.ftab = false;
                        this.rtab = false;
                        this.btab = false;
                        this.trcnt = 0;
                        this.srfcnt = 0;
                        this.surfer = false;
                    } else {
                        ++this.trcnt;
                    }
                }
            } else {
                if (this.trcnt != 0) {
                    this.travxy = 0;
                    this.travzy = 0;
                    this.travxz = 0;
                    this.ftab = false;
                    this.rtab = false;
                    this.btab = false;
                    this.trcnt = 0;
                    this.srfcnt = 0;
                    this.surfer = false;
                }
                if (this.capcnt == 0) {
                    int l10 = 0;
                    int i11 = 0;
                    do {
                        if (!(Math.abs(this.scz[i11]) < 70.0f) || !(Math.abs(this.scx[i11]) < 70.0f)) continue;
                        ++l10;
                    } while (++i11 < 4);
                    if (l10 == 4) {
                        this.capcnt = 1;
                    }
                } else {
                    ++this.capcnt;
                    if (this.capcnt == 30) {
                        this.speed = 0.0f;
                        conto.y += this.flipy[this.cn];
                        this.pxy += 180;
                        conto.xy += 180;
                        this.capcnt = 0;
                    }
                }
            }
        }
        if (this.speed != 0.0f) {
            if (this.xtpower == 0) {
                this.power = this.power > 0.0f ? (this.power -= this.power * this.power * this.power / (float)this.powerloss[this.cn]) : 0.0f;
            } else {
                --this.xtpower;
            }
        }
        if (this.im == 0) {
            if (control.wall != -1) {
                control.wall = -1;
            }
        } else if (this.lastcolido != 0 && !this.dest) {
            --this.lastcolido;
        }
        if (this.dest) {
            if (checkpoints.dested[this.im] == 0) {
                checkpoints.dested[this.im] = this.lastcolido == 0 ? 1 : 2;
            }
        } else if (checkpoints.dested[this.im] != 0) {
            checkpoints.dested[this.im] = 0;
        }
        if (this.im == 0 && this.rpd.wasted == 0 && this.rpdcatch != 0) {
            --this.rpdcatch;
            if (this.rpdcatch == 0) {
                this.rpd.cotchinow(0, checkpoints);
                if (this.rpd.hcaught) {
                    this.rpd.whenwasted = (int)(185.0f + this.m.random() * 20.0f);
                }
            }
        }
        if (this.cn == 39 && this.mtouch) {
            this.grip[this.cn] = Float.POSITIVE_INFINITY;
        }
        if (this.cn == 39 && this.dest) {
            this.lift[this.cn] = 0;
            this.revlift[this.cn] = 100;
        }
        if (this.cn == 39 && !this.dest) {
            this.lift[this.cn] = 100;
            this.revlift[this.cn] = 0;
        }
        if (this.explocnt > 0) {
            --this.explocnt;
        }
        if (this.lascnt == 0) {
            if (control.fire && !this.dest && !checkpoints.haltall && this.ltyp[this.cn] > -1) {
                if (this.power > 1.0f) {
                    if (!this.xt.mutes) {
                        this.xt.guns[this.ltyp[this.cn]].play();
                    }
                    if (this.ltyp[this.cn] == 0) {
                        this.lascnt = 4;
                        this.power -= 2.0f;
                    }
                    if (this.ltyp[this.cn] == 1) {
                        this.lascnt = 1;
                        this.power -= 1.0f;
                    }
                    if (this.ltyp[this.cn] == 2) {
                        this.lascnt = 5;
                        this.power -= 5.0f;
                    }
                    if (this.ltyp[this.cn] == 3) {
                        this.lascnt = 30;
                        this.power -= 10.0f;
                    }
                    if (this.ltyp[this.cn] == 4) {
                        this.lascnt = 20;
                        this.power -= 10.0f;
                    }
                    if (this.ltyp[this.cn] == 5) {
                        this.lascnt = 1;
                        this.power -= 3.0f;
                    }
                    if (this.ltyp[this.cn] == 6) {
                        this.lascnt = 50;
                        this.power -= 30.0f;
                    }
                    conto.fire = true;
                } else {
                    if (!this.xt.mutes) {
                        this.xt.out.play();
                    }
                    if (this.ltyp[this.cn] == 0) {
                        this.lascnt = 2;
                    }
                    if (this.ltyp[this.cn] == 1) {
                        this.lascnt = 1;
                    }
                    if (this.ltyp[this.cn] == 2) {
                        this.lascnt = 5;
                    }
                    if (this.ltyp[this.cn] == 3) {
                        this.lascnt = 30;
                    }
                    if (this.ltyp[this.cn] == 4) {
                        this.lascnt = 20;
                    }
                    if (this.ltyp[this.cn] == 5) {
                        this.lascnt = 1;
                    }
                    if (this.ltyp[this.cn] == 6) {
                        this.lascnt = 50;
                    }
                    conto.fire = true;
                }
            }
        } else {
            --this.lascnt;
        }
        if (control.fire && !this.dest && !checkpoints.haltall && this.ltyp[this.cn] > -1) {
            if (this.lascnt == 0 && this.bulkc < this.lsr.srate[this.ltyp[this.cn]]) {
                this.llx[this.nl] = conto.x;
                this.lly[this.nl] = conto.y;
                this.llz[this.nl] = conto.z;
                this.llxz[this.nl] = conto.xz;
                this.llzy[this.nl] = conto.zy;
                this.llxy[this.nl] = conto.xy;
                if (this.lly[this.nl] > 215) {
                    this.lly[this.nl] = 215;
                }
                this.lspeed[this.nl] = (int)((float)this.lsr.speed[this.ltyp[this.cn]] + this.speed);
                this.lstage[this.nl] = 1;
                this.lhit[this.nl] = 0;
                ++this.nl;
                if (this.nl == 20) {
                    this.nl = 0;
                }
                this.skip = false;
            } else if (!this.skip) {
                this.skip = true;
            }
            ++this.bulkc;
            if (this.bulkc > 12) {
                this.bulkc = 0;
            }
        }
        int l1 = 0;
        int j2 = 0;
        do {
            if (this.lstage[j2] == 0) continue;
            ++l1;
            if (this.lly[j2] > 240 && this.lhit[j2] == 0) {
                this.lhit[j2] = 1;
            }
            if (this.lhit[j2] != 0) continue;
            if (this.lstage[j2] > 10) {
                int k2 = 22500;
                int l29 = -1;
                for (int j39 = 1; j39 < i; ++j39) {
                    int i49 = this.getpy(aconto[ai99[j39]].x, aconto[ai99[j39]].y, aconto[ai99[j39]].z, j2);
                    if (i49 >= k2 || i49 <= 0 || aconto[ai99[j39]].exp) continue;
                    k2 = i49;
                    l29 = j39;
                }
                if (l29 != -1) {
                    if (this.lspeed[j2] > 230) {
                        this.lspeed[j2] = 230;
                    }
                    int k39 = aconto[ai99[l29]].x;
                    int j4 = aconto[ai99[l29]].z;
                    int k4 = aconto[ai99[l29]].y;
                    int c = 0;
                    if (k39 - this.llx[j2] > 0) {
                        c = 180;
                    }
                    this.llxz[j2] = (int)((double)(90 + c) + Math.atan((double)(j4 - this.llz[j2]) / (double)(k39 - this.llx[j2])) / (Math.PI / 180));
                    c = 0;
                    if (k4 - this.lly[j2] < 0) {
                        c = 65356;
                    }
                    int l49 = (int)Math.sqrt((j4 - this.llz[j2]) * (j4 - this.llz[j2]) + (k39 - this.llx[j2]) * (k39 - this.llx[j2]));
                    this.llzy[j2] = -((int)((double)(90 + c) - Math.atan((double)l49 / (double)(k4 - this.lly[j2])) / (Math.PI / 180)));
                }
            }
            int n = j2;
            this.llx[n] = this.llx[n] - (int)((float)this.lspeed[j2] * (conto.m.sin(this.llxz[j2]) * conto.m.cos(this.llzy[j2])));
            int n4 = j2;
            this.llz[n4] = this.llz[n4] + (int)((float)this.lspeed[j2] * (conto.m.cos(this.llxz[j2]) * conto.m.cos(this.llzy[j2])));
            int n5 = j2;
            this.lly[n5] = this.lly[n5] - (int)((float)this.lspeed[j2] * conto.m.sin(this.llzy[j2]));
            int n6 = j2;
            this.lstage[n6] = this.lstage[n6] + 1;
            if (this.lstage[j2] <= 80) continue;
            this.lstage[j2] = 0;
        } while (++j2 < 20);
        if (l1 != 0) {
            if (!conto.fire) {
                conto.fire = true;
            }
        } else if (conto.fire) {
            conto.fire = false;
            this.bulkc = 0;
        }
        if (this.ester == 0) {
            if (conto.x > 2800 && conto.x < 3200 && conto.z > -2100 && conto.z < -1900 && conto.y > -30) {
                this.ester = 1;
                conto.nhits = 0;
            }
        } else {
            if (this.ester < 13) {
                if (this.ltyp[this.cn] == 0) {
                    conto.m.er = conto.m.er == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 1) {
                    conto.m.eg = conto.m.eg == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 2) {
                    conto.m.eb = conto.m.eb == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 3) {
                    if (conto.m.er == 0) {
                        conto.m.er = 1;
                        conto.m.eg = 1;
                    } else {
                        conto.m.er = 0;
                        conto.m.eg = 0;
                    }
                }
                if (this.ltyp[this.cn] == 4) {
                    if (conto.m.eb == 0) {
                        conto.m.eb = 1;
                        conto.m.eg = 1;
                    } else {
                        conto.m.eb = 0;
                        conto.m.eg = 0;
                    }
                }
            }
            if (this.ester == 1) {
                conto.wire = true;
            }
            if (this.ester == 3) {
                conto.wire = false;
            }
            ++this.ester;
            if (this.ester == 45) {
                this.ester = 0;
            }
        }
        if (this.cn == 34 && this.power < 98.0f) {
            this.power += 0.5f;
        }
        if (this.cn == 35 && this.power < 98.0f) {
            this.power += 0.25f;
        }
        if (this.cn == 36 && this.power < 98.0f) {
            this.power += 0.25f;
        }
        if (this.cn == 37 && this.power < 98.0f) {
            this.power += 0.25f;
        }
        if (this.power < 1.0f) {
            this.power = 1.0f;
        }
        if (this.dest) {
            this.power = 0.0f;
        }
    }

    public void lasercolid(ContO conto) {
        if (!conto.out) {
            int i = 0;
            do {
                int j;
                if (this.lstage[i] == 0 || this.lhit[i] != 0 || (j = this.getpy(conto.x, conto.y, conto.z, i)) >= conto.maxR / 10 * (conto.maxR / 10) || j <= 0) continue;
                if (conto.rcol != 0 && j < conto.maxR / (10 * conto.rcol) * (conto.maxR / (10 * conto.rcol)) + this.lsr.rads[this.ltyp[this.cn]] / 10 * (this.lsr.rads[this.ltyp[this.cn]] / 10)) {
                    this.lhit[i] = 1;
                    if (conto.maxhits != -1) {
                        conto.hit = true;
                        conto.nhits = Math.random() > 0.5 ? (conto.nhits += this.lsr.damg[this.ltyp[this.cn]]) : (conto.nhits += 2);
                    }
                }
                if (conto.pcol == 0) continue;
                for (int k = 0; k < conto.npl; ++k) {
                    for (int l = 0; l < conto.p[k].n; ++l) {
                        if (conto.hit || (this.llx[i] - (conto.x + conto.p[k].ox[l])) * (this.llx[i] - (conto.x + conto.p[k].ox[l])) + (this.lly[i] - (conto.y + conto.p[k].oy[l])) * (this.lly[i] - (conto.y + conto.p[k].oy[l])) + (this.llz[i] - (conto.z + conto.p[k].oz[l])) * (this.llz[i] - (conto.z + conto.p[k].oz[l])) >= this.lsr.rads[this.ltyp[this.cn]] * 10 / conto.pcol * (this.lsr.rads[this.ltyp[this.cn]] * 10 / conto.pcol)) continue;
                        this.lhit[i] = 1;
                        if (conto.maxhits == -1) continue;
                        conto.hit = true;
                        if (Math.random() > 0.5) {
                            conto.nhits += this.lsr.damg[this.ltyp[this.cn]];
                            continue;
                        }
                        conto.nhits += 2;
                    }
                }
            } while (++i < 20);
        }
    }

    public int getpy(int i, int j, int k, int l) {
        return (i - this.llx[l]) / 10 * ((i - this.llx[l]) / 10) + (j - this.lly[l]) / 10 * ((j - this.lly[l]) / 10) + (k - this.llz[l]) / 10 * ((k - this.llz[l]) / 10);
    }

    public void dl(Graphics g) {
        int i = 0;
        do {
            if (this.lstage[i] == 0) continue;
            this.lsr.d(g, this.ltyp[this.cn], this.llx[i], this.lly[i], this.llz[i], this.llxz[i], this.llzy[i], this.llxy[i], this.lhit[i]);
            if (this.lhit[i] == 0) continue;
            int n = i;
            this.lhit[n] = this.lhit[n] + 1;
            if (this.lhit[i] <= 2) continue;
            this.lstage[i] = 0;
        } while (++i < 20);
    }
}
