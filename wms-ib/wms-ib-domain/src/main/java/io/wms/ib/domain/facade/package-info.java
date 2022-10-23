/**
 * DDD Domain层和Infrastructure的粘合剂：通过倒置依赖.
 *
 * <p>domain层声明需要基础设施层实现的接口：RPC, DB, Cache, MQ等.</p>
 * <p>为了方便产品人员查看领域层代码，梳理业务，统一放在facade package，减少对产品同学的干扰.</p>
 */
package io.wms.ib.domain.facade;
