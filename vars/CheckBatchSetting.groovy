
def call(Map config = [:]){
    if("${config.channel}".contains('批量官包_withboard'))
    {
        channel = 'official_android'
        buildtype = 'release_withboard'
        auto_trigger = 'None'
        download_latest = '1'
        sdk_env = 'prod'
        regenerate = '1'
        u8_enable = '1'

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'bilibili', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'huawei', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'oceanengine', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'taptap', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'haoyoukuaibao', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'release_withboard', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
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

        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'bilibili', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'huawei', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'oceanengine', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'taptap', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'haoyoukuaibao', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'0', origin_package:'1')
        invokeOtherTask(currentJobName:"${config.currentJobName}", channel:'googleplay', buildtype:'release', auto_trigger:'None', sdk_env:'prod', u8_enable:'1', version_env:"${config.version_env}", regenerate:'1', origin_package:'0')
    }
}
