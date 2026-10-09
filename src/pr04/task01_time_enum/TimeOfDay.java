public enum TimeOfDay {
    NIGHT(0, 5, "Ночь"), MORNING(6, 11, "Утро"), DAY(12, 17, "День"), EVENING(18, 23, "Вечер");
    private final int fromHour, toHour; private final String description;
    TimeOfDay(int fromHour,int toHour,String description){this.fromHour=fromHour;this.toHour=toHour;this.description=description;}
    public static TimeOfDay fromHour(int hour){
        if(hour<0||hour>23) throw new IllegalArgumentException("Час должен быть от 0 до 23.");
        for(TimeOfDay t: values()) if(hour>=t.fromHour&&hour<=t.toHour) return t;
        throw new IllegalStateException();
    }
    public String getDescription(){return description;}
}
