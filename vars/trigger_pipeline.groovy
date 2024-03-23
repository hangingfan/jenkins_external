def call(Map config = [:]){
    enable_perf_type = '0'
    url = "https://tech-jenkins.int.hypergryph.com"
    if("${config.auto_trigger}".contains('PhoneProfile'))
    {
        enable_perf_type = '1'
    }

    label = "ui_auto"
    teardownCases = "tc_stop_game"
    setupCases = "tc_install_game,tc_start_game"
    if("${config.target}".contains('ios'))
    {
        udid = "00008110-0008389C0E01401E"
        sh "curl -s -u dm02_bm:DM02_BM -X POST ${url}/view/DM02%20\\(Mainline\\)/job/UI_AUTOMATION_IOS_Mainline/buildWithParameters -d label=${label} -d packagePath=${config.triggerPackagePath} -d udid=${udid} -d setupCases=${setupCases} -d testCases=${config.testCases} -d teardownCases=${teardownCases} -d taskID=16 -d classifyPerf=${config.classifyPerf} -d bundleid=${config.bundleid} -d packageVersion=${config.curfileName} -d enablePerfType=${enable_perf_type}"
    }
    else
    {
        udid = "R5CR11VKZ8W"
        sh "curl -s -u dm02_bm:DM02_BM -X POST ${url}/view/DM02%20\\(Mainline\\)/job/UI_AUTOMATION_AND_Mainline/buildWithParameters -d label=${label} -d packagePath=${config.triggerPackagePath} -d serial=${udid} -d setupCases=${setupCases} -d testCases=${config.testCases} -d teardownCases=${teardownCases} -d taskID=16 -d classifyPerf=${config.classifyPerf} -d bundleid=${config.bundleid} -d packageVersion=${config.curfileName} -d enablePerfType=${enable_perf_type}"
    }
}
