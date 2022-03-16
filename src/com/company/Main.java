package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

      City[] cityArray = {new City(2,"Osh City"),new City(1,"Bishkek City")};

      HashSet<City> set = new HashSet<>(Arrays.asList(cityArray));
      TreeSet<City> treeSetList = new TreeSet();
        System.out.println("Sorted: " + sortMethod(set, treeSetList));

    }
    private static TreeSet<City> sortMethod(HashSet<City> hashSetList, TreeSet<City>treeSetList) {
        for (City city : hashSetList) {
            if (city.getCode() % 2 == 1) {
                treeSetList.add(city);
            }
        }
        return treeSetList;
    }
    }

