public class Data {
        //attributi
        private int day;
        private int month;
        private int year;

        //metodi
        public Data(int day, int month, int year){
            setYear(year);
            setMonth(month);
            setDay(day);
        }

        public void setDay(int day){
            if (month == 11 || month == 4 || month == 6 || month == 9 && day <= 30) {
                this.day = day;
            }
            if (month == 2 && day <= 28) {
                this.day = day;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day <= 31) {
                this.day = day;
            }
        }

        public void setMonth(int month){
            if (month > 0 && month <= 12) {
                this.month = month;
            }
        }

        public void setYear(int Year) {
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public String toString() {
            String data;
            data = "Oggi è il: " + day + "/" + month + "/" + year;
            return data;
        }

        public boolean lapYear() {
            boolean leap;
            if (year % 4 == 0) {
                leap = true;
            } else {
                leap = false;
            }
            return leap;
        }

        public int dayToNewYear() {
            int dayto;
            int year;
            int month;
            month = this.month;
            year = this.year;
            dayto = this.day - (this.day * 2);
            while (year == this.year + 1) {
                if (month == 11 || month == 4 || month == 6 || month == 9 && day <= 30) {
                    dayto = dayto + 30;
                    month++;
                }
                if (month == 2 && day <= 28) {
                    if (lapYear()) {
                        dayto = dayto + 29;
                    } else {
                        dayto = dayto + 28;
                    }
                    month++;
                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day <= 31) {
                    dayto = dayto + 31;
                    month++;
                }
                if (month == 12) {
                    year++;
                }
            }
            return dayto;
        }

        public void addDay(int dayadd) {
            this.day = this.day + dayadd;
            int daystart = 0;

            do {
                if (month == 11 || month == 4 || month == 6 || month == 9 && day <= 30) {
                    this.day = this.day - 30;
                }
                if (month == 2 && day <= 28) {
                    if (lapYear() == true) {
                        this.day = this.day - 29;
                    } else {
                        this.day = this.day - 28;
                    }
                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day <= 31) {
                    this.day = this.day - 31;
                }
                this.month++;

                if (this.month == 13) {
                    this.month = 1;
                    this.year++;
                }
                if (month == 11 || month == 4 || month == 6 || month == 9 && day <= 30) {
                    daystart = 30;
                }
                if (month == 2 && day <= 28) {
                    if (lapYear()) {
                        daystart = 29;
                    } else {
                        daystart = 28;
                    }
                }
                if (month == 1 || month == 3 || month == 5 || month == 07 || month == 8 || month == 10 || month == 12 && day <= 31) {
                    daystart = 31;
                }
            }while (day <= daystart);
        }

        public boolean compare(Data data1, Data data2){
            boolean comparato;
            if(data1.getDay() == data2.getDay() && data1.getMonth() == data2.getMonth() && data1.getYear() == data2.getYear()){
                comparato = true;
            }else{
                comparato = false;
            }
            return comparato;
        }
}
