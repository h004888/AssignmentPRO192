package CarPrj.Classes.Com;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class myUtilities {

    public static int inputInt() {
        int result = 0;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input an integer number: ");
                result = sc.nextInt();
                break;
            } catch (Exception e) {

                System.out.println("Error. Reason: " + e.getMessage());
                System.out.println("Please input again.");
                System.out.println("--=======================--");
            }
        }
        return result;
    }

    public static int genRandomInt() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static int genRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    
    public static double genRandomDouble(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble(); // Tạo số double ngẫu nhiên trong khoảng từ min đến max
    }

    public static String genRandomFirstName() {
        String data[] = {
            "Nguyen", "Tran", "Le", "Pham", "Hoang", "Huynh", "Phan", "Vu", "Vo", "Dang",
            "Bui", "Do", "Ho", "Ngô", "Duong", "Ly", "Quach", "Quang", "Dinh", "Truong",
            "Chu", "Luong", "Dang", "Phung", "Mai", "Lam", "Dao", "Vinh", "Trieu", "Thai",
            "Kieu", "Luu", "Diep", "La", "Ton", "Hua", "Cao", "Ngo", "Chu", "Doan",
            "Tang", "Cao", "Vuong", "Chau", "Luong", "Ngo", "Lai", "Trinh", "Nhieu", "Dinh"
        };
        return data[genRandomInt(0, data.length - 1)];
    }

    public static String genRandomLastName() {
        String[] data = {
            "Nguyen", "Tran", "Le", "Pham", "Hoang", "Huynh", "Phan", "Vu", "Vo", "Dang",
            "Bui", "Do", "Ho", "Ngo", "Duong", "Ly", "Trinh", "Luong", "Ta", "Mac",
            "Dao", "Chau", "Ngoc", "Kieu", "La", "Kim", "Dinh", "Quach", "Lam", "Phung",
            "Yen", "Thai", "Van", "Xuan", "Quyen", "Phu", "Cuong", "Tuan", "Minh", "Thanh",
            "Hieu", "Son", "Nam", "Hien", "Diep", "Quynh", "Thao", "Nhat", "Hai", "My"
        };
        return data[genRandomInt(0, data.length - 1)];
    }
    
    public static String genRandomFullName(){
        return genRandomFirstName() + " "+ genRandomLastName();
    }
    
    
    public static String genRandomMaterial() {
        String data[] = {
            "Glass", "Plastic", "Ceramic", "Clay", "Metal", "Wood", "Bamboo", "Stone",
            "Porcelain", "Terracotta", "Stainless Steel", "Aluminum", "Copper", "Brass",
            "Bronze", "Iron", "Tin", "Silver", "Gold", "Platinum", "Titanium", "Concrete",
            "Marble", "Granite", "Limestone", "Slate", "Sandstone", "Fiberglass", "Carbon Fiber",
            "Acrylic", "Polycarbonate", "Polyethylene", "Polypropylene", "PVC", "Silicone", "Rubber",
            "Leather", "Fabric", "Paper", "Cardboard", "Biodegradable Plastic", "Resin", "Epoxy",
            "Pewter", "Nickel", "Zinc", "Enamel", "Foam", "Lucite", "Quartz"
        };
        return data[genRandomInt(0, data.length - 1)];
    }
    
    
    public static String genRandomCoulour() {
         String data[] = {
            "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Pink", "Brown", "Black", "White",
            "Gray", "Cyan", "Magenta", "Turquoise", "Violet", "Indigo", "Gold", "Silver", "Bronze", "Beige",
            "Lavender", "Maroon", "Navy", "Olive", "Teal", "Crimson", "Fuchsia", "Lilac", "Mint", "Peach",
            "Salmon", "Coral", "Ivory", "Plum", "Khaki", "Sapphire", "Emerald", "Ruby", "Amber", "Mauve",
            "Slate", "Charcoal", "Burgundy", "Chocolate", "Tan", "Aqua", "Rose", "Cherry", "Sand", "Jade"
        };
        return data[genRandomInt(0, data.length - 1)];
    }
    
    public static String genRandomBandName(){
        String[] data = {
            "Toyota", "Ford", "Chevrolet", "Honda", "Nissan", "BMW", "Mercedes", "Volkswagen", "Hyundai", "Kia",
            "Audi", "Lexus", "Subaru", "Mazda", "Jaguar", "Ferrari", "Lamborghini", "Porsche", "Maserati", "Bentley",
            "Bugatti", "Rolls-Royce", "Land Rover", "Volvo", "Mini", "Tesla", "Fiat", "Alfa Romeo", "Acura", "Infiniti",
            "Mitsubishi", "Suzuki", "Peugeot", "Renault", "Skoda", "Seat", "Chrysler", "Dodge", "Jeep", "Ram",
            "Cadillac", "GMC", "Buick", "Lincoln", "Genesis", "Hummer", "Pontiac", "Saab", "Citroen", "Opel",
            "Aston Martin", "McLaren", "Pagani", "Koenigsegg", "Lotus", "Smart", "Daihatsu", "Isuzu", "Scion", "Geo",
            "MG", "Rover", "Lancia", "Yugo", "Zastava", "Tata", "Mahindra", "Maruti", "Perodua", "Proton",
            "Holden", "HSV", "Vauxhall", "Dacia", "Fisker", "Lucid", "Rivian", "Faraday Future", "Nikola", "Polestar",
            "BYD", "Nio", "XPeng", "Wuling", "Chery", "Geely", "Great Wall", "Haval", "Lynk & Co", "Baojun",
            "VinFast", "Tatra", "Spyker", "TVR", "Vector", "Zenos", "Wiesmann", "Ginetta", "Caterham", "Radical"
        };
        return data[genRandomInt(0, data.length - 1)];
    }
    
    public static String genRandonBandID(){
        
        return genRandomBandName().substring(0, 1)+genRandomInt();
    }
    
    public static String genRandonSoundBand(){
          String[] data = {
            "Bass Boost", "Treble Clear", "Vocal Enhancer", "Surround Sound", "Acoustic Balance",
            "Deep Bass", "High Fidelity", "Crystal Clear", "Sound Stage", "DJ Mix",
            "Live Performance", "Studio Master", "Auto Tune", "Sonic Boom", "Echo Chamber",
            "Ambient Sound", "Noise Cancellation", "3D Audio", "Digital Equalizer", "Beat Drop",
            "Soundscape", "Vibrant Sound", "Dynamic Range", "Soft Echo", "Sharp Clarity",
            "Booming Beats", "Rhythm Pulse", "Melodic Harmony", "Sonic Bliss", "Music Genie",
            "Bassline Magic", "Cinematic Sound", "Golden Ears", "Sound Revolution", "Ultra Bass",
            "High Volume", "Low Frequency", "Vibrating Sound", "Chamber Echo", "Clear Voice",
            "Sonic Symphony", "Beat Vibe", "Pulse Sound", "Rich Harmony", "Lush Audio",
            "Crystal Echo", "Digital Soundwave", "Harmonic Blend", "Sound Odyssey", "Bass Depth",
            "Vocal Boost", "Rhythmic Harmony", "Sound Fusion", "Echo Harmony", "Dynamic Sound",
            "Sound Enchantment", "Melody Echo", "Sonic Dream", "Bass Explosion", "Vocal Precision",
            "Live Echo", "Studio Sound", "Rocking Beats", "DJ Fusion", "Ambient Vibe",
            "Sound Surge", "Bass Enhancement", "Voice Studio", "Rhythmic Echo", "Acoustic Waves",
            "Sonic Adventure", "Bass Thrill", "Vocal Essence", "Harmonic Flow", "Echo Sound",
            "Dynamic Beats", "Sound Elevation", "Vibrational Harmony", "Crisp Audio", "Melodic Vibes",
            "Beat Harmony", "Sonic Experience", "Rhythm Waves", "Bass Motion", "Vocal Aura",
            "Sound Evolution", "Audio Balance", "Bass Journey", "Echo Waves", "Vibrant Beats",
            "Harmonic Rhythm", "Sound Oasis", "Bass Journey", "Crystal Waves", "Sonic Wonderland"
        };
        return data[genRandomInt(0, data.length - 1)];
    }
    
    
    
    
    

}
