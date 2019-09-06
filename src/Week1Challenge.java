package  com.company;

import java.util.Scanner;

public class Week1Challenge {

    public static void main(String[] args){
        String name
        String experienceRoom;
        String kBeauty;
        String makeUp;
        String faceMasks;
        String photoBooth;
        String withProps;
        String noProps;

        String briefingRoom;
        String kDramaWorkshop;
        String askQuestion;
        String nameFavoriteIdol;
        String kPopStructurePresentation;
        String phone;
        String record;
        String selfie;
        String glowStick;
        String waveStick;
        String shareStick;

        String secondFloor;
        String seminarRoom;
        String vrReactions;
        String vrMasks;
        String gallery;
        String readBook;
        String colorBook;
        String danceBabyShark;

        String kitchen;
        String spicy;
        String ricecakes;
        String kimchi;
        String nonSpicy;
        String bibimbap;
        String marinatedBeef;
        String noodles;
        String desserts;
        String koreanPancakes;
        String honeycookies;
        String drinks;
        String riceWine;
        String citronTea;


        String outdoorMadangGarden;
        String tatooParlor;
        String kCaligraphy;
        String singing;
        String acapella;
        String nonAcapella;
        String randomDancePlay;
        String girlGroups;
        String boyGroups;

        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        System.out.println("Welcome to 'All About Hallyu': The ultimate adventure for Korean Pop culture fans!");
        System.out.println("'Hallyu,' also known as the Korean Wave, refers to the global popularity of South Korea's cultural & economy export of pop culture: entertainment, music, TV dramas and movies etc..");
        System.out.println("Using the Map of the Korean Cultural Center (KCC), your goal is to experience as many aspects of Hallyu as possible");
        System.out.println("Enter Fan's name: ");
        System.out.println("At the end of your journey, you'll get a chance to meet, greet & even dance with your favorite idol^_^");
        System.out.println("Are you ready to surf the wave!?");
        System.out.println("1\t하나 (hana)!");
        System.out.println("2\t둘 (dhul)!");
        System.out.println("3\t셋 (sehtt!)");
        System.out.println("Go!");

        //games starts with instructions/get inputs
        System.out.println("you are starting in the Experience Room, located on the 1st Floor. Would you like to try some K-beauty products or do a mini photo shoot? ");
        if(experienceRoom == kBeauty) {
                System.out.println("You see a Korean cosmetic boutique called 'LilyCovers.' Which K-beauty products would you like to try? make-up or face masks?");
                kBeauty = makeUp;
                System.out.println("let's do a makeover!");
        }   else if kBeauty = faceMasks;
                System.out.println("it's skincare time!");

        System.out.println("Not a fan of make-up? try the photo booth!");
        if(experienceRoom == photoBooth) {
            photoBooth = withProps;
            System.out.println("how would you like to try some props?");
            else if photoBooth = noProps;
            System.out.println("maybe next time");
        }

        System.out.println("Let's move to the briefing room. you have the choice of attending a workshop on Kdramas or a presentation on the structure of K-pop. decisions...decisions...");
        if(briefingRoom == kDramaWorkshop) {
            System.out.println("hold-on to your heart and watch out for the dramas...");
            kDramaWorkshop = askQuestion;
            else kDramaWorkshop = nameFavoriteIdol;
            System.out.println("shout'사랑해'(or 'I love you') to your favorite idol");
        }
        System.out.println("not a big fan of dramas? Let's dive into K-pop instead!");
        if(briefingRoom == kPopStructurePresentation) {
            kPopStructurePresentation = phone;
            System.out.println("you're smartphone comes into play here");
                if (kPopStructurePresentation == phone){
                    phone = record;
                    System.out.println("take out your phone to record the presentation");
                    else phone = selfie;
                    System.out.println("take out your phone and take a selfie with presenters");
                }
            else kPopStructurePresentation = glowStick;
            System.out.println("real K-pop fans always have their glowstick handy-dandy1");
                glowStick = waveStick;
            System.out.println("wave your glowstick side to side");
                else glowStick = shareStick;
            System.out.println("share the glowstick with a fellow K-pop fan next to you");
        }
        System.out.println("go to up to the 2nd Floor, where there are two rooms: the Seminar Room or the Gallery. where would you like to go?");
        if(secondFloor == seminarRoom) {
            seminarRoom = vrReactions;
            System.out.println("here you can watch the funny reactions of those drowning in virtual reality");
            else seminarRoom = vrMasks;
            System.out.println("enjoy the ride and watch out for the horror flicks...");
        }
        System.out.println("if Virtual Reality ain't your cuo of tea, then come have fun at the Korean animated characters exposition");
        if(secondFloor == gallery){
            gallery = readBook;
            else gallery = colorBook;
            else gallery = danceBabyShark;
            System.out.println("if the baby shark theme song got you hooked last summer, now is your chance yo show off your shark du-ru-du-ru!");
        }
        System.out.println("TIME TO EAT!!!YOU CAN'T SURF THE HALLYU WAVE WITHOUT TASTING THE FOOD. would you like the 'spicy' options or 'nonspicy' options?");
        if(kitchen == spicy) {
            spicy = ricecakes;
            else spicy = kimchi;
            System.out.println("living alive or teary eyed?");
        }
        if(kitchen == nonSpicy) {
            nonSpicy = bibimbap;
            else nonSpicy = marinatedBeef;
            else nonSpicy = noodles;
        }
        if(kitchen == desserts) {
            desserts = koreanPancakes;
            else desserts = honeycookies;
        }
        if(kitchen == drinks) {
            drinks = riceWine;
            else drinks = citronTea;

        }
        if(outdoorMadangGarden == singing){
            singing = acapella;
            else singing = nonAcapella;
        }
        if(outdoorMadangGarden == randomDancePlay){
            randomDancePlay = girlGroups;
            else randomDancePlay = boyGroups;
        }




