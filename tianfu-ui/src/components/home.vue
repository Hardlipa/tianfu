<template>
  <q-layout view="hHr LpR lFf" class="bg-grey-1">
    <q-header elevated class="bg-white text-grey-8" height-hint="64">
      <q-toolbar class="bg-purple text-white">
        <q-btn
          flat
          round
          dense
          icon="assignment_ind"
          @click="leftDrawer = !leftDrawer"
        />
        <q-toolbar-title> 天府 </q-toolbar-title>
        <q-btn flat round dense icon="apps" class="q-mr-xs" />
        <q-btn flat round dense icon="more_vert" />
      </q-toolbar>
      <q-drawer
        side="left"
        v-model="leftDrawer"
        bordered
        :width="200"
        :breakpoint="500"
        content-class="bg-grey-3"
      >
        <q-scroll-area class="fit">
          <q-list>
            <template v-for="(menuItem, index) in menuList">
              <q-item
                clickable
                :key="index"
                :active="menuItem.label === 'Outbox'"
                v-ripple
                to=""
              >
                <q-item-section avatar>
                  <q-icon :name="menuItem.icon" />
                </q-item-section>
                <q-item-section>{{ menuItem.label }}</q-item-section>
              </q-item>
              <q-separator :key="'sep' + index" v-if="menuItem.separator" />
            </template>
          </q-list>
        </q-scroll-area>
      </q-drawer>
    </q-header>
  </q-layout>
</template>
<script>
const menuList = [
  {
    icon: "inbox",
    label: "Inbox",
    separator: true,
  },
  {
    icon: "send",
    label: "Outbox",
    separator: false,
  },
  {
    icon: "delete",
    label: "Trash",
    separator: false,
  },
  {
    icon: "error",
    label: "Spam",
    separator: true,
  },
  {
    icon: "settings",
    label: "Settings",
    separator: false,
  },
  {
    icon: "feedback",
    label: "Send Feedback",
    separator: false,
  },
  {
    icon: "help",
    iconColor: "primary",
    label: "Help",
    separator: false,
  },
];
export default {
  data() {
    return {
      leftDrawer: false,
      menuList,
    };
  },
  methods: {},
};
</script>