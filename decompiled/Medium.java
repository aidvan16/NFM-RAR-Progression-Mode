/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;

public class Medium {
    int focus_point = 400;
    int ground = 250;
    int skyline = -300;
    int[] fade = new int[]{3000, 6000, 9000, 12000, 15000, 18000, 21000, 24000};
    int[] csky = new int[]{170, 220, 255};
    int[] cgrnd = new int[]{205, 200, 200};
    int[] cpol = new int[]{215, 210, 210};
    int[] cfade = new int[]{255, 220, 220};
    int[] snap = new int[3];
    int origfade = 3000;
    int fogd = 3;
    boolean lightson = false;
    int lightn = -1;
    int lilo = 217;
    int flex = 0;
    boolean trk = false;
    boolean crs = false;
    int cx = 335;
    int cy = 200;
    int cz = 50;
    int xz = 0;
    int zy = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    int er = 0;
    int eg = 0;
    int eb = 0;
    int w = 670;
    int h = 400;
    int nsp = 0;
    int[] spx = new int[7];
    int[] spz = new int[7];
    int[] sprad = new int[7];
    boolean td = false;
    int bcxz = 0;
    boolean bt = false;
    int vxz = 180;
    int adv = 500;
    boolean vert = false;
    int trns = 1;
    int dispolys = 0;
    int[][] ogpx = new int[20000][8];
    int[][] ogpz = new int[20000][8];
    int[] cgpx = new int[20000];
    int[] cgpz = new int[20000];
    int sgpx = 0;
    int sgpz = 0;
    int nrw = 0;
    int ncl = 0;
    float[] tcos = new float[360];
    float[] tsin = new float[360];
    int lastmaf = 0;
    int checkpoint = -1;
    boolean lastcheck = false;
    float elecr = 0.0f;
    boolean cpflik = false;
    boolean nochekflk = false;
    int cntrn = 0;
    boolean[] diup = new boolean[3];
    int[] rand = new int[3];
    int trn = 0;
    int hit = 45000;
    int ptr = 0;
    int ptcnt = -10;
    int nrnd = 0;
    long trx = 0L;
    long trz = 0L;
    long atrx = 0L;
    long atrz = 0L;
    int fallen = 0;
    float fo = 1.0f;
    float gofo = (float)((double)0.33f + Math.random() * 1.34);
    int tart = 0;
    int yart = -100;

    public float random() {
        int n;
        if (this.cntrn == 0) {
            n = 0;
            do {
                this.rand[n] = (int)(10.0 * Math.random());
                boolean bl = this.diup[n] = !(Math.random() > Math.random());
            } while (++n < 3);
            this.cntrn = 20;
        } else {
            --this.cntrn;
        }
        n = 0;
        do {
            int n2;
            if (this.diup[n]) {
                n2 = n;
                this.rand[n2] = this.rand[n2] + 1;
                if (this.rand[n] != 10) continue;
                this.rand[n] = 0;
                continue;
            }
            n2 = n;
            this.rand[n2] = this.rand[n2] - 1;
            if (this.rand[n] != -1) continue;
            this.rand[n] = 9;
        } while (++n < 3);
        ++this.trn;
        if (this.trn == 3) {
            this.trn = 0;
        }
        return (float)this.rand[this.trn] / 10.0f;
    }

    public void groundpolys(Graphics graphics) {
        int n;
        int n2;
        int n3;
        int n4 = (this.x - this.sgpx) / 1200 - 7;
        if (n4 < 0) {
            n4 = 0;
        }
        if ((n3 = n4 + 15) > this.nrw) {
            n3 = this.nrw;
        }
        if ((n2 = (this.z - this.sgpz) / 1200 - 7) < 0) {
            n2 = 0;
        }
        if ((n = n2 + 15) > this.ncl) {
            n = this.ncl;
        }
        for (int i = n4; i < n3; ++i) {
            for (int j = n2; j < n; ++j) {
                int n5 = i + j * this.nrw;
                int n6 = this.cx + (int)((float)(this.cgpx[n5] - this.x - this.cx) * this.cos(this.xz) - (float)(this.cgpz[n5] - this.z - this.cz) * this.sin(this.xz));
                int n7 = this.cz + (int)((float)(this.cgpx[n5] - this.x - this.cx) * this.sin(this.xz) + (float)(this.cgpz[n5] - this.z - this.cz) * this.cos(this.xz));
                int n8 = this.cz + (int)((float)(250 - this.y - this.cy) * this.sin(this.zy) + (float)(n7 - this.cz) * this.cos(this.zy));
                if (this.xs(n6 + 700, n8) <= 0 || this.xs(n6 - 700, n8) >= this.w || n8 <= -700 || n8 >= (this.fade[0] + this.fade[1]) / 2) continue;
                int[] nArray = new int[8];
                int[] nArray2 = new int[8];
                int[] nArray3 = new int[8];
                int n9 = 0;
                do {
                    nArray[n9] = this.ogpx[n5][n9] + this.cgpx[n5] - this.x;
                    nArray2[n9] = this.ogpz[n5][n9] + this.cgpz[n5] - this.z;
                    nArray3[n9] = this.ground;
                } while (++n9 < 8);
                this.rot(nArray, nArray2, this.cx, this.cz, this.xz, 8);
                this.rot(nArray3, nArray2, this.cy, this.cz, this.zy, 8);
                int[] nArray4 = new int[8];
                int[] nArray5 = new int[8];
                int n10 = 0;
                int n11 = 0;
                int n12 = 0;
                int n13 = 0;
                boolean bl = true;
                int n14 = 0;
                do {
                    nArray4[n14] = this.xs(nArray[n14], nArray2[n14]);
                    nArray5[n14] = this.ys(nArray3[n14], nArray2[n14]);
                    if (nArray5[n14] < 0 || nArray2[n14] < 10) {
                        ++n10;
                    }
                    if (nArray5[n14] > this.h || nArray2[n14] < 10) {
                        ++n11;
                    }
                    if (nArray4[n14] < 0 || nArray2[n14] < 10) {
                        ++n12;
                    }
                    if (nArray4[n14] <= this.w && nArray2[n14] >= 10) continue;
                    ++n13;
                } while (++n14 < 8);
                if (n12 == 8 || n10 == 8 || n11 == 8 || n13 == 8) {
                    bl = false;
                }
                if (!bl) continue;
                int n15 = this.cpol[0];
                int n16 = this.cpol[1];
                int n17 = this.cpol[2];
                if (n8 > this.fade[0]) {
                    n15 = (n15 * 3 + this.cfade[0]) / 4;
                    n16 = (n16 * 3 + this.cfade[1]) / 4;
                    n17 = (n17 * 3 + this.cfade[2]) / 4;
                }
                graphics.setColor(new Color(n15, n16, n17));
                graphics.fillPolygon(nArray4, nArray5, 8);
            }
        }
    }

    public void setpolys(int n, int n2, int n3) {
        this.cpol[0] = (int)((float)n + (float)n * ((float)this.snap[0] / 100.0f));
        if (this.cpol[0] > 255) {
            this.cpol[0] = 255;
        }
        if (this.cpol[0] < 0) {
            this.cpol[0] = 0;
        }
        this.cpol[1] = (int)((float)n2 + (float)n2 * ((float)this.snap[1] / 100.0f));
        if (this.cpol[1] > 255) {
            this.cpol[1] = 255;
        }
        if (this.cpol[1] < 0) {
            this.cpol[1] = 0;
        }
        this.cpol[2] = (int)((float)n3 + (float)n3 * ((float)this.snap[2] / 100.0f));
        if (this.cpol[2] > 255) {
            this.cpol[2] = 255;
        }
        if (this.cpol[2] < 0) {
            this.cpol[2] = 0;
        }
        this.dispolys = 0;
    }

    public int ys(int n, int n2) {
        if (n2 < 10) {
            n2 = 10;
        }
        return (n2 - this.focus_point) * (this.cy - n) / n2 + n;
    }

    public float sin(int n) {
        while (n >= 360) {
            n -= 360;
        }
        while (n < 0) {
            n += 360;
        }
        return this.tsin[n];
    }

    public Medium() {
        int n = 0;
        do {
            this.tcos[n] = (float)Math.cos((double)n * (Math.PI / 180));
        } while (++n < 360);
        n = 0;
        do {
            this.tsin[n] = (float)Math.sin((double)n * (Math.PI / 180));
        } while (++n < 360);
    }

    public void setfade(int n, int n2, int n3) {
        this.cfade[0] = (int)((float)n + (float)n * ((float)this.snap[0] / 100.0f));
        if (this.cfade[0] > 255) {
            this.cfade[0] = 255;
        }
        if (this.cfade[0] < 0) {
            this.cfade[0] = 0;
        }
        this.cfade[1] = (int)((float)n2 + (float)n2 * ((float)this.snap[1] / 100.0f));
        if (this.cfade[1] > 255) {
            this.cfade[1] = 255;
        }
        if (this.cfade[1] < 0) {
            this.cfade[1] = 0;
        }
        this.cfade[2] = (int)((float)n3 + (float)n3 * ((float)this.snap[2] / 100.0f));
        if (this.cfade[2] > 255) {
            this.cfade[2] = 255;
        }
        if (this.cfade[2] < 0) {
            this.cfade[2] = 0;
        }
    }

    public void d(Graphics graphics) {
        int n;
        int n2;
        this.nsp = 0;
        if (this.zy > 90) {
            this.zy = 90;
        }
        if (this.zy < -90) {
            this.zy = -90;
        }
        if (this.xz > 360) {
            this.xz -= 360;
        }
        if (this.xz < 0) {
            this.xz += 360;
        }
        if (this.y > 0) {
            this.y = 0;
        }
        this.ground = 250 - this.y;
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        int n3 = this.cgrnd[0];
        int n4 = this.cgrnd[1];
        int n5 = this.cgrnd[2];
        int n6 = this.h;
        int n7 = 0;
        do {
            n2 = this.fade[n7];
            n = this.ground;
            if (this.zy != 0) {
                n = this.cy + (int)((float)(this.ground - this.cy) * this.cos(this.zy) - (float)(this.fade[n7] - this.cz) * this.sin(this.zy));
                n2 = this.cz + (int)((float)(this.ground - this.cy) * this.sin(this.zy) + (float)(this.fade[n7] - this.cz) * this.cos(this.zy));
            }
            nArray[0] = 0;
            nArray2[0] = this.ys(n, n2);
            if (nArray2[0] < 0) {
                nArray2[0] = 0;
            }
            nArray[1] = 0;
            nArray2[1] = n6;
            nArray[2] = this.w;
            nArray2[2] = n6;
            nArray[3] = this.w;
            nArray2[3] = nArray2[0];
            n6 = nArray2[0];
            if (n7 > 0) {
                n3 = (n3 * 3 + this.cfade[0]) / 4;
                n4 = (n4 * 3 + this.cfade[1]) / 4;
                n5 = (n5 * 3 + this.cfade[2]) / 4;
            }
            if (nArray2[0] >= this.h || nArray2[1] <= 0) continue;
            graphics.setColor(new Color(n3, n4, n5));
            graphics.fillPolygon(nArray, nArray2, 4);
        } while (++n7 < 8);
        if (this.lightn != -1) {
            if (this.lightn < 16) {
                if (this.lilo > this.lightn + 217) {
                    this.lilo -= 3;
                } else {
                    this.lightn = (int)(16.0f + 16.0f * this.random());
                }
            } else if (this.lilo < this.lightn + 217) {
                this.lilo += 7;
            } else {
                this.lightn = (int)(16.0f * this.random());
            }
            this.csky[0] = (int)((float)this.lilo + (float)this.lilo * ((float)this.snap[0] / 100.0f));
            if (this.csky[0] > 255) {
                this.csky[0] = 255;
            }
            if (this.csky[0] < 0) {
                this.csky[0] = 0;
            }
            this.csky[1] = (int)((float)this.lilo + (float)this.lilo * ((float)this.snap[1] / 100.0f));
            if (this.csky[1] > 255) {
                this.csky[1] = 255;
            }
            if (this.csky[1] < 0) {
                this.csky[1] = 0;
            }
            this.csky[2] = (int)((float)this.lilo + (float)this.lilo * ((float)this.snap[2] / 100.0f));
            if (this.csky[2] > 255) {
                this.csky[2] = 255;
            }
            if (this.csky[2] < 0) {
                this.csky[2] = 0;
            }
            this.flex = 0;
        }
        n3 = this.csky[0];
        n4 = this.csky[1];
        n5 = this.csky[2];
        n7 = 0;
        if (this.flex == 2) {
            nArray[0] = 260;
            nArray2[0] = 45;
            nArray[1] = 260;
            nArray2[1] = 0;
            nArray[2] = 410;
            nArray2[2] = 0;
            nArray[3] = 410;
            nArray2[3] = 45;
            graphics.setColor(new Color(n3, n4, n5));
            graphics.fillPolygon(nArray, nArray2, 4);
            n7 = 45;
        }
        n2 = 0;
        do {
            n = this.fade[n2];
            int n8 = this.skyline;
            if (this.zy != 0) {
                n8 = this.cy + (int)((float)(this.skyline - this.cy) * this.cos(this.zy) - (float)(this.fade[n2] - this.cz) * this.sin(this.zy));
                n = this.cz + (int)((float)(this.skyline - this.cy) * this.sin(this.zy) + (float)(this.fade[n2] - this.cz) * this.cos(this.zy));
            }
            nArray[0] = 0;
            nArray2[0] = this.ys(n8, n);
            if (nArray2[0] > this.h) {
                nArray2[0] = this.h;
            }
            nArray[1] = 0;
            nArray2[1] = n7;
            nArray[2] = this.w;
            nArray2[2] = n7;
            nArray[3] = this.w;
            nArray2[3] = nArray2[0];
            n7 = nArray2[0];
            if (n2 > 0) {
                n3 = (n3 * 3 + this.cfade[0]) / 4;
                n4 = (n4 * 3 + this.cfade[1]) / 4;
                n5 = (n5 * 3 + this.cfade[2]) / 4;
            }
            if (nArray2[0] <= 0 || nArray2[1] >= this.h) continue;
            graphics.setColor(new Color(n3, n4, n5));
            graphics.fillPolygon(nArray, nArray2, 4);
        } while (++n2 < 8);
        nArray[0] = 0;
        nArray2[0] = n7;
        nArray[1] = 0;
        nArray2[1] = n6;
        nArray[2] = this.w;
        nArray2[2] = n6;
        nArray[3] = this.w;
        nArray2[3] = n7;
        if (nArray2[0] < this.h && nArray2[1] > 0) {
            graphics.setColor(new Color(this.cfade[0], this.cfade[1], this.cfade[2]));
            graphics.fillPolygon(nArray, nArray2, 4);
        }
        if (this.dispolys != 2) {
            this.groundpolys(graphics);
        }
        if (this.cpflik) {
            this.cpflik = false;
        } else {
            this.cpflik = true;
            this.elecr = this.random() * 15.0f - 6.0f;
        }
    }

    public void watch(ContO contO, int n) {
        if (this.flex != 0) {
            this.flex = 0;
        }
        if (this.td) {
            this.y = (int)((float)(contO.y - 300) - 1100.0f * this.random());
            this.x = contO.x + (int)((float)(contO.x + 400 - contO.x) * this.cos(n) - (float)(contO.z + 5000 - contO.z) * this.sin(n));
            this.z = contO.z + (int)((float)(contO.x + 400 - contO.x) * this.sin(n) + (float)(contO.z + 5000 - contO.z) * this.cos(n));
            this.td = false;
        }
        int n2 = 0;
        if (contO.x - this.x - this.cx > 0) {
            n2 = 180;
        }
        int n3 = -((int)((double)(90 + n2) + Math.atan((double)(contO.z - this.z) / (double)(contO.x - this.x - this.cx)) / (Math.PI / 180)));
        n2 = 0;
        if (contO.y - this.y - this.cy < 0) {
            n2 = 65356;
        }
        int n4 = (int)Math.sqrt((contO.z - this.z) * (contO.z - this.z) + (contO.x - this.x - this.cx) * (contO.x - this.x - this.cx));
        int n5 = (int)((double)(90 + n2) - Math.atan((double)n4 / (double)(contO.y - this.y - this.cy)) / (Math.PI / 180));
        this.xz += (n3 - this.xz) / this.trns;
        if (this.trns != 1) {
            --this.trns;
        }
        this.zy += (n5 - this.zy) / 5;
        if ((int)Math.sqrt((contO.z - this.z) * (contO.z - this.z) + (contO.x - this.x - this.cx) * (contO.x - this.x - this.cx) + (contO.y - this.y - this.cy) * (contO.y - this.y - this.cy)) > 6000) {
            this.td = true;
        }
    }

    public void rot(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4) {
        if (n3 != 0) {
            for (int i = 0; i < n4; ++i) {
                int n5 = nArray[i];
                int n6 = nArray2[i];
                nArray[i] = n + (int)((float)(n5 - n) * this.cos(n3) - (float)(n6 - n2) * this.sin(n3));
                nArray2[i] = n2 + (int)((float)(n5 - n) * this.sin(n3) + (float)(n6 - n2) * this.cos(n3));
            }
        }
    }

    public void setsnap(int n, int n2, int n3) {
        this.snap[0] = n;
        this.snap[1] = n2;
        this.snap[2] = n3;
    }

    public void around(ContO contO, boolean bl) {
        if (this.flex != 0) {
            this.flex = 0;
        }
        if (!bl) {
            int n = this.adv = !this.vert ? (this.adv = this.adv + 2) : (this.adv = this.adv - 2);
            if (this.adv > 900) {
                this.vert = true;
            }
            if (this.adv < -500) {
                this.vert = false;
            }
        } else {
            this.adv -= 14;
        }
        int n = 500 + this.adv;
        if (bl && n < 1300) {
            n = 1300;
        }
        if (n < 1000) {
            n = 1000;
        }
        this.y = contO.y - this.adv;
        if (this.y > 10) {
            this.vert = false;
        }
        this.x = contO.x + (int)((float)(contO.x - n - contO.x) * this.cos(this.vxz));
        this.z = contO.z + (int)((float)(contO.x - n - contO.x) * this.sin(this.vxz));
        this.vxz = !bl ? (this.vxz = this.vxz + 2) : (this.vxz = this.vxz + 4);
        int n2 = 0;
        int n3 = this.y;
        if (n3 > 0) {
            n3 = 0;
        }
        if (contO.y - n3 - this.cy < 0) {
            n2 = 65356;
        }
        int n4 = (int)Math.sqrt((contO.z - this.z + this.cz) * (contO.z - this.z + this.cz) + (contO.x - this.x - this.cx) * (contO.x - this.x - this.cx));
        int n5 = (int)((double)(90 + n2) - Math.atan((double)n4 / (double)(contO.y - n3 - this.cy)) / (Math.PI / 180));
        this.xz = -this.vxz + 90;
        if (bl) {
            n5 -= 15;
        }
        this.zy += (n5 - this.zy) / 10;
        if (this.trns != 5) {
            this.trns = 5;
        }
    }

    public void setgrnd(int n, int n2, int n3) {
        this.cgrnd[0] = (int)((float)n + (float)n * ((float)this.snap[0] / 100.0f));
        if (this.cgrnd[0] > 255) {
            this.cgrnd[0] = 255;
        }
        if (this.cgrnd[0] < 0) {
            this.cgrnd[0] = 0;
        }
        this.cgrnd[1] = (int)((float)n2 + (float)n2 * ((float)this.snap[1] / 100.0f));
        if (this.cgrnd[1] > 255) {
            this.cgrnd[1] = 255;
        }
        if (this.cgrnd[1] < 0) {
            this.cgrnd[1] = 0;
        }
        this.cgrnd[2] = (int)((float)n3 + (float)n3 * ((float)this.snap[2] / 100.0f));
        if (this.cgrnd[2] > 255) {
            this.cgrnd[2] = 255;
        }
        if (this.cgrnd[2] < 0) {
            this.cgrnd[2] = 0;
        }
        this.dispolys = 2;
    }

    public int xs(int n, int n2) {
        if (n2 < this.cz) {
            n2 = this.cz;
        }
        return (n2 - this.focus_point) * (this.cx - n) / n2 + n;
    }

    public void adjstfade(float f) {
        if (f < 15.0f) {
            this.fade[0] = (int)((float)this.origfade - 1000.0f * (15.0f - f));
            if (this.fade[0] < 3000) {
                this.fade[0] = 3000;
            }
            this.fadfrom(this.fade[0]);
        } else if (this.fade[0] != this.origfade) {
            this.fade[0] = this.fade[0] + 500;
            if (this.fade[0] > this.origfade) {
                this.fade[0] = this.origfade;
            }
            this.fadfrom(this.fade[0]);
        }
    }

    public void addsp(int n, int n2, int n3) {
        if (this.nsp != 7) {
            this.spx[this.nsp] = n;
            this.spz[this.nsp] = n2;
            this.sprad[this.nsp] = n3;
            ++this.nsp;
        }
    }

    public void aroundtrack(CheckPoints checkPoints) {
        if (this.flex != 0) {
            this.flex = 0;
        }
        this.y = -this.hit;
        this.x = this.cx + (int)this.trx + (int)(17000.0f * this.cos(this.vxz));
        this.z = (int)this.trz + (int)(17000.0f * this.sin(this.vxz));
        if (this.hit > 5000) {
            if (this.hit == 45000) {
                this.fo = 1.0f;
                this.zy = 67;
                this.atrx = ((long)checkPoints.x[0] - this.trx) / 116L;
                this.atrz = ((long)checkPoints.z[0] - this.trz) / 116L;
                this.focus_point = 400;
            }
            this.hit -= this.fallen;
            this.fallen += 7;
            this.trx += this.atrx;
            this.trz += this.atrz;
            if (this.hit < 17600) {
                this.zy -= 2;
            }
            if (this.fallen > 500) {
                this.fallen = 500;
            }
            if (this.hit <= 5000) {
                this.hit = 5000;
                this.fallen = 0;
            }
            this.vxz += 3;
        } else {
            this.focus_point = (int)(400.0f * this.fo);
            if ((double)Math.abs(this.fo - this.gofo) > 0.005) {
                this.fo = this.fo < this.gofo ? (this.fo = this.fo + 0.005f) : (this.fo = this.fo - 0.005f);
            } else {
                this.gofo = (float)((double)0.35f + Math.random() * 1.3);
            }
            ++this.vxz;
            this.trx -= (this.trx - (long)checkPoints.x[this.ptr]) / 10L;
            this.trz -= (this.trz - (long)checkPoints.z[this.ptr]) / 10L;
            if (this.ptcnt == 7) {
                ++this.ptr;
                if (this.ptr == checkPoints.n) {
                    this.ptr = 0;
                    ++this.nrnd;
                }
                this.ptcnt = 0;
            } else {
                ++this.ptcnt;
            }
        }
        if (this.vxz > 360) {
            this.vxz -= 360;
        }
        this.xz = -this.vxz - 90;
        int n = 0;
        if (-this.y - this.cy < 0) {
            n = 65356;
        }
        Math.sqrt((this.trz - (long)this.z + (long)this.cz) * (this.trz - (long)this.z + (long)this.cz) + (this.trx - (long)this.x - (long)this.cx) * (this.trx - (long)this.x - (long)this.cx));
        this.cpflik = !this.cpflik;
    }

    public void setsky(int n, int n2, int n3) {
        this.csky[0] = (int)((float)n + (float)n * ((float)this.snap[0] / 100.0f));
        if (this.csky[0] > 255) {
            this.csky[0] = 255;
        }
        if (this.csky[0] < 0) {
            this.csky[0] = 0;
        }
        this.csky[1] = (int)((float)n2 + (float)n2 * ((float)this.snap[1] / 100.0f));
        if (this.csky[1] > 255) {
            this.csky[1] = 255;
        }
        if (this.csky[1] < 0) {
            this.csky[1] = 0;
        }
        this.csky[2] = (int)((float)n3 + (float)n3 * ((float)this.snap[2] / 100.0f));
        if (this.csky[2] > 255) {
            this.csky[2] = 255;
        }
        if (this.csky[2] < 0) {
            this.csky[2] = 0;
        }
    }

    public void fadfrom(int n) {
        int n2 = 0;
        do {
            this.fade[n2] = n * (n2 + 1);
        } while (++n2 < 8);
    }

    public void follow(ContO contO, Madness madness, int n, int n2) {
        int n3;
        if (madness.cn != 37) {
            this.zy = 10;
            n3 = 2 + Math.abs(this.bcxz) / 4;
            if (n3 > 20) {
                n3 = 20;
            }
            if (n2 != 0) {
                if (n2 == 1) {
                    if (this.bcxz < 180) {
                        this.bcxz += n3;
                    }
                    if (this.bcxz > 180) {
                        this.bcxz = 180;
                    }
                }
                if (n2 == -1) {
                    if (this.bcxz > -180) {
                        this.bcxz -= n3;
                    }
                    if (this.bcxz < -180) {
                        this.bcxz = -180;
                    }
                }
            } else if (Math.abs(this.bcxz) > n3) {
                this.bcxz = this.bcxz > 0 ? (this.bcxz = this.bcxz - n3) : (this.bcxz = this.bcxz + n3);
            } else if (this.bcxz != 0) {
                this.bcxz = 0;
            }
            this.xz = -(n += this.bcxz);
            this.x = contO.x - this.cx + (int)((float)(-(contO.z - 800 - contO.z)) * this.sin(n));
            this.z = contO.z - this.cz + (int)((float)(contO.z - 800 - contO.z) * this.cos(n));
            this.y = contO.y - 250 - this.cy;
            if (this.trns != 1) {
                this.trns = 1;
            }
        }
        if (madness.cn == 37) {
            n2 = contO.xz;
            for (n = contO.zy; n > 360; n -= 360) {
            }
            while (n < 0) {
                n += 360;
            }
            if (n > 90 && n < 270) {
                this.tart += (180 - this.tart) / 3;
                this.yart += (100 - this.yart) / 4;
            } else {
                this.tart -= this.tart / 3;
                this.yart += (-100 - this.yart) / 4;
            }
            n2 += this.tart;
            if (n > 90) {
                n = 180 - n;
            }
            if (n < -90) {
                n = -180 - n;
            }
            n3 = contO.y + (int)((float)(contO.y + this.yart - contO.y) * this.cos(contO.zy) - (float)(contO.z + 260 - contO.z) * this.sin(contO.zy));
            int n4 = contO.z + (int)((float)(contO.y + this.yart - contO.y) * this.sin(contO.zy) + (float)(contO.z + 260 - contO.z) * this.cos(contO.zy));
            int n5 = contO.x + (int)((float)(-(n4 - contO.z)) * this.sin(contO.xz));
            int n6 = contO.z + (int)((float)(n4 - contO.z) * this.cos(contO.xz));
            this.zy = -n;
            this.xz = -n2;
            this.x += n5 - this.cx - this.x;
            this.z += n6 - this.cz - this.z;
            this.y += n3 - this.cy - this.y;
            this.y -= 125;
        }
    }

    public void newpolys(int n, int n2, int n3, int n4, Trackers trackers) {
        int n5;
        this.nrw = n2 / 1200 + 1;
        this.ncl = n4 / 1200 + 1;
        this.sgpx = n;
        this.sgpz = n3;
        int n6 = 0;
        int n7 = 0;
        for (n5 = 0; n5 < this.nrw * this.ncl; ++n5) {
            this.cgpx[n5] = n + n6 * 1200 + (int)(Math.random() * 1000.0 - 500.0);
            this.cgpz[n5] = n3 + n7 * 1200 + (int)(Math.random() * 1000.0 - 500.0);
            for (int i = 0; i < trackers.nt; ++i) {
                int n8;
                if (trackers.zy[i] != 0 || trackers.xy[i] != 0) continue;
                if (trackers.radx[i] < trackers.radz[i] && Math.abs(this.cgpz[n5] - trackers.z[i]) < trackers.radz[i]) {
                    while (Math.abs(this.cgpx[n5] - trackers.x[i]) < trackers.radx[i]) {
                        n8 = n5;
                        this.cgpx[n8] = (int)((double)this.cgpx[n8] + (Math.random() * (double)trackers.radx[i] * 2.0 - (double)trackers.radx[i]));
                    }
                }
                if (trackers.radz[i] >= trackers.radx[i] || Math.abs(this.cgpx[n5] - trackers.x[i]) >= trackers.radx[i]) continue;
                while (Math.abs(this.cgpz[n5] - trackers.z[i]) < trackers.radz[i]) {
                    n8 = n5;
                    this.cgpz[n8] = (int)((double)this.cgpz[n8] + (Math.random() * (double)trackers.radz[i] * 2.0 - (double)trackers.radz[i]));
                }
            }
            if (++n6 != this.nrw) continue;
            n6 = 0;
            ++n7;
        }
        for (n5 = 0; n5 < this.nrw * this.ncl; ++n5) {
            this.ogpx[n5][0] = 0;
            this.ogpz[n5][0] = (int)(100.0 + Math.random() * 600.0);
            this.ogpx[n5][1] = (int)((100.0 + Math.random() * 600.0) * 0.7071);
            this.ogpz[n5][1] = this.ogpx[n5][1];
            this.ogpx[n5][2] = (int)(100.0 + Math.random() * 600.0);
            this.ogpz[n5][2] = 0;
            this.ogpx[n5][3] = (int)((100.0 + Math.random() * 600.0) * 0.7071);
            this.ogpz[n5][3] = -this.ogpx[n5][3];
            this.ogpx[n5][4] = 0;
            this.ogpz[n5][4] = -((int)(100.0 + Math.random() * 600.0));
            this.ogpx[n5][5] = -((int)((100.0 + Math.random() * 600.0) * 0.7071));
            this.ogpz[n5][5] = this.ogpx[n5][5];
            this.ogpx[n5][6] = -((int)(100.0 + Math.random() * 600.0));
            this.ogpz[n5][6] = 0;
            this.ogpx[n5][7] = -((int)((100.0 + Math.random() * 600.0) * 0.7071));
            this.ogpz[n5][7] = -this.ogpx[n5][7];
        }
    }

    public void transaround(ContO contO, ContO contO2, int n) {
        int n2;
        if (this.flex != 0) {
            this.flex = 0;
        }
        int n3 = (contO.x * (20 - n) + contO2.x * n) / 20;
        int n4 = (contO.y * (20 - n) + contO2.y * n) / 20;
        int n5 = (contO.z * (20 - n) + contO2.z * n) / 20;
        int n6 = this.adv = !this.vert ? (this.adv = this.adv + 2) : (this.adv = this.adv - 2);
        if (this.adv > 900) {
            this.vert = true;
        }
        if (this.adv < -500) {
            this.vert = false;
        }
        if ((n2 = 500 + this.adv) < 1000) {
            n2 = 1000;
        }
        this.y = n4 - this.adv;
        if (this.y > 10) {
            this.vert = false;
        }
        this.x = n3 + (int)((float)(n3 - n2 - n3) * this.cos(this.vxz));
        this.z = n5 + (int)((float)(n3 - n2 - n3) * this.sin(this.vxz));
        this.vxz += 2;
        int n7 = 0;
        int n8 = this.y;
        if (n8 > 0) {
            n8 = 0;
        }
        if (n4 - n8 - this.cy < 0) {
            n7 = 65356;
        }
        int n9 = (int)Math.sqrt((n5 - this.z + this.cz) * (n5 - this.z + this.cz) + (n3 - this.x - this.cx) * (n3 - this.x - this.cx));
        int n10 = (int)((double)(90 + n7) - Math.atan((double)n9 / (double)(n4 - n8 - this.cy)) / (Math.PI / 180));
        this.xz = -this.vxz + 90;
        this.zy += (n10 - this.zy) / 10;
        if (this.trns != 5) {
            this.trns = 5;
        }
    }

    public float cos(int n) {
        while (n >= 360) {
            n -= 360;
        }
        while (n < 0) {
            n += 360;
        }
        return this.tcos[n];
    }
}
