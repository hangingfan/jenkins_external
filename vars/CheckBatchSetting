def call(Map config = [:]){
    def invokeOtherTask(currentJobName, channel, buildtype, auto_trigger, sdk_env, u8_enable, version_env, regenerate, origin_package)
    {
        build job: currentJobName, wait: false, parameters: [
        string(name: 'channel', value: channel),
        string(name: 'buildtype', value: buildtype),
        string(name: 'auto_trigger', value: auto_trigger),
        string(name: 'sdk_env', value: sdk_env),
        string(name: 'u8_enable', value: u8_enable),
        string(name: 'version_env', value: version_env),
        string(name: 'regenerate', value: regenerate),
        string(name: 'origin_package', value: origin_package),
        ]
    }

    if("${config.channel}".contains('批量官包_withboard'))
    {
        channel = 'official_android'
        buildtype = 'release_withboard'
        auto_trigger = 'None'
        download_latest = '1'
        sdk_env = 'prod'
        regenerate = '1'
        u8_enable = '1'

        invokeOtherTask("${config.currentJobName}", 'bilibili', 'release_withboard', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'huawei', 'release_withboard', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'oceanengine', 'release_withboard', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'taptap', 'release_withboard', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'haoyoukuaibao', 'release_withboard', 'None', 'prod', '1', "${config.version_env}, '0', '1'")
        invokeOtherTask("${config.currentJobName}", 'googleplay', 'release_withboard', 'None', 'prod', '1', "${config.version_env}, '1', '0'")
    }
    else if("${config.channel}".contains('批量官包release'))
    {
        channel = 'official_android'
        buildtype = 'release'
        auto_trigger = 'None'
        download_latest = '1'
        sdk_env = 'prod'
        regenerate = '1'
        u8_enable = '1'

        invokeOtherTask("${config.currentJobName}", 'bilibili', 'release', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'huawei', 'release', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'oceanengine', 'release', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'taptap', 'release', 'None', 'prod', '1', "${config.version_env}", '0', '1')
        invokeOtherTask("${config.currentJobName}", 'haoyoukuaibao', 'release', 'None', 'prod', '1', "${config.version_env}, '0', '1'")
        invokeOtherTask("${config.currentJobName}", 'googleplay', 'release', 'None', 'prod', '1', "${config.version_env}, '1', '0'")
    }
}
