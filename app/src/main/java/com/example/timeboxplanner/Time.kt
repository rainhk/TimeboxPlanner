package com.example.timeboxplanner

public class Time {
    private var hour: String? = null
    private var box_color1: String? = null
    private var box_color2: String? = null
    private var box_color3: String? = null
    private var box_color4: String? = null
    private var box_color5: String? = null
    private var box_color6: String? = null

    public fun MainTime(hour: String, box_color1: String, box_color2: String, box_color3: String, box_color4: String, box_color5: String, box_color6: String){
        this.hour = hour
        this.box_color1 = box_color1
        this.box_color2 = box_color2
        this.box_color3 = box_color3
        this.box_color4 = box_color4
        this.box_color5 = box_color5
        this.box_color6 = box_color6
    }

    public fun getHour(): String? {
        return hour
    }

    public fun setHour(hour: String) {
        this.hour = hour
    }

    public fun boxColor1(): String? {
        return box_color1
    }

    public fun setBoxColor1(box_color1: String) {
        this.box_color1 = box_color1
    }

    public fun boxColor2(): String? {
        return box_color2
    }

    public fun setBoxColor2(box_color2: String) {
        this.box_color2 = box_color2
    }

    public fun boxColor3(): String? {
        return box_color3
    }

    public fun setBoxColor3(box_color3: String) {
        this.box_color3 = box_color3
    }

    public fun boxColor4(): String? {
        return box_color4
    }

    public fun setBoxColor4(box_color4: String) {
        this.box_color4 = box_color4
    }

    public fun boxColor5(): String? {
        return box_color5
    }

    public fun setBoxColor5(box_color5: String) {
        this.box_color5 = box_color5
    }

    public fun boxColor6(): String? {
        return box_color6
    }

    public fun setBoxColor6(box_color6: String) {
        this.box_color6 = box_color6
    }

}




