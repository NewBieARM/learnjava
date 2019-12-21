package 接口作为成员变量类型;

public class Hero {
    private String name; // 名称
    private Skill skill; // 英雄的法术技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void 放技能(){
        System.out.println(name + "开始释放技能");
        skill.use();   // 调用接口的abstract方法
        System.out.println("释放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
