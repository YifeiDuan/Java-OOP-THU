package date;

public class Date {
    String year;
    String month;
    String day;
    Date(String date1){
        date1 = date1.replaceAll(",","");
        String factor[] = date1.split(" ");

        if(factor[0].equals("Jan.")) month = "01";
        if(factor[0].equals("Feb.")) month = "02";
        if(factor[0].equals("Mar.")) month = "03";
        if(factor[0].equals("Apr.")) month = "04";
        if(factor[0].equals("May.")) month = "05";
        if(factor[0].equals("Jun.")) month = "06";
        if(factor[0].equals("Jul.")) month = "07";
        if(factor[0].equals("Aug.")) month = "08";
        if(factor[0].equals("Sept.")) month = "09";
        if(factor[0].equals("Oct.")) month = "10";
        if(factor[0].equals("Nov.")) month = "11";
        if(factor[0].equals("Dec.")) month = "12";

        if(factor[1].equals("1") | factor[1].equals("2") | factor[1].equals("3") | factor[1].equals("4") | factor[1].equals("5") | factor[1].equals("6") | factor[1].equals("7") | factor[1].equals("8") | factor[1].equals("9")) day = "0" + factor[1];
        else day = factor[1];

        year = factor[2];
    }

    Date(String str_month, int i_day, int i_year){
        if(str_month == "Jan.") month = "01";
        if(str_month == "Feb.") month = "02";
        if(str_month == "Mar.") month = "03";
        if(str_month == "Apr.") month = "04";
        if(str_month == "May.") month = "05";
        if(str_month == "Jun.") month = "06";
        if(str_month == "Jul.") month = "07";
        if(str_month == "Aug.") month = "08";
        if(str_month == "Sept.") month = "09";
        if(str_month == "Oct.") month = "10";
        if(str_month == "Nov.") month = "11";
        if(str_month == "Dec.") month = "12";

        if(i_day < 10) day = "0" + Integer.toString(i_day);
        else day = Integer.toString(i_day);

        year = Integer.toString(i_year);
    }

    Date(int i_year, int i_month, int i_day){
        year = Integer.toString(i_year);

        if(i_month < 10) month = "0" + Integer.toString(i_month);
        else month = Integer.toString(i_month);

        if(i_day < 10) day = "0" + Integer.toString(i_day);
        else day= Integer.toString(i_day);
    }

    public String print(){
        return year + "/" + month+ "/" + day;
    }
}
