package com.example.weatherdemo;

import java.util.List;

public class LifeBean {
    /**
     * ret : 200
     * data : {"err_code":0,"err_msg":"","weather":[{"day":"24日（星期三）","date":"2021-03-24","week":"星期三","wea":"多云","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"多云","wea_night_img":"yun","tem":"19℃","tem1":"19℃","tem2":"7℃","humidity":"50%","visibility":"21.3km","pressure":"1017","win":["西南风","南风"],"win_speed":"<3级","win_meter":"小于12km/h","sunrise":"05:53","sunset":"18:08","air":"51","air_level":"良","air_tips":"空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"14时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"7-8级"},{"hours":"15时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"16时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"17时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"7-8级"},{"hours":"18时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"6-7级"},{"hours":"19时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"20时","wea":"晴","wea_img":"qing","tem":"11","win":"微风","win_speed":"7-8级"},{"hours":"21时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"22时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"23时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"00时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"01时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"7-8级"},{"hours":"02时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"03时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"8-9级"},{"hours":"04时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"4-5级"},{"hours":"05时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"6-7级"},{"hours":"06时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"8-9级"},{"hours":"07时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"8-9级"},{"hours":"08时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"12时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"13时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"适宜","desc":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"25日（星期四）","date":"2021-03-25","week":"星期四","wea":"晴","wea_img":"qing","wea_day":"晴","wea_day_img":"qing","wea_night":"晴","wea_night_img":"qing","tem":"22℃","tem1":"22℃","tem2":"8℃","humidity":"","visibility":"","pressure":"","win":["东南风","东南风"],"win_speed":"<3级","win_meter":"","sunrise":"05:52","sunset":"18:09","air":"29","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"08时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"12时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"13时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"14时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"15时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"16时","wea":"晴","wea_img":"qing","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"17时","wea":"晴","wea_img":"qing","tem":"18","win":"微风","win_speed":"5-6级"},{"hours":"18时","wea":"晴","wea_img":"qing","tem":"15","win":"微风","win_speed":"5-6级"},{"hours":"19时","wea":"晴","wea_img":"qing","tem":"13","win":"微风","win_speed":"5-6级"},{"hours":"20时","wea":"晴","wea_img":"qing","tem":"11","win":"微风","win_speed":"5-6级"},{"hours":"21时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"5-6级"},{"hours":"22时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"23时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"很强","desc":"紫外线辐射极强，建议涂擦SPF20以上、PA  的防晒护肤品，尽量避免暴露于日光下。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"较适宜","desc":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"26日（星期五）","date":"2021-03-26","week":"星期五","wea":"小雨","wea_img":"yu","wea_day":"小雨","wea_day_img":"yu","wea_night":"小雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["东南风","南风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:51","sunset":"18:10","air":"16","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"00时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"01时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"02时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"03时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"04时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"05时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"06时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"07时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"5-6级"},{"hours":"08时","wea":"晴","wea_img":"qing","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"15","win":"东北风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"5-6级"},{"hours":"11时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"12时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"13时","wea":"阴","wea_img":"yin","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"15时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"16时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"17","win":"东北风","win_speed":"5-6级"},{"hours":"18时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"5-6级"},{"hours":"19时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"5-6级"},{"hours":"20时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"5-6级"},{"hours":"21时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"5-6级"},{"hours":"22时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"23时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"6-7级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"风雨相伴，坚持室内运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"27日（星期六）","date":"2021-03-27","week":"星期六","wea":"小雨","wea_img":"yu","wea_day":"小雨","wea_day_img":"yu","wea_night":"小雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["西南风","西北风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:50","sunset":"18:10","air":"33","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"00时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"01时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"03时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"04时","wea":"阴","wea_img":"yin","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"05时","wea":"阴","wea_img":"yin","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"06时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"07时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"08时","wea":"小雨","wea_img":"yu","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"11时","wea":"小雨","wea_img":"yu","tem":"18","win":"微风","win_speed":"6-7级"},{"hours":"14时","wea":"小雨","wea_img":"yu","tem":"19","win":"东北风","win_speed":"7-8级"},{"hours":"17时","wea":"小雨","wea_img":"yu","tem":"17","win":"东北风","win_speed":"7-8级"},{"hours":"20时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"7-8级"},{"hours":"23时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"8-9级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"风雨相伴，坚持室内运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"28日（星期日）","date":"2021-03-28","week":"星期日","wea":"多云","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"多云","wea_night_img":"yun","tem":"21℃","tem1":"21℃","tem2":"13℃","humidity":"","visibility":"","pressure":"","win":["西北风","东风"],"win_speed":"<3级","win_meter":"","sunrise":"05:48","sunset":"18:11","air":"182","air_level":"中度污染","air_tips":"儿童、老年人及心脏病、呼吸系统疾病患者应尽量减少外出，停留在室内，一般人群应适量减少户外运动。","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"9-10级"},{"hours":"05时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"9-10级"},{"hours":"08时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"9-10级"},{"hours":"11时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"9-10级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"20","win":"微风","win_speed":"9-10级"},{"hours":"17时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"9-10级"},{"hours":"20时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"9-10级"},{"hours":"23时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"6-7级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"较不宜","desc":"较不宜洗车，路面少量积水，如果执意擦洗汽车，要做好溅上泥水的心理准备。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"29日（星期一）","date":"2021-03-29","week":"星期一","wea":"多云转中雨","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"中雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["东南风","东南风"],"win_speed":"4-5级","win_meter":"","sunrise":"05:47","sunset":"18:12","air":"","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"晴","wea_img":"qing","tem":"14","win":"微风","win_speed":"4-5级"},{"hours":"05时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"4-5级"},{"hours":"08时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"多云","wea_img":"yun","tem":"17","win":"东北风","win_speed":"5-6级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"19","win":"东风","win_speed":"5-6级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"17","win":"东风","win_speed":"5-6级"},{"hours":"20时","wea":"阴","wea_img":"yin","tem":"15","win":"东风","win_speed":"5-6级"},{"hours":"23时","wea":"小雨","wea_img":"yu","tem":"15","win":"东风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"春天不减肥，夏天徒伤悲。风虽有点大，室内可健身。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件不易引起血糖波动。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"30日（星期二）","date":"2021-03-30","week":"星期二","wea":"阴","wea_img":"yin","wea_day":"阴","wea_day_img":"yin","wea_night":"阴","wea_night_img":"yin","tem":"17℃","tem1":"17℃","tem2":"12℃","humidity":"","visibility":"","pressure":"","win":["东北风","北风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:46","sunset":"18:12","air":"","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"14","win":"东北风","win_speed":"5-6级"},{"hours":"05时","wea":"大雨","wea_img":"yu","tem":"14","win":"东北风","win_speed":"5-6级"},{"hours":"08时","wea":"大雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"5-6级"},{"hours":"11时","wea":"阴","wea_img":"yin","tem":"15","win":"东北风","win_speed":"4-5级"},{"hours":"14时","wea":"阴","wea_img":"yin","tem":"16","win":"东北风","win_speed":"3-4级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"15","win":"东北风","win_speed":"3-4级"},{"hours":"20时","wea":"阴","wea_img":"yin","tem":"14","win":"微风","win_speed":"3-4级"},{"hours":"23时","wea":"阴","wea_img":"yin","tem":"13","win":"东北风","win_speed":"10-11级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"春天不减肥，夏天徒伤悲。风虽有点大，室内可健身。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件不易引起血糖波动。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车指数","level":"较不宜","desc":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]}]}
     * msg : V3.3.0 YesApi App.Common_Weather.WeekWeather
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
         * weather : [{"day":"24日（星期三）","date":"2021-03-24","week":"星期三","wea":"多云","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"多云","wea_night_img":"yun","tem":"19℃","tem1":"19℃","tem2":"7℃","humidity":"50%","visibility":"21.3km","pressure":"1017","win":["西南风","南风"],"win_speed":"<3级","win_meter":"小于12km/h","sunrise":"05:53","sunset":"18:08","air":"51","air_level":"良","air_tips":"空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"14时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"7-8级"},{"hours":"15时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"16时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"17时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"7-8级"},{"hours":"18时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"6-7级"},{"hours":"19时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"20时","wea":"晴","wea_img":"qing","tem":"11","win":"微风","win_speed":"7-8级"},{"hours":"21时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"22时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"23时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"00时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"01时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"7-8级"},{"hours":"02时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"03时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"8-9级"},{"hours":"04时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"4-5级"},{"hours":"05时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"6-7级"},{"hours":"06时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"8-9级"},{"hours":"07时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"8-9级"},{"hours":"08时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"12时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"13时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"适宜","desc":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"25日（星期四）","date":"2021-03-25","week":"星期四","wea":"晴","wea_img":"qing","wea_day":"晴","wea_day_img":"qing","wea_night":"晴","wea_night_img":"qing","tem":"22℃","tem1":"22℃","tem2":"8℃","humidity":"","visibility":"","pressure":"","win":["东南风","东南风"],"win_speed":"<3级","win_meter":"","sunrise":"05:52","sunset":"18:09","air":"29","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"08时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"12时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"13时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"14时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"15时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"},{"hours":"16时","wea":"晴","wea_img":"qing","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"17时","wea":"晴","wea_img":"qing","tem":"18","win":"微风","win_speed":"5-6级"},{"hours":"18时","wea":"晴","wea_img":"qing","tem":"15","win":"微风","win_speed":"5-6级"},{"hours":"19时","wea":"晴","wea_img":"qing","tem":"13","win":"微风","win_speed":"5-6级"},{"hours":"20时","wea":"晴","wea_img":"qing","tem":"11","win":"微风","win_speed":"5-6级"},{"hours":"21时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"5-6级"},{"hours":"22时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"23时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"很强","desc":"紫外线辐射极强，建议涂擦SPF20以上、PA  的防晒护肤品，尽量避免暴露于日光下。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"较适宜","desc":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"26日（星期五）","date":"2021-03-26","week":"星期五","wea":"小雨","wea_img":"yu","wea_day":"小雨","wea_day_img":"yu","wea_night":"小雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["东南风","南风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:51","sunset":"18:10","air":"16","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"00时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"01时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"02时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"03时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"04时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"05时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"06时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"07时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"5-6级"},{"hours":"08时","wea":"晴","wea_img":"qing","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"15","win":"东北风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"5-6级"},{"hours":"11时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"12时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"13时","wea":"阴","wea_img":"yin","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"19","win":"东北风","win_speed":"5-6级"},{"hours":"15时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"16时","wea":"阴","wea_img":"yin","tem":"18","win":"东北风","win_speed":"5-6级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"17","win":"东北风","win_speed":"5-6级"},{"hours":"18时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"5-6级"},{"hours":"19时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"5-6级"},{"hours":"20时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"5-6级"},{"hours":"21时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"5-6级"},{"hours":"22时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"23时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"6-7级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"风雨相伴，坚持室内运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"27日（星期六）","date":"2021-03-27","week":"星期六","wea":"小雨","wea_img":"yu","wea_day":"小雨","wea_day_img":"yu","wea_night":"小雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["西南风","西北风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:50","sunset":"18:10","air":"33","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"00时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"01时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"03时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"04时","wea":"阴","wea_img":"yin","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"05时","wea":"阴","wea_img":"yin","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"06时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"6-7级"},{"hours":"07时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"6-7级"},{"hours":"08时","wea":"小雨","wea_img":"yu","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"11时","wea":"小雨","wea_img":"yu","tem":"18","win":"微风","win_speed":"6-7级"},{"hours":"14时","wea":"小雨","wea_img":"yu","tem":"19","win":"东北风","win_speed":"7-8级"},{"hours":"17时","wea":"小雨","wea_img":"yu","tem":"17","win":"东北风","win_speed":"7-8级"},{"hours":"20时","wea":"小雨","wea_img":"yu","tem":"16","win":"东北风","win_speed":"7-8级"},{"hours":"23时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"8-9级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"风雨相伴，坚持室内运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"28日（星期日）","date":"2021-03-28","week":"星期日","wea":"多云","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"多云","wea_night_img":"yun","tem":"21℃","tem1":"21℃","tem2":"13℃","humidity":"","visibility":"","pressure":"","win":["西北风","东风"],"win_speed":"<3级","win_meter":"","sunrise":"05:48","sunset":"18:11","air":"182","air_level":"中度污染","air_tips":"儿童、老年人及心脏病、呼吸系统疾病患者应尽量减少外出，停留在室内，一般人群应适量减少户外运动。","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"9-10级"},{"hours":"05时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"9-10级"},{"hours":"08时","wea":"小雨","wea_img":"yu","tem":"16","win":"微风","win_speed":"9-10级"},{"hours":"11时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"9-10级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"20","win":"微风","win_speed":"9-10级"},{"hours":"17时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"9-10级"},{"hours":"20时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"9-10级"},{"hours":"23时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"6-7级"}],"index":[{"title":"紫外线指数","level":"弱","desc":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"较易波动","desc":"血糖较易波动，注意监测。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"较不宜","desc":"较不宜洗车，路面少量积水，如果执意擦洗汽车，要做好溅上泥水的心理准备。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]},{"day":"29日（星期一）","date":"2021-03-29","week":"星期一","wea":"多云转中雨","wea_img":"yun","wea_day":"多云","wea_day_img":"yun","wea_night":"中雨","wea_night_img":"yu","tem":"20℃","tem1":"20℃","tem2":"14℃","humidity":"","visibility":"","pressure":"","win":["东南风","东南风"],"win_speed":"4-5级","win_meter":"","sunrise":"05:47","sunset":"18:12","air":"","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"晴","wea_img":"qing","tem":"14","win":"微风","win_speed":"4-5级"},{"hours":"05时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"4-5级"},{"hours":"08时","wea":"多云","wea_img":"yun","tem":"15","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"多云","wea_img":"yun","tem":"17","win":"东北风","win_speed":"5-6级"},{"hours":"14时","wea":"多云","wea_img":"yun","tem":"19","win":"东风","win_speed":"5-6级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"17","win":"东风","win_speed":"5-6级"},{"hours":"20时","wea":"阴","wea_img":"yin","tem":"15","win":"东风","win_speed":"5-6级"},{"hours":"23时","wea":"小雨","wea_img":"yu","tem":"15","win":"东风","win_speed":"5-6级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"春天不减肥，夏天徒伤悲。风虽有点大，室内可健身。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件不易引起血糖波动。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车指数","level":"不宜","desc":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]},{"day":"30日（星期二）","date":"2021-03-30","week":"星期二","wea":"阴","wea_img":"yin","wea_day":"阴","wea_day_img":"yin","wea_night":"阴","wea_night_img":"yin","tem":"17℃","tem1":"17℃","tem2":"12℃","humidity":"","visibility":"","pressure":"","win":["东北风","北风"],"win_speed":"3-4级","win_meter":"","sunrise":"05:46","sunset":"18:12","air":"","air_level":"优","air_tips":"空气很好，可以外出活动，呼吸新鲜空气，拥抱大自然！","alarm":{"alarm_type":"","alarm_level":"","alarm_content":""},"hours":[{"hours":"02时","wea":"小雨","wea_img":"yu","tem":"14","win":"东北风","win_speed":"5-6级"},{"hours":"05时","wea":"大雨","wea_img":"yu","tem":"14","win":"东北风","win_speed":"5-6级"},{"hours":"08时","wea":"大雨","wea_img":"yu","tem":"15","win":"微风","win_speed":"5-6级"},{"hours":"11时","wea":"阴","wea_img":"yin","tem":"15","win":"东北风","win_speed":"4-5级"},{"hours":"14时","wea":"阴","wea_img":"yin","tem":"16","win":"东北风","win_speed":"3-4级"},{"hours":"17时","wea":"阴","wea_img":"yin","tem":"15","win":"东北风","win_speed":"3-4级"},{"hours":"20时","wea":"阴","wea_img":"yin","tem":"14","win":"微风","win_speed":"3-4级"},{"hours":"23时","wea":"阴","wea_img":"yin","tem":"13","win":"东北风","win_speed":"10-11级"}],"index":[{"title":"紫外线指数","level":"最弱","desc":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"title":"减肥指数","level":"一颗星","desc":"春天不减肥，夏天徒伤悲。风虽有点大，室内可健身。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件不易引起血糖波动。"},{"title":"穿衣指数","level":"较冷","desc":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},{"title":"洗车指数","level":"较不宜","desc":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"},{"title":"空气污染扩散指数","level":"良","desc":"气象条件有利于空气污染物稀释、扩散和清除。"}]}]
         */

        private int err_code;
        private String err_msg;
        private List<WeatherDTO> weather;

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

        public List<WeatherDTO> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherDTO> weather) {
            this.weather = weather;
        }

        public static class WeatherDTO {
            /**
             * day : 24日（星期三）
             * date : 2021-03-24
             * week : 星期三
             * wea : 多云
             * wea_img : yun
             * wea_day : 多云
             * wea_day_img : yun
             * wea_night : 多云
             * wea_night_img : yun
             * tem : 19℃
             * tem1 : 19℃
             * tem2 : 7℃
             * humidity : 50%
             * visibility : 21.3km
             * pressure : 1017
             * win : ["西南风","南风"]
             * win_speed : <3级
             * win_meter : 小于12km/h
             * sunrise : 05:53
             * sunset : 18:08
             * air : 51
             * air_level : 良
             * air_tips : 空气好，可以外出活动，除极少数对污染物特别敏感的人群以外，对公众没有危害！
             * alarm : {"alarm_type":"","alarm_level":"","alarm_content":""}
             * hours : [{"hours":"14时","wea":"多云","wea_img":"yun","tem":"18","win":"微风","win_speed":"7-8级"},{"hours":"15时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"16时","wea":"多云","wea_img":"yun","tem":"17","win":"微风","win_speed":"6-7级"},{"hours":"17时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"7-8级"},{"hours":"18时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"6-7级"},{"hours":"19时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"20时","wea":"晴","wea_img":"qing","tem":"11","win":"微风","win_speed":"7-8级"},{"hours":"21时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"22时","wea":"晴","wea_img":"qing","tem":"10","win":"微风","win_speed":"6-7级"},{"hours":"23时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"00时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"5-6级"},{"hours":"01时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"7-8级"},{"hours":"02时","wea":"晴","wea_img":"qing","tem":"9","win":"微风","win_speed":"6-7级"},{"hours":"03时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"8-9级"},{"hours":"04时","wea":"多云","wea_img":"yun","tem":"9","win":"微风","win_speed":"4-5级"},{"hours":"05时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"6-7级"},{"hours":"06时","wea":"多云","wea_img":"yun","tem":"8","win":"微风","win_speed":"8-9级"},{"hours":"07时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"8-9级"},{"hours":"08时","wea":"多云","wea_img":"yun","tem":"12","win":"微风","win_speed":"6-7级"},{"hours":"09时","wea":"多云","wea_img":"yun","tem":"14","win":"微风","win_speed":"5-6级"},{"hours":"10时","wea":"多云","wea_img":"yun","tem":"16","win":"微风","win_speed":"4-5级"},{"hours":"11时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"12时","wea":"晴","wea_img":"qing","tem":"19","win":"微风","win_speed":"5-6级"},{"hours":"13时","wea":"晴","wea_img":"qing","tem":"20","win":"微风","win_speed":"5-6级"}]
             * index : [{"title":"紫外线指数","level":"弱","desc":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。"},{"title":"减肥指数","level":"五颗星","desc":"春天不减肥，夏天徒伤悲。天气较舒适，快去运动吧。"},{"title":"血糖指数","level":"不易波动","desc":"天气条件好，血糖不易波动，可适时进行户外锻炼。"},{"title":"穿衣指数","level":"较舒适","desc":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"title":"洗车指数","level":"适宜","desc":"适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"},{"title":"空气污染扩散指数","level":"中","desc":"气象条件对空气污染物稀释、扩散和清除无明显影响。"}]
             */

            private String day;
            private String date;
            private String week;
            private String wea;
            private String wea_img;
            private String wea_day;
            private String wea_day_img;
            private String wea_night;
            private String wea_night_img;
            private String tem;
            private String tem1;
            private String tem2;
            private String humidity;
            private String visibility;
            private String pressure;
            private List<String> win;
            private String win_speed;
            private String win_meter;
            private String sunrise;
            private String sunset;
            private String air;
            private String air_level;
            private String air_tips;
            private AlarmDTO alarm;
            private List<HoursDTO> hours;
            private List<IndexDTO> index;

            public String getDay() {
                return day;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWea() {
                return wea;
            }

            public void setWea(String wea) {
                this.wea = wea;
            }

            public String getWea_img() {
                return wea_img;
            }

            public void setWea_img(String wea_img) {
                this.wea_img = wea_img;
            }

            public String getWea_day() {
                return wea_day;
            }

            public void setWea_day(String wea_day) {
                this.wea_day = wea_day;
            }

            public String getWea_day_img() {
                return wea_day_img;
            }

            public void setWea_day_img(String wea_day_img) {
                this.wea_day_img = wea_day_img;
            }

            public String getWea_night() {
                return wea_night;
            }

            public void setWea_night(String wea_night) {
                this.wea_night = wea_night;
            }

            public String getWea_night_img() {
                return wea_night_img;
            }

            public void setWea_night_img(String wea_night_img) {
                this.wea_night_img = wea_night_img;
            }

            public String getTem() {
                return tem;
            }

            public void setTem(String tem) {
                this.tem = tem;
            }

            public String getTem1() {
                return tem1;
            }

            public void setTem1(String tem1) {
                this.tem1 = tem1;
            }

            public String getTem2() {
                return tem2;
            }

            public void setTem2(String tem2) {
                this.tem2 = tem2;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getVisibility() {
                return visibility;
            }

            public void setVisibility(String visibility) {
                this.visibility = visibility;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public List<String> getWin() {
                return win;
            }

            public void setWin(List<String> win) {
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

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public String getAir() {
                return air;
            }

            public void setAir(String air) {
                this.air = air;
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

            public List<HoursDTO> getHours() {
                return hours;
            }

            public void setHours(List<HoursDTO> hours) {
                this.hours = hours;
            }

            public List<IndexDTO> getIndex() {
                return index;
            }

            public void setIndex(List<IndexDTO> index) {
                this.index = index;
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

            public static class HoursDTO {
                /**
                 * hours : 14时
                 * wea : 多云
                 * wea_img : yun
                 * tem : 18
                 * win : 微风
                 * win_speed : 7-8级
                 */

                private String hours;
                private String wea;
                private String wea_img;
                private String tem;
                private String win;
                private String win_speed;

                public String getHours() {
                    return hours;
                }

                public void setHours(String hours) {
                    this.hours = hours;
                }

                public String getWea() {
                    return wea;
                }

                public void setWea(String wea) {
                    this.wea = wea;
                }

                public String getWea_img() {
                    return wea_img;
                }

                public void setWea_img(String wea_img) {
                    this.wea_img = wea_img;
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
            }

            public static class IndexDTO {
                /**
                 * title : 紫外线指数
                 * level : 弱
                 * desc : 紫外线强度较弱，建议涂擦SPF在12-15之间、PA 的防晒护肤品。
                 */

                private String title;
                private String level;
                private String desc;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLevel() {
                    return level;
                }

                public void setLevel(String level) {
                    this.level = level;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }
            }
        }
    }
}
