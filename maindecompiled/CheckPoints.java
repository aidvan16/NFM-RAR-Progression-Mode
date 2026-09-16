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

    public CheckPoints(CheckPoints checkpoints) {
        this.x = new int[1000];
        this.z = new int[1000];
        this.y = new int[1000];
        this.typ = new int[1000];
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

    public void checkstat(Madness[] amadness, ContO[] aconto, Record record, CheckPoints checkpoints) {
        if (!this.haltall) {
            this.pcleared = amadness[0].pcleared;
            int i = 0;
            do {
                this.pos[i] = 0;
                this.onscreen[i] = aconto[i].dist;
                this.opx[i] = aconto[i].x;
                this.opz[i] = aconto[i].z;
                this.omxz[i] = amadness[i].mxz;
                this.clear[i] = this.dested[i] == 0 ? amadness[i].clear : -1;
            } while (++i < 7);
            i = 0;
            do {
                for (int l = i + 1; l < 7; ++l) {
                    if (this.clear[i] != this.clear[l]) {
                        if (this.clear[i] < this.clear[l]) {
                            int n = i;
                            this.pos[n] = this.pos[n] + 1;
                            continue;
                        }
                        int n = l;
                        this.pos[n] = this.pos[n] + 1;
                        continue;
                    }
                    
                    int j1 = amadness[i].pcleared + 1;

                    // Make absolutely sure the starting index is valid.
                    if (j1 < 0 || j1 >= this.n) {
                        j1 = 0;
                    }

                    int checkedPoints = 0;

                    // Search at most one full lap through the route.
                    while (this.typ[j1] <= 0 && checkedPoints < this.n) {

                        ++j1;

                        if (j1 >= this.n) {
                            j1 = 0;
                        }

                        ++checkedPoints;
                    }

                    // Debug protection: this should never happen if the stage
                    // contains at least one real checkpoint.
                    if (checkedPoints >= this.n && this.typ[j1] <= 0) {
                        System.out.println(
                            "[DBG-CP] Could not find positive point! " +
                            "stage=" + this.stage +
                            " racer=" + i +
                            " pcleared=" + amadness[i].pcleared +
                            " n=" + this.n
                        );

                        j1 = 0;
                    }
                    if (this.py(aconto[i].x / 100, this.x[j1] / 100, aconto[i].z / 100, this.z[j1] / 100) > this.py(aconto[l].x / 100, this.x[j1] / 100, aconto[l].z / 100, this.z[j1] / 100)) {
                        int n = i;
                        this.pos[n] = this.pos[n] + 1;
                        continue;
                    }
                    int n = l;
                    this.pos[n] = this.pos[n] + 1;
                }
            } while (++i < 7);
            if (this.stage > 2) {
                int j = 0;
                do {
                    if (this.clear[j] != this.nlaps * this.nsp || this.pos[j] != 0) continue;
                    if (j == 0) {
                        int i1 = 0;
                        do {
                            if (this.pos[i1] != 1) continue;
                            this.postwo = i1;
                        } while (++i1 < 7);
                        if (this.py(this.opx[0] / 100, this.opx[this.postwo] / 100, this.opz[0] / 100, this.opz[this.postwo] / 100) >= 14000 || this.clear[0] - this.clear[this.postwo] != 1) continue;
                        this.catchfin = 30;
                        continue;
                    }
                    if (this.pos[0] != 1 || this.py(this.opx[0] / 100, this.opx[j] / 100, this.opz[0] / 100, this.opz[j] / 100) >= 14000 || this.clear[j] - this.clear[0] != 1) continue;
                    this.catchfin = 30;
                    this.postwo = j;
                } while (++j < 7);
            }
        }
        this.wasted = 0;
        int k = 1;
        do {
            if (!amadness[k].dest) continue;
            ++this.wasted;
        } while (++k < 7);
        if (this.catchfin != 0) {
            --this.catchfin;
            if (this.catchfin == 0) {
                record.cotchinow(this.postwo, checkpoints);
                record.closefinish = this.pos[0] + 1;
            }
        }
    }

    public int py(int i, int j, int k, int l) {
        return (i - j) * (i - j) + (k - l) * (k - l);
    }
}
