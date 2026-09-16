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

    public int py(int n, int n2, int n3, int n4) {
        return (n - n2) * (n - n2) + (n3 - n4) * (n3 - n4);
    }

    public void regy(int n, float f, ContO contO) {
        float f2;
        f *= this.dammult[this.cn];
        if (f2 > 100.0f) {
            int n2;
            int n3;
            int n4;
            int n5;
            this.rpd.recy(n, f, this.mtouch, this.im);
            f -= 100.0f;
            int n6 = 0;
            int n7 = 0;
            int n8 = contO.xy;
            for (n5 = contO.zy; n5 < 360; n5 += 360) {
            }
            while (n5 > 360) {
                n5 -= 360;
            }
            if (n5 < 210 && n5 > 150) {
                n6 = -1;
            }
            if (n5 > 330 || n5 < 30) {
                n6 = 1;
            }
            while (n8 < 360) {
                n8 += 360;
            }
            while (n8 > 360) {
                n8 -= 360;
            }
            if (n8 < 210 && n8 > 150) {
                n7 = -1;
            }
            if (n8 > 330 || n8 < 30) {
                n7 = 1;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, n7 * n6);
            }
            if (n7 * n6 == 0 || this.mtouch) {
                for (n4 = 0; n4 < contO.npl; ++n4) {
                    float f3 = 0.0f;
                    for (n3 = 0; n3 < contO.p[n4].n; ++n3) {
                        if (contO.p[n4].wz != 0 || this.py(contO.keyx[n], contO.p[n4].ox[n3], contO.keyz[n], contO.p[n4].oz[n3]) >= this.clrad[this.cn]) continue;
                        f3 = f / 20.0f * this.m.random();
                        int n9 = n3;
                        contO.p[n4].oz[n9] = (int)((float)contO.p[n4].oz[n9] + f3 * this.m.sin(n5));
                        n2 = n3;
                        contO.p[n4].ox[n2] = (int)((float)contO.p[n4].ox[n2] - f3 * this.m.sin(n8));
                        this.hitmag = (int)((float)this.hitmag + Math.abs(f3));
                    }
                    if (f3 == 0.0f) continue;
                    if (Math.abs(f3) >= 1.0f) {
                        contO.p[n4].chip = 1;
                        contO.p[n4].ctmag = f3;
                    }
                    if (!contO.p[n4].nocol && !contO.p[n4].glass) {
                        if (contO.p[n4].bfase > 20 && (double)contO.p[n4].hsb[1] > 0.25) {
                            contO.p[n4].hsb[1] = 0.25f;
                        }
                        if (contO.p[n4].bfase > 25 && (double)contO.p[n4].hsb[2] > 0.7) {
                            contO.p[n4].hsb[2] = 0.7f;
                        }
                        if (contO.p[n4].bfase > 30 && (double)contO.p[n4].hsb[1] > 0.15) {
                            contO.p[n4].hsb[1] = 0.15f;
                        }
                        if (contO.p[n4].bfase > 35 && (double)contO.p[n4].hsb[2] > 0.6) {
                            contO.p[n4].hsb[2] = 0.6f;
                        }
                        if (contO.p[n4].bfase > 40) {
                            contO.p[n4].hsb[0] = 0.075f;
                        }
                        if (contO.p[n4].bfase > 50 && (double)contO.p[n4].hsb[2] > 0.5) {
                            contO.p[n4].hsb[2] = 0.5f;
                        }
                        if (contO.p[n4].bfase > 60) {
                            contO.p[n4].hsb[0] = 0.05f;
                        }
                        contO.p[n4].bfase = (int)((float)contO.p[n4].bfase + f3);
                        new Color(contO.p[n4].c[0], contO.p[n4].c[1], contO.p[n4].c[2]);
                        Color color = Color.getHSBColor(contO.p[n4].hsb[0], contO.p[n4].hsb[1], contO.p[n4].hsb[2]);
                        contO.p[n4].c[0] = color.getRed();
                        contO.p[n4].c[1] = color.getGreen();
                        contO.p[n4].c[2] = color.getBlue();
                    }
                    if (!contO.p[n4].glass) continue;
                    contO.p[n4].gr = (int)((double)contO.p[n4].gr + Math.abs((double)f3 * 0.0));
                }
            }
            if (n7 * n6 == -1) {
                if (this.nbsq > 0) {
                    n4 = 0;
                    int n10 = 1;
                    for (n3 = 0; n3 < contO.npl; ++n3) {
                        float f4 = 0.0f;
                        for (n2 = 0; n2 < contO.p[n3].n; ++n2) {
                            if (contO.p[n3].wz != 0) continue;
                            f4 = f / 15.0f * this.m.random();
                            if (Math.abs(contO.p[n3].oy[n2] - this.flipy[this.cn] - this.squash) >= this.msquash[this.cn] * 3 && contO.p[n3].oy[n2] >= this.flipy[this.cn] + this.squash || this.squash >= this.msquash[this.cn]) continue;
                            int n11 = n2;
                            contO.p[n3].oy[n11] = (int)((float)contO.p[n3].oy[n11] + f4);
                            n4 = (int)((float)n4 + f4);
                            ++n10;
                            this.hitmag = (int)((float)this.hitmag + Math.abs(f4));
                        }
                        if (contO.p[n3].glass && this.cn != 33 && this.cn != 34 && this.cn != 35 && this.cn != 36 && this.cn != 37 && this.cn != 38 && this.cn != 39) {
                            contO.p[n3].gr += 0;
                        } else if (f4 != 0.0f) {
                            contO.p[n3].bfase = (int)((float)contO.p[n3].bfase + f4);
                        }
                        if (!(Math.abs(f4) >= 1.0f)) continue;
                        contO.p[n3].chip = 1;
                        contO.p[n3].ctmag = f4;
                    }
                    this.squash += n4 / n10;
                    this.nbsq = 0;
                } else {
                    ++this.nbsq;
                }
            }
        }
    }

    public void reset(int n) {
        this.rspeed = 0;
        this.speed = 0.0f;
        this.rlift = 0;
        this.pexp = false;
        int n2 = 0;
        do {
            this.lstage[n2] = 0;
        } while (++n2 < 20);
    }

    public Madness(Medium medium, Record record, xtGraphics xtGraphics2, int n) {
        this.dominate = new boolean[7];
        this.caught = new boolean[7];
        this.scy = new float[4];
        this.scz = new float[4];
        this.scx = new float[4];
        this.m = medium;
        this.rpd = record;
        this.xt = xtGraphics2;
        this.im = n;
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

    public int rpy(float f, float f2, float f3, float f4, float f5, float f6) {
        return (int)((f - f2) * (f - f2) + (f3 - f4) * (f3 - f4) + (f5 - f6) * (f5 - f6));
    }

    public void regz(int n, float f, ContO contO) {
        float f2;
        f *= this.dammult[this.cn];
        if (Math.abs(f2) > 100.0f) {
            this.rpd.recz(n, f, this.im);
            if (f > 100.0f) {
                f -= 100.0f;
            }
            if (f < -100.0f) {
                f += 100.0f;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, 0);
            }
            for (int i = 0; i < contO.npl; ++i) {
                float f3 = 0.0f;
                for (int j = 0; j < contO.p[i].n; ++j) {
                    if (contO.p[i].wz != 0 || this.py(contO.keyx[n], contO.p[i].ox[j], contO.keyz[n], contO.p[i].oz[j]) >= this.clrad[this.cn]) continue;
                    f3 = f / 20.0f * this.m.random();
                    int n2 = j;
                    contO.p[i].oz[n2] = (int)((float)contO.p[i].oz[n2] + f3 * this.m.cos(contO.xz) * this.m.cos(contO.zy));
                    int n3 = j;
                    contO.p[i].ox[n3] = (int)((float)contO.p[i].ox[n3] + f3 * this.m.sin(contO.xz) * this.m.cos(contO.xy));
                    this.hitmag = (int)((float)this.hitmag + Math.abs(f3));
                }
                if (f3 == 0.0f) continue;
                if (Math.abs(f3) >= 1.0f) {
                    contO.p[i].chip = 1;
                    contO.p[i].ctmag = f3;
                }
                if (!contO.p[i].nocol && !contO.p[i].glass) {
                    if (contO.p[i].bfase > 20 && (double)contO.p[i].hsb[1] > 0.25) {
                        contO.p[i].hsb[1] = 0.25f;
                    }
                    if (contO.p[i].bfase > 25 && (double)contO.p[i].hsb[2] > 0.7) {
                        contO.p[i].hsb[2] = 0.7f;
                    }
                    if (contO.p[i].bfase > 30 && (double)contO.p[i].hsb[1] > 0.15) {
                        contO.p[i].hsb[1] = 0.15f;
                    }
                    if (contO.p[i].bfase > 35 && (double)contO.p[i].hsb[2] > 0.6) {
                        contO.p[i].hsb[2] = 0.6f;
                    }
                    if (contO.p[i].bfase > 40) {
                        contO.p[i].hsb[0] = 0.075f;
                    }
                    if (contO.p[i].bfase > 50 && (double)contO.p[i].hsb[2] > 0.5) {
                        contO.p[i].hsb[2] = 0.5f;
                    }
                    if (contO.p[i].bfase > 60) {
                        contO.p[i].hsb[0] = 0.05f;
                    }
                    contO.p[i].bfase = (int)((float)contO.p[i].bfase + Math.abs(f3));
                    new Color(contO.p[i].c[0], contO.p[i].c[1], contO.p[i].c[2]);
                    Color color = Color.getHSBColor(contO.p[i].hsb[0], contO.p[i].hsb[1], contO.p[i].hsb[2]);
                    contO.p[i].c[0] = color.getRed();
                    contO.p[i].c[1] = color.getGreen();
                    contO.p[i].c[2] = color.getBlue();
                }
                if (!contO.p[i].glass) continue;
                contO.p[i].gr = (int)((double)contO.p[i].gr + Math.abs((double)f3 * 0.0));
            }
        }
    }

    public void rot(float[] fArray, float[] fArray2, int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            for (int i = 0; i < n4; ++i) {
                float f = fArray[i];
                float f2 = fArray2[i];
                fArray[i] = (float)n + ((f - (float)n) * this.m.cos(n3) - (f2 - (float)n2) * this.m.sin(n3));
                fArray2[i] = (float)n2 + ((f - (float)n) * this.m.sin(n3) + (f2 - (float)n2) * this.m.cos(n3));
            }
        }
    }

    public void colide(ContO contO, Madness madness, ContO contO2, xtGraphics xtGraphics2) {
        float[] fArray = new float[4];
        float[] fArray2 = new float[4];
        float[] fArray3 = new float[4];
        float[] fArray4 = new float[4];
        float[] fArray5 = new float[4];
        float[] fArray6 = new float[4];
        int n = 0;
        do {
            fArray[n] = contO.x + contO.keyx[n];
            fArray2[n] = this.capsized ? (float)(contO.y + this.flipy[this.cn] + this.squash) : (float)(contO.y + contO.grat);
            fArray3[n] = contO.z + contO.keyz[n];
            fArray4[n] = contO2.x + contO2.keyx[n];
            fArray5[n] = this.capsized ? (float)(contO2.y + madness.flipy[madness.cn] + madness.squash) : (float)(contO2.y + contO2.grat);
            fArray6[n] = contO2.z + contO2.keyz[n];
        } while (++n < 4);
        this.rot(fArray, fArray2, contO.x, contO.y, contO.xy, 4);
        this.rot(fArray2, fArray3, contO.y, contO.z, contO.zy, 4);
        this.rot(fArray, fArray3, contO.x, contO.z, contO.xz, 4);
        this.rot(fArray4, fArray5, contO2.x, contO2.y, contO2.xy, 4);
        this.rot(fArray5, fArray6, contO2.y, contO2.z, contO2.zy, 4);
        this.rot(fArray4, fArray6, contO2.x, contO2.z, contO2.xz, 4);
        if ((double)this.rpy(contO.x, contO2.x, contO.y, contO2.y, contO.z, contO2.z) < (double)(contO.maxR * contO.maxR + contO2.maxR * contO2.maxR) * 1.5 && this.cn == 35 && madness.cn != 33 && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtGraphics2.killomatic[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 7.5);
        }
        if ((double)this.rpy(contO.x, contO2.x, contO.y, contO2.y, contO.z, contO2.z) < (double)(contO.maxR * contO.maxR + contO2.maxR * contO2.maxR) * (double)(this.speed / 200.0f) && this.cn == 38 && madness.cn != 33 && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtGraphics2.nuke[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 10.0);
        }
        if ((double)this.rpy(contO.x, contO2.x, contO.y, contO2.y, contO.z, contO2.z) < (double)(contO.maxR * contO.maxR + contO2.maxR * contO2.maxR) * (double)(this.speed / 10.0f) && this.cn == 38 && madness.cn != 33 && (madness.cn == 34 || madness.cn == 35 || madness.cn == 37) && this.explocnt == 0 && this.speed != 0.0f && madness.speed != 0.0f) {
            madness.hitmag += 100000;
            if (!this.xt.mutes) {
                xtGraphics2.nuke[(int)(this.m.random() * 2.0f)].play();
            }
            this.explocnt = (int)(Math.random() * 10.0);
        }
        if ((double)this.rpy(contO.x, contO2.x, contO.y, contO2.y, contO.z, contO2.z) < (double)(contO.maxR * contO.maxR + contO2.maxR * contO2.maxR) * 1.5 && this.cn == 39 && madness.cn != 33 && !this.dest && !madness.dest && this.speed != 0.0f) {
            this.dest = true;
            this.grip[this.cn] = 0.0f;
            this.revlift[this.cn] = 100;
            this.distruct(contO);
            ++this.cntdest;
            if (this.cntdest == 1) {
                this.rpd.dest[this.im] = 300;
            }
            if (!this.xt.mutes) {
                xtGraphics2.nuke[(int)(this.m.random() * 2.0f)].play();
            }
        }
        if ((double)this.rpy(contO.x, contO2.x, contO.y, contO2.y, contO.z, contO2.z) < (double)(contO.maxR * contO.maxR + contO2.maxR * contO2.maxR) * 1.5) {
            if (!(this.caught[madness.im] || this.speed == 0.0f && madness.speed == 0.0f)) {
                this.dominate[madness.im] = Math.abs(this.power * this.speed * this.moment[this.cn]) != Math.abs(madness.power * madness.speed * madness.moment[madness.cn]) ? Math.abs(this.power * this.speed * this.moment[this.cn]) > Math.abs(madness.power * madness.speed * madness.moment[madness.cn]) : this.moment[this.cn] > madness.moment[madness.cn];
                this.caught[madness.im] = true;
            }
        } else if (this.caught[madness.im]) {
            this.caught[madness.im] = false;
        }
        if (this.dominate[madness.im]) {
            int n2 = (int)(((this.scz[0] - madness.scz[0] + this.scz[1] - madness.scz[1] + this.scz[2] - madness.scz[2] + this.scz[3] - madness.scz[3]) * (this.scz[0] - madness.scz[0] + this.scz[1] - madness.scz[1] + this.scz[2] - madness.scz[2] + this.scz[3] - madness.scz[3]) + (this.scx[0] - madness.scx[0] + this.scx[1] - madness.scx[1] + this.scx[2] - madness.scx[2] + this.scx[3] - madness.scx[3]) * (this.scx[0] - madness.scx[0] + this.scx[1] - madness.scx[1] + this.scx[2] - madness.scx[2] + this.scx[3] - madness.scx[3])) / 16.0f);
            int n3 = 0;
            do {
                int n4 = 0;
                do {
                    int n5;
                    int n6;
                    int n7;
                    float f;
                    float f2;
                    float f3;
                    if (!((float)this.rpy(fArray[n3], fArray4[n4], fArray2[n3], fArray5[n4], fArray3[n3], fArray6[n4]) < (float)(n2 + 7000) * (this.comprad[madness.cn] + this.comprad[this.cn]))) continue;
                    if (Math.abs(this.scx[n3] * this.moment[this.cn]) > Math.abs(madness.scx[n4] * madness.moment[madness.cn])) {
                        float f4;
                        f3 = madness.scx[n4] * (float)this.revpush[this.cn];
                        if (f3 > 300.0f) {
                            f3 = 300.0f;
                        }
                        if (f3 < -300.0f) {
                            f3 = -300.0f;
                        }
                        f2 = this.scx[n3] * (float)this.push[this.cn];
                        if (f4 > 300.0f) {
                            f2 = 300.0f;
                        }
                        if (f2 < -300.0f) {
                            f2 = -300.0f;
                        }
                        f = 1.0f;
                        if ((madness.cn == 13 || madness.cn == 29) && this.cn != 35 && this.cn != 38 && this.cn != 39) {
                            f = this.moment[this.cn];
                        }
                        n7 = n4;
                        madness.scx[n7] = madness.scx[n7] + f2;
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regx(n4, f2 * this.moment[this.cn] * f, contO2);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                        n6 = n3;
                        this.scx[n6] = this.scx[n6] - f3;
                        this.regx(n3, -f3 * madness.moment[this.cn], contO);
                        n5 = n3;
                        this.scy[n5] = this.scy[n5] - (float)this.revlift[this.cn];
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regy(n4, this.revlift[this.cn] * 7, contO2);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                    }
                    if (Math.abs(this.scz[n3] * this.moment[this.cn]) > Math.abs(madness.scz[n4] * madness.moment[madness.cn])) {
                        float f5;
                        f3 = madness.scz[n4] * (float)this.revpush[this.cn];
                        if (f3 > 300.0f) {
                            f3 = 300.0f;
                        }
                        if (f3 < -300.0f) {
                            f3 = -300.0f;
                        }
                        f2 = this.scz[n3] * (float)this.push[this.cn];
                        if (f5 > 300.0f) {
                            f2 = 300.0f;
                        }
                        if (f2 < -300.0f) {
                            f2 = -300.0f;
                        }
                        f = 1.0f;
                        if ((madness.cn == 13 || madness.cn == 29) && this.cn != 35 && this.cn != 38 && this.cn != 39) {
                            f = this.moment[this.cn];
                        }
                        n7 = n4;
                        madness.scz[n7] = madness.scz[n7] + f2;
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regz(n4, f2 * this.moment[this.cn] * f, contO2);
                        if (madness.colidim) {
                            madness.colidim = false;
                        }
                        n6 = n3;
                        this.scz[n6] = this.scz[n6] - f3;
                        this.regz(n3, -f3 * madness.moment[this.cn], contO);
                        n5 = n3;
                        this.scy[n5] = this.scy[n5] - (float)this.revlift[this.cn];
                        if (this.im == 0) {
                            madness.colidim = true;
                        }
                        madness.regy(n4, this.revlift[this.cn] * 7, contO2);
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
                    int n8 = n4;
                    madness.scy[n8] = madness.scy[n8] - (float)this.lift[this.cn];
                } while (++n4 < 4);
            } while (++n3 < 4);
        }
    }

    public void distruct(ContO contO) {
        for (int i = 0; i < contO.npl; ++i) {
            if (contO.p[i].wz != 0 && contO.p[i].gr != -17 && contO.p[i].gr != -16) continue;
            contO.p[i].embos = 1;
        }
    }

    public void reseto(int n, ContO contO, CheckPoints checkPoints) {
        this.cn = n;
        int n2 = 0;
        do {
            this.dominate[n2] = false;
            this.caught[n2] = false;
        } while (++n2 < 7);
        if (this.cn == 11 && this.im == 0) {
            float f = this.moment[this.cn] = checkPoints.stage == 10 ? 2.5f : 2.0f;
        }
        if (this.cn == 9 && this.im != 0) {
            this.maxmag[this.cn] = checkPoints.stage == 4 ? 8000 : 9700;
        }
        this.mxz = 0;
        this.cxz = 0;
        this.pzy = 0;
        this.pxy = 0;
        this.speed = 0.0f;
        n2 = 0;
        do {
            this.scy[n2] = 0.0f;
            this.scx[n2] = 0.0f;
            this.scz[n2] = 0.0f;
        } while (++n2 < 4);
        this.forca = ((float)Math.sqrt(contO.keyz[0] * contO.keyz[0] + contO.keyx[0] * contO.keyx[0]) + (float)Math.sqrt(contO.keyz[1] * contO.keyz[1] + contO.keyx[1] * contO.keyx[1]) + (float)Math.sqrt(contO.keyz[2] * contO.keyz[2] + contO.keyx[2] * contO.keyx[2]) + (float)Math.sqrt(contO.keyz[3] * contO.keyz[3] + contO.keyx[3] * contO.keyx[3])) / 10000.0f * (float)((double)this.bounce[this.cn] - 0.3);
        if (this.cn == 17 || this.cn == 18 || this.cn == 20 || this.cn == 21 || this.cn == 23 || this.cn == 24 || this.cn == 25 || this.cn == 26 || this.cn == 31 || this.cn == 32) {
            this.forca = ((float)Math.sqrt(contO.keyz[0] * contO.keyz[0] + contO.keyx[0] * contO.keyx[0]) + (float)Math.sqrt(contO.keyz[1] * contO.keyz[1] + contO.keyx[1] * contO.keyx[1]) + (float)Math.sqrt(contO.keyz[2] * contO.keyz[2] + contO.keyx[2] * contO.keyx[2]) + (float)Math.sqrt(contO.keyz[3] * contO.keyz[3] + contO.keyx[3] * contO.keyx[3])) / 100000.0f * (float)((double)this.bounce[this.cn] - 0.3);
        }
        if (this.cn == 33 || this.cn == 34 || this.cn == 35 || this.cn == 36 || this.cn == 37 || this.cn == 38 || this.cn == 39) {
            this.forca = ((float)Math.sqrt(contO.keyz[0] * contO.keyz[0] + contO.keyx[0] * contO.keyx[0]) + (float)Math.sqrt(contO.keyz[1] * contO.keyz[1] + contO.keyx[1] * contO.keyx[1]) + (float)Math.sqrt(contO.keyz[2] * contO.keyz[2] + contO.keyx[2] * contO.keyx[2]) + (float)Math.sqrt(contO.keyz[3] * contO.keyz[3] + contO.keyx[3] * contO.keyx[3])) / Float.POSITIVE_INFINITY * (float)((double)this.bounce[this.cn] - 0.3);
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
        this.pcleared = checkPoints.pcs;
        this.clear = 0;
        this.nlaps = 0;
        this.focus = -1;
        this.missedcp = 0;
        this.nofocus = false;
        this.power = this.cn != 38 && this.cn != 39 ? 98.0f : 1.0f;
        this.lastcolido = 0;
        checkPoints.dested[this.im] = 0;
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
        int n3 = 0;
        do {
            this.lstage[n3] = 0;
        } while (++n3 < 20);
    }

    public void regx(int n, float f, ContO contO) {
        float f2;
        f *= this.dammult[this.cn];
        if (Math.abs(f2) > 100.0f) {
            this.rpd.recx(n, f, this.im);
            if (f > 100.0f) {
                f -= 100.0f;
            }
            if (f < -100.0f) {
                f += 100.0f;
            }
            if (this.im == 0 || this.colidim) {
                this.xt.crash(f, 0);
            }
            for (int i = 0; i < contO.npl; ++i) {
                float f3 = 0.0f;
                for (int j = 0; j < contO.p[i].n; ++j) {
                    if (contO.p[i].wz != 0 || this.py(contO.keyx[n], contO.p[i].ox[j], contO.keyz[n], contO.p[i].oz[j]) >= this.clrad[this.cn]) continue;
                    f3 = f / 20.0f * this.m.random();
                    int n2 = j;
                    contO.p[i].oz[n2] = (int)((float)contO.p[i].oz[n2] - f3 * this.m.sin(contO.xz) * this.m.cos(contO.zy));
                    int n3 = j;
                    contO.p[i].ox[n3] = (int)((float)contO.p[i].ox[n3] + f3 * this.m.cos(contO.xz) * this.m.cos(contO.xy));
                    this.hitmag = (int)((float)this.hitmag + Math.abs(f3));
                }
                if (f3 == 0.0f) continue;
                if (Math.abs(f3) >= 1.0f) {
                    contO.p[i].chip = 1;
                    contO.p[i].ctmag = f3;
                }
                if (!contO.p[i].nocol && !contO.p[i].glass) {
                    if (contO.p[i].bfase > 20 && (double)contO.p[i].hsb[1] > 0.25) {
                        contO.p[i].hsb[1] = 0.25f;
                    }
                    if (contO.p[i].bfase > 25 && (double)contO.p[i].hsb[2] > 0.7) {
                        contO.p[i].hsb[2] = 0.7f;
                    }
                    if (contO.p[i].bfase > 30 && (double)contO.p[i].hsb[1] > 0.15) {
                        contO.p[i].hsb[1] = 0.15f;
                    }
                    if (contO.p[i].bfase > 35 && (double)contO.p[i].hsb[2] > 0.6) {
                        contO.p[i].hsb[2] = 0.6f;
                    }
                    if (contO.p[i].bfase > 40) {
                        contO.p[i].hsb[0] = 0.075f;
                    }
                    if (contO.p[i].bfase > 50 && (double)contO.p[i].hsb[2] > 0.5) {
                        contO.p[i].hsb[2] = 0.5f;
                    }
                    if (contO.p[i].bfase > 60) {
                        contO.p[i].hsb[0] = 0.05f;
                    }
                    contO.p[i].bfase = (int)((float)contO.p[i].bfase + Math.abs(f3));
                    new Color(contO.p[i].c[0], contO.p[i].c[1], contO.p[i].c[2]);
                    Color color = Color.getHSBColor(contO.p[i].hsb[0], contO.p[i].hsb[1], contO.p[i].hsb[2]);
                    contO.p[i].c[0] = color.getRed();
                    contO.p[i].c[1] = color.getGreen();
                    contO.p[i].c[2] = color.getBlue();
                }
                if (!contO.p[i].glass) continue;
                contO.p[i].gr = (int)((double)contO.p[i].gr + Math.abs((double)f3 * 0.0));
            }
        }
    }

    public void drive(Control control, ContO contO, Trackers trackers, CheckPoints checkPoints, ContO[] contOArray, int[] nArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        float f;
        int n11;
        float f2;
        int n12;
        int n13;
        int n14 = 1;
        int n15 = 1;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        this.capsized = false;
        for (n13 = Math.abs(this.pzy); n13 > 270; n13 -= 360) {
        }
        if ((n13 = Math.abs(n13)) > 90) {
            bl = true;
        }
        boolean bl4 = false;
        for (n12 = Math.abs(this.pxy); n12 > 270; n12 -= 360) {
        }
        if ((n12 = Math.abs(n12)) > 90) {
            bl4 = true;
            n15 = -1;
        }
        int n16 = contO.grat;
        if (bl) {
            if (bl4) {
                bl4 = false;
                bl2 = true;
            } else {
                bl4 = true;
                this.capsized = true;
            }
            n14 = -1;
        } else if (bl4) {
            this.capsized = true;
        }
        if (this.capsized) {
            n16 = this.flipy[this.cn] + this.squash;
        }
        control.zyinv = bl;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (this.mtouch) {
            this.loop = 0;
        }
        if (this.cn == 34) {
            contO.elec = true;
            contO.roted = true;
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
            f2 = (this.scy[0] + this.scy[1] + this.scy[2] + this.scy[3]) / 4.0f;
            n11 = 0;
            do {
                this.scy[n11] = f2;
            } while (++n11 < 4);
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
                    f3 = (float)(-this.airc[this.cn]) * this.m.sin(contO.xz) * (float)n15;
                    f4 = (float)this.airc[this.cn] * this.m.cos(contO.xz) * (float)n15;
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
                    f5 = -this.airc[this.cn];
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
                    f3 = (float)(-this.airc[this.cn]) * this.m.cos(contO.xz) * (float)n14;
                    f4 = (float)(-this.airc[this.cn]) * this.m.sin(contO.xz) * (float)n14;
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
                    f3 = (float)this.airc[this.cn] * this.m.cos(contO.xz) * (float)n14;
                    f4 = (float)this.airc[this.cn] * this.m.sin(contO.xz) * (float)n14;
                } else if (this.rcomp > 0.0f) {
                    this.rcomp -= 2.0f * this.airs[this.cn];
                }
                this.pzy = (int)((float)this.pzy + (this.dcomp - this.ucomp) * this.m.cos(this.pxy));
                contO.xz = bl ? (int)((float)contO.xz + (this.dcomp - this.ucomp) * this.m.sin(this.pxy)) : (int)((float)contO.xz - (this.dcomp - this.ucomp) * this.m.sin(this.pxy));
                this.pxy = (int)((float)this.pxy + (this.rcomp - this.lcomp));
            } else {
                int n17;
                f2 = this.power;
                if (f2 < 40.0f) {
                    f2 = 40.0f;
                }
                if (this.im == 0 && this.power != 98.0f) {
                    if (checkPoints.stage != 6 && checkPoints.stage != 8) {
                        f2 = (float)((double)f2 * 0.76);
                    } else if (checkPoints.stage != 6) {
                        f2 = (float)((double)f2 * 0.9);
                    }
                }
                if (control.down) {
                    if (this.speed > 0.0f) {
                        this.speed -= (float)(this.handb[this.cn] / 2);
                    } else {
                        n11 = 0;
                        n17 = 0;
                        do {
                            if (!(this.speed <= -((float)(this.swits[this.cn][n17] / 2) + f2 * (float)this.swits[this.cn][n17] / 196.0f))) continue;
                            ++n11;
                        } while (++n17 < 2);
                        float f6 = this.speed = n11 != 2 ? (this.speed = this.speed - (this.acelf[this.cn][n11] / 2.0f + f2 * this.acelf[this.cn][n11] / 196.0f)) : -((float)(this.swits[this.cn][1] / 2) + f2 * (float)this.swits[this.cn][1] / 196.0f);
                    }
                }
                if (control.up) {
                    if (this.speed < 0.0f) {
                        this.speed += (float)this.handb[this.cn];
                    } else {
                        n11 = 0;
                        n17 = 0;
                        do {
                            if (!(this.speed >= (float)(this.swits[this.cn][n17] / 2) + f2 * (float)this.swits[this.cn][n17] / 196.0f)) continue;
                            ++n11;
                        } while (++n17 < 3);
                        float f7 = this.speed = n11 != 3 ? (this.speed = this.speed + (this.acelf[this.cn][n11] / 2.0f + f2 * this.acelf[this.cn][n11] / 196.0f)) : (float)(this.swits[this.cn][2] / 2) + f2 * (float)this.swits[this.cn][2] / 196.0f;
                    }
                }
                if (control.handb && Math.abs(this.speed) > (float)this.handb[this.cn]) {
                    float f8 = this.speed = this.speed < 0.0f ? (this.speed = this.speed + (float)this.handb[this.cn]) : (this.speed = this.speed - (float)this.handb[this.cn]);
                }
                if (this.loop == -1 && contO.y < 100) {
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
                    contO.xz = bl ? (int)((float)contO.xz + (this.dcomp - this.ucomp) * this.m.sin(this.pxy)) : (int)((float)contO.xz - (this.dcomp - this.ucomp) * this.m.sin(this.pxy));
                    this.pxy = (int)((float)this.pxy + (this.rcomp - this.lcomp));
                }
            }
        }
        float f9 = 20.0f * this.speed / (154.0f * this.simag[this.cn]);
        if (f > 22.0f) {
            f9 = 22.0f;
        }
        if (f9 < -22.0f) {
            f9 = -22.0f;
        }
        contO.wzy = (int)((float)contO.wzy - f9);
        if (contO.wzy < -45) {
            contO.wzy += 45;
        }
        if (contO.wzy > 45) {
            contO.wzy -= 45;
        }
        if (control.right) {
            contO.wxz -= this.turn[this.cn];
            if (contO.wxz < -36) {
                contO.wxz = -36;
            }
        }
        if (control.left) {
            contO.wxz += this.turn[this.cn];
            if (contO.wxz > 36) {
                contO.wxz = 36;
            }
        }
        if (contO.wxz != 0 && !control.left && !control.right) {
            if (Math.abs(contO.wxz) < this.turn[this.cn] * 2) {
                contO.wxz = 0;
            }
            if (contO.wxz > 0) {
                contO.wxz -= this.turn[this.cn] * 2;
            }
            if (contO.wxz < 0) {
                contO.wxz += this.turn[this.cn] * 2;
            }
        }
        if ((n10 = (int)(0.0f / (this.speed * this.speed))) < 5) {
            n10 = 5;
        }
        if (this.speed < 0.0f) {
            n10 = -n10;
        }
        if (this.wtouch) {
            if (!this.capsized) {
                this.fxz = !control.handb ? contO.wxz / (n10 * 3) : contO.wxz / n10;
                contO.xz += contO.wxz / n10;
            }
            this.wtouch = false;
            this.gtouch = false;
        } else {
            contO.xz += this.fxz;
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
        float[] fArray = new float[4];
        float[] fArray2 = new float[4];
        float[] fArray3 = new float[4];
        int n18 = 0;
        do {
            fArray[n18] = contO.keyx[n18] + contO.x;
            fArray3[n18] = n16 + contO.y;
            fArray2[n18] = contO.z + contO.keyz[n18];
            if (checkPoints.stage != 39 && checkPoints.stage != 38) {
                n9 = n18;
                this.scy[n9] = this.scy[n9] + 7.0f;
            }
            if (checkPoints.stage == 39) {
                n9 = n18;
                this.scy[n9] = this.scy[n9] + 1.1666666f;
            }
            if (checkPoints.stage != 38) continue;
            n9 = n18;
            this.scy[n9] = this.scy[n9] + 3.5f;
        } while (++n18 < 4);
        this.rot(fArray, fArray3, contO.x, contO.y, this.pxy, 4);
        this.rot(fArray3, fArray2, contO.y, contO.z, this.pzy, 4);
        this.rot(fArray, fArray2, contO.x, contO.z, contO.xz, 4);
        n9 = 0;
        double d = 0.0;
        int n19 = (int)((this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f);
        int n20 = (int)((this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f);
        int n21 = 0;
        do {
            if (this.scx[n21] - (float)n19 > 200.0f) {
                this.scx[n21] = 200 + n19;
            }
            if (this.scx[n21] - (float)n19 < -200.0f) {
                this.scx[n21] = n19 - 200;
            }
            if (this.scz[n21] - (float)n20 > 200.0f) {
                this.scz[n21] = 200 + n20;
            }
            if (!(this.scz[n21] - (float)n20 < -200.0f)) continue;
            this.scz[n21] = n20 - 200;
        } while (++n21 < 4);
        n21 = 0;
        do {
            n8 = n21;
            fArray3[n8] = fArray3[n8] + this.scy[n21];
            n7 = n21;
            fArray[n7] = fArray[n7] + (this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f;
            n6 = n21++;
            fArray2[n6] = fArray2[n6] + (this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f;
        } while (n21 < 4);
        n21 = 1;
        for (n8 = 0; n8 < trackers.nt; ++n8) {
            if (Math.abs(trackers.zy[n8]) == 90 || Math.abs(trackers.xy[n8]) == 90 || Math.abs(contO.x - trackers.x[n8]) >= trackers.radx[n8] || Math.abs(contO.z - trackers.z[n8]) >= trackers.radz[n8]) continue;
            n21 = trackers.skd[n8];
        }
        if (this.mtouch) {
            if (this.cn != 24 && this.cn != 25 && this.cn != 31 && this.cn != 33 && this.cn != 34 && this.cn != 35 && this.cn != 36 && this.cn != 37 && this.cn != 38 && this.cn != 39 && (control.left || control.right)) {
                this.speed -= this.speed / 100.0f;
            }
            float f10 = this.grip[this.cn];
            f10 -= (float)Math.abs(this.txz - contO.xz) * this.speed / 250.0f;
            if (control.handb) {
                f10 -= (float)(Math.abs(this.txz - contO.xz) * 4);
            }
            if (f10 < this.grip[this.cn]) {
                if (this.skid != 2) {
                    this.skid = 1;
                }
            } else if (this.skid == 1) {
                this.skid = 2;
            }
            if (n21 == 1) {
                if (checkPoints.stage != 37) {
                    f10 = (float)((double)f10 * 0.75);
                }
                if (checkPoints.stage == 37) {
                    float f11 = f10 = this.cn != 24 && this.cn != 25 && this.cn != 28 && this.cn != 29 && this.cn != 30 && this.cn != 31 ? (float)((double)f10 * 0.075) : (float)((double)f10 * 0.75);
                }
            }
            if (n21 == 2) {
                f10 = (float)((double)f10 * 0.55);
            }
            n7 = -((int)(this.speed * this.m.sin(contO.xz) * this.m.cos(this.pzy)));
            n6 = (int)(this.speed * this.m.cos(contO.xz) * this.m.cos(this.pzy));
            n5 = -((int)(this.speed * this.m.sin(this.pzy)));
            if (this.capsized || this.dest || checkPoints.haltall) {
                this.speed /= 3.0f;
                if (checkPoints.stage != 37) {
                    f10 = this.grip[this.cn] / 5.0f;
                }
                if (checkPoints.stage == 37) {
                    f10 = this.cn != 24 && this.cn != 25 && this.cn != 28 && this.cn != 29 && this.cn != 30 && this.cn != 31 ? this.grip[this.cn] / 50.0f : this.grip[this.cn] / 5.0f;
                }
                float f12 = this.speed = this.speed > 0.0f ? (this.speed = this.speed - 2.0f) : (this.speed = this.speed + 2.0f);
            }
            float f13 = Math.abs(this.speed) > this.drag[this.cn] ? (this.speed > 0.0f ? (this.speed = this.speed - this.drag[this.cn]) : (this.speed = this.speed + this.drag[this.cn])) : (this.speed = 0.0f);
            if (this.cn == 8 && f10 < 5.0f) {
                f10 = 5.0f;
            }
            if (f10 < 1.0f) {
                f10 = 1.0f;
            }
            float f14 = 0.0f;
            float f15 = 0.0f;
            n4 = 0;
            do {
                int n22;
                if (Math.abs(this.scx[n4] - (float)n7) > f10) {
                    if (this.scx[n4] < (float)n7) {
                        n22 = n4;
                        this.scx[n22] = this.scx[n22] + f10;
                    } else {
                        int n23 = n4;
                        this.scx[n23] = this.scx[n23] - f10;
                    }
                } else {
                    this.scx[n4] = n7;
                }
                if (Math.abs(this.scz[n4] - (float)n6) > f10) {
                    if (this.scz[n4] < (float)n6) {
                        n22 = n4;
                        this.scz[n22] = this.scz[n22] + f10;
                    } else {
                        n22 = n4;
                        this.scz[n22] = this.scz[n22] - f10;
                    }
                } else {
                    this.scz[n4] = n6;
                }
                if (Math.abs(this.scy[n4] - (float)n5) > f10) {
                    if (this.scy[n4] < (float)n5) {
                        n22 = n4;
                        this.scy[n22] = this.scy[n22] + f10;
                    } else {
                        n22 = n4;
                        this.scy[n22] = this.scy[n22] - f10;
                    }
                } else {
                    this.scy[n4] = n5;
                }
                if (f10 < this.grip[this.cn]) {
                    if (this.txz != contO.xz) {
                        ++this.dcnt;
                    } else if (this.dcnt != 0) {
                        this.dcnt = 0;
                    }
                    if ((float)this.dcnt > 40.0f * f10 / this.grip[this.cn] || this.capsized) {
                        float f16 = 1.0f;
                        if (n21 != 0) {
                            f16 = 1.2f;
                        }
                        if ((double)this.m.random() > 0.75) {
                            contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], f16 * this.simag[this.cn], true, (int)this.tilt);
                            if (this.im == 0 && !this.capsized) {
                                this.xt.skid(n21, (float)Math.sqrt(this.scx[n4] * this.scx[n4] + this.scz[n4] * this.scz[n4]));
                            }
                        }
                    } else {
                        if (n21 == 1 && (double)this.m.random() > 0.85) {
                            contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], 1.1f * this.simag[this.cn], false, (int)this.tilt);
                        }
                        if ((n21 == 2 || n21 == 3) && (double)this.m.random() > 0.7) {
                            contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], 1.15f * this.simag[this.cn], false, (int)this.tilt);
                        }
                    }
                } else if (this.dcnt != 0) {
                    this.dcnt -= 2;
                    if (this.dcnt < 0) {
                        this.dcnt = 0;
                    }
                }
                if (n21 == 3) {
                    int n24 = (int)(this.m.random() * 4.0f);
                    this.scy[n24] = (float)((double)(-100.0f * this.m.random() * (this.speed / (float)this.swits[this.cn][2])) * ((double)this.bounce[this.cn] - 0.3));
                }
                if (n21 == 4) {
                    int n25 = (int)(this.m.random() * 4.0f);
                    this.scy[n25] = (float)((double)(-150.0f * this.m.random() * (this.speed / (float)this.swits[this.cn][2])) * ((double)this.bounce[this.cn] - 0.3));
                }
                f14 += this.scx[n4];
                f15 += this.scz[n4];
            } while (++n4 < 4);
            this.txz = contO.xz;
            n14 = f14 > 0.0f ? -1 : 1;
            double d2 = (double)f15 / Math.sqrt(f14 * f14 + f15 * f15);
            this.mxz = (int)(Math.acos(d2) / (Math.PI / 180) * (double)n14);
            if (this.skid == 2) {
                if (!this.capsized) {
                    this.speed = bl2 ? -((float)Math.sqrt(f14 * f14 + f15 * f15) * this.m.cos(this.mxz - contO.xz)) : (float)Math.sqrt((f14 /= 4.0f) * f14 + (f15 /= 4.0f) * f15) * this.m.cos(this.mxz - contO.xz);
                }
                this.skid = 0;
            }
            if (this.capsized && f14 == 0.0f && f15 == 0.0f) {
                n21 = 0;
            }
            this.mtouch = false;
            n9 = 1;
        } else if (this.skid != 2) {
            this.skid = 2;
        }
        int n26 = 0;
        boolean[] blArray = new boolean[4];
        n6 = 0;
        do {
            if (fArray3[n6] > 245.0f) {
                float f17;
                float f18;
                ++n26;
                this.wtouch = true;
                this.gtouch = true;
                if (n9 == 0 && this.scy[n6] != 7.0f) {
                    float f19 = this.scy[n6] / 333.33f;
                    if ((double)f19 > 0.3) {
                        f19 = 0.3f;
                    }
                    f19 = n21 == 0 ? (float)((double)f19 + 1.1) : (float)((double)f19 + 1.2);
                    contO.dust(n6, fArray[n6], fArray3[n6], fArray2[n6], this.scx[n6], this.scz[n6], f19 * this.simag[this.cn], true, 0);
                }
                fArray3[n6] = 250.0f;
                float f20 = 0.0f;
                int n27 = 0;
                do {
                    if ((float)n6 == f20 || !(fArray3[n27] <= 245.0f)) continue;
                    int n28 = n27;
                    fArray3[n28] = fArray3[n28] - (fArray3[n6] - 250.0f);
                } while ((f20 += 1.0f) < 4.0f);
                f20 = Math.abs(this.m.sin(this.pxy)) + Math.abs(this.m.sin(this.pzy));
                f20 /= 3.0f;
                if ((double)f18 > 0.4) {
                    f20 = 0.4f;
                }
                f20 += this.bounce[this.cn];
                if ((double)f17 < 1.1) {
                    f20 = 1.1f;
                }
                this.regy(n6, Math.abs(this.scy[n6] * f20), contO);
                if (this.scy[n6] > 0.0f) {
                    int n29 = n6;
                    this.scy[n29] = this.scy[n29] - Math.abs(this.scy[n6] * f20);
                }
            }
            blArray[n6] = false;
        } while (++n6 < 4);
        n6 = 0;
        for (n5 = 0; n5 < trackers.nt; ++n5) {
            int n30 = 0;
            int n31 = 0;
            n4 = 0;
            do {
                float f21;
                float f22;
                int n32;
                float f23;
                if (blArray[n4] || !(fArray[n4] > (float)(trackers.x[n5] - trackers.radx[n5])) || !(fArray[n4] < (float)(trackers.x[n5] + trackers.radx[n5])) || !(fArray2[n4] > (float)(trackers.z[n5] - trackers.radz[n5])) || !(fArray2[n4] < (float)(trackers.z[n5] + trackers.radz[n5])) || !(fArray3[n4] > (float)(trackers.y[n5] - trackers.rady[n5])) || !(fArray3[n4] < (float)(trackers.y[n5] + trackers.rady[n5]))) continue;
                if (trackers.xy[n5] == 0 && trackers.zy[n5] == 0 && trackers.y[n5] != 250 && fArray3[n4] > (float)(trackers.y[n5] - 5)) {
                    float f24;
                    float f25;
                    ++n31;
                    this.wtouch = true;
                    this.gtouch = true;
                    if (n9 == 0 && this.scy[n4] != 7.0f) {
                        f23 = this.scy[n4] / 333.33f;
                        if ((double)f23 > 0.3) {
                            f23 = 0.3f;
                        }
                        f23 = n21 == 0 ? (float)((double)f23 + 1.1) : (float)((double)f23 + 1.2);
                        contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], f23 * this.simag[this.cn], true, 0);
                    }
                    fArray3[n4] = trackers.y[n5];
                    f23 = 0.0f;
                    int n33 = 0;
                    do {
                        if ((float)n4 == f23 || !(fArray3[n33] <= (float)(trackers.y[n5] - 5))) continue;
                        n32 = n33;
                        fArray3[n32] = fArray3[n32] - (fArray3[n4] - (float)trackers.y[n5]);
                    } while ((f23 += 1.0f) < 4.0f);
                    f23 = Math.abs(this.m.sin(this.pxy)) + Math.abs(this.m.sin(this.pzy));
                    f23 /= 3.0f;
                    if ((double)f25 > 0.4) {
                        f23 = 0.4f;
                    }
                    f23 += this.bounce[this.cn];
                    if ((double)f24 < 1.1) {
                        f23 = 1.1f;
                    }
                    this.regy(n4, Math.abs(this.scy[n4] * f23), contO);
                    if (this.scy[n4] > 0.0f) {
                        n32 = n4;
                        this.scy[n32] = this.scy[n32] - Math.abs(this.scy[n4] * f23);
                    }
                    blArray[n4] = true;
                }
                if (trackers.zy[n5] == -90 && fArray2[n4] < (float)(trackers.z[n5] + trackers.radz[n5]) && this.scz[n4] < 0.0f) {
                    float f26;
                    float f27;
                    fArray2[n4] = trackers.z[n5] + trackers.radz[n5];
                    f23 = 0.0f;
                    int n34 = 0;
                    do {
                        if ((float)n4 == f23 || !(fArray2[n34] >= (float)(trackers.z[n5] + trackers.radz[n5]))) continue;
                        n32 = n34;
                        fArray2[n32] = fArray2[n32] - (fArray2[n4] - (float)(trackers.z[n5] + trackers.radz[n5]));
                    } while ((f23 += 1.0f) < 4.0f);
                    f23 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    f23 /= 4.0f;
                    if ((double)f27 > 0.3) {
                        f23 = 0.3f;
                    }
                    if (n9 != 0) {
                        f23 = 0.0f;
                    }
                    f23 = (float)((double)f23 + ((double)this.bounce[this.cn] - 0.2));
                    if ((double)f26 < 1.1) {
                        f23 = 1.1f;
                    }
                    this.regz(n4, Math.abs(this.scz[n4] * f23 * (float)trackers.dam[n5]), contO);
                    n32 = n4;
                    this.scz[n32] = this.scz[n32] + Math.abs(this.scz[n4] * f23);
                    this.skid = 2;
                    bl3 = true;
                    blArray[n4] = true;
                    if (!trackers.notwall[n5]) {
                        control.wall = n5;
                    }
                }
                if (trackers.zy[n5] == 90 && fArray2[n4] > (float)(trackers.z[n5] - trackers.radz[n5]) && this.scz[n4] > 0.0f) {
                    float f28;
                    float f29;
                    fArray2[n4] = trackers.z[n5] - trackers.radz[n5];
                    f23 = 0.0f;
                    int n35 = 0;
                    do {
                        if ((float)n4 == f23 || !(fArray2[n35] <= (float)(trackers.z[n5] - trackers.radz[n5]))) continue;
                        n32 = n35;
                        fArray2[n32] = fArray2[n32] - (fArray2[n4] - (float)(trackers.z[n5] - trackers.radz[n5]));
                    } while ((f23 += 1.0f) < 4.0f);
                    f23 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    f23 /= 4.0f;
                    if ((double)f29 > 0.3) {
                        f23 = 0.3f;
                    }
                    if (n9 != 0) {
                        f23 = 0.0f;
                    }
                    f23 = (float)((double)f23 + ((double)this.bounce[this.cn] - 0.2));
                    if ((double)f28 < 1.1) {
                        f23 = 1.1f;
                    }
                    this.regz(n4, -Math.abs(this.scz[n4] * f23 * (float)trackers.dam[n5]), contO);
                    n32 = n4;
                    this.scz[n32] = this.scz[n32] - Math.abs(this.scz[n4] * f23);
                    this.skid = 2;
                    bl3 = true;
                    blArray[n4] = true;
                    if (!trackers.notwall[n5]) {
                        control.wall = n5;
                    }
                }
                if (trackers.xy[n5] == -90 && fArray[n4] < (float)(trackers.x[n5] + trackers.radx[n5]) && this.scx[n4] < 0.0f) {
                    float f30;
                    float f31;
                    fArray[n4] = trackers.x[n5] + trackers.radx[n5];
                    f23 = 0.0f;
                    int n36 = 0;
                    do {
                        if ((float)n4 == f23 || !(fArray[n36] >= (float)(trackers.x[n5] + trackers.radx[n5]))) continue;
                        n32 = n36;
                        fArray[n32] = fArray[n32] - (fArray[n4] - (float)(trackers.x[n5] + trackers.radx[n5]));
                    } while ((f23 += 1.0f) < 4.0f);
                    f23 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    f23 /= 4.0f;
                    if ((double)f31 > 0.3) {
                        f23 = 0.3f;
                    }
                    if (n9 != 0) {
                        f23 = 0.0f;
                    }
                    f23 = (float)((double)f23 + ((double)this.bounce[this.cn] - 0.2));
                    if ((double)f30 < 1.1) {
                        f23 = 1.1f;
                    }
                    this.regx(n4, Math.abs(this.scx[n4] * f23 * (float)trackers.dam[n5]), contO);
                    n32 = n4;
                    this.scx[n32] = this.scx[n32] + Math.abs(this.scx[n4] * f23);
                    this.skid = 2;
                    bl3 = true;
                    blArray[n4] = true;
                    if (!trackers.notwall[n5]) {
                        control.wall = n5;
                    }
                }
                if (trackers.xy[n5] == 90 && fArray[n4] > (float)(trackers.x[n5] - trackers.radx[n5]) && this.scx[n4] > 0.0f) {
                    float f32;
                    float f33;
                    fArray[n4] = trackers.x[n5] - trackers.radx[n5];
                    f23 = 0.0f;
                    int n37 = 0;
                    do {
                        if ((float)n4 == f23 || !(fArray[n37] <= (float)(trackers.x[n5] - trackers.radx[n5]))) continue;
                        n32 = n37;
                        fArray[n32] = fArray[n32] - (fArray[n4] - (float)(trackers.x[n5] - trackers.radx[n5]));
                    } while ((f23 += 1.0f) < 4.0f);
                    f23 = Math.abs(this.m.cos(this.pxy)) + Math.abs(this.m.cos(this.pzy));
                    f23 /= 4.0f;
                    if ((double)f33 > 0.3) {
                        f23 = 0.3f;
                    }
                    if (n9 != 0) {
                        f23 = 0.0f;
                    }
                    f23 = (float)((double)f23 + ((double)this.bounce[this.cn] - 0.2));
                    if ((double)f32 < 1.1) {
                        f23 = 1.1f;
                    }
                    this.regx(n4, -Math.abs(this.scx[n4] * f23 * (float)trackers.dam[n5]), contO);
                    n32 = n4;
                    this.scx[n32] = this.scx[n32] - Math.abs(this.scx[n4] * f23);
                    this.skid = 2;
                    bl3 = true;
                    blArray[n4] = true;
                    if (!trackers.notwall[n5]) {
                        control.wall = n5;
                    }
                }
                if (trackers.zy[n5] != 0 && trackers.zy[n5] != 90 && trackers.zy[n5] != -90) {
                    int n38 = 90 + trackers.zy[n5];
                    float f34 = 1.0f + (float)(50 - Math.abs(trackers.zy[n5])) / 30.0f;
                    if (f34 < 1.0f) {
                        f34 = 1.0f;
                    }
                    f22 = (float)trackers.y[n5] + ((fArray3[n4] - (float)trackers.y[n5]) * this.m.cos(n38) - (fArray2[n4] - (float)trackers.z[n5]) * this.m.sin(n38));
                    f21 = (float)trackers.z[n5] + ((fArray3[n4] - (float)trackers.y[n5]) * this.m.sin(n38) + (fArray2[n4] - (float)trackers.z[n5]) * this.m.cos(n38));
                    if (f21 > (float)trackers.z[n5] && f21 < (float)(trackers.z[n5] + 200)) {
                        n3 = n4;
                        this.scy[n3] = this.scy[n3] - (f21 - (float)trackers.z[n5]) / f34;
                        f21 = trackers.z[n5];
                    }
                    if (f21 > (float)(trackers.z[n5] - 30)) {
                        if (trackers.skd[n5] == 2) {
                            ++n30;
                        } else {
                            ++n6;
                        }
                        this.wtouch = true;
                        this.gtouch = false;
                        if (n9 == 0 && n21 != 0) {
                            float f35 = 1.4f;
                            contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], f35 * this.simag[this.cn], true, 0);
                        }
                    }
                    fArray3[n4] = (float)trackers.y[n5] + ((f22 - (float)trackers.y[n5]) * this.m.cos(-n38) - (f21 - (float)trackers.z[n5]) * this.m.sin(-n38));
                    fArray2[n4] = (float)trackers.z[n5] + ((f22 - (float)trackers.y[n5]) * this.m.sin(-n38) + (f21 - (float)trackers.z[n5]) * this.m.cos(-n38));
                    blArray[n4] = true;
                }
                if (trackers.xy[n5] == 0 || trackers.xy[n5] == 90 || trackers.xy[n5] == -90) continue;
                int n39 = 90 + trackers.xy[n5];
                float f36 = 1.0f + (float)(50 - Math.abs(trackers.xy[n5])) / 30.0f;
                if (f36 < 1.0f) {
                    f36 = 1.0f;
                }
                f22 = (float)trackers.y[n5] + ((fArray3[n4] - (float)trackers.y[n5]) * this.m.cos(n39) - (fArray[n4] - (float)trackers.x[n5]) * this.m.sin(n39));
                f21 = (float)trackers.x[n5] + ((fArray3[n4] - (float)trackers.y[n5]) * this.m.sin(n39) + (fArray[n4] - (float)trackers.x[n5]) * this.m.cos(n39));
                if (f21 > (float)trackers.x[n5] && f21 < (float)(trackers.x[n5] + 200)) {
                    n3 = n4;
                    this.scy[n3] = this.scy[n3] - (f21 - (float)trackers.x[n5]) / f36;
                    f21 = trackers.x[n5];
                }
                if (f21 > (float)(trackers.x[n5] - 30)) {
                    if (trackers.skd[n5] == 2) {
                        ++n30;
                    } else {
                        ++n6;
                    }
                    this.wtouch = true;
                    this.gtouch = false;
                    if (n9 == 0 && n21 != 0) {
                        float f37 = 1.4f;
                        contO.dust(n4, fArray[n4], fArray3[n4], fArray2[n4], this.scx[n4], this.scz[n4], f37 * this.simag[this.cn], true, 0);
                    }
                }
                fArray3[n4] = (float)trackers.y[n5] + ((f22 - (float)trackers.y[n5]) * this.m.cos(-n39) - (f21 - (float)trackers.x[n5]) * this.m.sin(-n39));
                fArray[n4] = (float)trackers.x[n5] + ((f22 - (float)trackers.y[n5]) * this.m.sin(-n39) + (f21 - (float)trackers.x[n5]) * this.m.cos(-n39));
                blArray[n4] = true;
            } while (++n4 < 4);
            if (n30 == 4) {
                this.mtouch = true;
            }
            if (n31 != 4) continue;
            n26 = 4;
        }
        if (n6 == 4) {
            this.mtouch = true;
        }
        n5 = 0;
        int n40 = 0;
        int n41 = 0;
        n4 = 0;
        if (this.scy[2] != this.scy[0]) {
            n14 = this.scy[2] < this.scy[0] ? -1 : 1;
            double d3 = Math.sqrt((fArray2[0] - fArray2[2]) * (fArray2[0] - fArray2[2]) + (fArray3[0] - fArray3[2]) * (fArray3[0] - fArray3[2]) + (fArray[0] - fArray[2]) * (fArray[0] - fArray[2])) / (double)(Math.abs(contO.keyz[0]) + Math.abs(contO.keyz[2]));
            int n42 = n5 = d3 >= 0.9998 ? n14 : (int)(Math.acos(d3) / (Math.PI / 180) * (double)n14);
        }
        if (this.scy[3] != this.scy[1]) {
            n14 = this.scy[3] < this.scy[1] ? -1 : 1;
            double d4 = Math.sqrt((fArray2[1] - fArray2[3]) * (fArray2[1] - fArray2[3]) + (fArray3[1] - fArray3[3]) * (fArray3[1] - fArray3[3]) + (fArray[1] - fArray[3]) * (fArray[1] - fArray[3])) / (double)(Math.abs(contO.keyz[1]) + Math.abs(contO.keyz[3]));
            int n43 = n40 = d4 >= 0.9998 ? n14 : (int)(Math.acos(d4) / (Math.PI / 180) * (double)n14);
        }
        if (this.scy[1] != this.scy[0]) {
            n14 = this.scy[1] < this.scy[0] ? -1 : 1;
            double d5 = Math.sqrt((fArray2[0] - fArray2[1]) * (fArray2[0] - fArray2[1]) + (fArray3[0] - fArray3[1]) * (fArray3[0] - fArray3[1]) + (fArray[0] - fArray[1]) * (fArray[0] - fArray[1])) / (double)(Math.abs(contO.keyx[0]) + Math.abs(contO.keyx[1]));
            int n44 = n41 = d5 >= 0.9998 ? n14 : (int)(Math.acos(d5) / (Math.PI / 180) * (double)n14);
        }
        if (this.scy[3] != this.scy[2]) {
            n14 = this.scy[3] < this.scy[2] ? -1 : 1;
            double d6 = Math.sqrt((fArray2[2] - fArray2[3]) * (fArray2[2] - fArray2[3]) + (fArray3[2] - fArray3[3]) * (fArray3[2] - fArray3[3]) + (fArray[2] - fArray[3]) * (fArray[2] - fArray[3])) / (double)(Math.abs(contO.keyx[2]) + Math.abs(contO.keyx[3]));
            int n45 = n4 = d6 >= 0.9998 ? n14 : (int)(Math.acos(d6) / (Math.PI / 180) * (double)n14);
        }
        if (bl3) {
            int n46;
            for (n46 = Math.abs(contO.xz + 45); n46 > 180; n46 -= 360) {
            }
            this.pmlt = Math.abs(n46) > 90 ? 1 : -1;
            for (n46 = Math.abs(contO.xz - 45); n46 > 180; n46 -= 360) {
            }
            this.nmlt = Math.abs(n46) > 90 ? 1 : -1;
        }
        contO.xz = (int)((float)contO.xz + this.forca * (this.scz[0] * (float)this.nmlt - this.scz[1] * (float)this.pmlt + this.scz[2] * (float)this.pmlt - this.scz[3] * (float)this.nmlt + this.scx[0] * (float)this.pmlt + this.scx[1] * (float)this.nmlt - this.scx[2] * (float)this.nmlt - this.scx[3] * (float)this.pmlt));
        if (Math.abs(n40) > Math.abs(n5)) {
            n5 = n40;
        }
        if (Math.abs(n4) > Math.abs(n41)) {
            n41 = n4;
        }
        this.pzy = !bl ? (this.pzy = this.pzy + n5) : (this.pzy = this.pzy - n5);
        int n47 = this.pxy = !bl4 ? (this.pxy = this.pxy + n41) : (this.pxy = this.pxy - n41);
        if (n26 == 4) {
            int n48 = 0;
            while (this.pzy < 360) {
                this.pzy += 360;
                contO.zy += 360;
            }
            while (this.pzy > 360) {
                this.pzy -= 360;
                contO.zy -= 360;
            }
            if (this.pzy < 190 && this.pzy > 170) {
                this.pzy = 180;
                contO.zy = 180;
                ++n48;
            }
            if (this.pzy > 350 || this.pzy < 10) {
                this.pzy = 0;
                contO.zy = 0;
                ++n48;
            }
            while (this.pxy < 360) {
                this.pxy += 360;
                contO.xy += 360;
            }
            while (this.pxy > 360) {
                this.pxy -= 360;
                contO.xy -= 360;
            }
            if (this.pxy < 190 && this.pxy > 170) {
                this.pxy = 180;
                contO.xy = 180;
                ++n48;
            }
            if (this.pxy > 350 || this.pxy < 10) {
                this.pxy = 0;
                contO.xy = 0;
                ++n48;
            }
            if (n48 == 2) {
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
        int n49 = n14 = bl ? -1 : 1;
        if (checkPoints.stage != 999) {
            contO.x = (int)((fArray[0] - (float)contO.keyx[0] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[0]) * this.m.sin(contO.xz) + fArray[1] - (float)contO.keyx[1] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[1]) * this.m.sin(contO.xz) + fArray[2] - (float)contO.keyx[2] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[2]) * this.m.sin(contO.xz) + fArray[3] - (float)contO.keyx[3] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[3]) * this.m.sin(contO.xz)) / 4.0f + (float)n16 * this.m.sin(this.pxy) * this.m.cos(contO.xz) - (float)n16 * this.m.sin(this.pzy) * this.m.sin(contO.xz) + f3);
            contO.y = (int)((fArray3[0] + fArray3[1] + fArray3[2] + fArray3[3]) / 4.0f - (float)n16 * this.m.cos(this.pzy) * this.m.cos(this.pxy) + f5);
            contO.z = (int)((fArray2[0] - (float)(n14 * contO.keyz[0]) * this.m.cos(contO.xz) - (float)contO.keyx[0] * this.m.sin(contO.xz) + fArray2[1] - (float)(n14 * contO.keyz[1]) * this.m.cos(contO.xz) - (float)contO.keyx[1] * this.m.sin(contO.xz) + fArray2[2] - (float)(n14 * contO.keyz[2]) * this.m.cos(contO.xz) - (float)contO.keyx[2] * this.m.sin(contO.xz) + fArray2[3] - (float)(n14 * contO.keyz[3]) * this.m.cos(contO.xz) - (float)contO.keyx[3] * this.m.sin(contO.xz)) / 4.0f + (float)n16 * this.m.sin(this.pxy) * this.m.sin(contO.xz) - (float)n16 * this.m.sin(this.pzy) * this.m.cos(contO.xz) + f4);
        } else {
            contO.x = (int)((fArray[0] - (float)contO.keyx[0] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[0]) * this.m.sin(contO.xz) + fArray[1] - (float)contO.keyx[1] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[1]) * this.m.sin(contO.xz) + fArray[2] - (float)contO.keyx[2] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[2]) * this.m.sin(contO.xz) + fArray[3] - (float)contO.keyx[3] * this.m.cos(contO.xz) + (float)(n14 * contO.keyz[3]) * this.m.sin(contO.xz)) / 4.05f + (float)n16 * this.m.sin(this.pxy) * this.m.cos(contO.xz) - (float)n16 * this.m.sin(this.pzy) * this.m.sin(contO.xz) + f3);
            contO.y = (int)((fArray3[0] + fArray3[1] + fArray3[2] + fArray3[3]) / 4.05f - (float)n16 * this.m.cos(this.pzy) * this.m.cos(this.pxy) + f5);
            contO.z = (int)((fArray2[0] - (float)(n14 * contO.keyz[0]) * this.m.cos(contO.xz) - (float)contO.keyx[0] * this.m.sin(contO.xz) + fArray2[1] - (float)(n14 * contO.keyz[1]) * this.m.cos(contO.xz) - (float)contO.keyx[1] * this.m.sin(contO.xz) + fArray2[2] - (float)(n14 * contO.keyz[2]) * this.m.cos(contO.xz) - (float)contO.keyx[2] * this.m.sin(contO.xz) + fArray2[3] - (float)(n14 * contO.keyz[3]) * this.m.cos(contO.xz) - (float)contO.keyx[3] * this.m.sin(contO.xz)) / 4.05f + (float)n16 * this.m.sin(this.pxy) * this.m.sin(contO.xz) - (float)n16 * this.m.sin(this.pzy) * this.m.cos(contO.xz) + f4);
        }
        if (Math.abs(this.speed) > 10.0f || !this.mtouch) {
            int n50 = Math.abs(this.pxy - contO.xy) >= 4 ? (this.pxy > contO.xy ? (contO.xy = contO.xy + (2 + (this.pxy - contO.xy) / 2)) : (contO.xy = contO.xy - (2 + (contO.xy - this.pxy) / 2))) : (contO.xy = this.pxy);
            int n51 = Math.abs(this.pzy - contO.zy) >= 4 ? (this.pzy > contO.zy ? (contO.zy = contO.zy + (2 + (this.pzy - contO.zy) / 2)) : (contO.zy = contO.zy - (2 + (contO.zy - this.pzy) / 2))) : (contO.zy = this.pzy);
        }
        if (this.wtouch && !this.capsized) {
            float f38 = (float)((double)(this.speed / (float)this.swits[this.cn][2] * 14.0f) * ((double)this.bounce[this.cn] - 0.4));
            this.tilt = control.left && this.tilt < f38 && this.tilt >= 0.0f ? (float)((double)this.tilt + 0.4) : (control.right && this.tilt > -f38 && this.tilt <= 0.0f ? (float)((double)this.tilt - 0.4) : ((double)Math.abs(this.tilt) > 3.0 * ((double)this.bounce[this.cn] - 0.4) ? (this.tilt > 0.0f ? (float)((double)this.tilt - 3.0 * ((double)this.bounce[this.cn] - 0.3)) : (float)((double)this.tilt + 3.0 * ((double)this.bounce[this.cn] - 0.3))) : 0.0f));
            contO.xy = (int)((float)contO.xy + this.tilt);
        } else if (this.tilt != 0.0f) {
            this.tilt = 0.0f;
        }
        if (this.wtouch && n21 == 2) {
            contO.zy += (int)((double)(this.m.random() * 6.0f * this.speed / (float)this.swits[this.cn][2] - 3.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
            contO.xy += (int)((double)(this.m.random() * 6.0f * this.speed / (float)this.swits[this.cn][2] - 3.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
        }
        if (this.wtouch && n21 == 1) {
            contO.zy += (int)((double)(this.m.random() * 4.0f * this.speed / (float)this.swits[this.cn][2] - 2.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
            contO.xy += (int)((double)(this.m.random() * 4.0f * this.speed / (float)this.swits[this.cn][2] - 2.0f * this.speed / (float)this.swits[this.cn][2]) * ((double)this.bounce[this.cn] - 0.3));
        }
        if (this.hitmag > this.maxmag[this.cn] && !this.dest) {
            this.distruct(contO);
            if (this.cntdest == 7) {
                this.dest = true;
            } else {
                ++this.cntdest;
            }
            if (this.cntdest == 1) {
                this.rpd.dest[this.im] = 300;
            }
        }
        if (contO.dist == 0) {
            for (int i = 0; i < contO.npl; ++i) {
                if (contO.p[i].chip != 0) {
                    contO.p[i].chip = 0;
                }
                if (contO.p[i].embos == 0) continue;
                contO.p[i].embos = 13;
            }
        }
        if (checkPoints.stage == 42) {
            for (int i = 0; i < contO.npl; ++i) {
                contO.p[i].chip = 1;
                contO.p[i].embos = 1;
            }
        }
        int n52 = 0;
        int n53 = 0;
        int n54 = 0;
        n15 = this.nofocus ? 1 : 7;
        for (n2 = 0; n2 < checkPoints.n; ++n2) {
            if (checkPoints.typ[n2] > 0) {
                ++n54;
                if (checkPoints.typ[n2] == 1) {
                    if (this.clear == n54 + this.nlaps * checkPoints.nsp) {
                        n15 = 1;
                    }
                    if ((float)Math.abs(contO.z - checkPoints.z[n2]) < 60.0f + Math.abs(this.scz[0] + this.scz[1] + this.scz[2] + this.scz[3]) / 4.0f && Math.abs(contO.x - checkPoints.x[n2]) < 700 && Math.abs(contO.y - checkPoints.y[n2]) < 800 && this.clear == n54 + this.nlaps * checkPoints.nsp - 1) {
                        this.clear = n54 + this.nlaps * checkPoints.nsp;
                        this.pcleared = n2;
                        this.focus = -1;
                    }
                }
                if (checkPoints.typ[n2] == 2) {
                    if (this.clear == n54 + this.nlaps * checkPoints.nsp) {
                        n15 = 1;
                    }
                    if ((float)Math.abs(contO.x - checkPoints.x[n2]) < 60.0f + Math.abs(this.scx[0] + this.scx[1] + this.scx[2] + this.scx[3]) / 4.0f && Math.abs(contO.z - checkPoints.z[n2]) < 700 && Math.abs(contO.y - checkPoints.y[n2]) < 800 && this.clear == n54 + this.nlaps * checkPoints.nsp - 1) {
                        this.clear = n54 + this.nlaps * checkPoints.nsp;
                        this.pcleared = n2;
                        this.focus = -1;
                    }
                }
            }
            if (this.py(contO.x / 100, checkPoints.x[n2] / 100, contO.z / 100, checkPoints.z[n2] / 100) * n15 >= n53 && n53 != 0) continue;
            n52 = n2;
            n53 = this.py(contO.x / 100, checkPoints.x[n2] / 100, contO.z / 100, checkPoints.z[n2] / 100) * n15;
        }
        if (this.clear == n54 + this.nlaps * checkPoints.nsp) {
            ++this.nlaps;
        }
        if (this.im == 0) {
            this.m.checkpoint = this.clear;
            while (this.m.checkpoint >= checkPoints.nsp) {
                this.m.checkpoint -= checkPoints.nsp;
            }
            if (this.clear == checkPoints.nlaps * checkPoints.nsp - 1) {
                this.m.lastcheck = true;
            }
            if (checkPoints.haltall) {
                this.m.lastcheck = false;
            }
        }
        if (this.focus == -1) {
            int n55 = n52 = this.im == 0 ? (n52 += 2) : ++n52;
            if (!this.nofocus) {
                n2 = this.pcleared + 1;
                while (checkPoints.typ[n2] <= 0) {
                    if (++n2 != checkPoints.n) continue;
                    n2 = 0;
                }
                if (n52 > n2 && (this.clear != this.nlaps * checkPoints.nsp || n52 < this.pcleared)) {
                    this.focus = n52 = n2;
                }
            }
            if (n52 >= checkPoints.n) {
                n52 -= checkPoints.n;
            }
            if (checkPoints.typ[n52] == -3) {
                n52 = 0;
            }
            if (this.im == 0) {
                if (this.missedcp != -1) {
                    this.missedcp = -1;
                }
            } else if (this.missedcp != 0) {
                this.missedcp = 0;
            }
        } else {
            n52 = this.focus;
            if (this.im == 0) {
                if (this.missedcp == 0 && this.mtouch && Math.sqrt(this.py(contO.x / 10, checkPoints.x[this.focus] / 10, contO.z / 10, checkPoints.z[this.focus] / 10)) > 800.0) {
                    this.missedcp = 1;
                }
                if (this.missedcp == -2 && Math.sqrt(this.py(contO.x / 10, checkPoints.x[this.focus] / 10, contO.z / 10, checkPoints.z[this.focus] / 10)) < 400.0) {
                    this.missedcp = 0;
                }
                if (this.missedcp != 0 && this.mtouch && Math.sqrt(this.py(contO.x / 10, checkPoints.x[this.focus] / 10, contO.z / 10, checkPoints.z[this.focus] / 10)) < 250.0) {
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
        this.point = n52;
        for (n2 = 0; n2 < checkPoints.fn; ++n2) {
            if (!checkPoints.roted[n2]) {
                if (Math.abs(contO.z - checkPoints.fz[n2]) >= 200 || this.py(contO.x / 100, checkPoints.fx[n2] / 100, contO.y / 100, checkPoints.fy[n2] / 100) >= 30) continue;
                if (contO.dist == 0) {
                    contO.fcnt = 8;
                } else {
                    if (this.im == 0 && !contO.fix && !this.xt.mutes) {
                        this.xt.carfixed.play();
                    }
                    contO.fix = true;
                }
                this.rpd.fix[this.im] = 300;
                continue;
            }
            if (Math.abs(contO.x - checkPoints.fx[n2]) >= 200 || this.py(contO.z / 100, checkPoints.fz[n2] / 100, contO.y / 100, checkPoints.fy[n2] / 100) >= 30) continue;
            if (contO.dist == 0) {
                contO.fcnt = 8;
            } else {
                if (this.im == 0 && !contO.fix && !this.xt.mutes) {
                    this.xt.carfixed.play();
                }
                contO.fix = true;
            }
            this.rpd.fix[this.im] = 300;
        }
        if (contO.fcnt == 7 || contO.fcnt == 8) {
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
                this.lxz = contO.xz;
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
            if (this.lxz != contO.xz) {
                this.travxz += this.lxz - contO.xz;
                this.lxz = contO.xz;
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
                        if (this.im == 0 && (int)this.powerup > this.rpd.powered && this.rpd.wasted == 0 && (this.powerup > 60.0f || checkPoints.stage <= 2)) {
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
                            int n56 = this.xtpower = this.powerup > 150.0f ? 400 : 100;
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
                    n2 = 0;
                    int n57 = 0;
                    do {
                        if (!(Math.abs(this.scz[n57]) < 70.0f) || !(Math.abs(this.scx[n57]) < 70.0f)) continue;
                        ++n2;
                    } while (++n57 < 4);
                    if (n2 == 4) {
                        this.capcnt = 1;
                    }
                } else {
                    ++this.capcnt;
                    if (this.capcnt == 30) {
                        this.speed = 0.0f;
                        contO.y += this.flipy[this.cn];
                        this.pxy += 180;
                        contO.xy += 180;
                        this.capcnt = 0;
                    }
                }
            }
        }
        if (this.speed != 0.0f) {
            if (this.xtpower == 0) {
                this.power = this.power > 0.0f ? (this.power = this.power - this.power * this.power * this.power / (float)this.powerloss[this.cn]) : 0.0f;
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
            if (checkPoints.dested[this.im] == 0) {
                checkPoints.dested[this.im] = this.lastcolido == 0 ? 1 : 2;
            }
        } else if (checkPoints.dested[this.im] != 0) {
            checkPoints.dested[this.im] = 0;
        }
        if (this.im == 0 && this.rpd.wasted == 0 && this.rpdcatch != 0) {
            --this.rpdcatch;
            if (this.rpdcatch == 0) {
                this.rpd.cotchinow(0, checkPoints);
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
            if (control.fire && !this.dest && !checkPoints.haltall && this.ltyp[this.cn] > -1) {
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
                    contO.fire = true;
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
                    contO.fire = true;
                }
            }
        } else {
            --this.lascnt;
        }
        if (control.fire && !this.dest && !checkPoints.haltall && this.ltyp[this.cn] > -1) {
            if (this.lascnt == 0 && this.bulkc < this.lsr.srate[this.ltyp[this.cn]]) {
                this.llx[this.nl] = contO.x;
                this.lly[this.nl] = contO.y;
                this.llz[this.nl] = contO.z;
                this.llxz[this.nl] = contO.xz;
                this.llzy[this.nl] = contO.zy;
                this.llxy[this.nl] = contO.xy;
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
        n2 = 0;
        int n58 = 0;
        do {
            int n59;
            int n60;
            int n61;
            if (this.lstage[n58] == 0) continue;
            ++n2;
            if (this.lly[n58] > 240 && this.lhit[n58] == 0) {
                this.lhit[n58] = 1;
            }
            if (this.lhit[n58] != 0) continue;
            if (this.lstage[n58] > 10) {
                n3 = 22500;
                n61 = -1;
                for (n60 = 1; n60 < n14; ++n60) {
                    n59 = this.getpy(contOArray[nArray[n60]].x, contOArray[nArray[n60]].y, contOArray[nArray[n60]].z, n58);
                    if (n59 >= n3 || n59 <= 0 || contOArray[nArray[n60]].exp) continue;
                    n3 = n59;
                    n61 = n60;
                }
                if (n61 != -1) {
                    if (this.lspeed[n58] > 230) {
                        this.lspeed[n58] = 230;
                    }
                    n60 = contOArray[nArray[n61]].x;
                    n59 = contOArray[nArray[n61]].z;
                    int n62 = contOArray[nArray[n61]].y;
                    int n63 = 0;
                    if (n60 - this.llx[n58] > 0) {
                        n63 = 180;
                    }
                    this.llxz[n58] = (int)((double)(90 + n63) + Math.atan((double)(n59 - this.llz[n58]) / (double)(n60 - this.llx[n58])) / (Math.PI / 180));
                    n63 = 0;
                    if (n62 - this.lly[n58] < 0) {
                        n63 = 65356;
                    }
                    int n64 = (int)Math.sqrt((n59 - this.llz[n58]) * (n59 - this.llz[n58]) + (n60 - this.llx[n58]) * (n60 - this.llx[n58]));
                    this.llzy[n58] = -((int)((double)(90 + n63) - Math.atan((double)n64 / (double)(n62 - this.lly[n58])) / (Math.PI / 180)));
                }
            }
            n3 = n58;
            this.llx[n3] = this.llx[n3] - (int)((float)this.lspeed[n58] * (contO.m.sin(this.llxz[n58]) * contO.m.cos(this.llzy[n58])));
            n61 = n58;
            this.llz[n61] = this.llz[n61] + (int)((float)this.lspeed[n58] * (contO.m.cos(this.llxz[n58]) * contO.m.cos(this.llzy[n58])));
            n60 = n58;
            this.lly[n60] = this.lly[n60] - (int)((float)this.lspeed[n58] * contO.m.sin(this.llzy[n58]));
            n59 = n58;
            this.lstage[n59] = this.lstage[n59] + 1;
            if (this.lstage[n58] <= 80) continue;
            this.lstage[n58] = 0;
        } while (++n58 < 20);
        if (n2 != 0) {
            if (!contO.fire) {
                contO.fire = true;
            }
        } else if (contO.fire) {
            contO.fire = false;
            this.bulkc = 0;
        }
        if (this.ester == 0) {
            if (contO.x > 2800 && contO.x < 3200 && contO.z > -2100 && contO.z < -1900 && contO.y > -30) {
                this.ester = 1;
                contO.nhits = 0;
            }
        } else {
            if (this.ester < 13) {
                if (this.ltyp[this.cn] == 0) {
                    int n65 = contO.m.er = contO.m.er == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 1) {
                    int n66 = contO.m.eg = contO.m.eg == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 2) {
                    int n67 = contO.m.eb = contO.m.eb == 0 ? 1 : 0;
                }
                if (this.ltyp[this.cn] == 3) {
                    if (contO.m.er == 0) {
                        contO.m.er = 1;
                        contO.m.eg = 1;
                    } else {
                        contO.m.er = 0;
                        contO.m.eg = 0;
                    }
                }
                if (this.ltyp[this.cn] == 4) {
                    if (contO.m.eb == 0) {
                        contO.m.eb = 1;
                        contO.m.eg = 1;
                    } else {
                        contO.m.eb = 0;
                        contO.m.eg = 0;
                    }
                }
            }
            if (this.ester == 1) {
                contO.wire = true;
            }
            if (this.ester == 3) {
                contO.wire = false;
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

    public void lasercolid(ContO contO) {
        if (!contO.out) {
            int n = 0;
            do {
                int n2;
                if (this.lstage[n] == 0 || this.lhit[n] != 0 || (n2 = this.getpy(contO.x, contO.y, contO.z, n)) >= contO.maxR / 10 * (contO.maxR / 10) || n2 <= 0) continue;
                if (contO.rcol != 0 && n2 < contO.maxR / (10 * contO.rcol) * (contO.maxR / (10 * contO.rcol)) + this.lsr.rads[this.ltyp[this.cn]] / 10 * (this.lsr.rads[this.ltyp[this.cn]] / 10)) {
                    this.lhit[n] = 1;
                    if (contO.maxhits != -1) {
                        int n3;
                        contO.hit = true;
                        if (Math.random() > 0.5) {
                            n3 = contO.nhits + this.lsr.damg[this.ltyp[this.cn]];
                            contO.nhits = contO.nhits;
                        } else {
                            n3 = contO.nhits + 2;
                            contO.nhits = contO.nhits;
                        }
                        contO.nhits = n3;
                    }
                }
                if (contO.pcol == 0) continue;
                for (int i = 0; i < contO.npl; ++i) {
                    for (int j = 0; j < contO.p[i].n; ++j) {
                        if (contO.hit || (this.llx[n] - (contO.x + contO.p[i].ox[j])) * (this.llx[n] - (contO.x + contO.p[i].ox[j])) + (this.lly[n] - (contO.y + contO.p[i].oy[j])) * (this.lly[n] - (contO.y + contO.p[i].oy[j])) + (this.llz[n] - (contO.z + contO.p[i].oz[j])) * (this.llz[n] - (contO.z + contO.p[i].oz[j])) >= this.lsr.rads[this.ltyp[this.cn]] * 10 / contO.pcol * (this.lsr.rads[this.ltyp[this.cn]] * 10 / contO.pcol)) continue;
                        this.lhit[n] = 1;
                        if (contO.maxhits == -1) continue;
                        contO.hit = true;
                        if (Math.random() > 0.5) {
                            contO.nhits += this.lsr.damg[this.ltyp[this.cn]];
                            continue;
                        }
                        contO.nhits += 2;
                    }
                }
            } while (++n < 20);
        }
    }

    public int getpy(int n, int n2, int n3, int n4) {
        return (n - this.llx[n4]) / 10 * ((n - this.llx[n4]) / 10) + (n2 - this.lly[n4]) / 10 * ((n2 - this.lly[n4]) / 10) + (n3 - this.llz[n4]) / 10 * ((n3 - this.llz[n4]) / 10);
    }

    public void dl(Graphics graphics) {
        int n = 0;
        do {
            if (this.lstage[n] == 0) continue;
            this.lsr.d(graphics, this.ltyp[this.cn], this.llx[n], this.lly[n], this.llz[n], this.llxz[n], this.llzy[n], this.llxy[n], this.lhit[n]);
            if (this.lhit[n] == 0) continue;
            int n2 = n;
            this.lhit[n2] = this.lhit[n2] + 1;
            if (this.lhit[n] <= 2) continue;
            this.lstage[n] = 0;
        } while (++n < 20);
    }
}
