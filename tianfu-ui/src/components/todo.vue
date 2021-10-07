<template lang="">
    <div>
        <q-tabs
            v-model="tab"
            class="text-teal"
            align="left"
        >
            <q-tab name="today" label="今"  />
            <q-tab name="calendar" icon="calendar_view_month" />
        </q-tabs>
        <q-tab-panels v-model="tab" animated transition-prev="fade" transition-next="fade">
            <q-tab-panel name="today">
                <q-btn color="primary" icon="add_task" label="OK" @click="addTodo" />
                <q-list bordered>
                    <template v-for="(item, index) in todos" >
                        <q-item clickable v-ripple :key="index">
                        <q-item-section avatar>
                            <q-checkbox left-label v-model="done"  />
                        </q-item-section>
                        <q-item-section>{{item.name}}</q-item-section>
                    </q-item>
                    </template>
                </q-list>
            </q-tab-panel>
            <q-tab-panel name="calendar" > 

            </q-tab-panel>
        </q-tab-panels>
    </div>
</template>
<script>
export default {
    data(){
        return{
            tab: 'today',
            done: false,
            todos:[{
                name:'好好好'
            }]
        }
    },
    methods:{
        addTodo(){

        }
    }
}
</script>
<style lang="">
    
</style>