job("First-Maven-Project-Via-DSL")
{
    description("First maven jonb using code dsl on ${new Date()}")
    scm{
        git("https://github.com/wasi2320/anshulc55_Jenkins_Upgradev3.git",master)
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven("clear package",'maven-samples/single-moule/pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}