package com.me.shopping;

import java.util.ArrayList;

public class TVShowsCollection {


    public static ArrayList<TVShow> getTVShows()
    {
        ArrayList<TVShow> tvshows=new ArrayList<>();
        TVShow tv=new TVShow();

        //ADD DATA
        tv.setName("BlackList");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355636/red_s9jrzj.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Breaking Bad");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355582/breaking_wbxtzb.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Fruits");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355636/fruits_xapn76.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Crisis");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355640/crisis_m1btcv.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Ghost Rider");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355639/rider_ehhjol.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Game of Thrones");
        tv.setUrl("http://res.cloudinary.com/oclemy/image/upload/v1460355638/thrones_noxbhq.jpg");
        tvshows.add(tv);

        tv=new TVShow();
        tv.setName("Shuttle Carrier");
        tv.setUrl(" http://res.cloudinary.com/oclemy/image/upload/v1460355638/shuttle_carrier_nwvr5v.jpg");
        tvshows.add(tv);

        return tvshows;

    }

}
