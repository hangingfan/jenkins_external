def call(Map config = [:]){
    dir("${config.projectpath}/Build/tools")
    {
        if("${config.channel}".contains('googleplay'))
        {
            echo sh(script: 'python3 -u aab_oversea_shell.py', returnStdout: true).trim()
            echo sh(script: 'python3 -u apk_oversea_shell.py', returnStdout: true).trim()
        }
        else
        {
            echo sh(script: 'python3 -u apk_shell.py', returnStdout: true).trim()
        }
    }
}
