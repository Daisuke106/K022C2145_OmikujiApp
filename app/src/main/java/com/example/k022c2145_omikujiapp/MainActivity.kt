package com.example.k022c2145_omikujiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewの取得
        val textView  : TextView = findViewById(R.id.textView)
        val button    : Button = findViewById(R.id.button)
        val imageView : ImageView = findViewById(R.id.imageView)

       //ボタンを押したら
       button.setOnClickListener {

//                                     配列uranai [0]    [1]  [2]   [3]  [4]  [5]    [6]
           val uranai : Array<String> = arrayOf("大吉","中吉","小吉","吉","末吉","凶","大凶")
//         val num = (0..6).random() //0以上6以下のでたらめな整数値

           //uranai.count()←配列uranaiの要素数　最終添え字番号はuranai.count()-1
           val num = Random.nextInt(uranai.count())  //0　から　uranai.cocunt()-1までの整数値

           textView.text = "今日の運勢は\n" + uranai[num] + "です"

           when(num){
               0 -> imageView.setImageResource(R.drawable.omikuji_daikichi)     //大吉
               1 -> imageView.setImageResource(R.drawable.omikuji_tyukichi)     //中吉
               2 -> imageView.setImageResource(R.drawable.omikuji_syoukichi)    //小吉
               3 -> imageView.setImageResource(R.drawable.omikuji_kichi)        //吉
               4 -> imageView.setImageResource(R.drawable.omikuji_suekichi)     //末吉
               5 -> imageView.setImageResource(R.drawable.omikuji_kyou)         //凶
               6 -> imageView.setImageResource(R.drawable.omikuji_daikyou)      //大凶

           }

       }


//            //0のとき大吉
//            if ( num == 0){
//                textView.text = "今日の運勢は\n大吉です"
//                imageView.setImageResource(R.drawable.omikuji_daikichi)
//             }
//            //1のとき大吉
//            if ( num == 1){
//                textView.text = "今日の運勢は\n中吉です"
//                imageView.setImageResource(R.drawable.omikuji_tyukichi)
//            }
//            //2のとき中吉
//            if ( num == 2){
//                textView.text = "今日の運勢は\n小吉です"
//                imageView.setImageResource(R.drawable.omikuji_syoukichi)
//
//            }
//            //3のとき小吉
//            if ( num == 3){
//                textView.text = "今日の運勢は\n吉です"
//                imageView.setImageResource(R.drawable.omikuji_kichi)
//
//            }
//            //4のとき吉
//            if ( num == 4){
//                textView.text = "今日の運勢は\n末吉です"
//                imageView.setImageResource(R.drawable.omikuji_suekichi)
//
//            }
//            //5のとき凶
//            if ( num == 5){
//                textView.text = "今日の運勢は\n凶です"
//                imageView.setImageResource(R.drawable.omikuji_kyou)
//
//            }
//            //6のとき大凶
//            if ( num == 6){
//                textView.text = "今日の運勢は\n大凶です"
//                imageView.setImageResource(R.drawable.omikuji_daikyou)
//
//            }


        }
    }