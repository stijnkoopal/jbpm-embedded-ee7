package al.koop.jbpm.embedded.process.handler;

import al.koop.jbpm.embedded.service.NotSoImmediateService;
import org.drools.core.process.instance.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static org.slf4j.LoggerFactory.getLogger;

@ApplicationScoped
public class NotSoImmediateServiceWorkItemHandler implements WorkItemHandler {
    private static final Logger LOG = getLogger(NotSoImmediateServiceWorkItemHandler.class);

    @Inject
    private NotSoImmediateService dataService;

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        LOG.info("The not so immediate service task is invoced, doing nothing");
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
}
