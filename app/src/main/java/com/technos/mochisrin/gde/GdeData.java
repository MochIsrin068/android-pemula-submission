package com.technos.mochisrin.gde;

import java.util.ArrayList;

public class GdeData {
    public static  String[][] data = new String[][]{
            {"Yohan Totting", "Google Developer Expert for Web Technologies", "https://i1.wp.com/chromplex.com/wp-content/uploads/2016/03/yohan-totting.jpg?ssl=1", "Yohan adalah Google Developer Expert pertama dari Indonesia yang berasal dari Bandung. Seorang developer yang fokus pada Client Server Architecture, Backend and API Development, Mobile App Development, HTML5 Development."},
            {"Sidiq Permana", "Google Developer Expert for Android", "https://i2.wp.com/chromplex.com/wp-content/uploads/2016/03/Sidiq-Permana.png?ssl=1", "Sidiq adalah Google Developer Expert di Indonesia yang berasal dari Banten. Seorang developer yang fokus pada Android dengan teknologi NDK dan NFC, Java, J2SE Programming selain itu sebagai public speaking influencer dan endorser."},
            {"Ibnu Sina Wardy", "Google Developer Expert for Android", "https://i1.wp.com/chromplex.com/wp-content/uploads/2016/03/Ibnu-Sina-Wardy.png?ssl=1", "Ibnu adalah Google Developer Expert di Indonesia yang berasal dari Bandung. Seorang developer yang fokus pada Android Application Development, desain UX dan Mobile App Framework."},
            {"Andrew Kurniadi", "Google Developer Expert for Android", "https://i1.wp.com/chromplex.com/wp-content/uploads/2016/03/andrew-kurniadi.jpg?ssl=1", "Andrew adalah Google Developer Expert dari Indonesia yang berasal dari Jakarta. Seorang developer yang fokus pada Android, Material Design, Wearable, Client Server Architecture, GCM dan UI/UX."},
            {"Borrys Hasian", "Google Developer Expert for UX/UI", "https://i2.wp.com/chromplex.com/wp-content/uploads/2016/03/Borrys-Hasian.jpg?ssl=1", "Borrys merupakan Google Developer Expert pertama dari Indonesia bidang UX/UI. Borrys memiliki banyak pengalaman terutama dibidang Mobile Software Engineer, Pengembangan Produk , UX (User Experience) dan Desain. Dalam desain ia fokus dengan Emotional Design, Simplicity, Interaction Design, Prototyping, Ideation, dan User Research."},
            {"Yansen Kamto", "Google Developer Expert for Marketing and Branding", "https://i0.wp.com/chromplex.com/wp-content/uploads/2016/03/yansen-kamto.jpg?ssl=1", "Berbeda dengan para Google Developer Expert Indonesia sebelumnya yang fokus pada developer teknologi. Yansen adalah seorang Marketing Expert yang berasal dari Jakarta dan fokus pada Strategic Branding, Go-To-Market Strategy, User Accuisition, Media Relation dan Partnership."},
            {"Sanny Gaddafi",
                    "Google Developer Expert for Product Strategy",
                    "https://i2.wp.com/chromplex.com/wp-content/uploads/2016/03/Sanny-Gaddafi.jpg?ssl=1",
                    "Sanny Gaddafi adalah Google Developer Expert dari Indonesia yang berasal dari Bekasi. " +
                            "Sanny berfokus sebagai Product Management, Rural Communities," +
                            " Social Network, UI / UX dan Business Development."},
            {"Nayoko Wicaksono",
                    "Google Developer Expert for Product Strategy",
                    "https://i2.wp.com/chromplex.com/wp-content/uploads/2016/03/nayoko-wicaksono.png?ssl=1",
                    "Nayoko adalah Google Developer Expert dari Indonesia yang berasal dari Jakarta. " +
                            "Nayoko berfokus sebagai Partnership & Networking Expert, " +
                            "Project Management, HR Process & Setup, Content Strategy & Marketing, PR dan Branding."},
            {"Dennis Alund",
                    "Google Developer Expert for Firebase, Sprint Master",
                    "https://miro.medium.com/fit/c/256/256/1*M4IH5ERSVB8i9dqtNbJuRQ.jpeg",
                    "Dennis adalah google develoer expert untuk firebase, dia juga founder dari kumpul coworking space yang bertempat di bali" +
                            "dan saat ini dennis masih sebagai software developer di oddbit"},
            {"Ivan Kristanto",
                    "Google Developer Expert for Web Technology",
                    "https://secure.gravatar.com/avatar/300f565b24f0cf1711fb33fc9b311f9c?s=320",
                    "Ivan adalah google developer expert for Web Technology dan saat ini ivan aktif sebagai leader organisasi / komunitas" +
                            "wordpress jakarta"},
            {"Riza Fahmi",
                    "Google Developer Expert for Web Technology",
                    "https://rizafahmi.com/static/riza-d486b1ae7040ce3f5d80bafaea63977c.jpg",
                    "Riza fahmi adalah google developer expert for Web Technology dan saat ini riza aktif sebagai leader organisasi / komunitas" +
                            "jakarta js, dan dia juga adalah Co founder and curiculum director HackTiv8"},
            {"Eunice Sari",
                    "Google Developer Expert for Design Sprint Master",
                    "https://media.licdn.com/dms/image/C4D03AQFzxE8Zk5bRGQ/profile-displayphoto-shrink_800_800/0?e=1566432000&v=beta&t=mi_ngkkTZCGiOofk3yGLQKREaKOXctxei0gDTaFxlbM",
                    "Eunice Sari adalah google developer expert for Design Sprint Master dan eunice juga adalah " +
                            "CEO and Founder UX Indonesia"},
            {"Imre Nagi",
                    "Google Developer Expert for Google Cloud Platform",
                    "https://media.licdn.com/dms/image/C5603AQGOLwBYyaw9-Q/profile-displayphoto-shrink_800_800/0?e=1566432000&v=beta&t=xArvsS4rQP0KTTYTuupzjsfOQB8f7FmJlSySthLsnw4",
                    "Imre Nagi adalah google developer expert for Google Cloud Platform dan imre juga adalah " +
                            "Software Engineer and Senior Data Engineer di Traveloka"},
    };

    public static ArrayList<Gde> getListData(){
        Gde gde = null;
        ArrayList<Gde> list = new ArrayList();

        for (String[] aData : data){
            gde  = new Gde();
            gde.setName(aData[0]);
            gde.setRemarks(aData[1]);
            gde.setPhoto(aData[2]);
            gde.setDesc(aData[3]);

            list.add(gde);
        }

        return list;
    }
}
