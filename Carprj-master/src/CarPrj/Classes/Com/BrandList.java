package CarPrj.Classes.Com;

import java.io.*;
import java.util.*;

public class BrandList extends ArrayList<Brand> {
    
    
   // to store the number of items that added to the list
  // is the size of the array

    public BrandList() {
        super();
    }
    
    
    //Linh add newbrand random from myUtilities
    public void addRandom(){
        int numOfBrand;
        numOfBrand = 30;
        int min = 1;
        int max = 10;
        for (int i = 0; i < numOfBrand; i++) {
            this.add(new Brand(myUtilities.genRandonBandID(), myUtilities.genRandomBandName(), myUtilities.genRandonSoundBand(), myUtilities.genRandomDouble(min, max)));
        }
        System.out.println("Added is " + numOfBrand);

    }
    
//Linh hàm đọc file
    public boolean loadFromFile(String filename) throws IOException {

        FileReader fr = null;

        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("Failed");
            return false;
        } else {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(s, ",:");
                String newID = st.nextToken().toUpperCase();
                String newbrandname = st.nextToken().toUpperCase();
                String newsoundbrand = st.nextToken().toUpperCase();
                double newprice = Double.parseDouble(st.nextToken());

                Brand b = new Brand(newID, newbrandname, newsoundbrand, newprice);
                this.add(b);
            }
            fr.close();
            br.close();
        }
        return true;
    }

    
    public int find(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBrandID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchID(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBrandID().equalsIgnoreCase(ID.trim())) {
                return i;
            }
        }
        return -1;
    }

    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return (Brand) mnu.ret_getChoice(this);
    }

    
    
    //Linh add new brand from keyboat
    public void addBrand() {
        Scanner sc = new Scanner(System.in);

        String newID;
        String newBrandname;
        String newSoundbrand;
        double price;
        int checkID;
        String s;
        double d;

        do {
            System.out.printf("Enter a new brand: ");
            newID = sc.nextLine().toUpperCase();
            checkID = find(newID);
            if (checkID >= 0) {
                System.out.print("Brand ID is duplicated: ");
            }
        } while (checkID >= 0);

        do {
            System.out.print("Enter the brand name: ");
            newBrandname = sc.nextLine().toUpperCase();
            s = newBrandname;
            if (s == null) {
                System.out.print("Error!!");

            }

        } while (s == null);

        do {
            System.out.print("Enter the sound manufacturer: ");
            newSoundbrand = sc.nextLine().toUpperCase();
            s = newSoundbrand;
            if (s == null) {
                System.out.print("Error!!");

            }

        } while (s == null);

        do {
            System.out.print("Enter the price: ");
            price = sc.nextDouble();
            d = price;
            if (d <= 0) {
                System.out.printf("Erorr!!!");

            }
        } while (d <= 0);

        Brand brand = new Brand(newID, newBrandname, newSoundbrand, price);
        this.add(brand);
        System.out.println("New brand is added !");
      
    }
    

    public void updateBrand() {
        Scanner scanner = new Scanner(System.in);
        int k;
        String id, newbrand, newmanu;
        double price;
        System.out.print("Enter the ID you need update the brand: ");
        id = scanner.nextLine().toUpperCase();
        k = find(id);
        if (k >= 0) {
            do {
                System.out.print("Enter the new brand you want to update: ");
                newbrand = scanner.nextLine().toUpperCase();
                if (newbrand == null) {
                    System.out.println("The brandID must not be blank.Try again");
                }
            } while (newbrand == null);

            do {
                System.out.print("Enter new sound manufacturer : ");
                newmanu = scanner.nextLine().toUpperCase();
                if (newmanu == null) {
                    System.out.println("The sound manufacturer must not be blank. Try again");
                }
            } while (newmanu == null);

            do {
                System.out.print("Enter new price : ");
                price = scanner.nextDouble();
                if (price <= 0) {
                    System.out.println("The price must be a positive number!");
                }
            } while (price <= 0);
	    boolean checkUpdate = false;
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getBrandID().contains(id)) {
                    this.get(i).setBrandName(newbrand);
                    this.get(i).setSoundBrand(newmanu);
                    this.get(i).setPrice(price);
		    checkUpdate = true;
                }
		if(checkUpdate){
                    System.out.println("Update succesful!");
		}
            }

        } else {
            System.out.println("The ID does not exist !!!");
        }
    }

    
    //dat
    //list ra
    public void listBrands() {
            System.out.printf("%8s%40s%20s%8s\n", "BRAND", "BRAND NAME", "SOUND BRAND", "PRICE");
        for (int i = 0; i < this.size(); i++) {
            System.out.printf("%8s%40s%20s%8s\n", this.get(i).getBrandID(), this.get(i).getBrandName(), this.get(i).getSoundBrand()+"\t" , String.format("%.2f", this.get(i).getPrice()));
            //System.out.println(this.get(i).getBrandID() + ", " + this.get(i).getBrandName() + ", " + this.get(i).getSoundBrand() + ": " + this.get(i).getPrice());
        }
    }

    
    
    //Save
    public boolean saveToFile(String fname) {

        FileWriter fileWriter = null;
        boolean c = false;
        File f = new File(fname);

        try {
            if (f.isFile() && f.canWrite()) {
                fileWriter = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fileWriter);
                for (int i = 0; i < this.size(); i++) {
                    pw.println(this.get(i).toString());
               }
                c = true;
                System.out.println("Save successfull!");
                fileWriter.close();
                pw.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
            c = false;
        }
        return c;
    }

    
    public void searchID1(String ID) {
        int k;
        k = find(ID);
        if (k >= 0) {
            System.out.print(this.get(k).getBrandID() + ", " + this.get(k).getBrandName() + ", " + this.get(k).getSoundBrand() + ": " + this.get(k).getPrice());
        } else if (k < 0) {
            System.out.println("Not Exist!");
        }
    }
}
