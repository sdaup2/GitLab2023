package edu.unl.raikes.git;

public class GitLab {

    public GitLab() {
        // TODO Auto-generated constructor stub
    }
    public static void main(String args[]) {
        System.out.println("This is a lesson on git");
        GitLabHelper helper = new GitLabHelper("Shruti and Natalia", "Seth");
        helper.PrintWelcomeMessage();
    }

}
