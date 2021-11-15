public class DrivingLicense{    
    private String name;    
    private String surname;    
    private String address;    
    private String postalCode;    
    private String city;    
    private String drivingLicenseNumber;    
    private int yearOfIssue;    
    private String drivingLicenseCategory;        
    public String getName(){        
        return name;    
    }    
    public void setName(String name){        
        String firstLetter = name.substring(0,1).toUpperCase();
        String restLetters = name.substring(1).toLowerCase();
        this.name=firstLetter + restLetters;   
    }    
    public String getSurname(){        
        return surname;    
    }    
    public void setSurname(String surname){
        this.surname=surname;    
    }    
    public String getAddress(){        
        return address;    
    }    
    public void setAddress(String address){        
        this.address=address;    
    }    
    public String getPostalCode(){        
        return postalCode;    
    }    
    public void setPostalCode(String postalCode){        
        this.postalCode=postalCode;    
    }    
    public String getCity(){        
        return city;    
    }    
    public void setCity(String city){        
        this.city=city;    
    }    
    public String getDrivingLicenseNumber(){        
        return drivingLicenseNumber;    
    }    
    public void setDrivingLicenseNumber(String drivingLicenseNumber){        
        this.drivingLicenseNumber=drivingLicenseNumber;    
    }    
    public int getYearOfIssue(){        
        return yearOfIssue;    
    }    
    public void setYearOfIssue(int yearOfIssue){  
        if (yearOfIssue >= 1980 && yearOfIssue <=2021){
            this.yearOfIssue=yearOfIssue;
        }    
    }    
    public String getDrivingLicenseCategory(){        
        return drivingLicenseCategory;    
    }    
    public void setDrivingLicenseCategory(String drivingLicenseCategory){        
        this.drivingLicenseCategory=drivingLicenseCategory;    
    }    
    DrivingLicense(String name, String surname, String address, String postalCode, String city, String drivingLicenseNumber, int yearOfIssue, String drivingLicenseCategory){        
        this.name=name;        
        this.surname=surname;        
        this.address=address;        
        this.postalCode=postalCode;        
        this.city=city;        
        this.drivingLicenseNumber=drivingLicenseNumber;        
        this.yearOfIssue=yearOfIssue;        
        this.drivingLicenseCategory=drivingLicenseCategory;            
    }    
    public void display(){        
        System.out.println("Name: " + getName());        
        System.out.println("Surname: " + getSurname());        
        System.out.println("Address: " + getAddress());        
        System.out.println("Postal Code: " + getPostalCode());        
        System.out.println("City: " + getCity());        
        System.out.println("Driving license number: " + getDrivingLicenseNumber());        
        System.out.println("Year of Issue: " + getYearOfIssue());        
        System.out.println("Driving license category: " + getDrivingLicenseCategory());            
    }    
    public String toString(){        
        return ("Name: " + getName()  + "\nSurname: " + getSurname() + "\nAddress: " + getAddress() +        "\nPostal code: " + getPostalCode() + "\nCity: " + getCity() + "\nDriving license number: " + getDrivingLicenseNumber() +        "\nYear of issue: " + getYearOfIssue()+ "\nDriving license category: " + getDrivingLicenseCategory());    
    }    
    public static void main(String[] args){        
        DrivingLicense drivingLicense1= new DrivingLicense("Jan","Kowalski","ul.Długa 8", "32-066", "Warszawa", "466464747", 2016, "A");        
        drivingLicense1.display();        
        drivingLicense1.setName("Piotr");
        drivingLicense1.setYearOfIssue(1979);
        drivingLicense1.setYearOfIssue(2022);
        drivingLicense1.display();
        drivingLicense1.setYearOfIssue(2000);
        drivingLicense1.display();
        drivingLicense1.setName("aDaM");
        drivingLicense1.display();
        System.out.println(drivingLicense1);
    }
}
