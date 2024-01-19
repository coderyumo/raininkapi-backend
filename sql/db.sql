use raininkapi;
-- 帖子' COLLATE utf8mb4_unicode_c
create table if not exists `interface_info`
(
    `id`             bigint                             not null auto_increment comment 'id' primary key,
    `name`           varchar(512)                       not null comment '接口名称',
    `description`    varchar(512)                       null comment '接口描述',
    `url`            varchar(512)                       not null comment '接口地址',
    `method`         varchar(512)                       not null comment '请求类型',
    `status`         int      default 0                 not null comment '接口状态',
    `userId`         bigint                             not null comment '创建人',
    `requestHeader`  text                               null comment '请求头',
    `responseHeader` text                               null comment '响应头',
    createTime       datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime       datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete`       tinyint  default 0                 not null comment '是否删除'
) comment '接口信息表';

create table if not exists `user_interface_info`
(
    `id`              bigint                             not null auto_increment comment 'id' primary key,
    `userId`          bigint                             not null comment '调用用户id',
    `interfaceInfoId` bigint                             null comment '响应头',
    `totalNum`        int                                null comment '总调用次数',
    `leftNum`         int                                null comment '总调用次数',
    `status`          int                                null comment '0正常 1禁用',
    `createTime`      datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime`      datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDelete`        tinyint  default 0                 not null comment '是否删除'
) comment '接口信息表';


insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('孔鸿煊', 'www.edgar-daugherty.com', 'GET', 0, 5940650, '7TGo', 'Khi');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('严鹏煊', 'www.meta-walter.info', 'GET', 0, 742069, 'lWgW', 'xA');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('顾驰', 'www.chi-gerlach.co', 'GET', 0, 3114542054, 'FzTFZ', 'Oj9t0');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('方弘文', 'www.alonso-rosenbaum.net', 'GET', 0, 351467, 'l2fPP', 'zk');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('史烨霖', 'www.josette-lebsack.co', 'GET', 0, 613327, 'LKuvt', 'VA');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('廖雪松', 'www.genaro-abernathy.org', 'GET', 0, 32, 'iCFH', 'vhq');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('熊昊焱', 'www.lida-nicolas.co', 'GET', 0, 168423, 'J1H8a', 'Q33');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('邱子轩', 'www.janell-conroy.co', 'GET', 0, 482730, 'hyS', 'GNXp9');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('崔雪松', 'www.luke-hegmann.name', 'GET', 0, 98668203, 'uLMm', 'VMgrD');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('沈彬', 'www.carolyne-conn.co', 'GET', 0, 8572885, 'a0h', 't55');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('李乐驹', 'www.jamey-dubuque.org', 'GET', 0, 348, 'WA3U', 'sU');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('叶胤祥', 'www.mervin-oconnell.name', 'GET', 0, 4076114615, 'yO', 'xnGg');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('徐烨伟', 'www.rolf-wehner.biz', 'GET', 0, 5015259192, 'yTP', 'JHsp1');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('戴擎苍', 'www.mafalda-bartoletti.io', 'GET', 0, 56912321, 'qsW17', 'vxr');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('姚擎宇', 'www.delmar-tillman.co', 'GET', 0, 91235115, '4NIFX', 'Ew');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('武晓啸', 'www.bella-daniel.co', 'GET', 0, 72, 'hsgp', 'Xp');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('苏鸿煊', 'www.theron-shanahan.net', 'GET', 0, 583431732, 'F8bm', 'NM');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('史炎彬', 'www.agripina-collier.net', 'GET', 0, 2271, 'vPg8G', 'jnl6s');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('于弘文', 'www.serita-blanda.co', 'GET', 0, 19434658, 'kWWo', 'm2LSw');
insert into `interface_info` (`name`, `url`, `method`, `status`, `userId`, `requestHeader`, `responseHeader`)
values ('沈浩然', 'www.melina-collins.biz', 'GET', 0, 5257151135, 'WTjgg', '2e0');