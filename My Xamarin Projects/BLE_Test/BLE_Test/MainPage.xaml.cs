using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Plugin.BLE;
using Plugin.BLE.Abstractions.Contracts;
using Plugin.BLE.Abstractions.Exceptions;
using Xamarin.Forms;

namespace BLE_Test
{
    public partial class MainPage : ContentPage
    {
        IBluetoothLE ble;
        IAdapter adapter;
        ObservableCollection<IDevice> devicelist;
        IDevice device;

        public MainPage()
        {
            InitializeComponent();
            ble = CrossBluetoothLE.Current;
            adapter = CrossBluetoothLE.Current.Adapter;
            devicelist = new ObservableCollection<IDevice>();
            lv.ItemsSource = devicelist;
            var state = ble.State;
            Status_label.Text = "BlueTooth is: " + state.ToString();
            Scan();
        }

        //------------------------------------------------------------
        void Handle_Clicked_scan(object sender, System.EventArgs e)
        {
            Scan();
        }
        public async void Scan()
        {
            try
            {
                devicelist.Clear();

                Status_label.Text = "Searching...";


                adapter.DeviceDiscovered += (s, a) =>
                {
                    devicelist.Add(a.Device);
                };


                if (!ble.Adapter.IsScanning)
                {
                    await adapter.StartScanningForDevicesAsync();
                    if (Status_label.Text == "Searching...")
                        Status_label.Text = "Finished.";
                }
            }
            catch (Exception ex)
            {
                await DisplayAlert("Error! ", ex.Message.ToString(), "Ok");

            }
        }

        //------------------------------------------------------------
        void lv_ItemSelected(object sender, Xamarin.Forms.SelectedItemChangedEventArgs e)
        { 
            if (lv.SelectedItem == null)
            {
                return;
            }
            device = lv.SelectedItem as IDevice;
            Status_label.Text = "Selected Device: " + Environment.NewLine +
                device.Id.ToString() + Environment.NewLine +
                device.Name.ToString() + Environment.NewLine +
                device.NativeDevice.ToString() + Environment.NewLine +
                device.Rssi.ToString() + Environment.NewLine +
                device.State.ToString() + Environment.NewLine;
            connect();
        }

        //------------------------------------------------------------
        async void connect()
        {
            try
            {
                if (device != null)
                {
                    await adapter.ConnectToDeviceAsync(device);

                    // Status_label.Text = "Connected. ";
                    Status_label.Text = "Selected Device: " + Environment.NewLine +
                        device.Id.ToString() + Environment.NewLine +
                        device.Name.ToString() + Environment.NewLine +
                        device.NativeDevice.ToString() + Environment.NewLine +
                        device.Rssi.ToString() + Environment.NewLine +
                        device.State.ToString() + Environment.NewLine;

                   // await adapter.DisconnectDeviceAsync(device); //disconnection command

                }
                else
                {
                    Status_label.Text = "Status: Conected" + device.Id.ToString();
                    //await DisplayAlert("Notice", "No Device selected!", "OK");
                }
            }
            catch (DeviceConnectionException ex)
            {
                //Could not connect to the device
                await DisplayAlert("Error!", ex.Message.ToString(), "OK");
            }
        }

        //------------------------------------------------------------
     //   IList<IService> Services;
     //   IService Service;

     //   IList<ICharacteristic> Characteristics;
      //  ICharacteristic Characteristic;

     //   IDescriptor descriptor;
     //   IList<IDescriptor> descriptors;

        async void Handle_Clicked_Service(object sender, System.EventArgs e)
        {
            Update_data();

            /*
            Services = await device.GetServicesAsync();
           // Service = await device.GetServiceAsync(Guid.Parse("guid")); 
            //or we call the Guid of selected Device

           // Service = await device.GetServiceAsync(device.Id);
            /*
                      if (!Services.Any())
                      {
                          //Status_label.Text = Service.ToString();
                          foreach (var ch in Services)
                              Status_label.Text = ch.ToString()+ " ";

                      }
                      else
                      {
                          Status_label.Text = "No service" + Environment.NewLine + device.Id.ToString();
                      }
                      /

            var characteristics = await Services[0].GetCharacteristicsAsync();
            Guid idGuid = Guid.Parse("00002a02-0000-1000-8000-00805f9b34fb");
            Characteristic = await Services[0].GetCharacteristicAsync(idGuid);
            //  Characteristic.CanRead

            if (characteristics.Any())
            {
                //Status_label.Text = Service.ToString();
                //foreach (var ch in characteristics)
                //    Status_label.Text = ch.ToString() + " ";

                byte[] bytes = {0X25, 0X12, 0XFF }; //await Characteristic.ReadAsync();
                await Characteristic.WriteAsync(bytes);

                Characteristic.ValueUpdated += (o, args) =>
                {
                     bytes = args.Characteristic.Value;
                };
                await Characteristic.StartUpdatesAsync();

            }
            else
            {
                Status_label.Text = "No service" + Environment.NewLine + device.Id.ToString();
            }
            */

        }

        static readonly Guid ServiceId = new Guid("0000ffe0-0000-1000-8000-00805f9b34fb");

        static readonly Guid ReceiveCharId = new Guid("0000ffe1-0000-1000-8000-00805f9b34fb");
        static readonly Guid TransmitCharId = new Guid("713D0003-503E-4C75-BA94-3148F18D941E");
        static readonly Guid ResetCharId = new Guid("713D0004-503E-4C75-BA94-3148F18D941E");

        //------------------------------------------------------------
        //------------------------------------------------------------
        public async void Update_data()
        {

            if(device !=null)
            {
                var Services = await device.GetServicesAsync();
                var Service = await device.GetServiceAsync(ServiceId);
                var characteristics = await Service.GetCharacteristicsAsync();

                var Characteristic_SR = await Service.GetCharacteristicAsync(ReceiveCharId);
             //   var Characteristic_send = await Service.GetCharacteristicAsync(TransmitCharId);
              //  var Characteristic_reset = await Service.GetCharacteristicAsync(ResetCharId);

                var descriptors = await Characteristic_SR.GetDescriptorsAsync();
                // var descriptor = await Characteristic.GetDescriptorAsync(Guid.Parse("00002a03-0000-1000-8000-00805f9b34fb"));

                byte[] data = Encoding.UTF8.GetBytes("off");

                byte [] bytes = { 0xFF }; //await Characteristic.ReadAsync();
                await Characteristic_SR.WriteAsync(data);


                var Recievebytes = Characteristic_SR.Value;

                //await Characteristic_reset.WriteAsync(new byte[] { 1 });

                /*
                Characteristic.ValueUpdated += (o, args) =>
                {
                    var bytes1 = args.Characteristic.Value;
                };
                await Characteristic.StartUpdatesAsync();

                /*
                await Characteristic.WriteAsync(data);

                string Input = "";
                Characteristic.ValueUpdated += (s, e) =>
                {
                    Input = Encoding.UTF8.GetString(e.Characteristic.Value, 0, e.Characteristic.Value.Length);
                
                };
                byte[] data = Encoding.UTF8.GetBytes("on");
                */

            }
        }





        void Handle_ValueChanged(object sender, Xamarin.Forms.ValueChangedEventArgs e)
        {
            //throw new NotImplementedException();
         //   Result1.Text = string.Format("Value: {0:f2}", Slider1.Value);
            //  Slider1.Value = 0.5;

         //   if (Slider1.Value >= 1)
         //       DisplayAlert("Good", "max", "Ok");
        }

    }
}
