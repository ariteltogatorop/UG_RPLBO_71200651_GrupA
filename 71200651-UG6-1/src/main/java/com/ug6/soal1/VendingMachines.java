package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<double[]> acceptanceBalance;
    private double consumerMoney;

    public VendingMachines(){}

    public VendingMachines(String code, int capacity) {
        this.code = code;
        this.capacity = capacity;
        this.usedCapacity=0;
    }

    public VendingMachines(String code, int capacity, ArrayList<Goods> goods, ArrayList<double[]> acceptanceBalance, double consumerMoney) {
        this.code = code;
        this.capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = acceptanceBalance;
        this.consumerMoney = consumerMoney;
    }
    public void proceedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){

    }
    private void giveGood(double goodsPrice, String goodsName){

    }
    public double withdrawMoney(){
        return 0;
    }
    public void inputGoods(Goods good){
        if (good.getQuantity()<=capacity-usedCapacity){
            goods.add(good);
            usedCapacity+=1;
        }else{
            System.out.println("Jumlah barang telah melampaui kapasitas maximal");
        }
    }
    public int getCapacity(){
        return capacity-usedCapacity;
    }
}
