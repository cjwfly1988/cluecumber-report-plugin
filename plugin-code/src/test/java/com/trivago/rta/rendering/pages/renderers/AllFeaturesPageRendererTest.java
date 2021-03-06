package com.trivago.rta.rendering.pages.renderers;

import com.trivago.rta.exceptions.CluecumberPluginException;
import com.trivago.rta.json.pojo.Report;
import com.trivago.rta.rendering.charts.ChartJsonConverter;
import com.trivago.rta.rendering.pages.pojos.pagecollections.AllFeaturesPageCollection;
import freemarker.template.Template;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class AllFeaturesPageRendererTest {

    private AllFeaturesPageRenderer allFeaturesPageRenderer;

    @Before
    public void setup() {
        ChartJsonConverter chartJsonConverter = mock(ChartJsonConverter.class);
        allFeaturesPageRenderer = new AllFeaturesPageRenderer(chartJsonConverter);
    }

    @Test
    public void testContentRendering() throws CluecumberPluginException {
        Template template = mock(Template.class);
        Report report = new Report();
        List<Report> reports = new ArrayList<>();
        reports.add(report);
        AllFeaturesPageCollection allFeaturesPageCollection = new AllFeaturesPageCollection(reports);
        allFeaturesPageRenderer.getRenderedContent(allFeaturesPageCollection, template);
    }
}
