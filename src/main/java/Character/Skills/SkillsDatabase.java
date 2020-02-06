package Character.Skills;

import Character.Skills.Active.ActiveSkillDatabase;
import Character.Skills.Passive.PassiveSkillDatabase;

public class SkillsDatabase {
    private ActiveSkillDatabase activeSkillDatabase = new ActiveSkillDatabase();
    private PassiveSkillDatabase passiveSkillDatabase = new PassiveSkillDatabase();

    public ActiveSkillDatabase getActiveSkillDatabase() {
        return activeSkillDatabase;
    }

    public PassiveSkillDatabase getPassiveSkillDatabase() {
        return passiveSkillDatabase;
    }
}
