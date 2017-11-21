package com.mycompany.Memberships.Benefits;
import com.mycompany.Memberships.BenefitsMembership;
import com.mycompany.Membership;

/**
 * Clas Instructor.
 */
public class PersonalInstructor extends BenefitsMembership {
    /**
     * instructor.
     */
    private Membership instructor;

    /**
     * default constructor.
     * @param instructors a.
     */
    public PersonalInstructor(final Membership instructors) {
        this.instructor = instructors;
    }

    /**
     * a.
     * @return membershp.
     */
    public final String getMembership() {
        if (this.instructor != null) {
            return this.instructor.getMembership() + ", personal instructor.";
        } else {
            return "Add your membership type";
        }
    }
}
