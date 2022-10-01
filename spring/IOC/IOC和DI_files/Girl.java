package com.study.di;

import java.util.*;

/*
 * @author SMILE.Huang
 * @date 2021-04-09 15:40
 */
public class Girl {
    private String gname;
    private Integer[] luckyNumber;//幸运数字
    private List<String> manStars;//喜欢的男星
    private Set<String> honeys;//闺蜜
    private Map<Integer,String> hotels;//房产
    private Properties hobbies;//爱好

    public Properties getHobbies() {
        return hobbies;
    }

    public void setHobbies(Properties hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "gname='" + gname + '\'' +
                ", luckyNumber=" + Arrays.toString(luckyNumber) +
                ", manStars=" + manStars +
                ", honeys=" + honeys +
                ", hotels=" + hotels +
                '}';
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer[] getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(Integer[] luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public List<String> getManStars() {
        return manStars;
    }

    public void setManStars(List<String> manStars) {
        this.manStars = manStars;
    }

    public Set<String> getHoneys() {
        return honeys;
    }

    public void setHoneys(Set<String> honeys) {
        this.honeys = honeys;
    }

    public Map<Integer, String> getHotels() {
        return hotels;
    }

    public void setHotels(Map<Integer, String> hotels) {
        this.hotels = hotels;
    }

    public Girl() {
    }

    public Girl(String gname, Integer[] luckyNumber, List<String> manStars, Set<String> honeys, Map<Integer, String> hotels) {
        this.gname = gname;
        this.luckyNumber = luckyNumber;
        this.manStars = manStars;
        this.honeys = honeys;
        this.hotels = hotels;
    }
}
