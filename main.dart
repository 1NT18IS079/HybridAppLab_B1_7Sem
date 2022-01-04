import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(

    Column(

        children: [
        const Text(
            'Hello world',
            textDirection: TextDirection.ltr,
            style: TextStyle(fontWeight: FontWeight.bold, fontStyle: FontStyle.italic, fontSize: 30,
              color: Color.fromRGBO(255, 252, 0, 1),
              height: 5
            )
        ),
        // Image.network('https://upload.wikimedia.org/wikipedia/commons/e/ee/Sample_abc.jpg',
        // ),

          Image.network('https://c.tenor.com/uHVmd0uBuU0AAAAC/bored-ape-yacht-club-nft.gif', height: 200, width: 200,),
          Container(
            margin: const EdgeInsets.fromLTRB(0, 0, 0, 0),
            child: Image.network('https://i.pinimg.com/originals/de/4f/94/de4f94f6eb2a53fa7a10dde1b72390f5.gif', height: 200, width: 200,),
          )
        ]


  )

  );
}
