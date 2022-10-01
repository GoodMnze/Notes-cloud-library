package com.study.di;

/* 班级类
 * @author SMILE.Huang
 * @date 2020-07-11 15:01
 */
public class Clazz {
    private Integer cid;//编号
    private String cname;//班级名称
    private String master;//班主任

    public Clazz(Integer cid){
        System.out.println("我是带一个Integer参数的Clazz构造方法....");
        this.cid = cid;
    }
    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public Clazz() {
        System.out.println("Clazz无参构造方法》。。");
    }

    public Clazz(Integer cid, String cname, String master) {
        System.out.println("Clazz的全参构造方法》。。");
        this.cid = cid;
        this.cname = cname;
        this.master = master;
    }
    public Clazz(String master,Integer cid,String cname){
        System.out.println("Clazz新的全参构造方法》》》》》");
        this.cid = cid;
        this.cname = cname;
        this.master = master;
    }
}
