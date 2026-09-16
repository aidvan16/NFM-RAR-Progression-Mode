/*
 * Decompiled with CFR 0.152.
 */
public class CheckPoints {
    int[] x;
    int[] z;
    int[] y;
    int[] typ;
    int pcs = 0;
    int nsp = 0;
    int n = 0;
    int[] fx;
    int[] fz;
    int[] fy;
    boolean[] roted;
    boolean[] special;
    int fn = 0;
    int stage = 1;
    int nlaps = 0;
    String name = "hogan rewish";
    int[] pos = new int[]{6, 6, 6, 6, 6, 6, 6};
    int[] clear;
    int[] dested;
    int wasted = 0;
    boolean haltall = false;
    int pcleared = 0;
    int[] opx;
    int[] opz;
    int[] onscreen;
    int[] omxz;
    int catchfin = 0;
    int postwo = 0;
    int sortcars;

    public CheckPoints(CheckPoints checkPoints) {
        this.x = new int[300];
        this.z = new int[300];
        this.y = new int[300];
        this.typ = new int[300];
        this.fx = new int[20];
        this.fz = new int[20];
        this.fy = new int[20];
        this.roted = new boolean[20];
        this.special = new boolean[20];
        this.clear = new int[7];
        this.dested = new int[7];
        this.opx = new int[7];
        this.opz = new int[7];
        this.onscreen = new int[7];
        this.omxz = new int[7];
    }

    public void checkstat(Madness[] madnessArray, ContO[] contOArray, Record record, CheckPoints checkPoints) {
        int n;
        if (!this.haltall) {
            int n2;
            int n3;
            this.pcleared = madnessArray[0].pcleared;
            n = 0;
            do {
                this.pos[n] = 0;
                this.onscreen[n] = contOArray[n].dist;
                this.opx[n] = contOArray[n].x;
                this.opz[n] = contOArray[n].z;
                this.omxz[n] = madnessArray[n].mxz;
                int n4 = this.clear[n] = this.dested[n] == 0 ? madnessArray[n].clear : -1;
            } while (++n < 7);
            n = 0;
            do {
                for (n3 = n + 1; n3 < 7; ++n3) {
                    int n5;
                    if (this.clear[n] != this.clear[n3]) {
                        if (this.clear[n] < this.clear[n3]) {
                            n2 = n;
                            this.pos[n2] = this.pos[n2] + 1;
                            continue;
                        }
                        n2 = n3;
                        this.pos[n2] = this.pos[n2] + 1;
                        continue;
                    }
                    n2 = madnessArray[n].pcleared + 1;
                    while (this.typ[n2] <= 0) {
                        if (++n2 != this.n) continue;
                        n2 = 0;
                    }
                    if (this.py(contOArray[n].x / 100, this.x[n2] / 100, contOArray[n].z / 100, this.z[n2] / 100) > this.py(contOArray[n3].x / 100, this.x[n2] / 100, contOArray[n3].z / 100, this.z[n2] / 100)) {
                        n5 = n;
                        this.pos[n5] = this.pos[n5] + 1;
                        continue;
                    }
                    n5 = n3;
                    this.pos[n5] = this.pos[n5] + 1;
                }
            } while (++n < 7);
            if (this.stage > 2) {
                n3 = 0;
                do {
                    if (this.clear[n3] != this.nlaps * this.nsp || this.pos[n3] != 0) continue;
                    if (n3 == 0) {
                        n2 = 0;
                        do {
                            if (this.pos[n2] != 1) continue;
                            this.postwo = n2;
                        } while (++n2 < 7);
                        if (this.py(this.opx[0] / 100, this.opx[this.postwo] / 100, this.opz[0] / 100, this.opz[this.postwo] / 100) >= 14000 || this.clear[0] - this.clear[this.postwo] != 1) continue;
                        this.catchfin = 30;
                        continue;
                    }
                    if (this.pos[0] != 1 || this.py(this.opx[0] / 100, this.opx[n3] / 100, this.opz[0] / 100, this.opz[n3] / 100) >= 14000 || this.clear[n3] - this.clear[0] != 1) continue;
                    this.catchfin = 30;
                    this.postwo = n3;
                } while (++n3 < 7);
            }
        }
        this.wasted = 0;
        n = 1;
        do {
            if (!madnessArray[n].dest) continue;
            ++this.wasted;
        } while (++n < 7);
        if (this.catchfin != 0) {
            --this.catchfin;
            if (this.catchfin == 0) {
                record.cotchinow(this.postwo, checkPoints);
                record.closefinish = this.pos[0] + 1;
            }
        }
    }

    public int py(int n, int n2, int n3, int n4) {
        return (n - n2) * (n - n2) + (n3 - n4) * (n3 - n4);
    }
}
