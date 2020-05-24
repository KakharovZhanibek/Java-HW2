package hw2.task3;

import hw2.task1.PenType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BeginnerKitService {
    public static ArrayList<StationeryAbstract>BeginnerKitCreator(){
        ArrayList<StationeryAbstract> stationeries=new ArrayList<StationeryAbstract>();

        Marker marker=new Marker(50,"red");
        Paper  paper=new Paper(3,"A4");
        Pen pen=new Pen(70,PenType.BallpointPen);
        Pencil pencil=new Pencil(40,"wood");
        Ruler ruler=new Ruler(50,30);

        stationeries.add(marker);
        stationeries.add(paper);
        stationeries.add(pen);
        stationeries.add(pencil);
        stationeries.add(ruler);

        return stationeries;
    }

    public static ArrayList<StationeryAbstract> BeginnerKitNameSort(ArrayList<StationeryAbstract> stationeryAbstracts){

        Collections.sort(stationeryAbstracts,StationeryAbstract.stationeryNameComparator);
        return stationeryAbstracts;
    }

    public static ArrayList<StationeryAbstract> BeginnerKitPriceSort(ArrayList<StationeryAbstract> stationeryAbstracts){

        Collections.sort(stationeryAbstracts,StationeryAbstract.stationeryPriceComparator);
        return stationeryAbstracts;
    }
}
