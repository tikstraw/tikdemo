package io.wms.ib.domain.step.shelving.addtask;

import io.github.dddplus.annotation.Step;
import io.wms.ib.domain.model.ShelvingTask;
import io.wms.ib.domain.step.shelving.AddShelvingTaskStep;
import io.wms.ib.spec.Steps;
import io.wms.ib.spec.ext.IbException;

@Step(name = "预占储位库存：即这个储位已经分配给某上架任务了，不能再分配给别人了", dependsOn = RecommendStep.class)
public class StockStep extends AddShelvingTaskStep {

    @Override
    public void execute(ShelvingTask model) throws IbException {
        // 根据model任务明细里包含的储位信息，调用库存中心，预占储位资源库存
    }

    @Override
    public String stepCode() {
        return Steps.AddShelvingTask.StepCode.Stock;
    }
}
