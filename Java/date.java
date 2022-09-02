

SimpleDateFormat ft
            = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("Formatted Date : " + str);
 
        // parsing a given String
        str = "02/18/1995";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);
 
        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);