import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:sensei/screens/home_screen.dart';

class SplashScreen extends StatefulWidget {
  const SplashScreen({super.key});

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen>
    with SingleTickerProviderStateMixin {
  @override
  void initState() {
    super.initState();
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.immersive);
    Future.delayed(Duration(seconds: 2), () {
      Navigator.of(context).pushReplacement(MaterialPageRoute(
        builder: (_) => const HomeScreen(),
      ));
    });
  }

  @override
  void dispose() {
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.manual,
        overlays: SystemUiOverlay.values);
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Container(
          width: 393,
          height: 852,
          clipBehavior: Clip.antiAlias,
          decoration: BoxDecoration(color: Color(0xFF001B37)),
          child: Stack(
            children: [
              Positioned(
                left: 84,
                top: 797,
                child: Container(
                  width: 227,
                  height: 10,
                  decoration: ShapeDecoration(
                    color: Color(0xFF003366),
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10),
                    ),
                  ),
                ),
              ),
              Positioned(
                left: 82,
                top: 797,
                child: Container(
                  width: 229,
                  height: 10,
                  decoration: ShapeDecoration(
                    color: Color(0xFFFD7702),
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10),
                    ),
                  ),
                ),
              ),
              Positioned(
                left: 136,
                top: -169,
                child: Container(
                  width: 121,
                  height: 121,
                  decoration: BoxDecoration(
                    image: DecorationImage(
                      image:
                          NetworkImage("https://via.placeholder.com/121x121"),
                      fit: BoxFit.fill,
                    ),
                    boxShadow: [
                      BoxShadow(
                        color: Color(0x99FF8E00),
                        blurRadius: 50,
                        offset: Offset(0, 5),
                        spreadRadius: 20,
                      )
                    ],
                  ),
                ),
              ),
              Positioned(
                left: 136,
                top: 476,
                child: Text(
                  '#keepasking',
                  style: TextStyle(
                    color: Color(0xFFFD7702),
                    fontSize: 24,
                    fontFamily: 'Nunito Sans',
                    fontWeight: FontWeight.w400,
                    height: 0,
                    letterSpacing: -1.44,
                  ),
                ),
              ),
              Positioned(
                left: 86.74,
                top: 289.94,
                child: SizedBox(
                  width: 219.72,
                  height: 106.06,
                  child: Stack(
                    children: [
                      Positioned(
                        left: 0,
                        top: 0,
                        child: SizedBox(
                          width: 219.72,
                          height: 106.06,
                          child: Stack(children: []),
                        ),
                      ),
                      Positioned(
                        left: 21.29,
                        top: 31.29,
                        child: SizedBox(
                          width: 175.74,
                          height: 26.16,
                          child: Stack(children: []),
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }
}
