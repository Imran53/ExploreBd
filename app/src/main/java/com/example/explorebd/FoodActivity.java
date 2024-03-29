package com.example.explorebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.EditText;

import androidx.recyclerview.widget.RecyclerView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.util.ArrayList;
import java.util.List;


public class FoodActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;
    //search
    //EditText text_search;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        //search
       // text_search=(EditText)findViewById(R.id.text_searchtext);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(FoodActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);




        myFoodList=new ArrayList<>();
        //search
        myAdapter = new MyAdapter(FoodActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);


        mFoodData=new FoodData("বাখরখানি","মুঘল আমল থেকে পুরান ঢাকার মানুষের সকালের নাশতা হিসেবে অতি জনপ্রিয় খাবার বাকরখানি। ঐতিহ্যগতভাবে নবাবী আমলের শেষের দিকে প্রভাবশালী জমিদার আগা বাখর খানের নামানুসারে এ নামটির উৎপত্তি। ময়দার খামির থেকে রুটি বানিয়ে তা মচমচে বা খাস্তা করে ভেজে বাকরখানি তৈরি করা হয়। ছোট-বড় বিভিন্ন আকারের বাকরখানি পাওয়া যায় পুরান ঢাকায়। পুরান ঢাকার লালবাগ, নাজিমুদ্দিন রোড, সিক্সা বাজার এবং চাঁনখারপুল এলাকা বাকরখানি রুটি তৈরীর জন্য বিখ্যাত।\n\nবাকরখানি রুটি কেজি দরে বিক্রয় করা হয়। প্রতি কেজি রুটির মূল্য ১১০ টাকা থেকে ১৩০ টাকা পর্যন্ত হয়ে থাকে। ৩৫ টি থেকে ৪০ টি পর্যন্ত রুটি ধরে প্রতি কেজিতে। ","ঢাকা",R.drawable.bakarkani);
        myFoodList.add(mFoodData);
      

        mFoodData=new FoodData("হাজী বিরিয়ানি","হাজী বিরিয়ানি পুরান ঢাকার একটি ঐতিহ্যবাহী খাবার। এর যাত্রা শুরু ১৯৩৯ সালে। খাবারের জগতে এ বিরিয়ানী বাংলাদেশের সকল মানুষের কাছে সমাদৃত । হাজীর বিরিয়ানির প্রধান বিশেষত্ব হচ্ছে এই বিরিয়ানি রান্নার প্রক্রিয়া তে কোন ঘি বা বাটার ওয়েল ব্যবহার করা হয় না। খাটিঁ সরিষার তেল এ রান্না করা হয় তাদের এই বিরিয়ানি। আর শুধুমাত্র খাসীর মাংস দিয়েই রান্না করা হয় হাজীর এই বিখ্যাত বিরিয়ানি।\n\nমূলত ৩ টি শাখায় আসল হাজী বিরিয়ানি পাওয়া যায়। ঢাকার বংশাল এ নাজিরাবাজারে ৭০ কাজী আলাউদ্দিন রোডে তাদের প্রধান শাখা অবস্থিত। বাকি দুটি শাখা ৯৯ মতিঝিল বিমান অফিসের পাশে এবং আরেকটি বসুন্ধরা বারিধারা আবাসিক এলাকার ক ১১/৬ রোড এ অবস্থিত। মতিঝিল শাখা দুপুর ১২ টা থেকে বিকেল ৪ টা পর্যন্ত খোলা থাকে। আর বসুন্ধরা শাখা খোলা থাকে দুপুর ১২ টা থেকে রাত ৮টা পর্যন্ত। প্রতি প্লেট বিরিয়ানির মুল্য ১৪০ টাকা।","ঢাকা",R.drawable.hajirbiryani);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("সুতি কাবাব","সুতি কাবাব রাজধানী ঢাকার ঐতিহ্যবাহী খাবারের মধ্যে অন্যতম কাবাব। বিশেষ করে ইফতারির পদ হিসেবে অনেক জনপ্রিয়। মুড়ি মাখার সাথে মেখে কিংবা পরোটা দিয়ে খেলে সুতি কাবাবের আসল স্বাদ মিলবে।\n\nচকবাজারে গরুর এবং খাসির সুতি কাবাব কিনতে পাওয়া যায়। গরুর সুতি কাবাবের দাম পড়বে কেজিপ্রতি ৬০০ থেকে ৭০০ টাকা। আর খাসির সুতি কাবাবের দাম পড়বে ৮০০ থেকে ৯০০ টাকা।","ঢাকা",R.drawable.sutikabab);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("কাচ্চি বিরিয়ানি", "আমাদের দেশে পুরান ঢাকায় সবচেয়ে বেশি জনপ্রিয় হল কাচ্চি বিরিয়ানি। কাচ্চি শব্দটা উর্দু শব্দ 'কাচ্চা' থেকে এসেছে যার বাংলা অর্থ কাঁচা। মূলত খাসির মাংস দিয়ে এ বিরিয়ানী রান্না করা হয়। কাচ্চি বিরিয়ানি রান্নার সময় হাড়িতে চাল ও কাঁচা আলুর উপর টক দই ও মশলায় মেখে রাখা কাঁচা মাংসের আস্তরন দেওয়া হয়। এরপর দমে দিয়ে রান্না হতে হতে তৈরি হয় অতুলনীয় স্বাদের কাচ্চি।","ঢাকা",R.drawable.kacchi);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("মেজবানি মাংস"," মেজবানি মাংস চট্টগ্রামের একটি ঐতিহ্যবাহী জনপ্রিয় খাবার। যিনি একবার খেয়েছেন, আজীবন তার মুখে লেগে থাকবে এর স্বাদ। কারণ এই মাংস রান্নার ধরণ যেমন আলাদা, তেমনি রয়েছে বাহারি মসলার ব্যবহার যার বেশিরভাগ স্থানীয়ভাবে চট্টগ্রামের বিভিন্ন উপজেলায় উৎপাদিত। এই কাজে দক্ষ কেবল চট্টগ্রামের বাবুর্চিরা, আর তারাই বংশপরম্পরায় এই ঐতিহ্যের ধারা অব্যাহত রেখেছে। মেজবানের রান্নার রয়েছে আলাদা বিশেষত্ব এবং এর রন্ধন প্রক্রিয়ার বিশেষ পদ্ধতি। সাধারণ মাংস রান্নার তুলনায় এই মেজবানি মাংসে তেলের ব্যবহার হয় একটু বেশী এবং এটি অনেকটা গাঢ় বাদামি বর্ণের।\n\nপরিবারের সবাই মিলে যদি মেজবানি মাংস খেতে চান তবে চলে যেতে পারেন 'মেজ্জান হাইলে আইয়্যুন' ও 'হোটেল জামান' এর মতো চট্টগ্রামের বড় বড় রেস্টুরেন্টে। এছাড়া ঢাকায় বসে মেজবানি মাংসের স্বাদ পেতে চাইলে চলে যেতে হবে চিটাগাং এক্সপ্রেস, নওয়াব চাটগাঁ, মেজবান বাড়ি এসব রেস্টুরেন্টে । ", "চট্টগ্রাম",R.drawable.mejbani);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("কালাভুনা", "কালাভুনা চট্টগ্রামের অন্যতম ঐতিহ্যবাহী জনপ্রিয় খাবার। এটি দেখতে যেমন আকর্ষণীয় খেতেও তেমন মুখরোচক। গরুর অত্যন্ত সুস্বাদু পদ কালাভুনা গরুর মাংসের সাথে পেঁয়াজ, মরিচ, টক দই ও বিভিন্ন মসলা দিয়ে মাখিয়ে তেলে ভাজা হয়। এটিতে পানি কম ব্যবহার করা হয় এবং ভাজতে ভাজতে যখন রং কালো হয় তখন এটি নামানো হয়। হরেক রকমের মসলার সংমিশ্রণে রান্না করার ফলে মাংস ভুনায় কালো রং আসে বলেই এর নাম দেওয়া হয়েছে কালাভুনা। সাধারণত ভাত, পরোটা কিংবা রুটির সাথে কালোভুনা খাওয়া হয়। ","চট্টগ্রাম",R.drawable.kala);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("পোড়াবাড়ীর চমচম","সুস্বাদু ও লোভনীয় পোড়াবাড়ির চমচম মিষ্টি টাঙ্গাইলের অন্যতম একটি ঐতিহ্য। প্রায় দুইশ বছরের প্রাচীন ঐতিহ্য বজায় রেখে বানানো পোড়াবাড়ির চমচমের সুনাম রয়েছে বিশ্বজোড়া। টাঙ্গাইল শহর থেকে প্রায় ৭ কিমি দূরে পোড়াবাড়ি নামক গ্রামে এর বিস্তৃতি ঘটে। মিষ্টি জগতে অপ্রতিদ্বন্দ্বী চমচমের বৈশিষ্ট্যে অতি চমৎকার। কারণ এর ভিতরের অংশ থাকে রসালো ও নরম। লালচে পোড়া ইটের রংয়ের এই সুস্বাদু চমচমের উপরিভাগে  চিনির গুড়ো কোষ থাকে কড়া মিষ্টিতে কানায় কানায় ভরা।\n\nটাঙ্গাইল শহরের নিরালা মোড়ে পাঁচ আনি বাজারের মিষ্টির দোকানগুলোতে পাবেন এই এতিহ্যবাহী চমচম।প্রতি কেজি দাম পড়বে ২০০ টাকা।","টাঙ্গাইল",R.drawable.comcom2);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("দই","দই নামটি শুনলেই প্রথমে চলে আসে বগুড়া জেলার নাম। দেশের অন্যান্য জেলায় দই পাওয়া গেলেও স্বাদে ও গুণে অতুলনীয় হওয়ায় বগুড়ার শেরপুর উপজেলার দই দেশ ও দেশের বাইরে সমান জনপ্রিয়। তৎকালীন বগুড়ার শেরপুরের ঘোষ পরিবারের ঘেটু ঘোষ প্রথম দই তৈরী শুরু করেন। টক দই তৈরী থেকে বংশ পরস্পরায় তা মিষ্টি দইয়ে রূপান্তরিত হয়। বর্তমানে এই দইকে বহুমুখী কাজে ব্যবহার করা হয়। টক দইয়ে যেমন মেজবানের রান্না হয় আর মিষ্টি দইয়ে চলে অতিথি আপ্যায়ন।\n\nবগুড়ার প্রসিদ্ধ এই দইয়ের দাম একদম হাতের নাগালে। স্বাভাবিক সময়ে এর দাম পড়বে প্রতি কেজিতে ১৫০-২২০ টাকা।"," বগুড়া",R.drawable.doi2);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("রসমালাই","কুমিল্লার রসমালাই স্বাদ, গুণ, আর ঐতিহ্যের কারণে বিশ্বজোড়া খ্যাতি। ১৯৩০ সালে ঘোষ সম্প্রদায়ের হাত ধরে কুমিল্লায় রসমালাইয়ের প্রচলন শুরু হয়। সে সময় তাঁরা দুধ জ্বাল দিয়ে ঘন করে ক্ষির বানিয়ে তাতে ছোট আকারের শুকনো রসগোল্লা ভিজিয়ে যে মিষ্টান্ন তৈরি করে তা ক্ষিরভোগ নামে পরিচিতি পায়। ক্রমান্বয়ে এই ক্ষিরভোগ রসমালাই নামে পরিচিত হয়ে উঠে। সেই থেকে দিন দিন এর চাহিদা ও খ্যাতি দেশের সীমানা পেরিয়ে বিদেশেও ছড়িয়ে পড়ে।\n\n এ রসমালাই কিনতে পাবেন কুমিল্লা শহরের প্রাণকেন্দ্রে মনোহরপুরের কুমিল্লা মাতৃভান্ডার দোকানে, দাম পড়বে কেজি প্রতি ২৬০ টাকা।   ","কুমিল্লা",R.drawable.comillarrosmalai);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("রসকদম্ব", "মেহেরপুরের ঐতিহ্যবাহী মিষ্টান্ন রসকদম্ব স্বাদে অতুলনীয়,গুনে ও মানে অদ্বিতীয়। এই মিষ্টি জেলার ১৫০ বছরের ঐতিহ্য বহন করে এখনো সগৌরবে তার অবস্থানের কথা জানান দিয়ে যাচ্ছে ক্রেতাদের। এর সবচেয়ে বড় বৈশিষ্ট্য ফ্রিজে না রেখে প্রায় ১৫ দিন আর ফ্রিজে রাখলে ১ মাসেরও বেশি সময় এর স্বাদ বজায় থাকে। দুধ তথা দুধের চাছি আর চিনিই মূলত এই মিষ্টি তৈরির উপকরণ। \n\nরসকদম্ব শুধুমাত্র মেহেরপুর জেলার বাসুদেব গ্র্যান্ড সন্স এ বিক্রি হয়। এদের অন্য কোথাও কোন শাখা নেই।কেজি প্রতি দাম ২২০ টাকা।"," মেহেরপুর",R.drawable.roskodom);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("প্যারা সন্দেশ", "গরুর দুধ থেকে তৈরি ক্ষীর দিয়ে বানানো প্যারা সন্দেশ নওগা জেলার বিখ্যাত সন্দেশ। এই সন্দেশের সুখ্যাতি এখন দেশের গন্ডি পেরিয়ে মধ্যপ্রাচ্যসহ বিশ্বের বিভিন্ন দেশে পৌঁছেছে। প্যারা সন্দেশ তৈরির প্রথম ধাপে তরল দুধের সাথে চিনি মিশিয়ে জ্বাল দিয়ে তৈরি করা হয় ক্ষীর। ক্ষীর যখন হাতায় জড়িয়ে আসে তখন উষ্ণ ক্ষীর দুই হাতের তালু দিয়ে রোল করে সামান্য চাপ দিলেই তইরি হয়ে যায় খয়েরী রংয়ের প্যারা সন্দেশ।\n\nপ্রতিটি প্যারা সন্দেশ প্রায় আধা ইঞ্চি চওড়া ও দুই ইঞ্চি লম্বা হয়ে থাকে।প্রতি কেজি সন্দেশের দাম ৩২০ থেকে ৩৫০ টাকা।"," নওগাঁ",R.drawable.perasondesh);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("ক্ষীরমোহন", "ভোজনের রসনায় কুড়িগ্রাম জেলার উলিপুরের অনন্য এক মিষ্টান্নের নাম ক্ষীরমোহন। খাঁটি ছানা থেকে তৈরি মিষ্টি প্রথমে গরম চিনির রসে জ্বাল দেওয়া হয়। মিষ্টি হয়ে এলে তা থেকে রস ঝরিয়ে নিয়ে দুধে জ্বাল দেওয়া হয়। দুধ ক্ষীরে পরিণত হলেও মিষ্টির ভিতরে ক্ষীর ঢুকে গেলে তৈরি হয় লোভনীয় ক্ষীরমোহন। দোকানভেদে প্রতি কেজি ক্ষীরমোহনের দাম পড়বে ৩২০ থেকে ৪০০ টাকা। ","কুড়িগ্রাম",R.drawable.khirmohon);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("কাঁচাগোল্লা","নাটোরের বনলতা সেনের মতোই আলোচিত আদৃত আরেক নাম নাটোরের কাঁচাগোল্লা। নামে কাঁচাগোল্লা হলেও এটি কিন্তু কাঁচা নয় আবার দেখতে গোলও নয়। খাঁটি দুধের তৈরি ছানা আর পরিমাণমতো চিনি দিয়ে তৈরি হয় এ কাঁচাগোল্লা।\n\nনাটোর শহরের প্রায় সর্বত্রই পাওয়া যায় কাঁচাগোল্লা। এক কেজির দাম চার থেকে পাঁচশ টাকা।","নাটোর",R.drawable.kachagulla);
        myFoodList.add(mFoodData);

        mFoodData=new FoodData("সাত রঙের চা","চায়ের রাজধানী খ্যাত শ্রীমঙ্গল উপজেলার সাত রঙের চা খুবই আকর্ষণীয় এবং জনপ্রিয়। গ্রীন চা, ব্ল্যাক চা, লেবু, আদা, দুধ মিশ্রনেই তৈরি হয় এই চা। রমেশ রাম গৌড় হচ্ছেন এই সাত রঙ চায়ের উদ্ভাবক। প্রায় এক যুগ ধরেই তিনি এই চা বানাচ্ছেন।\n\nসাত রঙের এই চা শ্রীমঙ্গলের 'নীলকন্ঠ টি কেবিন' এ পাওয়া যায়। প্রতি কাপ চায়ের দাম ৭০ টাকা। ","ময়মনসিংহ",R.drawable.sevenrong);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter=new MyAdapter(FoodActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);




        //searchoption


    }

    //search


    //animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }










    //add back button to the toolbar

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        {
            if(item.getItemId()==android.R.id.home)
            {
                this.finish();
            }
        }
        return super.onOptionsItemSelected(item);
    }






}
