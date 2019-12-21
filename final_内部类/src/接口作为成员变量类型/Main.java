package 接口作为成员变量类型;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        // 设置英雄技能
//        SkillImpl skillImpl = ;new SkillImpl()
//        hero.setSkill(skillImpl); // hero.setSkill(new SkillImpl())

        // 还可以改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia...");
//            }
//        };
//        hero.setSkill(skill);

        // 同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("bang~bang~bang~");
            }
        });
        hero.放技能();
    }
}
