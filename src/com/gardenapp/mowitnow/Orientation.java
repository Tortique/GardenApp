package com.gardenapp.mowitnow;

public enum Orientation {
    N {
        Orientation left() {
            return W;
        }

        Orientation right() {
            return E;
        }
    },
    E {
        Orientation left() {
            return N;
        }

        Orientation right() {
            return S;
        }
    },
    W {
        Orientation left() {
            return S;
        }

        Orientation right() {
            return N;
        }
    },
    S {
        Orientation left() {
            return E;
        }

        Orientation right() {
            return W;
        }
    };

    public enum Turn {
        LEFT, RIGHT
    }

    abstract Orientation left();

    abstract Orientation right();

    public Orientation turn(Turn where) {
        return where == Turn.LEFT ? this.left() : this.right();
    }

}
