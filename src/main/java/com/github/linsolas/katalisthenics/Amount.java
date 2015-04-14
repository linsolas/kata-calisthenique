package com.github.linsolas.katalisthenics;

public class Amount {

    public int value = 0;

    public Amount(int value) {
        this.value = value;
    }

    public Amount() {
    }

    public void add(int i) {
        value += i;
    }

    public void add(Amount a) {
        value += a.value;
    }

    public void substract(int i) {
        value -= i;
    }
    public void substract(Amount a) {
        value -= a.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        if (value != amount.value) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
