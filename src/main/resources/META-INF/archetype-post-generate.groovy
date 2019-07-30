def optionIncludeErrorHandler = request.getProperties().get("optionIncludeErrorHandler")

def rootDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId())
def uiAppsPackage = new File(rootDir, "ui.apps")
def dispatcherConfig = new File(rootDir, "dispatcher")

if (optionIncludeErrorHandler == "n") {
    assert new File(uiAppsPackage, "src/main/content/jcr_root/apps/sling").deleteDir()
}

if ( generateDispatcherConfig == "none" || generateDispatcherConfig == "n"  ) {
    assert dispatcherConfig.deleteDir()
}