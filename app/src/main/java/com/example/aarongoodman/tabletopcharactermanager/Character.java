package com.example.aarongoodman.tabletopcharactermanager;

/**
 * Created by aarongoodman on 4/2/17.
 */

public class Character {
    private String name;
    private int hp;
    private int passivePerception;
    private int str;
    private int dex;
    private int con;
    private int wis;
    private int intel;
    private int cha;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPassivePerception() {
        return passivePerception;
    }

    public void setPassivePerception(int passivePerception) {
        this.passivePerception = passivePerception;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public Character(String name, int hp, int passivePerception, int str, int dex,
                     int con, int wis, int intel, int cha) {
        this.name = name;
        this.hp = hp;
        this.passivePerception = passivePerception;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.wis = wis;
        this.intel = intel;
        this.cha = cha;

    }

    public Character(){
        this.name = "Barry Bluejeans";
        this.hp = 10;
        this.passivePerception = 12;
        this.str= 10;
        this.dex= 10;
        this.con= 10;
        this.wis= 10;
        this.intel= 10;
        this.cha= 10;

    }
}
