package com.example.weatherdemo.bean;
/*利用GsonFormat生成数据*/
public class WeatherBean {
    /**
     * ret : 200
     * data : {"err_code":0,"err_msg":"","weather":{"date":"2021-03-23","time":"2021-03-23 21:02","city":"松江","visibility":"15.6km","weather":"阴","tem":"12","win":"东南风 ","win_speed":"东南风 ","win_meter":"小于12km/h","humidity":"62%","pressure":"1018","air":"53","air_pm25":"53","air_level":"良","air_tips":"空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""}}}
     * msg : V3.3.0 YesApi App.Common_Weather.LiveWeather
     */

    private int ret;
    private DataDTO data;
    private String msg;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataDTO {
        /**
         * err_code : 0
         * err_msg :
         * weather : {"date":"2021-03-23","time":"2021-03-23 21:02","city":"松江","visibility":"15.6km","weather":"阴","tem":"12","win":"东南风 ","win_speed":"东南风 ","win_meter":"小于12km/h","humidity":"62%","pressure":"1018","air":"53","air_pm25":"53","air_level":"良","air_tips":"空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""}}
         */

        private int err_code;
        private String err_msg;
        private WeatherDTO weather;

        public int getErr_code() {
            return err_code;
        }

        public void setErr_code(int err_code) {
            this.err_code = err_code;
        }

        public String getErr_msg() {
            return err_msg;
        }

        public void setErr_msg(String err_msg) {
            this.err_msg = err_msg;
        }

        public WeatherDTO getWeather() {
            return weather;
        }

        public void setWeather(WeatherDTO weather) {
            this.weather = weather;
        }

        public static class WeatherDTO {
            /**
             * date : 2021-03-23
             * time : 2021-03-23 21:02
             * city : 松江
             * visibility : 15.6km
             * weather : 阴
             * tem : 12
             * win : 东南风
             * win_speed : 东南风
             * win_meter : 小于12km/h
             * humidity : 62%
             * pressure : 1018
             * air : 53
             * air_pm25 : 53
             * air_level : 良
             * air_tips : 空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！
             * alarm : {"alarm_type":"","alarm_level":"","alarm_content":""}
             */

            private String date;
            private String time;
            private String city;
            private String visibility;
            private String weather;
            private String tem;
            private String win;
            private String win_speed;
            private String win_meter;
            private String humidity;
            private String pressure;
            private String air;
            private String air_pm25;
            private String air_level;
            private String air_tips;
            private AlarmDTO alarm;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getVisibility() {
                return visibility;
            }

            public void setVisibility(String visibility) {
                this.visibility = visibility;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getTem() {
                return tem;
            }

            public void setTem(String tem) {
                this.tem = tem;
            }

            public String getWin() {
                return win;
            }

            public void setWin(String win) {
                this.win = win;
            }

            public String getWin_speed() {
                return win_speed;
            }

            public void setWin_speed(String win_speed) {
                this.win_speed = win_speed;
            }

            public String getWin_meter() {
                return win_meter;
            }

            public void setWin_meter(String win_meter) {
                this.win_meter = win_meter;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getAir() {
                return air;
            }

            public void setAir(String air) {
                this.air = air;
            }

            public String getAir_pm25() {
                return air_pm25;
            }

            public void setAir_pm25(String air_pm25) {
                this.air_pm25 = air_pm25;
            }

            public String getAir_level() {
                return air_level;
            }

            public void setAir_level(String air_level) {
                this.air_level = air_level;
            }

            public String getAir_tips() {
                return air_tips;
            }

            public void setAir_tips(String air_tips) {
                this.air_tips = air_tips;
            }

            public AlarmDTO getAlarm() {
                return alarm;
            }

            public void setAlarm(AlarmDTO alarm) {
                this.alarm = alarm;
            }

            public static class AlarmDTO {
                /**
                 * alarm_type :
                 * alarm_level :
                 * alarm_content :
                 */

                private String alarm_type;
                private String alarm_level;
                private String alarm_content;

                public String getAlarm_type() {
                    return alarm_type;
                }

                public void setAlarm_type(String alarm_type) {
                    this.alarm_type = alarm_type;
                }

                public String getAlarm_level() {
                    return alarm_level;
                }

                public void setAlarm_level(String alarm_level) {
                    this.alarm_level = alarm_level;
                }

                public String getAlarm_content() {
                    return alarm_content;
                }

                public void setAlarm_content(String alarm_content) {
                    this.alarm_content = alarm_content;
                }
            }
        }
    }
}
