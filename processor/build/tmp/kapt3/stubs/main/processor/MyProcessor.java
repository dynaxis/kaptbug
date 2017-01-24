package processor;

@javax.annotation.processing.SupportedSourceVersion(value = javax.lang.model.SourceVersion.RELEASE_8)
@javax.annotation.processing.SupportedAnnotationTypes(value = {"annotation.ProcessThis"})
@com.google.auto.service.AutoService(value = javax.annotation.processing.Processor.class)
public final class MyProcessor extends javax.annotation.processing.AbstractProcessor {
    private boolean fileCreated;
    
    @java.lang.Override()
    public boolean process(java.util.Set<? extends javax.lang.model.element.TypeElement> annotations, javax.annotation.processing.RoundEnvironment roundEnv) {
        return false;
    }
    
    public MyProcessor() {
        super();
    }
}